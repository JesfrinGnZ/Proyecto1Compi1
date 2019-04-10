//------------------>1era area<--------------------------    

package backend.analizadorParaRespuestaServidor;
import java_cup.runtime.*;
import static backend.analizadorParaRespuestaServidor.sym.*;

%% //------------------>2da area<--------------------------    

%public
%class AnalizadorLexicoTextoServidor
%cup
%cupdebug
%unicode
%line
%column

Salto = \r|\n|\r\n
Espacio = {Salto} | [ \t\f]



%{
  
  private Symbol symbol(int type) {
    return new Symbol(type, yyline+1, yycolumn+1);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline+1, yycolumn+1, value);
  }

%}

%% //------------------>3er area<--------------------------    
  <YYINITIAL>  {


    "mensaje"	{return symbol(MENSAJE,yytext());}				
	
    "/"    {return symbol(DIAGONAL,yytext());}

   "<"    {return symbol(MENOR_QUE,yytext());}

   ">"    {return symbol(MAYOR_QUE,yytext());}

   "["~"]" {return symbol(ORACION,yytext());}

   {Espacio} 	{/*IGNORAMOS*/}
}

//<<EOF>>                 { return symbol(EOF);

[^]     {/*Ignoramos System.out.println("Error:"+yytext());*/}




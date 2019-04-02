//------------------>1era area<--------------------------    

package backend.analizadorParaLogin;
import java_cup.runtime.*;
import static backend.analizadorParaLogin.sym.*;
import backend.elementos.Usuario;

%% //------------------>2da area<--------------------------    

%public
%class AnalizadorLexicoUsuarios
%cup
%cupdebug
%unicode
%line
%column

Salto = \r|\n|\r\n
Espacio = {Salto} | [ \t\f]
SignosEspeciales =["_"|"-"|"."]
Id = ({SignosEspeciales}|[:jletterdigit:])+


%{
  Usuario usuario;
  
  private Symbol symbol(int type) {
    return new Symbol(type, yyline+1, yycolumn+1);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline+1, yycolumn+1, value);
  }

%}

%% //------------------>3er area<--------------------------    
  <YYINITIAL>  {

    "Usuario" {return symbol(USUARIO,yytext());}

    "Nombre"	{return symbol(NOMBRE,yytext());}				
	
    "Password" {return symbol(PASSWORD,yytext());}

    "/"    {return symbol(DIAGONAL,yytext());}

   "<"    {return symbol(MENOR_QUE,yytext());}

   ">"    {return symbol(MAYOR_QUE,yytext());}

    {Id}   {return symbol(ID,yytext());}

{Espacio} 	{/*IGNORAMOS*/}
}

//<<EOF>>                 { return symbol(EOF);

[^]     {System.out.println("Error en el lexico");}



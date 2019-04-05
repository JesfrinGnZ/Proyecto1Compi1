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
SignosEspeciales =["_"|"-"|"$"]
Id = ({SignosEspeciales}+[:jletterdigit:]+)+



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

 //   "["(({Id}"\|")+) {Id}"]" {System.out.println("Etiquetas conjuntas:"+yytext());}

   "["~"]" {return symbol(FORMATO_PASSWORD,yytext());}



//    "#"([a-fA-F]|[0-9]){6} {System.out.println("Codigo color:"+yytext());}

//    "["~"]"     {System.out.println("Oracion:"+yytext());}

//    ^https?:\/\/[\w\-]+(\.[\w\-]+)+[/#?]?.*$    {System.out.println("URL:"+yytext());}

{Espacio} 	{/*IGNORAMOS*/}
}

//<<EOF>>                 { return symbol(EOF);

[^]     {/*Ignoramos*/System.out.println("Error:"+yytext());}



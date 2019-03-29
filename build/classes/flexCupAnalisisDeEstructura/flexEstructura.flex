//------------------>1era area<--------------------------    

package backend.analizadorParaTextoDeCliente;
import java_cup.runtime.*;
import static backendd.analizadorParaTextoDeCliente.sym.*;

%% //------------------>2da area<--------------------------    

%public
%class AnalizadorLexicoTextoCliente
%cup
%cupdebug
%unicode
%line
%column

Salto = \r|\n|\r\n
Espacio = {Salto} | [ \t\f]
//L = [a-zA-Z]
Digitos = 0|[1-9][0-9]*
//DigitosNaturales=[1-9][0-9]*
FormatoFecha=[1-9][0-9][0-9][0-9]["-"][0-1][1-9]["-"][0-1][1-9]
SignosEspeciales =["_"|"-"|"$"]
Id = ({SignosEspeciales}+|[:jletterdigit:]+)+
//Url =https?:\/\/(www\.)?[-a-zA-Z0-9@:%._\+~#=]{2,256}\.[a-z]{2,6}\b([-a-zA-Z0-9@:%_\+.~#?&//=]*)
Url=[[:jletterdigit:]|.|'\?'|'\-'|'_']+

%{
  StringBuilder string = new StringBuilder();
  
  private Symbol symbol(int type) {
    return new Symbol(type, yyline+1, yycolumn+1);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline+1, yycolumn+1, value);
  }


  private void error(String message) {
    System.out.println("Error en linea line "+(yyline+1)+", columna "+(yycolumn+1)+" : "+message);
  }
%}

%% //------------------>3er area<--------------------------    
        
<YYINITIAL>     [a|A][c|C][c|C][i|I][o|O][n|N][e|E][s|S]	{ System.out.println("Simbolo ACCIONES::"+yytext());return symbol(ACCIONES,yytext());}				

<YYINITIAL>     [a|A][c|C][c|C][i|I][o|O][n|N]	{System.out.println("Simbolo ACCION::"+yytext());return symbol(ACCION,yytext());}				
	
<YYINITIAL>     [p|P][a|A][r|R][a|A][m|M][e|E][t|T][r|R][o|O][s|S] {System.out.println("Simbolo PARAMETROS::"+yytext());return symbol(PARAMETROS,yytext());}

<YYINITIAL>     [p|P][a|A][r|R][a|A][m|M][e|E][t|T][r|R][o|O] {System.out.println("Simbolo PARAMETRO::"+yytext());return symbol(PARAMETRO,yytext());}

<YYINITIAL>     [a|A][t|T][r|R][i|I][b|B][u|U][t|T][o|O][s|S] {System.out.println("Simbolo ATRIBUTOS::"+yytext());return symbol(ATRIBUTOS,yytext());}

<YYINITIAL>     [a|A][t|T][r|R][i|I][b|B][u|U][t|T][o|O] {System.out.println("Simbolo ATRIBUTO::"+yytext());return symbol(ATRIBUTO,yytext());}

<YYINITIAL>     [n|N][o|O][m|M][b|B][r|R][e|E]    {System.out.println("Simbolo NOMBRE::"+yytext());return symbol(NOMBRE,yytext());}

<YYINITIAL>     [e|E][t|T][i|I][q|Q][u|U][e|E][t|T][a|A][s|S]    {System.out.println("Simbolo ETIQUETAS::"+yytext());return symbol(ETIQUETAS,yytext());}

<YYINITIAL>     [e|E][t|T][i|I][q|Q][u|U][e|E][t|T][a|A]    {System.out.println("Simbolo ETIQUETA::"+yytext());return symbol(ETIQUETA,yytext());}

<YYINITIAL>     [v|V][a|A][l|L][o|O][r|R] {System.out.println("Simbolo VALOR::"+yytext());return symbol(VALOR,yytext());}

<YYINITIAL>     "/"    {System.out.println("Simbolo DIAGONAL::"+yytext());return symbol(DIAGONAL,yytext());}

<YYINITIAL>     "<"    {System.out.println("Simbolo MENOR_QUE::"+yytext());return symbol(MENOR_QUE,yytext());}

<YYINITIAL>     ">"    {System.out.println("Simbolo MAYOR_QUE::"+yytext());return symbol(MAYOR_QUE,yytext());}

<YYINITIAL>     "["    {System.out.println("Simbolo CORCHETE_ABIERTO::"+yytext());return symbol(CORCHETE_ABIERTO,yytext());}

<YYINITIAL>     "]"    {System.out.println("Simbolo CORCHETE_CERRADO::"+yytext());return symbol(CORCHETE_CERRADO,yytext());}

<YYINITIAL>     "="    {System.out.println("Simbolo IGUAL::"+yytext());return symbol(IGUAL,yytext());}

<YYINITIAL>     "\""   {System.out.println("Simbolo COMILLA::"+yytext());return symbol(COMILLA,yytext());}

<YYINITIAL>     "|"    {System.out.println("Simbolo DIAGONAL_RECTA::"+yytext());return symbol(DIAGONAL_RECTA,yytext());}

<YYINITIAL>     "NUEVO_SITIO_WEB"   {System.out.println("Simbolo NUEVO_SITIO_WEB::"+yytext());return symbol(NUEVO_SITIO_WEB,yytext());}

<YYINITIAL>     "ID"    {System.out.println("Simbolo ID::"+yytext());return symbol(ID,yytext());}

<YYINITIAL>     "USUARIO_CREACION"  {System.out.println("Simbolo USUARIO_CREACION::"+yytext());return symbol(USUARIO_CREACION,yytext());}

<YYINITIAL>     "FECHA_CREACION"    {System.out.println("Simbolo FECHA_CREACION::"+yytext());return symbol(FECHA_CREACION,yytext());}

<YYINITIAL>     "FECHA_MODIFICACION"    {System.out.println("Simbolo FECHA_MODIFICACION::"+yytext());return symbol(FECHA_MODIFICACION,yytext());}

<YYINITIAL>     "USUARIO_MODIFICACION"  {System.out.println("Simbolo USUARIO_MODIFICACION::"+yytext());return symbol(USUARIO_MODIFICACION,yytext());}

<YYINITIAL>     "BORRAR_SITIO_WEB"      {System.out.println("Simbolo BORRAR_SITIO_WEB::"+yytext());return symbol(BORRAR_SITIO_WEB,yytext());}

<YYINITIAL>     "NUEVA_PAGINA"      {System.out.println("Simbolo NUEVA_PAGINA::"+yytext());return symbol(NUEVA_PAGINA,yytext());}

<YYINITIAL>     "TITULO"        {System.out.println("Simbolo TITULO::"+yytext());return symbol(TITULO,yytext());}

<YYINITIAL>     "SITIO"     {System.out.println("Simbolo SITIO::"+yytext());return symbol(SITIO,yytext());}

<YYINITIAL>     "PADRE"     {System.out.println("Simbolo PADRE::"+yytext());return symbol(PADRE,yytext());}

<YYINITIAL>     "BORRAR_PAGINA"     {System.out.println("Simbolo BORRAR_PAGINA::"+yytext());return symbol(BORRAR_PAGINA,yytext());}

<YYINITIAL>     "MODIFICAR_PAGINA"  {System.out.println("Simbolo MODIFICAR_PAGINA::"+yytext());return symbol(MODIFICAR_PAGINA,yytext());}

<YYINITIAL>     "AGREGAR_COMPONENTE"    {System.out.println("Simbolo AGREGAR_COMPONENTE::"+yytext());return symbol(AGREGAR_COMPONENTE,yytext());}

<YYINITIAL>     "PAGINA"    {System.out.println("Simbolo PAGINA::"+yytext());return symbol(PAGINA,yytext());}

<YYINITIAL>     "CLASE"     {System.out.println("Simbolo CLASE::"+yytext());return symbol(CLASE,yytext());}

<YYINITIAL>     "BORRAR_COMPONENTE"     {System.out.println("Simbolo BORRAR_COMPONENTE::"+yytext());return symbol(BORRAR_COMPONENTE,yytext());}

<YYINITIAL>     "MODIFICAR_COMPONENTE"  {System.out.println("Simbolo MODIFICAR_COMPONENTE::"+yytext());return symbol(MODIFICAR_COMPONENTE,yytext());} 

<YYINITIAL>     "TITULO"       {System.out.println("Simbolo TITULO::"+yytext());return symbol(TITULO,yytext());}       

<YYINITIAL>     "PARRAFO"       {System.out.println("Simbolo PARRAFO::"+yytext());return symbol(PARRAFO,yytext());}       

<YYINITIAL>     "IMAGEN"       {System.out.println("Simbolo IMAGEN::"+yytext());return symbol(IMAGEN,yytext());}       

<YYINITIAL>     "VIDEO"       {System.out.println("Simbolo VIDEO::"+yytext());return symbol(VIDEO,yytext());}       

<YYINITIAL>     "MENU"       {System.out.println("Simbolo MENU::"+yytext());return symbol(MENU,yytext());}

<YYINITIAL>     "TEXTO"       {System.out.println("Simbolo TEXTO::"+yytext());return symbol(TEXTO,yytext());}
       
<YYINITIAL>     "ALINEACION"       {System.out.println("Simbolo ALINEACION::"+yytext());return symbol(ALINEACION,yytext());}

<YYINITIAL>     "CENTRAR"       {System.out.println("Simbolo CENTRAR::"+yytext());return symbol(CENTRAR,yytext());}

<YYINITIAL>     "IZQUIERDA"       {System.out.println("Simbolo IZQUIERDA::"+yytext());return symbol(IZQUIERDA,yytext());}

<YYINITIAL>     "DERECHA"       {System.out.println("Simbolo DERECHA::"+yytext());return symbol(DERECHA,yytext());}

<YYINITIAL>     "JUSTIFICAR"       {System.out.println("Simbolo JUSTIFICAR::"+yytext());return symbol(JUSTIFICAR,yytext());}

<YYINITIAL>     "COLOR"       {System.out.println("Simbolo COLOR::"+yytext());return symbol(COLOR,yytext());}

<YYINITIAL>     "ORIGEN"       {System.out.println("Simbolo ORIGEN::"+yytext());return symbol(ORIGEN,yytext());}

<YYINITIAL>     "ALTURA"       {System.out.println("Simbolo ALTURA::"+yytext());return symbol(ALTURA,yytext());}

<YYINITIAL>     "ANCHO"       {System.out.println("Simbolo ANCHO::"+yytext());return symbol(ANCHO,yytext());}

<YYINITIAL>     "https:"      {System.out.println("Simbolo HTTPS::"+yytext());return symbol(HTTPS,yytext());}   

<YYINITIAL>     {FormatoFecha}  {System.out.println("Simbolo FORMATO_FECHA::"+yytext());return symbol(FORMATO_FECHA,yytext());}

<YYINITIAL>     {Digitos}     {System.out.println("Simbolo NUMERO::"+yytext());return symbol(NUMERO,yytext());}

<YYINITIAL>     {Id} {System.out.println("Simbolo IDENTIFICADOR::"+yytext());return symbol(IDENTIFICADOR,yytext());}   

<YYINITIAL>     {Url}       {{System.out.println("Simbolo URL::"+yytext());return symbol(URL,yytext());}}

{Espacio} 	{/*IGNORAMOS*/}

[^]     {System.out.println("Simbolo no valido"+yytext());}


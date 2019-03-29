/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import backend.analizadorParaTextoDeCliente.*;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesfrin
 */
public class Run {
    
    public static void main(String[] args){
        System.out.println("Hola mundo");
        //String instruccion="  Accion PARAMETRO parametros atributo atributos nombre valor etiqueta etiquetas / < > [ \" | NUEVO_SITIO_WEB ID USUARIO_CREACION FECHA_CREACION FECHA_MODIFICACION USUARIO_MODIFICACION BORRAR_SITIO_WEB,NUEVA_PAGINA,TITULO,SITIO,PADRE,BORRAR_PAGINA,MODIFICAR_PAGINA AGREGAR_COMPONENTE,PAGINA,CLASE,BORRAR_COMPONENTE,MODIFICAR_COMPONENTE";
        //String instruccion =" / https:/cdn.computerhoy.com/sites/navi.axelspringer.es/public/styles/480/public/media/image/2018/08/fondos-pantalla-full-hd-animales_4.jpg?itok=e9hCWoJi";
        //String instruccion = "2019-12-12";
//        String instruccion="ACCION,ACCIONES,PARAMETROS,PARAMETRO,ATRIBUTOS,ATRIBUTO,NOMBRE,ETIQUETAS,ETIQUETA,VALOR,\n" +
//"                        DIAGONAL,MENOR_QUE,MAYOR_QUE,CORCHETE_ABIERTO,CORCHETE_CERRADO,IGUAL,COMILLA,DIAGONAL_RECTA,\n" +
//"                        NUEVO_SITIO_WEB,ID,USUARIO_CREACION,FECHA_CREACION,FECHA_MODIFICACION,USUARIO_MODIFICACION,\n" +
//"                        BORRAR_SITIO_WEB,NUEVA_PAGINA,TITULO,SITIO,PADRE,BORRAR_PAGINA,MODIFICAR_PAGINA,\n" +
//"                        AGREGAR_COMPONENTE,PAGINA,CLASE,BORRAR_COMPONENTE,MODIFICAR_COMPONENTE,\n" +
//"                        PARRAFO,IMAGEN,VIDEO,MENU,TEXTO,ALINEACION,CENTRAR,IZQUIERDA,DERECHA,JUSTIFICAR,\n" +
//"                        COLOR,ORIGEN,ALTURA,ANCHO,HTTPS,00";

        String instruccion="<accion nombre=\"NUEVO_SITIO_WEB\">\n" +
"        <parametros>\n" +
"            <parametro nombre = \"ID\">\n" +
"                [RicardoAndrade]\n" +
"            </parametro>\n" +
"        </parametros>\n" +
"    </accion>\n" +
"    @accion nombre=\"BORRAR_SITIO_WEB\">\n" +
"        <parametros>\n" +
"            <parametro nombre = \"ID\">\n" +
"                [ElClubo]\n" +
"            </parametro>\n" +
"        </parametros>\n" +
"    </accion>";
        AnalizadorLexicoTextoCliente lexico = new AnalizadorLexicoTextoCliente(new BufferedReader(new StringReader(instruccion)));
        
        parser sintactico = new parser(lexico);
        
        try {
            sintactico.parse();
        } catch (Exception ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

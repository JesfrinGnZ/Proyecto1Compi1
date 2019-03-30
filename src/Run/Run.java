/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import backend.elementos.Usuario;
import frontend.gui.ClienteFrame;
/**
 *
 * @author jesfrin
 */
public class Run {
    
    public static void main(String[] args){
        /*
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

        String instruccion="<acciones> \n" +
"    <accion nombre=\"NUEVO_SITIO_WEB\">\n" +
"        <parametros>\n" +
"            <parametro nombre = \"ID\">\n" +
"                [_RicardoAndrade]\n" +
"            </parametro>\n" +
"            <parametro nombre = \"USUARIO_CREACION\">\n" +
"                [$Guatemala]\n" +
"            </parametro>\n" +
"            <parametro nombre = \"FECHA_CREACION\">\n" +
"                [2019-12-11]\n" +
"            </parametro>\n" +
"            <parametro nombre = \"FECHA_MODIFICACION\">\n" +
"                [2019-11-15]\n" +
"            </parametro>\n" +
"            <parametro nombre = \"USUARIO_MODIFICACION\">\n" +
"                [-YO]\n" +
"            </parametro>\n" +
"        </parametros>\n" +
"    </accion>\n" +
"    <accion nombre=\"NUEVO_SITIO_WEB\">\n" +
"        <parametros>\n" +
"            <parametro nombre = \"ID\">\n" +
"                [LeonelMessi]\n" +
"            </parametro>\n" +
"            <parametro nombre = \"USUARIO_CREACION\">\n" +
"                [Barccelona]\n" +
"            </parametro>\n" +
"        </parametros>\n" +
"    </accion>\n" +
"</acciones>";
        AnalizadorLexicoTextoCliente lexico = new AnalizadorLexicoTextoCliente(new BufferedReader(new StringReader(instruccion)));
        
        parser sintactico = new parser(lexico);
        
        try {
            sintactico.parse();
        } catch (Exception ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        Usuario usuario = new Usuario("Usuario", "1234");
        ClienteFrame frame = new ClienteFrame(usuario);
        frame.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.elementos;

import backend.excepciones.FaltaDeAtributoObligatorioException;
import frontend.gui.ClienteFrame;
import java.util.ArrayList;

/**
 *
 * @author jesfrin
 */
public class Componente {

    private String id, pagina, clase;

    public String generarTextoEliminacion() {
        String parametros = "<parametro nombre =\"ID\">[" + this.id + "]</parametro>\n";
        parametros += "<parametro nombre =\"PAGINA\">[" + this.pagina + "]</parametro>\n";
        return "<accion nombre =\"NUEVA_PAGINA\">\n<parametros>\n" + parametros + "</parametros>\n</accion>";
    }

    public String generarTextoCreacion_Modificacion(String atributos, String tipo) {
        String parametros = "<parametro nombre =\"ID\">[" + this.id + "]</parametro>\n";
        parametros += "<parametro nombre =\"PAGINA\">[" + this.pagina + "]</parametro>\n";
        parametros += "<parametro nombre =\"CLASE\">[" + this.clase + "]</parametro>\n";
        if (tipo.equals("creacion")) {
            return "<accion nombre =\"AGREGAR_COMPONENTE\">\n<parametros>\n" + parametros + "</parametros>\n" + atributos + "</accion>";
        }
        return "<accion nombre =\"MODIFICAR_COMPONENTE\">\n<parametros>\n" + parametros + "</parametros>\n" + atributos + "</accion>";
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public boolean darValoresCreacion_Modificacion(String valor, String tipo) {
        switch (tipo) {
            case "id":
                if (this.id == null) {
                    this.id = valor;
                    return true;
                }
                break;
            case "pagina":
                if (this.pagina == null) {
                    this.pagina = valor;
                    return true;
                }
                break;
            case "clase":
                if (this.clase == null) {
                    this.clase = valor;
                    return true;
                }
                break;
        }
        return false;
    }

    public boolean darValoresEliminacion(String valor, String tipo) {
        switch (tipo) {
            case "id":
                if (this.id == null) {
                    this.id = valor;
                    return true;
                }
                break;
            case "pagina":
                if (this.pagina == null) {
                    this.pagina = valor;
                    return true;
                }
                break;
        }
        return false;
    }

    public void verificarDatosObligatoriosParaCreacion_Modificacion() throws FaltaDeAtributoObligatorioException {
        if (this.id == null || this.pagina == null || this.clase == null) {
            throw new FaltaDeAtributoObligatorioException();
        }
    }

    public void verificarDatosObligatoriosParaEliminacion() throws FaltaDeAtributoObligatorioException {
        if (this.id == null || this.pagina == null) {
            throw new FaltaDeAtributoObligatorioException();
        }
    }

    public static void analisisDeCreacion_ModificacionDeComponente(Token tipo, ArrayList<Token> listaDeTokens, ClienteFrame clienteFrame, ArrayList<Token> listaDeAtributos,String tipoDeAccion) {
        Componente componente = new Componente();
        for (Token token : listaDeTokens) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(componente.darValoresCreacion_Modificacion(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getTipo());
            }
        }
        try {
            componente.verificarDatosObligatoriosParaCreacion_Modificacion();//Se verifica si estan los datos obligatorios
            String atributos;
            switch (componente.getClase()) {
                case "TITULO":
                    atributos = AtributoTituloParrafo.analisisDeTitulo(tipo, listaDeAtributos, clienteFrame);
                    //Aqui se concatena el texto,componente, SE NECESITA: componente, tipo crear o modificar,listaDeAtributos
                    if (atributos != null) {
                        clienteFrame.concatenarTexto(componente.generarTextoCreacion_Modificacion(atributos,tipoDeAccion));
                    }
                    break;
                case "PARRAFO":
                    atributos = AtributoTituloParrafo.analisisDeTitulo(tipo, listaDeAtributos, clienteFrame);
                    if (atributos != null) {
                        clienteFrame.concatenarTexto(componente.generarTextoCreacion_Modificacion(atributos,tipoDeAccion));
                    }
                    break;
                case "IMAGEN":
                    atributos = AtributoImagen.analisisDeTitulo(tipo, listaDeAtributos, clienteFrame);
                    if (atributos != null) {
                        clienteFrame.concatenarTexto(componente.generarTextoCreacion_Modificacion(atributos,tipoDeAccion));
                    }
                    break;
                case "VIDEO":
                    atributos = AtributoVideo.analisisDeTitulo(tipo, listaDeAtributos, clienteFrame);
                    if (atributos != null) {
                        clienteFrame.concatenarTexto(componente.generarTextoCreacion_Modificacion(atributos,tipoDeAccion));
                    }
                    break;
                case "MENU":
                    atributos = AtributoMenu.analisisDeTitulo(tipo, listaDeAtributos, clienteFrame);
                    if (atributos != null) {
                        clienteFrame.concatenarTexto(componente.generarTextoCreacion_Modificacion(atributos,tipoDeAccion));
                    }
                    break;
            }
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
        }
    }

    public static void analisisDeEliminacionDeComponente(Token tipo, ArrayList<Token> listaDeTokens, ClienteFrame clienteFrame) {
        Componente componente = new Componente();
        for (Token token : listaDeTokens) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(componente.darValoresEliminacion(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getTipo());
            }
        }
        try {
            componente.verificarDatosObligatoriosParaEliminacion();//Se verifica si estan los datos obligatorios
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
        }

    }

}

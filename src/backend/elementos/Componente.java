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
            case "sitio":
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

    public static void analisisDeCreacion_ModificacionDeComponente(Token tipo, ArrayList<Token> listaDeTokens, ClienteFrame clienteFrame,ArrayList<Token> listaDeAtributos) {
        Componente componente = new Componente();
        for (Token token : listaDeTokens) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(componente.darValoresCreacion_Modificacion(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getLexema());
            }
        }
        try {
            componente.verificarDatosObligatoriosParaCreacion_Modificacion();//Se verifica si estan los datos obligatorios
            switch(componente.getClase()){
                case "titulo":
                    AtributoTituloParrafo.analisisDeTitulo(tipo, listaDeAtributos, clienteFrame);
                    break;
                case "parrafo":
                    break;
                case "imagen":
                    break;
                case "video":
                    break;
                case "menu":
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
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getLexema());
            }
        }
        try {
            componente.verificarDatosObligatoriosParaEliminacion();//Se verifica si estan los datos obligatorios
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
        }
        
    }

}

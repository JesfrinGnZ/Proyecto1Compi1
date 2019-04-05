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
public class AtributoTituloParrafo {

    private String texto, alineacion, color;

    public AtributoTituloParrafo() {
    }

    public String generarTextoCreacion() {
        String parametros = "<atributo nombre =\"TEXTO\">[" + this.texto + "]</atributo>\n";
        if (this.alineacion != null) {
            parametros += "<atributo nombre =\"ALINEACION\">[" + this.alineacion + "]</atributo>\n";
        } else {
            parametros += "<atributo nombre =\"ALINEACION\">[" + "IZQUIERDA" + "]</atributo>\n";
        }

        if (this.color != null) {
            parametros += "<atributo nombre =\"COLOR\">[" + this.color + "]</atributo>\n";
        } else {
            parametros += "<atributo nombre =\"COLOR\">[" + "#000000" + "]</atributo>\n";
        }

        return "<atributos>\n" + parametros + "</atributos>\n";

    }

    public boolean darValores(String valor, String tipo) {
        switch (tipo) {
            case "texto":
                if (this.texto == null) {
                    this.texto = valor;
                    return true;
                }
                break;
            case "alineacion":
                if (this.alineacion == null) {
                    this.alineacion = valor;
                    return true;
                }
                break;
            case "color":
                if (this.color == null) {
                    this.color = valor;
                    return true;
                }
                break;
        }
        return false;
    }

    public void verificarDatosObligatorios() throws FaltaDeAtributoObligatorioException {
        if (this.texto == null) {
            throw new FaltaDeAtributoObligatorioException();
        }
    }

    public static String analisisDeTitulo(Token tipo, ArrayList<Token> listaDeAtributos, ClienteFrame clienteFrame) {
        AtributoTituloParrafo nuevoTitulo_Parrafo = new AtributoTituloParrafo();
        for (Token token : listaDeAtributos) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(nuevoTitulo_Parrafo.darValores(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getTipo());
            }
        }
        try {
            nuevoTitulo_Parrafo.verificarDatosObligatorios();//Se verifica si estan los datos obligatorios
            return nuevoTitulo_Parrafo.generarTextoCreacion();
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
            return null;
        }
    }
}

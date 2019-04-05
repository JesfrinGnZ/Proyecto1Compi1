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
public class AtributoImagen {

    String origen, alineacion, altura, ancho;

    public AtributoImagen() {
    }

    
    public String generarTextoCreacion() {
        String parametros = "<atributo nombre =\"ORIGEN\">[" + this.origen + "]</atributo>\n";
        parametros += "<atributo nombre =\"ALTURA\">[" + this.altura + "]</atributo>\n";
        parametros += "<atributo nombre =\"ANCHO\">[" + this.ancho + "]</atributo>\n";
        if (this.alineacion != null) {
            parametros += "<atributo nombre =\"ALINEACION\">[" + this.alineacion + "]</atributo>\n";
        } else {
            parametros += "<atributo nombre =\"ALINEACION\">[" + "IZQUIERDA" + "]</atributo>\n";
        }
        return "<atributos>\n" + parametros + "</atributos>\n";
    }

    public boolean darValores(String valor, String tipo) {
        switch (tipo) {
            case "origen":
                if (this.origen == null) {
                    this.origen = valor;
                    return true;
                }
                break;
            case "alineacion":
                if (this.alineacion == null) {
                    this.alineacion = valor;
                    return true;
                }
                break;
            case "altura":
                if (this.altura == null) {
                    this.altura = valor;
                    return true;
                }
                break;
            case "ancho":
                if (this.ancho == null) {
                    this.ancho = valor;
                    return true;
                }
                break;
        }
        return false;
    }

    public void verificarDatosObligatorios() throws FaltaDeAtributoObligatorioException {
        if (this.origen == null || this.altura == null || this.ancho == null) {
            throw new FaltaDeAtributoObligatorioException();
        }
    }

    public static String analisisDeTitulo(Token tipo, ArrayList<Token> listaDeAtributos, ClienteFrame clienteFrame) {
        AtributoImagen nuevaImagen = new AtributoImagen();
        for (Token token : listaDeAtributos) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(nuevaImagen.darValores(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getTipo());
            }
        }
        try {
            nuevaImagen.verificarDatosObligatorios();//Se verifica si estan los datos obligatorios
            return nuevaImagen.generarTextoCreacion();
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
            return null;
        }
    }
}

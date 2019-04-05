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
public class AtributoMenu {

    private String padre, etiqetas;

    public AtributoMenu() {
    }

    
    
    public String generarTextoCreacion() {
        String parametros = "<atributo nombre =\"PADRE\">[" + this.padre + "]</atributo>\n";
        if (this.etiqetas != null) {
            parametros += "<atributo nombre =\"ETIQUETAS\">[" + this.etiqetas + "]</atributo>\n";
        }
        return "<atributos>\n" + parametros + "</atributos>\n";
    }

    public boolean darValores(String valor, String tipo) {
        switch (tipo) {
            case "padre":
                if (this.padre == null) {
                    this.padre = valor;
                    return true;
                }
                break;
            case "etiquetas":
                if (this.etiqetas == null) {
                    this.etiqetas = valor;
                    return true;
                }
                break;
        }
        return false;
    }

    public void verificarDatosObligatorios() throws FaltaDeAtributoObligatorioException {
        if (this.padre == null) {
            throw new FaltaDeAtributoObligatorioException();
        }
    }

        public static String analisisDeTitulo(Token tipo, ArrayList<Token> listaDeAtributos, ClienteFrame clienteFrame) {
        AtributoMenu nuevoMenu = new AtributoMenu();
        for (Token token : listaDeAtributos) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(nuevoMenu.darValores(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getTipo());
                
            }
        }
        try {
            nuevoMenu.verificarDatosObligatorios();//Se verifica si estan los datos obligatorios
            return nuevoMenu.generarTextoCreacion();
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
            return null;
        }
    }
}

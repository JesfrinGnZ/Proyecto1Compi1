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

    private String id, etiqetas;

    public boolean darValores(String valor, String tipo) {
        switch (tipo) {
            case "id":
                if (this.id == null) {
                    this.id = valor;
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
        if (this.id == null && this.etiqetas == null) {
            throw new FaltaDeAtributoObligatorioException();
        }
    }

        public static void analisisDeTitulo(Token tipo, ArrayList<Token> listaDeAtributos, ClienteFrame clienteFrame) {
        AtributoMenu nuevoMenu = new AtributoMenu();
        for (Token token : listaDeAtributos) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(nuevoMenu.darValores(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getLexema());
            }
        }
        try {
            nuevoMenu.verificarDatosObligatorios();//Se verifica si estan los datos obligatorios
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
        }
    }
}

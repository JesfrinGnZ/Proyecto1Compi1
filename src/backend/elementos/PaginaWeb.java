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
public class PaginaWeb {

    String id, titulo, sitio, padre, usuarioCreacion, fechaDeCreacion, fechaModificacion, usuarioModificacion;

    public PaginaWeb() {
    }

    /**
     * \
     *
     * @param valor
     * @param tipo
     * @return true si se pudo asignar el valor, es decir no es repetitivo
     */
    public boolean darValoresCreacion(String valor, String tipo) {
        switch (tipo) {
            case "id":
                if (this.id == null) {
                    this.id = valor;
                    return true;
                }
                break;
            case "titulo":
                if (this.titulo == null) {
                    this.titulo = valor;
                    return true;
                }
                break;
            case "sitio":
                if (this.sitio == null) {
                    this.sitio = valor;
                    return true;
                }
                break;
            case "padre":
                if (this.padre == null) {
                    this.padre = valor;
                    return true;
                }
                break;
            case "usuarioCreacion":
                if (this.usuarioCreacion == null) {
                    this.usuarioCreacion = valor;
                    return true;
                }
                break;
            case "fechaCreacion":
                if (this.fechaDeCreacion == null) {
                    this.fechaDeCreacion = valor;
                    return true;
                }
                break;
            case "fechaModificacion":
                if (this.fechaModificacion == null) {
                    this.fechaModificacion = valor;
                    return true;
                }
                break;
            case "usuarioModificacion":
                if (this.usuarioModificacion == null) {
                    this.usuarioModificacion = valor;
                    return true;
                }
                break;
        }
        return false;
    }

    /**
     *
     * @param valor
     * @param tipo
     * @return true si se pudo asignar el valor, es decir no es repetitivo
     */
    public boolean darValoresEliminacion(String valor, String tipo) {
        switch (tipo) {
            case "id":
                if (this.id == null) {
                    this.id = valor;
                    return true;
                }
                break;
        }
        return false;
    }

    /**
     *
     * @param valor
     * @param tipo
     * @return true si se pudo asignar el valor, es decir no es repetitivo
     */
    public boolean darValoresModificacion(String valor, String tipo) {
        switch (tipo) {
            case "id":
                if (this.id == null) {
                    this.id = valor;
                    return true;
                }
                break;
            case "titulo":
                if (this.titulo == null) {
                    this.titulo = valor;
                    return true;
                }
                break;
        }
        return false;
    }

    /**
     * Verifica si el objeto cuenta con los datos obligatorios para creacion
     *
     * @throws backend.excepciones.FaltaDeAtributoObligatorioException
     */
    public void verificarDatosObligatoriosParaCreacion() throws FaltaDeAtributoObligatorioException {
        if (this.id == null || this.sitio == null || this.padre == null) {
            throw new FaltaDeAtributoObligatorioException();
        }
    }

    /**
     * Verifica si el objeto cuenta con los datos obligatorios para borrar
     *
     * @throws FaltaDeAtributoObligatorioException
     */
    public void verificarDatosObligatoriosParaBorrar() throws FaltaDeAtributoObligatorioException {
        if (this.id == null) {
            throw new FaltaDeAtributoObligatorioException();
        }
    }

    /**
     * Verifica si el objeto cuenta con los datos obligatorios para borrar
     *
     * @throws FaltaDeAtributoObligatorioException
     */
    public void verificarDatosObligatoriosParaModificar() throws FaltaDeAtributoObligatorioException {
        if (this.id == null || this.titulo==null) {
            throw new FaltaDeAtributoObligatorioException();
        }
    }

    public static void analisisDeCreacionDePaginaWeb(Token tipo, ArrayList<Token> listaDeTokens, ClienteFrame clienteFrame, boolean seDebenTomarEtiquetas) {
        PaginaWeb nuevaPagina = new PaginaWeb();
        for (Token token : listaDeTokens) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(nuevaPagina.darValoresCreacion(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getLexema());
            }
        }
        try {
            nuevaPagina.verificarDatosObligatoriosParaCreacion();//Se verifica si estan los datos obligatorios
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
        }
    }

    public static void analisisDeEliminacionDePaginaWeb(Token tipo, ArrayList<Token> listaDeTokens, ClienteFrame clienteFrame) {
        PaginaWeb nuevaPagina = new PaginaWeb();
        for (Token token : listaDeTokens) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(nuevaPagina.darValoresEliminacion(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getLexema());
            }
        }
        try {
            nuevaPagina.verificarDatosObligatoriosParaBorrar();//Se verifica si estan los datos obligatorios
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
        }
    }

    static void analisisDeModificacionDePagina(Token tipo, ArrayList<Token> listaDeTokens, ClienteFrame clienteFrame, boolean b) {
        PaginaWeb nuevaPagina = new PaginaWeb();
        for (Token token : listaDeTokens) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(nuevaPagina.darValoresModificacion(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getLexema());
            }
        }
        try {
            nuevaPagina.verificarDatosObligatoriosParaModificar();//Se verifica si estan los datos obligatorios
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
        }
    }

}

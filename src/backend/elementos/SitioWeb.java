/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.elementos;

import Run.Run;
import backend.excepciones.FaltaDeAtributoObligatorioException;
import frontend.gui.ClienteFrame;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author jesfrin
 */
public class SitioWeb {

    private String id, usuarioCreacion, fechaCreacion, fechaModificacion, usuarioModificacion;

    public SitioWeb() {
    }

    public String generarTextoEliminacion() {
        String parametros = "<parametro nombre =\"ID\">[" + this.id + "]</parametro>\n";
        return "<accion nombre =\"BORRAR_SITIO_WEB\">\n<parametros>\n" + parametros + "</parametros>\n</accion>";

    }

    public String generarTextoCreacion(ClienteFrame clienteFrame) {
        String parametros = "<parametro nombre =\"ID\">[" + this.id + "]</parametro>\n";
        if (this.usuarioCreacion != null) {
            parametros += "<parametro nombre =\"USUARIO_CREACION\">[" + this.usuarioCreacion + "]</parametro>\n";
        } else {
            parametros += "<parametro nombre =\"USUARIO_CREACION\">[" + clienteFrame.getUsuario().getNombre() + "]</parametro>\n";
        }

        if (this.fechaCreacion != null) {
            parametros += "<parametro nombre =\"FECHA_CREACION\">[" + this.fechaCreacion + "]</parametro>\n";
        } else {
            parametros += "<parametro nombre =\"FECHA_CREACION\">[" + LocalDate.now() + "]</parametro>\n";
        }

        if (this.fechaModificacion != null) {
            parametros += "<parametro nombre =\"FECHA_MODIFICACION\">[" + this.fechaModificacion + "]</parametro>\n";
        } else {
            parametros += "<parametro nombre =\"FECHA_MODIFICACION\">[" + LocalDate.now() + "]</parametro>\n";
        }

        if (this.usuarioModificacion != null) {
            parametros += "<parametro nombre =\"USUARIO_MODIFICACION\">[" + this.usuarioModificacion + "]</parametro>\n";
        } else {
            parametros += "<parametro nombre =\"USUARIO_MODIFICACION\">[" + clienteFrame.getUsuario().getNombre() + "]</parametro>\n";
        }
        return "<accion nombre =\"NUEVO_SITIO_WEB\">\n<parametros>\n" + parametros + "</parametros>\n</accion>";
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
            case "usuarioCreacion":
                if (this.usuarioCreacion == null) {
                    this.usuarioCreacion = valor;
                    return true;
                }
                break;
            case "fechaCreacion":
                if (this.fechaCreacion == null) {
                    if (Run.verificarSiFechaEsCorrecta(valor)) {
                        this.fechaCreacion = valor;
                        return true;
                    }
                }
                break;
            case "fechaModificacion":
                if (this.fechaModificacion == null) {
                    if (Run.verificarSiFechaEsCorrecta(valor)) {
                        this.fechaModificacion = valor;
                        return true;
                    }
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
     * Verifica si el objeto cuenta con los datos obligatorios
     *
     * @throws backend.excepciones.FaltaDeAtributoObligatorioException
     */
    public void verificarDatosObligatorios() throws FaltaDeAtributoObligatorioException {
        if (this.id == null) {
            throw new FaltaDeAtributoObligatorioException();
        }
    }

    /**
     *
     * @param tipo
     * @param listaDeTokens
     * @param clienteFrame
     * @param b Verifica parametros, repeticiones y obligatorios
     */
    static void analisisDeCreacionSitioWeb(Token tipo, ArrayList<Token> listaDeTokens, ClienteFrame clienteFrame) {
        SitioWeb nuevoSitio = new SitioWeb();
        for (Token token : listaDeTokens) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(nuevoSitio.darValoresCreacion(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getTipo());
            }
        }
        try {
            nuevoSitio.verificarDatosObligatorios();//Se verifica si estan los datos obligatorios
            clienteFrame.concatenarTexto(nuevoSitio.generarTextoCreacion(clienteFrame));//Se genera lo que se le enviara al manejador
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
        }
    }

    /**
     *
     * @param tipo
     * @param listaDeTokens
     * @param clienteFrame
     * @param b Verifica parametros, repeticiones y obligatorios
     */
    static void analisisDeEliminacionSitioWeb(Token tipo, ArrayList<Token> listaDeTokens, ClienteFrame clienteFrame) {
        SitioWeb nuevoSitio = new SitioWeb();
        for (Token token : listaDeTokens) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(nuevoSitio.darValoresEliminacion(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getTipo());
            }
        }
        try {
            nuevoSitio.verificarDatosObligatorios();//Se verifica si estan los datos obligatorios
            clienteFrame.concatenarTexto(nuevoSitio.generarTextoEliminacion());//Se genera lo que se le enviara al manejador
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
        }
    }

}

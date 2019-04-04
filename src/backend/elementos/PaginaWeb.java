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
public class PaginaWeb {

    String id, titulo, sitio, padre, usuarioCreacion, fechaDeCreacion, fechaModificacion, usuarioModificacion;

    public PaginaWeb() {
    }

    public String generarTextoModificacion(ArrayList<Token> listaDeEtiquetas) {
        String parametros = "<parametro nombre =\"ID\">[" + this.id + "]</parametro>\n";
        if (this.titulo != null) {
            parametros += "<parametro nombre =\"TITULO\">[" + this.titulo + "]</parametro>\n";
        }
        if (listaDeEtiquetas == null || listaDeEtiquetas.isEmpty()) {
            return "<accion nombre =\"NUEVA_PAGINA\">\n<parametros>\n" + parametros + "</parametros>\n</accion>";
        } else {
            String conjuntoDeEtiquetas = "";
            for (Token etiqueta : listaDeEtiquetas) {
                conjuntoDeEtiquetas += "<etiqueta valor =\"" + etiqueta.getLexema() + "\"/>\n";
            }
            String etiquetas = "<etiquetas>\n" + conjuntoDeEtiquetas + "\n</etiquetas>\n";
            return "<accion nombre =\"MODIFICAR_PAGINA\">\n<parametros>\n" + parametros + "</parametros>\n" + etiquetas + "</accion>";
        }
        

    }

    public String generarTextoEliminacion() {
        String parametros = "<parametro nombre =\"ID\">[" + this.id + "]</parametro>\n";
        return "<accion nombre =\"BORRAR_PAGINA\">\n<parametros>\n" + parametros + "</parametros>\n</accion>";

    }

    public String generarTextoCreacion(ClienteFrame clienteFrame, ArrayList<Token> listaDeEtiquetas) {
        String parametros = "<parametro nombre =\"ID\">[" + this.id + "]</parametro>\n";
        parametros += "<parametro nombre =\"SITIO\">[" + this.sitio + "]</parametro>\n";
        parametros += "<parametro nombre =\"PADRE\">[" + this.padre + "]</parametro>\n";
        if (this.titulo != null) {
            parametros += "<parametro nombre =\"TITULO\">[" + this.titulo + "]</parametro>\n";
        } else {
            parametros += "<parametro nombre =\"TITULO\">[" + "Titulo_sin_especificar" + "]</parametro>\n";
        }

        if (this.usuarioCreacion != null) {
            parametros += "<parametro nombre =\"USUARIO_CREACION\">[" + this.usuarioCreacion + "]</parametro>\n";
        } else {
            parametros += "<parametro nombre =\"USUARIO_CREACION\">[" + clienteFrame.getUsuario().getNombre() + "]</parametro>\n";
        }

        if (this.fechaDeCreacion != null) {
            parametros += "<parametro nombre =\"FECHA_CREACION\">[" + this.fechaDeCreacion + "]</parametro>\n";
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

        if (listaDeEtiquetas == null || listaDeEtiquetas.isEmpty()) {
            return "<accion nombre =\"NUEVA_PAGINA\">\n<parametros>\n" + parametros + "</parametros>\n</accion>";
        } else {
            String conjuntoDeEtiquetas = "";
            for (Token etiqueta : listaDeEtiquetas) {
                conjuntoDeEtiquetas += "<etiqueta valor =\"" + etiqueta.getLexema() + "\"/>\n";
            }
            String etiquetas = "<etiquetas>\n" + conjuntoDeEtiquetas + "</etiquetas>\n";
            return "<accion nombre =\"NUEVA_PAGINA\">\n<parametros>\n" + parametros + "</parametros>\n" + etiquetas + "</accion>";
        }

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
                    if (Run.verificarSiFechaEsCorrecta(valor)) {
                        this.fechaDeCreacion = valor;
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
     * @param listaDeAtributos
     * @throws FaltaDeAtributoObligatorioException
     */
    public void verificarDatosObligatoriosParaModificar(ArrayList<Token> listaDeAtributos) throws FaltaDeAtributoObligatorioException {
        if (this.id == null) {
            throw new FaltaDeAtributoObligatorioException();
        }else if(this.titulo==null && (listaDeAtributos==null || listaDeAtributos.isEmpty())){//No trae titulo ni etiqueta
            throw new FaltaDeAtributoObligatorioException();
        }
    }


    public static void analisisDeCreacionDePaginaWeb(Token tipo, ArrayList<Token> listaDeTokens, ClienteFrame clienteFrame, ArrayList<Token> listaDeEtiquetas) {
        PaginaWeb nuevaPagina = new PaginaWeb();
        for (Token token : listaDeTokens) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(nuevaPagina.darValoresCreacion(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getTipo());
            }
        }
        try {
            nuevaPagina.verificarDatosObligatoriosParaCreacion();//Se verifica si estan los datos obligatorios
            clienteFrame.concatenarTexto(nuevaPagina.generarTextoCreacion(clienteFrame,listaDeEtiquetas));//Se concatena el texto que se enviara a el manejador
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
        }
    }

    public static void analisisDeEliminacionDePaginaWeb(Token tipo, ArrayList<Token> listaDeTokens, ClienteFrame clienteFrame) {
        PaginaWeb nuevaPagina = new PaginaWeb();
        for (Token token : listaDeTokens) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(nuevaPagina.darValoresEliminacion(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getTipo());
            }
        }
        try {
            nuevaPagina.verificarDatosObligatoriosParaBorrar();//Se verifica si estan los datos obligatorios
            clienteFrame.concatenarTexto(nuevaPagina.generarTextoEliminacion());
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
        }
    }

    static void analisisDeModificacionDePagina(Token tipo, ArrayList<Token> listaDeTokens, ClienteFrame clienteFrame, ArrayList<Token> listaDeEtiquetas) {
        PaginaWeb nuevaPagina = new PaginaWeb();
        for (Token token : listaDeTokens) {//Se recorre la lista de tokens encontrados verificando si hay repetidos
            if (!(nuevaPagina.darValoresModificacion(token.getLexema(), token.getTipo()))) {
                clienteFrame.mostrarError("repetido o incorrecto", token.getLinea(), token.getColumna(), token.getTipo());
            }
        }
        try {
                nuevaPagina.verificarDatosObligatoriosParaModificar(listaDeEtiquetas);
                clienteFrame.concatenarTexto(nuevaPagina.generarTextoModificacion(listaDeEtiquetas));
        } catch (FaltaDeAtributoObligatorioException ex) {
            clienteFrame.mostrarErrorSintactico("Error SINTACTICO faltan datos obligatorios en Linea" + tipo.getLinea() + " " + "Columna:" + tipo.getColumna());
        }
    }

}

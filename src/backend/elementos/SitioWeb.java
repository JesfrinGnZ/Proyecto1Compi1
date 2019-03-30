/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.elementos;

import backend.excepciones.FaltaDeAtributoObligatorioException;

/**
 *
 * @author jesfrin
 */
public class SitioWeb {
    
    private String id,usuarioCreacion,fechaCreacion,fechaModificacion,usuarioModificacion;
    
    public SitioWeb(){   
    }
    /**\
     * 
     * @param valor
     * @param tipo
     * @return true si se pudo asignar el valor, es decir no es repetitivo
     */
    public boolean darValores(String valor, String tipo){
        switch(tipo){
            case "id":
                if(this.id==null){
                    this.id=valor;
                    return true;
                }
                break;
            case "usuarioCreacion":
                if(this.usuarioCreacion==null){
                    this.usuarioCreacion=valor;
                    return true;
                }
                break;
            case "fechaCreacion":
                if(this.fechaCreacion==null){
                    this.fechaCreacion=valor;
                    return true;
                }
                break;
            case "fechaModificacion":
                if(this.fechaModificacion==null){
                    this.fechaModificacion=valor;
                    return true;
                }
                break;
            case "usuarioModificacion":
                if(this.usuarioModificacion==null){
                    this.usuarioModificacion=valor;
                    return true;
                }
                break;
        }
        return false;
    }
    
    /**
     * Verifica si el objeto cuenta con los datos obligatorios
     * @throws backend.excepciones.FaltaDeAtributoObligatorioException
     */
    public void verificarDatosObligatorios() throws FaltaDeAtributoObligatorioException{
        if(this.id==null){
            throw new FaltaDeAtributoObligatorioException();
        }
    }
    
    /**
     * Verifica los datos que se han ingresado
     */
    public void escribirDatos(){
        System.out.println("Id:"+this.id);
        System.out.println("UsuariCreacion:"+this.usuarioCreacion);
        System.out.println("FechaCreacion:"+this.fechaCreacion);
        System.out.println("FechaModificacion"+this.fechaModificacion);
        System.out.println("UsuarioModificacion:"+this.usuarioModificacion);
    }
    
    
}

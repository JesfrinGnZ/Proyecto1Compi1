/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.manejadoresDeArchivosDeTexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesfrin
 */
public class LectorDeDatos {
    
    public static String leerDatos(){
        String usuarios="";
        File direccionDeUsuarios = new File("/home/jesfrin/Documentos/ArchivosP1Compi1/Usuarios.txt");
        try {
            String aux;
            BufferedReader bf = new BufferedReader(new FileReader(direccionDeUsuarios));
            while((aux=bf.readLine())!=null){
                usuarios+=aux+"\n";
            }
            bf.close();
        } catch (Exception ex) {
            Logger.getLogger(LectorDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }
}

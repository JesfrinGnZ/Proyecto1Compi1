/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.Conexion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesfrin
 */
public class Servidor extends Observable implements Runnable {

    private final ServerSocket servidor;
    private Socket sc;
    private  int puerto;
    private DataInputStream in;

    public Servidor(int puerto) throws IOException {
        this.puerto = puerto;
        this.servidor = new ServerSocket(this.puerto);

    }

    @Override
    public void run() {
        try {
            iniciarServidor();
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void iniciarServidor() throws IOException {
        System.out.println("SERVIDOR INICIADO");
        //Siempre estara escuchando peticiones 
        while (true) {
            this.sc = servidor.accept();
            System.out.println("Cliente conectado");
            in = new DataInputStream(sc.getInputStream());//Para lectura de mensajes
            String mensaje = in.readUTF();
            System.out.println(mensaje);
            //Informar de actualizacion
            this.setChanged();
            this.notifyObservers(mensaje);
            this.clearChanged();
            //Se cierra el flujo
            sc.close();
            System.out.println("Cliente desconectado");
        }
    }

}

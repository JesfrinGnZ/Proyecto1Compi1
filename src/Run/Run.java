/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import backend.elementos.Usuario;
import frontend.gui.ClienteFrame;
import frontend.gui.LogInFrame;

/**
 *
 * @author jesfrin
 */
public class Run {

    public static void main(String[] args) {
        /*
        LogInFrame logIn = new LogInFrame();
        logIn.setVisible(true);
        */
        
        Usuario usuario = new Usuario("Usuario", "1234");
        ClienteFrame frame = new ClienteFrame(usuario);
        frame.setVisible(true);
        
    }
}

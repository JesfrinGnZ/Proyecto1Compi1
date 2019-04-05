/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import backend.Conexion.Cliente;
import backend.elementos.Usuario;
import frontend.gui.ClienteFrame;
import frontend.gui.LogInFrame;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesfrin
 */
public class Run {

    public static void main(String[] args) {

        LogInFrame logIn = new LogInFrame();
        logIn.setVisible(true);

        /*
            Usuario usuario = new Usuario("Usuario", "1234");
            ClienteFrame frame = new ClienteFrame(usuario);
            frame.setVisible(true);
         */
      
    }

    public static boolean verificarSiFechaEsCorrecta(String fecha) {
        String[] numeros = fecha.split("-");
        int year = Integer.parseInt(numeros[0]);
        int month = Integer.parseInt(numeros[1]);
        int day = Integer.parseInt(numeros[2]);
        try {
            LocalDate date = LocalDate.of(year, month, day);
            return true;
        } catch (DateTimeException ex) {
            return false;
        }
    }

}

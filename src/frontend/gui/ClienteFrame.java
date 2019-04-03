/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.gui;

import Run.Run;
import backend.analizadorParaTextoDeCliente.AnalizadorLexicoTextoCliente;
import backend.analizadorParaTextoDeCliente.parser;
import backend.elementos.Usuario;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;

/**
 *
 * @author jesfrin
 */
public class ClienteFrame extends javax.swing.JFrame {

    private boolean seDebeEnviarElTexto;
    private String texto;
    private Usuario usuario;

    /**
     * Creates new form ClienteFrame
     */
    public ClienteFrame(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        this.setLocationRelativeTo(null);//Configurando su posicion en el centro
        this.seDebeEnviarElTexto = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        enviarTextoButton = new javax.swing.JButton();
        numeroDeColumnaLabel = new javax.swing.JLabel();
        numeroDeFilaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoDeClienteTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        erroresTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enviarTextoButton.setFont(new java.awt.Font("TlwgTypewriter", 0, 18)); // NOI18N
        enviarTextoButton.setText("Enviar");
        enviarTextoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarTextoButtonActionPerformed(evt);
            }
        });

        numeroDeColumnaLabel.setFont(new java.awt.Font("TlwgTypewriter", 0, 18)); // NOI18N
        numeroDeColumnaLabel.setText("#Columna");

        numeroDeFilaLabel.setFont(new java.awt.Font("TlwgTypewriter", 0, 18)); // NOI18N
        numeroDeFilaLabel.setText("#Linea");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enviarTextoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroDeFilaLabel)
                    .addComponent(numeroDeColumnaLabel))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(numeroDeFilaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numeroDeColumnaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(enviarTextoButton)
                .addGap(41, 41, 41))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 130, -1));

        textoDeClienteTextArea.setColumns(20);
        textoDeClienteTextArea.setFont(new java.awt.Font("TlwgTypewriter", 0, 14)); // NOI18N
        textoDeClienteTextArea.setRows(5);
        textoDeClienteTextArea.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textoDeClienteTextAreaCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(textoDeClienteTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 473, 296));

        erroresTextArea.setEditable(false);
        erroresTextArea.setColumns(20);
        erroresTextArea.setRows(5);
        jScrollPane2.setViewportView(erroresTextArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 450, 290));

        jLabel1.setFont(new java.awt.Font("TlwgTypewriter", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("APLICACION CLIENTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("TlwgTypewriter", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Analisis");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 33, -1, -1));

        jLabel3.setFont(new java.awt.Font("TlwgTypewriter", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Instrucciones");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 33, -1, -1));

        jLabel4.setFont(new java.awt.Font("TlwgTypewriter", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Respuestas del manejador");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("TlwgTypewriter", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 420, 1080, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarTextoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarTextoButtonActionPerformed
        this.erroresTextArea.setText("");
        this.erroresTextArea.setText("******************Analisis iniciado******************\n");
        analizarTexto();
        this.erroresTextArea.append("******************Analisis finalizado******************\n");
        if (seDebeEnviarElTexto) {
            this.erroresTextArea.append("El analisis fue EXITOSO!!!!!! se ha enviado las instrucciones");
        } else {
            this.erroresTextArea.append("El analisis concluyo con ERRORES!!!!!! verifique y pruebe de nuevo");
            this.seDebeEnviarElTexto=true;
        }
    }//GEN-LAST:event_enviarTextoButtonActionPerformed

    private void textoDeClienteTextAreaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textoDeClienteTextAreaCaretUpdate
        int pos = evt.getDot(); //mira los pasos del puntero
        try {
            int fila = textoDeClienteTextArea.getLineOfOffset(pos) + 1; //devuelve la fila
            int columna = pos - textoDeClienteTextArea.getLineStartOffset(fila - 1) + 1; //devuelve la columna
            this.numeroDeColumnaLabel.setText("#Columna:" + " " + columna + "");
            this.numeroDeFilaLabel.setText("#Linea:" + " " + fila);

        } catch (BadLocationException exc) {
        }
    }//GEN-LAST:event_textoDeClienteTextAreaCaretUpdate

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviarTextoButton;
    private javax.swing.JTextArea erroresTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel numeroDeColumnaLabel;
    private javax.swing.JLabel numeroDeFilaLabel;
    private javax.swing.JTextArea textoDeClienteTextArea;
    // End of variables declaration//GEN-END:variables

    public void setSeDebeEnviarElTexto(boolean valor) {
        this.seDebeEnviarElTexto = valor;
    }

    public boolean getSeDebeEnviarElTexto() {
        return this.seDebeEnviarElTexto;
    }

    public String getTexto() {
        return texto;
    }

    public void concatenarTextoAlInicio(String textoNuevo){
        if(this.texto==null){
            this.texto=textoNuevo;
        }else{
            String copiaDeTexto=this.texto;
            this.texto=textoNuevo+copiaDeTexto;
        }
    }
    
    public void concatenarTextoAlFinal(String textoNuevo){
        if(this.texto==null){
            this.texto=textoNuevo;
        }else{
            this.texto+=textoNuevo;
        }
    }

    private void analizarTexto() {
        String instruccion = this.textoDeClienteTextArea.getText();
        if (instruccion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese texto para continuar");
        } else {
            AnalizadorLexicoTextoCliente lexico = new AnalizadorLexicoTextoCliente(new BufferedReader(new StringReader(instruccion)));
            lexico.iniciarFrame(this);
            parser sintactico = new parser(lexico, this.usuario, this);
            try {
                sintactico.parse();
            } catch (Exception ex) {
                Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void mostrarError(String tipo, int linea, int columna, String lexema) {
        String texto;
        if (tipo.equalsIgnoreCase("lexico")) {
            texto = "Error LEXICO en linea:" + linea + " " + "Columna:" + columna + " " + "Lexema:" + lexema + "\n";
        } else if (tipo.equalsIgnoreCase("sintactico")) {
            texto = "Error SINTACTICO linea:" + linea + " " + "Columna:" + columna + " " + "Lexema:" + lexema + "\n";
        } else {
            texto = "Error SINTACTICO VALOR REPETIDO o INCORRECTO linea:" + linea + " " + "Columna:" + columna + " " + "Lexema:" + lexema + "\n";
        }

        this.erroresTextArea.append(texto);
    }

    public void mostrarErrorSintactico(String mensaje) {
        this.erroresTextArea.append(mensaje + "\n");
    }

}

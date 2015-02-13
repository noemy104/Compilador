/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import convertidor.Analizador;
import convertidor.AnalizadorSintactico;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("COMPILADOR");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorGeneral = new javax.swing.JPanel();
        btnTransformar = new javax.swing.JButton();
        txtIngreso = new javax.swing.JTextField();
        lblSalida = new javax.swing.JLabel();
        contenedorErrores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtErrores = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorGeneral.setBackground(new java.awt.Color(0, 102, 102));
        contenedorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transformar Minúsculas a Mayúsculas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnTransformar.setBackground(new java.awt.Color(204, 204, 255));
        btnTransformar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tick_32.png"))); // NOI18N
        btnTransformar.setText("TRANSFORMAR");
        btnTransformar.setToolTipText("");
        btnTransformar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransformarActionPerformed(evt);
            }
        });

        txtIngreso.setText("             CONVERTIR");

        lblSalida.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        lblSalida.setForeground(new java.awt.Color(255, 153, 153));
        lblSalida.setBorder(javax.swing.BorderFactory.createTitledBorder("RESULTADO"));

        contenedorErrores.setBorder(javax.swing.BorderFactory.createTitledBorder("Errores"));

        txtErrores.setEditable(false);
        txtErrores.setColumns(20);
        txtErrores.setRows(5);
        jScrollPane1.setViewportView(txtErrores);

        javax.swing.GroupLayout contenedorErroresLayout = new javax.swing.GroupLayout(contenedorErrores);
        contenedorErrores.setLayout(contenedorErroresLayout);
        contenedorErroresLayout.setHorizontalGroup(
            contenedorErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorErroresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );
        contenedorErroresLayout.setVerticalGroup(
            contenedorErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorErroresLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img_limpiar.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorGeneralLayout = new javax.swing.GroupLayout(contenedorGeneral);
        contenedorGeneral.setLayout(contenedorGeneralLayout);
        contenedorGeneralLayout.setHorizontalGroup(
            contenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorErrores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(contenedorGeneralLayout.createSequentialGroup()
                            .addComponent(lblSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(contenedorGeneralLayout.createSequentialGroup()
                            .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(btnTransformar))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        contenedorGeneralLayout.setVerticalGroup(
            contenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorGeneralLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(contenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransformar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(22, 22, 22)
                .addComponent(contenedorErrores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransformarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransformarActionPerformed
        txtErrores.setText("");
        this.main();
    }//GEN-LAST:event_btnTransformarActionPerformed
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtIngreso.setText("");
        txtIngreso.requestFocus();
        txtErrores.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed
    public void main() {
        try {
            escribir("entrada.txt");//se guarda en un archivo externo lo que se escribio
            Analizador lex = new Analizador(new FileReader("entrada.txt"));//se le pasa al analizador lexico lo que se escribio
            AnalizadorSintactico parser = new AnalizadorSintactico(lex, txtErrores);//se le pasa al analizador sitactico lo que genero el analizador lexico
            try {
                parser.parse(); //se encarga de verificar todo y la ejecucion del respestivo codigo
                //System.out.println("--->>>>"+parser.palabra);
                lblSalida.setText(parser.palabra);
            } catch (java.lang.Exception el) {
                txtErrores.setText("error encontrado: " + el.getMessage());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ex " + ex);
        }
    }

    public void escribir(String direccion) {
        //metodo que guarda lo que esta escrito en un archivo de texto
        try {
            FileWriter writer = new FileWriter(direccion);
            PrintWriter print = new PrintWriter(writer);
            print.print(txtIngreso.getText());
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnTransformar;
    private javax.swing.JPanel contenedorErrores;
    private javax.swing.JPanel contenedorGeneral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JTextArea txtErrores;
    private javax.swing.JTextField txtIngreso;
    // End of variables declaration//GEN-END:variables
}

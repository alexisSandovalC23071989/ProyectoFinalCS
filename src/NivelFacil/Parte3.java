/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NivelFacil;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author zujeily
 */
public class Parte3 extends javax.swing.JFrame {
Fondo Stranger =new Fondo();
private int count=0;
    /**
     * Creates new form Parte3
     */
    public Parte3() {
        this.setContentPane(Stranger);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Juego Escapando de SAW");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        jBmSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Text1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Text1.setForeground(new java.awt.Color(255, 0, 0));
        Text1.setText("Cuando volvio a ver sintio como todo su cuerpo lo recorrio un frio sin control");

        Text2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Text2.setForeground(new java.awt.Color(255, 0, 0));
        Text2.setText("Y sintio miedo por que sabia que su padre le debia mucha plata a varias personas");

        jBmSiguiente.setBackground(new java.awt.Color(0, 0, 0));
        jBmSiguiente.setForeground(new java.awt.Color(255, 0, 0));
        jBmSiguiente.setText("Siguiente");
        jBmSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Text1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 49, Short.MAX_VALUE)
                        .addComponent(Text2)
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBmSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(Text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(Text2)
                .addGap(40, 40, 40)
                .addComponent(jBmSiguiente)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBmSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmSiguienteActionPerformed
      
       AnimacionEfecto AE =new AnimacionEfecto();
        
          count +=1;
        if(count ==1){
          Text1.setVisible(AE.InvisibleMode());
        }else if(count ==2){
          Text2.setVisible(AE.InvisibleMode());
        
        }else{
            
            Parte4 siguiente =new Parte4();
            siguiente.setVisible(true);
            this.setVisible(false);
        }     
        
        
    }//GEN-LAST:event_jBmSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(Parte3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parte3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parte3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parte3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parte3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JButton jBmSiguiente;
    // End of variables declaration//GEN-END:variables

class Fondo extends JPanel{
     private Image Stranger;         

     @Override
     public void paint (Graphics imagen){
         
     Stranger =new ImageIcon(getClass().getResource("/imagenes/StakerShiiit.jpg")).getImage();
     imagen.drawImage(Stranger, 0, 0, getWidth(), getHeight(), this);
     setOpaque(false);
     super.paint(imagen);
     
      
        
        
     }
         
     }










}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NivelFacil;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.EventQueue;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
/**
 *
 * @author zujeily
 */
public class Parte1 extends javax.swing.JFrame {
Fondo Gymatnigt =new Fondo();
   private int count=0;
    /**
     * Creates new form Parte1
     */
    public Parte1() {
        this.setContentPane(Gymatnigt);
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

        SiguienteBtn = new javax.swing.JButton();
        jText1 = new javax.swing.JLabel();
        JText2 = new javax.swing.JLabel();
        jText3 = new javax.swing.JLabel();
        jText4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(600, 626));

        SiguienteBtn.setBackground(new java.awt.Color(0, 0, 0));
        SiguienteBtn.setForeground(new java.awt.Color(255, 0, 0));
        SiguienteBtn.setText("Siguiente");
        SiguienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteBtnActionPerformed(evt);
            }
        });

        jText1.setVisible(false);
        jText1.setBackground(new java.awt.Color(255, 0, 0));
        jText1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jText1.setForeground(new java.awt.Color(255, 0, 0));
        jText1.setText("Oliver un estudiante de Univerisdad que venia saliendo de la Gym");

        JText2.setVisible(false);
        JText2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JText2.setForeground(new java.awt.Color(255, 0, 0));
        JText2.setText("Iba de camino a su casa, caminaba apresurado porque eran las 11 p.m y");

        jText3.setVisible(false);
        jText3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jText3.setForeground(new java.awt.Color(255, 0, 0));
        jText3.setText("perdió la noción del tiempo mientras entrenaba, tanto asi que lo noto");

        jText4.setVisible(false);
        jText4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jText4.setForeground(new java.awt.Color(255, 0, 0));
        jText4.setText("por que el empleado del lugar apago las luces para darselo a saber ");
        jText4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jText4MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SiguienteBtn)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText4)
                    .addComponent(jText3, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JText2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(JText2)
                .addGap(89, 89, 89)
                .addComponent(jText3)
                .addGap(89, 89, 89)
                .addComponent(jText4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(SiguienteBtn)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SiguienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteBtnActionPerformed
        // Mostrar los Labels con texto
        boolean click=true;
         count +=1;
        if(count ==1){
           jText1.setVisible(true);
        }else if(count ==2){
           JText2.setVisible(true);
        }else if(count ==3){
            jText3.setVisible(true);
        }else if(count ==4){
            jText4.setVisible(true);
        }else if(count ==5){
            jText1.setVisible(false);
            JText2.setVisible(false);
            jText3.setVisible(false);
            jText4.setVisible(false);    
        }else{
            Parte2 siguiente =new Parte2();
            siguiente.setVisible(true);
            this.setVisible(false);
        }   
    }//GEN-LAST:event_SiguienteBtnActionPerformed

    private void jText4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jText4MouseReleased

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
            java.util.logging.Logger.getLogger(Parte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parte1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parte1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JText2;
    private javax.swing.JButton SiguienteBtn;
    private javax.swing.JLabel jText1;
    private javax.swing.JLabel jText3;
    private javax.swing.JLabel jText4;
    // End of variables declaration//GEN-END:variables


class Fondo extends JPanel{
     private Image Gymatnigt;         

     @Override
     public void paint (Graphics imagen){
         
     Gymatnigt =new ImageIcon(getClass().getResource("/imagenes/hombregimnasio.png")).getImage();
     imagen.drawImage(Gymatnigt, 0, 0, getWidth(), getHeight(), this);
     setOpaque(false);
     super.paint(imagen);
     
      
        
        
     }
         
     }





}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NivelMedio;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author aldav
 */
public class Juego2 extends javax.swing.JFrame {
    
     private Nivel2 controlador2;

    private Color color1 = Color.BLACK;
    private Color color2 = Color.WHITE;
    
    
    
    public Juego2() {
        
        
        
        JFrame frame = new JFrame();
        
        controlador2 = new Nivel2();
        
      // ColorFondo mcolor=new ColorFondo();
       // frame.add(mcolor);
        this.setSize(748, 519);
        this.setLocationRelativeTo(null);// Se utiliza para centrar la ventana de Jframe.
        this.setTitle("Juego Escapando de SAW");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxOjo = new javax.swing.JCheckBox();
        jCheckBoxPajaro = new javax.swing.JCheckBox();
        jCheckBoxNube = new javax.swing.JCheckBox();
        jCheckBoxTiempo = new javax.swing.JCheckBox();
        jButtonValidar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel2.setBackground(new java.awt.Color(0, 0, 0));
        Panel2.setPreferredSize(new java.awt.Dimension(640, 480));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText(" Puedo volar, pero no tengo alas , Puedo llorar , pero no tengo ojos.");
        Panel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 730, 60));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Donde quiera que vaya la oscuridad me sigue. Quien soy yo ???");
        Panel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 680, 60));

        jCheckBoxOjo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jCheckBoxOjo.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBoxOjo.setText("  Ojo");
        jCheckBoxOjo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxOjoActionPerformed(evt);
            }
        });
        Panel2.add(jCheckBoxOjo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jCheckBoxPajaro.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jCheckBoxPajaro.setForeground(new java.awt.Color(255, 0, 51));
        jCheckBoxPajaro.setText("  Pajaro");
        jCheckBoxPajaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPajaroActionPerformed(evt);
            }
        });
        Panel2.add(jCheckBoxPajaro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jCheckBoxNube.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jCheckBoxNube.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBoxNube.setText("  Nube");
        jCheckBoxNube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNubeActionPerformed(evt);
            }
        });
        Panel2.add(jCheckBoxNube, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jCheckBoxTiempo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jCheckBoxTiempo.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBoxTiempo.setText("   Tiempo");
        jCheckBoxTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTiempoActionPerformed(evt);
            }
        });
        Panel2.add(jCheckBoxTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jButtonValidar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonValidar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonValidar.setText("Comprobar Juego");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });
        Panel2.add(jButtonValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 130, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sawpeque??a.jpg"))); // NOI18N
        jLabel4.setText("jLabel3");
        Panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 230, 190));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jPanel1.add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         /// Con este Objeto me puedo pasar de de inicio con el boton indicado.
        Nivel_Intermedio juego1 = new Nivel_Intermedio();
         juego1.setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxOjoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxOjoActionPerformed
     // Se utiliza para que solo se marque una sola opcion. 
     Botones.add(jCheckBoxOjo);
     jCheckBoxOjo.setActionCommand("1");
    controlador2.aumentarContador(1);
     
     
     
     
     
// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxOjoActionPerformed

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
      
         if (controlador2.puedeSeleccionar()) {
            if (controlador2.esGanador()) {
                JOptionPane.showMessageDialog(null, "",
                        "Ganaste",JOptionPane.WARNING_MESSAGE,new ImageIcon("src/Imagenes/ganaste1.png"));
                dispose();
                
              
            } else {
                JOptionPane.showMessageDialog(null, "",
                        "Perdiste",JOptionPane.WARNING_MESSAGE, new ImageIcon("src/Imagenes/Perdiste.png"));
                dispose();
                Introducion2 introduccion2 = new Introducion2();
                introduccion2.setVisible(true);
               
               
            }
            
        }
        
       
    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jCheckBoxPajaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPajaroActionPerformed
     Botones.add(jCheckBoxPajaro);
     jCheckBoxPajaro.setActionCommand("2");
    controlador2.aumentarContador(2);
        
        
    }//GEN-LAST:event_jCheckBoxPajaroActionPerformed

    private void jCheckBoxNubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNubeActionPerformed
     Botones.add(jCheckBoxNube);
     jCheckBoxNube.setActionCommand("3");
     controlador2.aumentarContador(3);
     
        
    }//GEN-LAST:event_jCheckBoxNubeActionPerformed

    private void jCheckBoxTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTiempoActionPerformed
        
     Botones.add(jCheckBoxTiempo);
     jCheckBoxTiempo.setActionCommand("4");
     controlador2.aumentarContador(4);
    
    }//GEN-LAST:event_jCheckBoxTiempoActionPerformed
  
    
    private void colocarRadioBotones() {

        JRadioButton radioBoton1 = new JRadioButton("Opcion 1", false);/// sin le pongo true sale marcado la opcion
        radioBoton1.setBounds(50, 100, 200, 50);
        radioBoton1.setEnabled(true);// para quitar la opcion disponible
        radioBoton1.setText("Programacion");//// Para agregar el texto
        radioBoton1.setFont(new Font("cooper black", 0, 20));///tamano de la letra

        Panel2.add(radioBoton1);/// insertar dentro del panel.

        // radioBoton1.add(radioBoton1);/// insertar dentro del panel.
        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);/// sin le pongo true sale marcado la opcion
        radioBoton2.setBounds(50, 150, 100, 50);
        Panel2.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);/// sin le pongo true sale marcado la opcion
        radioBoton3.setBounds(50, 200, 100, 50);
        Panel2.add(radioBoton3);

        ButtonGroup grupoRadioBotones = new ButtonGroup();  /// Se utiliza para hacer un grupo de botones
        grupoRadioBotones.add(radioBoton1);  // se utiliza [ara agregar los botones
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
        

        //Hay que  hacer un grupo de radio botones  para que se marque solo uno y no todos
        // 
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
            java.util.logging.Logger.getLogger(Juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Botones;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JCheckBox jCheckBoxNube;
    private javax.swing.JCheckBox jCheckBoxOjo;
    private javax.swing.JCheckBox jCheckBoxPajaro;
    private javax.swing.JCheckBox jCheckBoxTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ControladorAcceso;
import java.awt.Image;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author ab
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        Calendar cal=Calendar.getInstance();
        String fecha=cal.get(Calendar.DATE)+"/"+cal.get(Calendar.MONTH)+"/"+cal.get(cal.YEAR);
        String hora=cal.get(cal.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(cal.SECOND); 
        this.lblFecha.setText(fecha); 
        this.lblHora.setText(hora);
        ImageIcon imagen= new ImageIcon(getClass().getResource("/Images/17010.jpg"));
        Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(icono);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRespuesta1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        Bback = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("00/00/0000");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("00:00");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 60, -1));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        Bback.setBackground(new java.awt.Color(0, 0, 0));
        Bback.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        Bback.setForeground(new java.awt.Color(255, 255, 255));
        Bback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salida.png"))); // NOI18N
        Bback.setText("Volver");
        Bback.setBorderPainted(false);
        Bback.setContentAreaFilled(false);
        Bback.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bback.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iniciar-sesionSelected.png"))); // NOI18N
        Bback.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bback.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Bback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BbackMouseClicked(evt);
            }
        });
        Bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbackActionPerformed(evt);
            }
        });
        getContentPane().add(Bback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        jMenu1.setText("Administracion");

        jMenu2.setText("Comisario");

        jMenuItem6.setText("Agregar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenu1.add(jMenu2);

        jMenu5.setText("Complejo");

        jMenuItem13.setText("Agregar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenu1.add(jMenu5);

        jMenu7.setText("Polideportivo");

        jMenuItem20.setText("Agregar");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem20);

        jMenu1.add(jMenu7);

        jMenu6.setText("Unico Deporte");

        jMenuItem1.setText("Agregar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenu1.add(jMenu6);

        jMenu8.setText("Cancha");

        jMenuItem24.setText("Agregar");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem24);

        jMenu1.add(jMenu8);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Solicitudes");

        jMenuItem10.setText("Revisar solicitudes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Exit");

        jMenuItem11.setText("Salir");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Volver al login");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
    ControladorAcceso ac= new ControladorAcceso();
    if("".equals(ac.verificaConexion())){
    new Solicitudes().setVisible(true);
    this.dispose();
    }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
    ControladorAcceso ac= new ControladorAcceso();
    if("".equals(ac.verificaConexion())){
    new ComplejoAgregar().setVisible(true);
    this.dispose();
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    ControladorAcceso ac= new ControladorAcceso();
    if("".equals(ac.verificaConexion())){
    new ComisarioAgregar().setVisible(true);
    this.dispose();
    }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
     ControladorAcceso ac= new ControladorAcceso();
    if("".equals(ac.verificaConexion())){
    new PolideportivoAgregar().setVisible(true);
    this.dispose();
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 ControladorAcceso ac= new ControladorAcceso();
    if("".equals(ac.verificaConexion())){
    new UnicoAgregar().setVisible(true);
    this.dispose();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
    ControladorAcceso ac= new ControladorAcceso();
    if("".equals(ac.verificaConexion())){
    new CanchaAgregar().setVisible(true);
    this.dispose();
    } 
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
    this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
    ControladorAcceso ac= new ControladorAcceso();
    if("".equals(ac.verificaConexion())){
    new IniciarSesion().setVisible(true);
    this.dispose();
    } 
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void BbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BbackMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BbackMouseClicked

    private void BbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbackActionPerformed
        Inicio ini = new Inicio();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BbackActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bback;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblRespuesta1;
    // End of variables declaration//GEN-END:variables
}

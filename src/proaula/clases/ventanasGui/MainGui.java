
package proaula.clases.ventanasGui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proaula.TextPrompt;
import proaula.clases.Cliente;

public class MainGui extends javax.swing.JFrame {

    public static List<Cliente> clientes;
    InterfazCine iCine = new InterfazCine();
    public MainGui() {
        initComponents();
       
        TextPrompt txt1 = new TextPrompt("Digite su correo...", txtMail);
        TextPrompt txt2 = new TextPrompt("Digite su Clave...", txtClave);
        clientes = new ArrayList<>();
        this.setLocationRelativeTo(this);
        JlabdatosIncorrectos.setForeground(Color.RED);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        JlabdatosIncorrectos = new javax.swing.JLabel();
        JlabelClave = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JlabelCorreo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnIniciar = new javax.swing.JButton();
        jlabIcons1 = new javax.swing.JLabel();
        JlabelIconClave = new javax.swing.JLabel();
        registrarse = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        JlabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(20,33,60)
        );
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrar.setText("X");
        btnCerrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.setFocusable(false);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 40, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JlabdatosIncorrectos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(JlabdatosIncorrectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 170, 27));

        JlabelClave.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        JlabelClave.setText("CLAVE");
        jPanel2.add(JlabelClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 188, 169, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 262, 240, 8));

        JlabelCorreo.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        JlabelCorreo.setText("CORREO");
        jPanel2.add(JlabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 56, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 129, 240, 10));

        btnIniciar.setBackground(new java.awt.Color(20, 33, 61));
        btnIniciar.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("INICIAR");
        btnIniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarMouseExited(evt);
            }
        });
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 136, 34));

        jlabIcons1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proaula/clases/iconos/icons8-usuario-masculino-en-círculo-30.png"))); // NOI18N
        jPanel2.add(jlabIcons1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 86, -1, 37));

        JlabelIconClave.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JlabelIconClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proaula/clases/iconos/icons8-accede-redondeado-derecho-30.png"))); // NOI18N
        jPanel2.add(JlabelIconClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 218, -1, 40));

        registrarse.setBackground(new java.awt.Color(255, 255, 255));
        registrarse.setText("¿No estas registrado?");
        registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarseMouseEntered(evt);
            }
        });
        jPanel2.add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 180, 20));

        txtMail.setBorder(null);
        jPanel2.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 220, 30));

        txtClave.setBorder(null);
        jPanel2.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 222, 230, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 74, 310, 420));

        JlabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine-en-familia.jpg"))); // NOI18N
        getContentPane().add(JlabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 840, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        boolean band = false;
        String correo = txtMail.getText();
        String contraseña = txtClave.getText();
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
            if (correo.equals(clientes.get(i).getCorreo()) && contraseña.equals(clientes.get(i).getContraseña())) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
                band = true;
                dispose();
                break;
            }
        }

        if (txtClave.getText().equals("") && txtMail.getText().equals("") ) {
            JlabdatosIncorrectos.setText("Campos vacios");
        } else if (!txtClave.getText().equals("") && txtMail.getText().equals("") ) {
            JlabdatosIncorrectos.setText("Digite el correo");
        } else if (txtClave.getText().equals("") && !txtMail.getText().equals("") ) {
            JlabdatosIncorrectos.setText("Digite la contraseña");
        } else if (!txtClave.getText().equals("") && !txtMail.getText().equals("")&& band==false) {
            JlabdatosIncorrectos.setText("Usuario no encontrado");
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBackground(Color.red);
        btnCerrar.setForeground(Color.white);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBackground(Color.white);
        btnCerrar.setForeground(Color.black);
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked

//        iCine.setOpacity(0.1f); 
        setVisible(false);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        btnIniciar.setBackground(new java.awt.Color(10, 20, 90));
        btnIniciar.setFont(new java.awt.Font("Serif", 0, 18));
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        btnIniciar.setBackground(new java.awt.Color(20, 33, 60));
        btnIniciar.setFont(new java.awt.Font("Serif", 0, 14));

    }//GEN-LAST:event_btnIniciarMouseExited

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
        btnIniciar.setFocusable(false);
    }//GEN-LAST:event_btnIniciarMouseClicked

    private void registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseMouseClicked
        Registro r = new Registro(this, true);
      
        r.setVisible(true);
    }//GEN-LAST:event_registrarseMouseClicked

    private void registrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseMouseEntered
      
    }//GEN-LAST:event_registrarseMouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabdatosIncorrectos;
    private javax.swing.JLabel JlabelClave;
    private javax.swing.JLabel JlabelCorreo;
    private javax.swing.JLabel JlabelFondo;
    private javax.swing.JLabel JlabelIconClave;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlabIcons1;
    private javax.swing.JLabel registrarse;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtMail;
    // End of variables declaration//GEN-END:variables

}

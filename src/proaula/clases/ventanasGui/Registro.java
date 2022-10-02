/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proaula.clases.ventanasGui;

import java.awt.Color;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import proaula.TextPrompt;
import proaula.clases.Cliente;
      
public class Registro extends javax.swing.JDialog {
    MainGui m = new MainGui();
    public Registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        TextPrompt txt = new TextPrompt("Nombre", txtNombre);
        TextPrompt txt2 = new TextPrompt("Apellido", txtApellido);
        TextPrompt txt3= new TextPrompt("Correo", txtCorreo);
        TextPrompt txt4 = new TextPrompt("Contraseña", txtContraseña);
        setLocationRelativeTo(null);
        dia();
        año();
        error1.setVisible(false);
        error2.setVisible(false);
        error3.setVisible(false);
        error4.setVisible(false);
        error5.setVisible(false);
        error6.setVisible(false);
        error7.setVisible(false);
        error8.setVisible(false);
    }
   
    public void dia(){
           for(int i = 1 ; i<31 ; i++){
               dia.addItem(String.valueOf(i));
        }
    }
    public void año(){
        for (int i = 2022; i > 1900; i--) {
            año.addItem(String.valueOf(i));
        }
    }
    public int Edad(){
         int edad = Integer.parseInt((String) año.getSelectedItem());
         edad = 2022 - edad;
         return edad;
     }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        error2 = new javax.swing.JLabel();
        error3 = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        error4 = new javax.swing.JLabel();
        error7 = new javax.swing.JLabel();
        error5 = new javax.swing.JLabel();
        error8 = new javax.swing.JLabel();
        error6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnHombre = new javax.swing.JRadioButton();
        btnMujer = new javax.swing.JRadioButton();
        btnCompañere = new javax.swing.JRadioButton();
        labelSexo = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        labelFecha = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        dia = new javax.swing.JComboBox<>();
        año = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusCycleRoot(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 33, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setBackground(new java.awt.Color(20, 33, 60));
        txtTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR");
        txtTitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 40));

        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 70));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 30));

        error2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proaula/clases/iconos/icon error.png"))); // NOI18N
        jPanel1.add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 40, 50));

        error3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proaula/clases/iconos/icon error.png"))); // NOI18N
        jPanel1.add(error3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 40, 50));

        error1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proaula/clases/iconos/icon error.png"))); // NOI18N
        jPanel1.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, 30));

        error4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proaula/clases/iconos/icon error.png"))); // NOI18N
        jPanel1.add(error4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 40, 50));

        error7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proaula/clases/iconos/icon error.png"))); // NOI18N
        jPanel1.add(error7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 40, 50));

        error5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proaula/clases/iconos/icon error.png"))); // NOI18N
        jPanel1.add(error5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 40, 50));

        error8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proaula/clases/iconos/icon error.png"))); // NOI18N
        jPanel1.add(error8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 40, 60));

        error6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proaula/clases/iconos/icon error.png"))); // NOI18N
        jPanel1.add(error6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 40, 50));

        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 150, 30));

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 290, 30));

        btnHombre.setBackground(new java.awt.Color(20, 33, 61));
        buttonGroup1.add(btnHombre);
        btnHombre.setForeground(new java.awt.Color(255, 255, 255));
        btnHombre.setText("Hombre");
        btnHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHombreActionPerformed(evt);
            }
        });
        jPanel1.add(btnHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        btnMujer.setBackground(new java.awt.Color(20, 33, 61));
        buttonGroup1.add(btnMujer);
        btnMujer.setForeground(new java.awt.Color(255, 255, 255));
        btnMujer.setText("Mujer");
        jPanel1.add(btnMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        btnCompañere.setBackground(new java.awt.Color(20, 33, 61));
        buttonGroup1.add(btnCompañere);
        btnCompañere.setForeground(new java.awt.Color(255, 255, 255));
        btnCompañere.setText("Compañere");
        jPanel1.add(btnCompañere, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        labelSexo.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        labelSexo.setForeground(new java.awt.Color(255, 255, 255));
        labelSexo.setText("Sexo");
        jPanel1.add(labelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 20, 20));

        btnRegistrar.setBackground(new java.awt.Color(252, 163, 17));
        btnRegistrar.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrarte");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 210, 40));

        labelFecha.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setText("Fecha de nacimiento");
        jPanel1.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 20));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 290, 30));

        dia.setModel(new javax.swing.DefaultComboBoxModel<>());
        jPanel1.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 50, 30));

        jPanel1.add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 70, 30));

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembte", " " }));
        jPanel1.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 420, 520));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCerrar.setText("X");
        btnCerrar.setBorder(null);
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
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHombreActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
       
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
     
    }//GEN-LAST:event_txtCorreoActionPerformed
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        boolean  InforCliente = true;
        
        //SACAR EL SEXO
        String sexo = "";
          if (btnHombre.isSelected()) {
            sexo = "Hombre";
        }else if(btnMujer.isSelected()){
            sexo = "Mujer";
        }else if (btnCompañere.isSelected()) {
            sexo = "Compañere";
        }if(sexo.equals("")){
            InforCliente = false;
            error8.setVisible(true);
        }else{
            error8.setVisible(false);
        }
       
          //ACTIVAR ERROR DE CAMPOS VACIOS
        if(txtNombre.getText().equals("")){
            error1.setVisible(true);
            InforCliente = false;
        }else{
            error1.setVisible(false);
        }if(txtApellido.getText().equals("")){
            error2.setVisible(true);
            InforCliente = false;
        }else{
            error2.setVisible(false);
        }if(txtCorreo.getText().equals("")){
            error3.setVisible(true);
            InforCliente = false;
        }else{
            error3.setVisible(false);
        }if(txtContraseña.getPassword().equals("")){
            error4.setVisible(true);
             InforCliente = false;
        }else{
            error5.setVisible(false);
        }
       
        
        //CREAR EL OBJETO
        if(InforCliente == true){
            Cliente cliente1 = new Cliente();
        cliente1.setNombre(txtNombre.getText());
        cliente1.setApellido(txtApellido.getText());
        String pass = new String (txtContraseña.getPassword());
        cliente1.setContraseña(pass);
        cliente1.setCorreo(txtCorreo.getText());
        cliente1.setGenero(sexo);
        cliente1.setEdad(Edad());
        System.out.println(año.getSelectedItem());
        System.out.println(cliente1.toString());
        m.clientes.add(cliente1);
        }
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
       btnCerrar.setBackground(Color.white);
        btnCerrar.setForeground(Color.black);
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBackground(Color.red);
        btnCerrar.setForeground(Color.white);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        btnRegistrar.setFocusable(false);
    }//GEN-LAST:event_btnRegistrarMouseClicked
 public int cal(int edad){
     int edadAc = 2022-edad;
     return edadAc;
 }

 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registro dialog = new Registro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> año;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JRadioButton btnCompañere;
    private javax.swing.JRadioButton btnHombre;
    private javax.swing.JRadioButton btnMujer;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel error3;
    private javax.swing.JLabel error4;
    private javax.swing.JLabel error5;
    private javax.swing.JLabel error6;
    private javax.swing.JLabel error7;
    private javax.swing.JLabel error8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPanel txtTitulo;
    // End of variables declaration//GEN-END:variables
}

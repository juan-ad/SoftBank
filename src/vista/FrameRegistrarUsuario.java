package vista;

import entidad.Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.UsuarioDAO;

/**
 *
 * @author Juan Jose
 */
public class FrameRegistrarUsuario extends javax.swing.JInternalFrame {
     
    private UsuarioDAO ud = new UsuarioDAO();
    private Icon m;
    public FrameRegistrarUsuario() {
        initComponents();
        this.setSize(586, 552);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        txtCedula = new rojeru_san.RSMTextFull();
        txtApellidos = new rojeru_san.RSMTextFull();
        txtNombres = new rojeru_san.RSMTextFull();
        txtPass = new rojeru_san.RSMPassView();
        txtDireccion = new rojeru_san.RSMTextFull();
        txtTelefono = new rojeru_san.RSMTextFull();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        comboRol = new rojerusan.RSComboMetro();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonRiple1.setText("Registrar");
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRiple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 280, -1));

        txtCedula.setPlaceholder("Cédula");
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 104, 200, 40));

        txtApellidos.setPlaceholder("Apellidos");
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 200, 40));

        txtNombres.setPlaceholder("Nombres");
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 200, 40));

        txtPass.setPlaceholder("Contraseña");
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 200, 40));

        txtDireccion.setPlaceholder("Dirección");
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 200, 40));

        txtTelefono.setPlaceholder("Teléfono ");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 200, -1));

        jPanel3.setBackground(new java.awt.Color(0, 112, 192));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REGISTRAR USUARIO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel7)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 90));

        comboRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Jefe Credito", "Auxiliar Credito" }));
        comboRol.setAlignmentY(0.3F);
        jPanel1.add(comboRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 112, 192));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 112, 192));
        jLabel2.setText("Rol de Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyReleased
    }//GEN-LAST:event_txtNombresKeyReleased

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
    }//GEN-LAST:event_txtApellidosKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        validarTexto(evt);
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        validarTexto(evt);
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        camposVacios();
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed
    
    void camposVacios(){
        
        if (txtNombres.getText().isEmpty() || txtCedula.getText().isEmpty() || txtApellidos.getText().isEmpty() || txtTelefono.getText().isEmpty() 
            || txtDireccion.getText().isEmpty() || txtPass.getText().isEmpty()){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios","Campos Vacíos",JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            restriccionContraseña();    
        }
    }
    
     void restriccionContraseña(){
        
        if(txtPass.getText().length()<6 || validarNumeros() == 0 ){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 6 caracteres y un número","Contraseña",JOptionPane.INFORMATION_MESSAGE,m);
        }else{
            verificarUsuario();    
        }
    } 
    
    int validarNumeros(){
        String contraseña = txtPass.getText();
        int con = 0;
        char c;
        for (int i=0; i< contraseña.length(); i++){
            c = contraseña.charAt(i);
            
            if (Character.isDigit(c)){
                con = 1;
                break;
            }
        }
        return con;
    }
    void verificarUsuario(){
        int verificar = ud.validarCedula(txtCedula.getText());
        if (verificar == 0){
            registrarUsuario();
        }else{
            JOptionPane.showMessageDialog(null, "Ya existe una persona registrada con ese número de cédula", "Cédula Repetida", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void registrarUsuario(){ // Método que registra un usuario
        Usuario usr = new Usuario();
        usr.setCedula(txtCedula.getText());
        usr.setNombre(txtNombres.getText());
        usr.setApellido(txtApellidos.getText());
        usr.setTelefono(txtTelefono.getText());
        usr.setDireccion(txtDireccion.getText());
        usr.setPass(txtPass.getText());
        usr.setRol(comboRol.getSelectedItem().toString());
        if (ud.registrarUsuario(usr) != 0){
            m = new ImageIcon(getClass().getResource("/imagenes/exito.png"));
            JOptionPane.showMessageDialog(null,"Usuario registrado satisfactoriamente", "Registro Existoso", JOptionPane.INFORMATION_MESSAGE, m);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null,"Error en la base de datos");
        }
    }
    
    void validarTexto(java.awt.event.KeyEvent evt){// Método que permite ingresar letras solamente
        char validar = evt.getKeyChar();
        if ((validar >= 33 && validar <= 64) || (validar >= 91 && validar <=96) || (validar >=123 && validar <= 208)
            || (validar >=210 && validar <=224) || (validar >=252 && validar<=255)){
            
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Debe ingresar solo letras", "Datos Erróneos", JOptionPane.ERROR_MESSAGE);
        }
    }
    void validarDigitos(java.awt.event.KeyEvent evt){//Método que permite ingresar números solamente
        char validar = evt.getKeyChar();
        if ((validar >=32 && validar<=47) || (validar >=58 && validar<=255)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Debe ingresar solo números", "Datos Erróneos", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void limpiar(){
        txtCedula.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        comboRol.setSelectedIndex(0);
        txtPass.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private rojerusan.RSComboMetro comboRol;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSMTextFull txtApellidos;
    private rojeru_san.RSMTextFull txtCedula;
    private rojeru_san.RSMTextFull txtDireccion;
    private rojeru_san.RSMTextFull txtNombres;
    private rojeru_san.RSMPassView txtPass;
    private rojeru_san.RSMTextFull txtTelefono;
    // End of variables declaration//GEN-END:variables
}

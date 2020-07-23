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
public class FrameConsultarUsuario extends javax.swing.JInternalFrame {

    Icon m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
    public FrameConsultarUsuario() {
        initComponents();
        txtCedula.requestFocus();
        this.setSize(694,569);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtTelefono = new rojeru_san.RSMTextFull();
        txtRol = new rojeru_san.RSMTextFull();
        txtNombre = new rojeru_san.RSMTextFull();
        txtApellido = new rojeru_san.RSMTextFull();
        txtDireccion = new rojeru_san.RSMTextFull();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new rojeru_san.RSMTextFull();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS CONSULTADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12), new java.awt.Color(0, 112, 192))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 112, 192));
        jPanel2.setFocusable(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTelefono.setPlaceholder("Teléfono");
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 40));

        txtRol.setPlaceholder("Rol de Usuario");
        jPanel2.add(txtRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 40));

        txtNombre.setPlaceholder("Nombres");
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 40));

        txtApellido.setPlaceholder("Apellidos");
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 260, 40));

        txtDireccion.setPlaceholder("Dirección");
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 260, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 600, 280));

        jPanel4.setBackground(new java.awt.Color(0, 112, 192));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CONSULTAR USUARIO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel7)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 100));

        txtCedula.setPlaceholder("Cédula Usuario");
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 300, -1));

        rSButtonRiple1.setText("Consultar");
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRiple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 260, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 580, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 580, 10));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        if (txtCedula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar el número de cédula", "Cédula Vacía", JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            consultarUsuario();
        }
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        limpiar();
    }//GEN-LAST:event_txtCedulaKeyReleased
 
    void consultarUsuario(){
        
        UsuarioDAO ud = new UsuarioDAO();
        Usuario usr = ud.consultarUsuario(txtCedula.getText());
        
        if (usr.getCedula() != null){
            
            txtNombre.setText(usr.getNombre());
            txtApellido.setText(usr.getApellido());
            txtDireccion.setText(usr.getDireccion());
            txtTelefono.setText(usr.getTelefono());
            txtRol.setText(usr.getRol());
        }else{
            JOptionPane.showMessageDialog(null, "El usuario con ese número de cédula no existe", " Consulta Usuario", JOptionPane.INFORMATION_MESSAGE);
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
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtRol.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSMTextFull txtApellido;
    private rojeru_san.RSMTextFull txtCedula;
    private rojeru_san.RSMTextFull txtDireccion;
    private rojeru_san.RSMTextFull txtNombre;
    private rojeru_san.RSMTextFull txtRol;
    private rojeru_san.RSMTextFull txtTelefono;
    // End of variables declaration//GEN-END:variables
}

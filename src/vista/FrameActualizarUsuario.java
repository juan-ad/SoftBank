package vista;

import entidad.Usuario;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.UsuarioDAO;

/**
 *
 * @author Juan Jose
 */
public class FrameActualizarUsuario extends javax.swing.JInternalFrame {
    
    private UsuarioDAO ud = new UsuarioDAO();
    ImageIcon rojo = new ImageIcon(getClass().getResource("/imagenes/mensajeN.png"));
    ImageIcon azul = new ImageIcon(getClass().getResource("/imagenes/mensajeE.png"));
    Icon m; 
    public FrameActualizarUsuario() {
        initComponents();
        btnActualizar.setEnabled(false);
        lblMensaje.setText("");
        lblImagen.setText("");
        this.setSize(710, 569);
        bloquearDesbloquear(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblImagen = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panelDatos = new javax.swing.JPanel();
        txtNombre = new rojeru_san.RSMTextFull();
        txtApellido = new rojeru_san.RSMTextFull();
        txtDireccion = new rojeru_san.RSMTextFull();
        txtTelefono = new rojeru_san.RSMTextFull();
        comboRol = new rojerusan.RSComboMetro();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new rojeru_san.RSMTextFull();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnActualizar = new rojeru_san.RSButtonRiple();
        lblMensaje = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 630, 10));

        lblImagen.setText("...");
        jPanel4.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 30, 40));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 630, -1));

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12), new java.awt.Color(0, 112, 192))); // NOI18N
        panelDatos.setFocusable(false);

        txtNombre.setPlaceholder("Nombres");
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.setPlaceholder("Apellidos");
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtDireccion.setPlaceholder("Dirección");

        txtTelefono.setPlaceholder("Teléfono ");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        comboRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Jefe Credito", "Auxiliar Credito" }));
        comboRol.setAlignmentY(0.3F);

        jLabel1.setBackground(new java.awt.Color(0, 112, 192));
        jLabel1.setForeground(new java.awt.Color(0, 112, 192));
        jLabel1.setText("Rol de Usuario:");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(comboRol, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jPanel4.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 220));

        txtCedula.setPlaceholder("Cédula Usuario");
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel4.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 110, 200, 40));

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ACTUALIZAR USUARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel7)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 90));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel4.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        lblMensaje.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        lblMensaje.setText("...");
        jPanel4.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 114, -1, 40));

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        if(txtCedula.getText().isEmpty()){
            lblMensaje.setText("");
            lblImagen.setIcon(null);
            bloquearDesbloquear(false);
            btnActualizar.setEnabled(false);
            limpiar2();
        }else{
            consultarUsuario();   
        }
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        validarTexto(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        validarTexto(evt);
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        camposVacios();
    }//GEN-LAST:event_btnActualizarActionPerformed
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
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        comboRol.setSelectedIndex(0);
    }
    
    void limpiar2(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        comboRol.setSelectedIndex(0);
    }
    
    void consultarUsuario(){
        Usuario buscado = ud.consultarUsuario(txtCedula.getText());
        lblMensaje.setText("Aqui");
        if(buscado.getCedula() == null){
            lblMensaje.setText(" Sin resultado en la búsqueda");
            lblImagen.setIcon(rojo);
            btnActualizar.setEnabled(false);
            bloquearDesbloquear(false);
            limpiar2();
        }else{
            lblMensaje.setText(" Usuario Encontrado");
            lblImagen.setIcon(azul);
            bloquearDesbloquear(true);
            btnActualizar.setEnabled(true);
            txtNombre.setText(buscado.getNombre());
            txtApellido.setText(buscado.getApellido());
            txtDireccion.setText(buscado.getDireccion());
            txtTelefono.setText(buscado.getTelefono());
            comboRol.setSelectedItem(buscado.getRol());
        }   
    }
     void actualizarUsuario(){
        
        Usuario usr = new Usuario();
        usr.setCedula(txtCedula.getText());
        usr.setNombre(txtNombre.getText());
        usr.setApellido(txtApellido.getText());
        usr.setDireccion(txtDireccion.getText());
        usr.setTelefono(txtTelefono.getText());
        usr.setRol(comboRol.getSelectedItem().toString());
        
        if (ud.actualizarUsuario(usr) > 0){
            m = new ImageIcon(getClass().getResource("/imagenes/exito.png"));
            JOptionPane.showMessageDialog(null, "Usuario Actualizado Satisfactoriamente","Actualización",JOptionPane.INFORMATION_MESSAGE,m);
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo actualizar");
        }
        limpiar();
        bloquearDesbloquear(false);
        btnActualizar.setEnabled(false);
        lblMensaje.setText("");
        lblImagen.setIcon(null);
    }
    
    void bloquearDesbloquear(Boolean parametro){
     
        for (Component a: panelDatos.getComponents()){
            a.setEnabled(parametro);
        }
    }
    
    void camposVacios(){
        
        if(txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtDireccion.getText().equals("") || txtTelefono.getText().equals("")){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios","Campos Vacíos",JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            actualizarUsuario();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnActualizar;
    private rojerusan.RSComboMetro comboRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel panelDatos;
    private rojeru_san.RSMTextFull txtApellido;
    private rojeru_san.RSMTextFull txtCedula;
    private rojeru_san.RSMTextFull txtDireccion;
    private rojeru_san.RSMTextFull txtNombre;
    private rojeru_san.RSMTextFull txtTelefono;
    // End of variables declaration//GEN-END:variables
}

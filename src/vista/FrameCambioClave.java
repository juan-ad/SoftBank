package vista;

import entidad.Usuario;
import logica.UsuarioDAO;

/**
 *
 * @author Juan Jose
 */
public class FrameCambioClave extends javax.swing.JDialog {

    private Usuario usr1 = Login.usr;
    public FrameCambioClave(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblMensaje.setText("");
        lblMensaje1.setText("");
        lblUsuario.setText(usr1.getCedula());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNueva = new rojeru_san.RSMPassView();
        txtConfirmacion = new rojeru_san.RSMPassView();
        txtActual = new rojeru_san.RSMPassView();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        lblMensaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblMensaje1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        txtNueva.setPlaceholder("Contraseña Nueva");

        txtConfirmacion.setPlaceholder("Confirmación Contrseña Nueva");

        txtActual.setPlaceholder("Contraseña Actual");

        rSButtonRiple1.setText("Guardar Cambios");
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });

        lblMensaje.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 0, 0));
        lblMensaje.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 112, 192));
        jLabel1.setText("USUARIO:");

        lblUsuario.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 112, 192));
        lblUsuario.setText("...");

        lblMensaje1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblMensaje1.setForeground(new java.awt.Color(255, 0, 0));
        lblMensaje1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(lblMensaje1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                        .addContainerGap(88, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUsuario))
                .addGap(18, 18, 18)
                .addComponent(txtActual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMensaje)
                .addGap(18, 18, 18)
                .addComponent(lblMensaje1)
                .addGap(18, 18, 18)
                .addComponent(rSButtonRiple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        camposVacios();
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed
    void limpiar(){
        txtActual.setText("");
        txtNueva.setText("");
        txtConfirmacion.setText("");
    }
    
    void camposVacios(){
        
        if(txtActual.getText().isEmpty() || txtNueva.getText().isEmpty() || txtConfirmacion.getText().isEmpty()){
            lblMensaje.setText("Todos los campos son obligatorios");
            lblMensaje1.setText("");
        }else{
           validarContraseñaActual(); 
        }
    }
    
    void validarContraseñaActual(){
        if(txtActual.getText().equals(usr1.getPass())){
            restriccionContraseña();
        }else{
            lblMensaje.setText("La contraseña actual es incorrecta");
            lblMensaje1.setText("");
        }
    }
    
    void validarContraseñaNueva(){
        if(txtNueva.getText().equals(txtConfirmacion.getText())){
            UsuarioDAO ud = new UsuarioDAO();
            ud.cambiarContraseña(usr1.getCedula(), txtActual.getText(), txtNueva.getText());
            lblMensaje.setText("¡Contraseña actualizada correctamente!");
            lblMensaje1.setText("");
        }else{
            lblMensaje.setText("¡La contraseña nueva y su confirmación");
            lblMensaje1.setText("No coinciden!");
        }
    }
    
    void restriccionContraseña(){
        
        if(txtNueva.getText().length()<6 || validarNumeros() == 0 ){
            lblMensaje.setText("La contraseña debe tener al menos 6");
            lblMensaje1.setText("caracteres y un número");
        }else{
            validarContraseñaNueva();
        }
    } 
    
    int validarNumeros(){
        String contraseña = txtNueva.getText();
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
            java.util.logging.Logger.getLogger(FrameCambioClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCambioClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCambioClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCambioClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameCambioClave dialog = new FrameCambioClave(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMensaje1;
    private javax.swing.JLabel lblUsuario;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private rojeru_san.RSMPassView txtActual;
    private rojeru_san.RSMPassView txtConfirmacion;
    private rojeru_san.RSMPassView txtNueva;
    // End of variables declaration//GEN-END:variables
}

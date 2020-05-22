package vista;

import entidad.Cliente;
import entidad.Inversion;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import logica.ClienteDAO;
import logica.InversionDAO;


public class FrameRegistrarInversion extends javax.swing.JInternalFrame {

    private InversionDAO ind = new InversionDAO();
    private ClienteDAO cd = new ClienteDAO();
    private Inversion inv;
    private Cliente c;
    private String ruta_archivo = "";
    private Icon m;
    public FrameRegistrarInversion() {
        initComponents();
        generarCodigo();
        generarFechaSolicitud();
        limpiar();
    }

    void generarFechaSolicitud(){
        Calendar fecha = new GregorianCalendar();
        lblSolicitud.setText(fecha.get(Calendar.YEAR)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.DAY_OF_MONTH));
    }
    void generarCodigo(){// Asigna un código a la inversión en turno
        int codigo = ind.nroCodigo();
        
        if (codigo == 0){
            txtCodigo.setText("5550");
        }else{
            codigo = codigo +1;
            txtCodigo.setText(String.valueOf(codigo));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboInteres = new javax.swing.JComboBox<>();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        fechaTermino = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblArchivo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblSolicitud = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro Inversiones");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("REGISTRAR INVERSIÓN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 140, 0, 0);
        jPanel1.add(jLabel9, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SOLICITUD ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("CODIGO: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 30));

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarCliente.png"))); // NOI18N
        jButton2.setText("CC");
        jButton2.setToolTipText("");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarCliente.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarCliente - pressed.png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 80, 80));

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });
        jPanel2.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 170, -1));

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 140, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("CÉDULA CLIENTE: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("CLIENTE: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("FECHA SOLICITUD: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("FECHA INICIO: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("MONTO: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, 30));

        comboInteres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1%", "1.5%", "2%", "2.5%", "3%" }));
        jPanel2.add(comboInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 180, -1));

        fechaInicio.setDateFormatString("yyyy/MM/dd");
        jPanel2.add(fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 140, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("FECHA TERMINO:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        fechaTermino.setDateFormatString("yyyy/MM/dd");
        jPanel2.add(fechaTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 140, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setText("$");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 10, 20));

        lblCliente.setText(".");
        jPanel2.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 180, 20));

        lblArchivo.setText(".");
        jPanel2.add(lblArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 150, 20));

        txtCodigo.setEditable(false);
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 100, 30));

        btnSeleccionar.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/subir.jpg"))); // NOI18N
        btnSeleccionar.setContentAreaFilled(false);
        btnSeleccionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeleccionar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/subir.jpg"))); // NOI18N
        btnSeleccionar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/subirpressed.jpg"))); // NOI18N
        btnSeleccionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 70, 50));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("INTERÉS: ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, 30));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setText("ARCHIVO:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        lblSolicitud.setText(".");
        jPanel2.add(lblSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 140, 20));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 30, 0, 0);
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        jButton1.setText("REGISTRAR");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarPressed.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarPressed.png"))); // NOI18N
        jButton3.setText("LIMPIAR");
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarPressed.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarRegistro.png"))); // NOI18N
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jButton4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        jButton4.setText("CANCELAR");
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelarPressed.png"))); // NOI18N
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 105;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 30, 19, 23);
        jPanel1.add(jPanel3, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtCedula.getText().isEmpty()){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null, "Debe digitar la cédula del cliente que solicita el servicio","Cédula Vacía",JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            validarCliente();
        }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtCedula.getText().isEmpty() || txtMonto.getText().isEmpty() || lblCliente.getText().isEmpty() || fechaInicio.getDate() == null || fechaTermino.getDate() == null || ruta_archivo.isEmpty()){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            inv = new Inversion();
            inv.setCodigo(Integer.parseInt(txtCodigo.getText()));
            inv.setFechaSolicitud(lblSolicitud.getText());
            inv.setFechaInicio(((JTextField)fechaInicio.getDateEditor().getUiComponent()).getText());
            inv.setFechaTermino(((JTextField)fechaTermino.getDateEditor().getUiComponent()).getText());
            inv.setMonto(Double.parseDouble(txtMonto.getText()));
            inv.setEstado("En proceso");
            inv.setInversionista(c.getIdPersona());
            String interes = formatoInversion(comboInteres.getSelectedItem().toString());
            inv.setInteres(Double.parseDouble(interes));
            File ruta = new File(ruta_archivo);
            guardarPdf(ruta);
            if(ind.registrarInversion(inv) != 0){
                m = new ImageIcon(getClass().getResource("/imagenes/exito.png"));
                JOptionPane.showMessageDialog(null, "INVERSIÓN REGISTRADA SATISFACTORIAMENTE", "Inversión Exitosa", JOptionPane.INFORMATION_MESSAGE, m);
                generarCodigo();
            }else{
                JOptionPane.showMessageDialog(null, "NO SE  PUDO REGISTRAR");
            }
            limpiar();
        }
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtMontoKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        lblCliente.setText("");
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        seleccionarPdf();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    void validarDigitos(java.awt.event.KeyEvent evt){
        char validar = evt.getKeyChar();
        if ((validar >=32 && validar<=47) || (validar >=58 && validar<=255)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Debe ingresar solo números", "Datos Erróneos", JOptionPane.ERROR_MESSAGE);
        }
    }
    String formatoInversion(String inver){
        String numero = "";
        for (int i = 0;i<inver.length();i++){   
            char c = inver.charAt (i);
            if(c == '%'){
                numero = inver.substring(0, i);
                break;
            }
        }
        return numero;
    }
    void limpiar(){
        fechaInicio.setDate(null);
        fechaTermino.setDate(null);
        txtCedula.setText("");
        txtMonto.setText("");
        lblCliente.setText("");
        lblArchivo.setText("");
        ruta_archivo = "";
        comboInteres.setSelectedIndex(0);
    }

    void seleccionarPdf() {
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            lblArchivo.setText("" + j.getSelectedFile().getName());
            ruta_archivo = j.getSelectedFile().getAbsolutePath();
        } 
    }
    
    void guardarPdf(File ruta){
       
        try {
            byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
            inv.setPdf(pdf);
        } catch (IOException ex) {
            System.out.println("Error al agregar archivo pdf "+ex.getMessage());
        }
    }
    
    void validarCliente(){
        
        c = cd.consultarCliente(txtCedula.getText());
        if (c.getCedula() != null){
            lblCliente.setText(c.getNombre()+" "+c.getApellido());
        }else{
            m = new ImageIcon(getClass().getResource("/imagenes/notFound.png"));
            int rpta = JOptionPane.showConfirmDialog(null, "Cliente no registrado, Desea Registrar?","Cliente No Encontrado",JOptionPane.YES_NO_OPTION);
              
            if (rpta == 0){
                FrameRegistrarCliente frc = new FrameRegistrarCliente();
                Principal.VentanaPrincipal.add(frc);
                frc.setVisible(true);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> comboInteres;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private com.toedter.calendar.JDateChooser fechaTermino;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}

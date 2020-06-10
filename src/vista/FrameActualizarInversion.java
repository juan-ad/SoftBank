package vista;

import entidad.Inversion;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import logica.InversionDAO;

/**
 *
 * @author Juan Jose
 */
public class FrameActualizarInversion extends javax.swing.JInternalFrame {

    private InversionDAO id = new InversionDAO();
    private Inversion inv;
    private String ruta_archivo= "";
    public FrameActualizarInversion() {
        initComponents();
        lblMensaje.setText("");
        lblImagen.setText("");
        limpiar();
        bloquearDesbloquear(false);
        btnActualizar.setEnabled(false);
    }

    ImageIcon rojo = new ImageIcon(getClass().getResource("/imagenes/mensajeN.png"));
    ImageIcon azul = new ImageIcon(getClass().getResource("/imagenes/mensajeE.png"));
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        PanelDatos = new javax.swing.JPanel();
        txtMonto = new javax.swing.JTextField();
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
        lblCedula = new javax.swing.JLabel();
        lblArchivo = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblSolicitud = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setTitle("Actualizar Inversión");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("ACTUALIZAR INVERSIÓN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 90, 0, 0);
        jPanel1.add(jLabel9, gridBagConstraints);

        PanelDatos.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SOLICITUD ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N
        PanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        PanelDatos.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 170, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("CÉDULA CLIENTE: ");
        PanelDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("CLIENTE: ");
        PanelDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("FECHA SOLICITUD: ");
        PanelDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("FECHA INICIO: ");
        PanelDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("MONTO: ");
        PanelDatos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, 40));

        comboInteres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1%", "1.5%", "2%", "2.5%", "3%" }));
        PanelDatos.add(comboInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 180, -1));

        fechaInicio.setDateFormatString("yyyy/MM/dd");
        fechaInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaInicioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fechaInicioKeyReleased(evt);
            }
        });
        PanelDatos.add(fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("FECHA TERMINO:");
        PanelDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));

        fechaTermino.setDateFormatString("yyyy/MM/dd");
        PanelDatos.add(fechaTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setText("$");
        PanelDatos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 10, 20));

        lblCedula.setText(".");
        PanelDatos.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 180, 30));

        lblArchivo.setText(".");
        PanelDatos.add(lblArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 150, 20));

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
        PanelDatos.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 70, 50));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("INTERÉS: ");
        PanelDatos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, 40));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setText("ARCHIVO:");
        PanelDatos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        lblSolicitud.setText(".");
        PanelDatos.add(lblSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, 20));

        lblCliente.setText(".");
        PanelDatos.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 180, 20));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 30, 0, 0);
        jPanel1.add(PanelDatos, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescar.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescar.png"))); // NOI18N
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescarPressed.png"))); // NOI18N
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

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
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

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
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 87;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 23, 23);
        jPanel1.add(jPanel3, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("INGRESE EL CÓDIGO DE LA INVERSIÓN: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 40, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 94;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 10, 0, 0);
        jPanel1.add(txtCodigo, gridBagConstraints);

        lblImagen.setText("...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 20, 0, 0);
        jPanel1.add(lblImagen, gridBagConstraints);

        lblMensaje.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        lblMensaje.setText("...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        jPanel1.add(lblMensaje, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 659;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel1.add(jSeparator1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 659;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 30, 0, 0);
        jPanel1.add(jSeparator2, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtMontoKeyTyped

    private void fechaInicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaInicioKeyPressed

    }//GEN-LAST:event_fechaInicioKeyPressed

    private void fechaInicioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaInicioKeyReleased

    }//GEN-LAST:event_fechaInicioKeyReleased

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        seleccionarPdf();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        camposVacios();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpiar();
        lblMensaje.setText("");
        lblImagen.setIcon(null);
        bloquearDesbloquear(false);
        btnActualizar.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        if (txtCodigo.getText().isEmpty() == false){
            consultarInversion();
        }else{
            lblMensaje.setText("");
            lblImagen.setIcon(null);
            bloquearDesbloquear(false);
            btnActualizar.setEnabled(false);
            limpiar2();
        }
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtCodigoKeyTyped

    void validarDigitos(java.awt.event.KeyEvent evt){//Método que permite ingresar números solamente
        char validar = evt.getKeyChar();
        if ((validar >=32 && validar<=47) || (validar >=58 && validar<=255)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Debe ingresar solo números", "Datos Erróneos", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void limpiar(){
        txtCodigo.setText("");
        lblCedula.setText("");
        lblCliente.setText("");
        lblSolicitud.setText("");
        fechaInicio.setDate(null);
        fechaTermino.setDate(null);
        comboInteres.setSelectedIndex(0);
        txtMonto.setText("");
        lblArchivo.setText("");
    }
    
    void limpiar2(){
        lblCedula.setText("");
        lblCliente.setText("");
        lblSolicitud.setText("");
        fechaInicio.setDate(null);
        fechaTermino.setDate(null);
        comboInteres.setSelectedIndex(0);
        txtMonto.setText("");
        lblArchivo.setText("");
    }
    
    void consultarInversion(){
        String [] buscada= id.consultarInversion(Integer.parseInt(txtCodigo.getText()),"En Proceso");
        if (buscada[0] == null){
            lblMensaje.setText(" Sin resultado en la búsqueda");
            lblImagen.setIcon(rojo);
            bloquearDesbloquear(false);
            limpiar2();
        }else{
            lblMensaje.setText(" Inversión Encontrada");
            lblImagen.setIcon(azul);
            bloquearDesbloquear(true);
            btnActualizar.setEnabled(true);
            lblCedula.setText(buscada[0]);
            lblCliente.setText(buscada[1]);
            lblSolicitud.setText(buscada[2]);
            fechaInicio.setDate(formatoFecha(buscada[3]));
            fechaTermino.setDate(formatoFecha(buscada[4]));
            comboInteres.setSelectedItem(buscada[5]);
            lblArchivo.setText("Inversión #"+" "+txtCodigo.getText());
            txtMonto.setText(buscada[6].substring(1,buscada[6].length()));
        }
    }
    
    void actualizarInversion(){
        inv = new Inversion();
        inv.setCodigo(Integer.parseInt(txtCodigo.getText()));
        inv.setFechaInicio(((JTextField)fechaInicio.getDateEditor().getUiComponent()).getText());
        inv.setFechaTermino(((JTextField)fechaTermino.getDateEditor().getUiComponent()).getText());
        inv.setMonto(Double.parseDouble(txtMonto.getText()));
        String interes = formatoInversion(comboInteres.getSelectedItem().toString());
        inv.setInteres(Double.parseDouble(interes));
        if (ruta_archivo.isEmpty() == false){
            File ruta = new File(ruta_archivo);
            guardarPdf(ruta);   
        }
        if (id.actualizarInversion(inv) > 0){
            JOptionPane.showMessageDialog(null, "Inversión Actualizada Satisfactoriamente");
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo actualizar");
        }
        limpiar();
        bloquearDesbloquear(false);
        btnActualizar.setEnabled(false);
        lblMensaje.setText("");
        lblImagen.setIcon(null);
    }
    
    Date formatoFecha(String fech){
        
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = null;
        try{
            fecha = formato.parse(fech);
        }catch(ParseException ex){
            System.out.println(ex.getMessage());
        }
        return fecha;
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
    
    void bloquearDesbloquear(Boolean parametro){
     
        for (Component a: PanelDatos.getComponents()){
            a.setEnabled(parametro);
        }
    }
    
    void camposVacios(){
        
        if(fechaInicio.getDate() == null || fechaTermino.getDate() == null || txtMonto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }else{
            if(verificarFechas() == true){
                actualizarInversion();
            }
        }
    }
    
    boolean verificarFechas(){
        boolean validar = false;
        Date fechaInicioDate = fechaInicio.getDate();
        System.out.println(fechaInicioDate);
        Date fechTerminoDate = fechaTermino.getDate();
      
        if (fechaInicioDate.after(fechTerminoDate)){
            JOptionPane.showMessageDialog(null, "La fecha de término debe ser mayor a la fecha de inicio", "Fechas Incorrectas", JOptionPane.ERROR_MESSAGE);
        }else{
            validar = true;
        } 
        return validar;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> comboInteres;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private com.toedter.calendar.JDateChooser fechaTermino;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}

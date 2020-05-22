
package vista;

import entidad.Prestamo;
import java.awt.CardLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.PrestamoDAO;

public class FrameConsultarPrestamo extends javax.swing.JInternalFrame {
    private PrestamoDAO pd =new PrestamoDAO();
    private CardLayout vista;
    private Icon m;
    public FrameConsultarPrestamo() {
        initComponents();
        vista = (CardLayout) PanelCardLayout.getLayout();
        PanelCardLayout.add(PanelDefecto,"default");
        vista.show(PanelCardLayout,"default");   
        limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblSolicitud = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblTermino = new javax.swing.JLabel();
        lblInteres = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblAprobacion = new javax.swing.JLabel();
        PanelCardLayout = new javax.swing.JPanel();
        PanelFiador = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblCedulaFiador = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblFiador = new javax.swing.JLabel();
        PanelGarantia = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblGarantia = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        PanelDefecto = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta Préstamo");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("CONSULTAR PRÉSTAMO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 160, 0, 0);
        jPanel1.add(jLabel9, gridBagConstraints);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS CONSULTADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("CÉDULA CLIENTE:");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 41, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("FECHA SOLICITUD:");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 113, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("CLIENTE:");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 77, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("FECHA INICIO:");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 142, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("FECHA TERMINO:");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 171, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("FECHA");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("INTERÉS:");
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 202, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setText("MONTO:");
        panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 231, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("ESTADO:");
        panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        lblCedula.setText(".");
        panel.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 44, 150, -1));

        lblCliente.setText(".");
        panel.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 80, 170, -1));

        lblSolicitud.setText(".");
        panel.add(lblSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 116, 120, -1));

        lblInicio.setText(".");
        panel.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 142, 120, -1));

        lblTermino.setText(".");
        panel.add(lblTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 174, 120, -1));

        lblInteres.setText(".");
        panel.add(lblInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 202, 120, -1));

        lblMonto.setText(".");
        panel.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 234, 120, -1));

        lblEstado.setText(".");
        panel.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 120, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setText("APROBACIÓN: ");
        panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        lblAprobacion.setText(".");
        panel.add(lblAprobacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 120, -1));

        PanelCardLayout.setBackground(new java.awt.Color(255, 255, 255));
        PanelCardLayout.setLayout(new java.awt.CardLayout());

        PanelFiador.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setText("CÉDULA FIADOR:");

        lblCedulaFiador.setText(".");

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel14.setText("FIADOR: ");

        lblFiador.setText(".");

        javax.swing.GroupLayout PanelFiadorLayout = new javax.swing.GroupLayout(PanelFiador);
        PanelFiador.setLayout(PanelFiadorLayout);
        PanelFiadorLayout.setHorizontalGroup(
            PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFiadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCedulaFiador, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiador, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        PanelFiadorLayout.setVerticalGroup(
            PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFiadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblCedulaFiador))
                .addGap(18, 18, 18)
                .addGroup(PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblFiador))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        PanelCardLayout.add(PanelFiador, "card2");

        PanelGarantia.setBackground(new java.awt.Color(255, 255, 255));
        PanelGarantia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel15.setText("COD GARANTIA:");
        PanelGarantia.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel16.setText("TIPO: ");
        PanelGarantia.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel17.setText("VALOR:");
        PanelGarantia.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel18.setText("UBICACIÓN:");
        PanelGarantia.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblUbicacion.setText(".");
        PanelGarantia.add(lblUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 200, -1));

        lblGarantia.setText(".");
        PanelGarantia.add(lblGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 180, -1));

        lblTipo.setText(".");
        PanelGarantia.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 180, -1));

        lblValor.setText(".");
        PanelGarantia.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 180, -1));

        PanelCardLayout.add(PanelGarantia, "card3");

        PanelDefecto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelDefectoLayout = new javax.swing.GroupLayout(PanelDefecto);
        PanelDefecto.setLayout(PanelDefectoLayout);
        PanelDefectoLayout.setHorizontalGroup(
            PanelDefectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanelDefectoLayout.setVerticalGroup(
            PanelDefectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        PanelCardLayout.add(PanelDefecto, "card4");

        panel.add(PanelCardLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 360, 130));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 46, 0, 32);
        jPanel1.add(panel, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIGITE EL CÓDIGO DEL PRÉSTAMO A CONSULTAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("CODIGO: ");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarServicio.png"))); // NOI18N
        jButton1.setText("CONSULTAR");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarServicio.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarServiciPressed.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarPressed.png"))); // NOI18N
        jButton2.setText("LIMPIAR");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarPressed.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarRegistro.png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(41, 41, 41))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 46, 23, 32);
        jPanel1.add(jPanel4, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char validar = evt.getKeyChar();
        if ((validar >=32 && validar<=47) || (validar >=58 && validar<=255)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Debe ingresar solo números", "Datos Erróneos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtCodigo.getText().isEmpty()){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null, "Debe digitar el código del préstamo a consultar", "Campo de Código Vacío", JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            Prestamo p = pd.validarFiadorGarantia(Integer.parseInt(txtCodigo.getText()));
            
            if (p.getCodigo() == 0){
                 m = new ImageIcon(getClass().getResource("/imagenes/notFound.png"));
                JOptionPane.showMessageDialog(null, "El péstamo con ese código no existe", "Préstamo NO Encontrado", JOptionPane.INFORMATION_MESSAGE, m);
            }else{
                visualizarPrestamo(p);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
        txtCodigo.setText("");
        PanelCardLayout.add(PanelDefecto,"default");
        vista.show(PanelCardLayout,"default");   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        limpiar();
        PanelCardLayout.add(PanelDefecto,"default");
        vista.show(PanelCardLayout,"default");   
    }//GEN-LAST:event_txtCodigoKeyReleased

    void limpiar(){
        
        lblCedula.setText("");
        lblCliente.setText("");
        lblSolicitud.setText("");
        lblInicio.setText("");
        lblInicio.setText("");
        lblTermino.setText("");
        lblInteres.setText("");
        lblMonto.setText("");
        lblEstado.setText("");
        lblAprobacion.setText("");
        lblCedulaFiador.setText("");
        lblFiador.setText("");
        lblGarantia.setText("");
        lblTipo.setText("");
        lblValor.setText("");
        lblUbicacion.setText(""); 
    }
    
    void visualizarPrestamo(Prestamo p){
        String [] consulta;
        if (p.getFiador() != 0){
            PanelCardLayout.add(PanelFiador,"fiador");
            vista.show(PanelCardLayout,"fiador");   
            consulta = pd.consultarPrestamoFiador(Integer.parseInt(txtCodigo.getText()));
            lblCedula.setText(consulta[0]);
            lblCliente.setText(consulta[1]);
            lblSolicitud.setText(consulta[2]);
            lblInicio.setText(consulta[3]);
            lblTermino.setText(consulta[4]);
            lblInteres.setText(consulta[5]);
            lblMonto.setText(consulta[6]);
            lblEstado.setText(consulta[7]);
            lblAprobacion.setText(consulta[8]);
            lblCedulaFiador.setText(consulta[9]);
            lblFiador.setText(consulta[10]);
        }else{
            PanelCardLayout.add(PanelGarantia,"garantia");
            vista.show(PanelCardLayout,"garantia");  
            consulta = pd.consultarPrestamoGarantia(Integer.parseInt(txtCodigo.getText()));
            lblCedula.setText(consulta[0]);
            lblCliente.setText(consulta[1]);
            lblSolicitud.setText(consulta[2]);
            lblInicio.setText(consulta[3]);
            lblTermino.setText(consulta[4]);
            lblInteres.setText(consulta[5]);
            lblMonto.setText(consulta[6]);
            lblEstado.setText(consulta[7]);
            lblAprobacion.setText(consulta[8]);
            lblGarantia.setText(consulta[9]);
            lblTipo.setText(consulta[10]);
            lblValor.setText(consulta[11]);
            lblUbicacion.setText(consulta[12]);
        }
               
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCardLayout;
    private javax.swing.JPanel PanelDefecto;
    private javax.swing.JPanel PanelFiador;
    private javax.swing.JPanel PanelGarantia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAprobacion;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCedulaFiador;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFiador;
    private javax.swing.JLabel lblGarantia;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblInteres;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JLabel lblTermino;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}

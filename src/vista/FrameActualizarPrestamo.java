
package vista;

import entidad.Cliente;
import entidad.Garantia;
import entidad.Prestamo;
import java.awt.CardLayout;
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
import logica.ClienteDAO;
import logica.GarantiaDAO;
import logica.PrestamoDAO;

/**
 *
 * @author Juan Jose
 */
public class FrameActualizarPrestamo extends javax.swing.JInternalFrame {

    private CardLayout vista;
    private PrestamoDAO pd = new PrestamoDAO();
    private GarantiaDAO gd = new GarantiaDAO();
    private ClienteDAO cd = new ClienteDAO();
    private String ruta_archivo = "";
    private Prestamo p;
    private ImageIcon rojo = new ImageIcon(getClass().getResource("/imagenes/mensajeN.png"));
    private ImageIcon azul = new ImageIcon(getClass().getResource("/imagenes/mensajeE.png"));
    private Garantia g;
    private Cliente f;
    public FrameActualizarPrestamo() {
        initComponents();
        vistaInicial();
    }
    
    void vistaInicial(){
        vista = (CardLayout) PanelCard.getLayout();
        PanelCard.add(panelDefecto,"default");
        vista.show(PanelCard,"default"); 
        lblMensaje.setText("");
        lblImagen.setIcon(null);
        lblImagen.setText("");
        limpiar();
        bloquearDesbloquear(false);
        btnActualizar.setEnabled(false);
    }
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
        lblCedula = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblSolicitud = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        PanelCard = new javax.swing.JPanel();
        panelFiador = new javax.swing.JPanel();
        txtCedulaFiador = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblFiador = new javax.swing.JLabel();
        panelGarantia = new javax.swing.JPanel();
        txtGarantia = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelDefecto = new javax.swing.JPanel();
        lblArchivo = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
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
        setTitle("Actualizar Préstamo");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("ACTUALIZAR PRÉSTAMO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipady = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 280, 0, 0);
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
        PanelDatos.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 170, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("CÉDULA CLIENTE: ");
        PanelDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("CLIENTE: ");
        PanelDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("FECHA SOLICITUD: ");
        PanelDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("FECHA INICIO: ");
        PanelDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("MONTO: ");
        PanelDatos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, 50));

        comboInteres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1%", "1.5%", "2%", "2.5%", "3%" }));
        PanelDatos.add(comboInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 180, -1));

        fechaInicio.setDateFormatString("yyyy/MM/dd");
        fechaInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaInicioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fechaInicioKeyReleased(evt);
            }
        });
        PanelDatos.add(fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("FECHA TERMINO:");
        PanelDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));

        fechaTermino.setDateFormatString("yyyy/MM/dd");
        PanelDatos.add(fechaTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, 30));

        lblCedula.setText(".");
        PanelDatos.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 180, 30));

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
        PanelDatos.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 70, 50));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("INTERÉS: ");
        PanelDatos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, 50));

        lblSolicitud.setText(".");
        PanelDatos.add(lblSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, 20));

        lblCliente.setText(".");
        PanelDatos.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 180, 20));

        PanelCard.setBackground(new java.awt.Color(255, 255, 255));
        PanelCard.setLayout(new java.awt.CardLayout());

        panelFiador.setBackground(new java.awt.Color(255, 255, 255));

        txtCedulaFiador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaFiadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaFiadorKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setText("CEDULA FIADOR:");

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel14.setText("FIADOR:");

        lblFiador.setText(".");

        javax.swing.GroupLayout panelFiadorLayout = new javax.swing.GroupLayout(panelFiador);
        panelFiador.setLayout(panelFiadorLayout);
        panelFiadorLayout.setHorizontalGroup(
            panelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFiadorLayout.createSequentialGroup()
                        .addComponent(txtCedulaFiador)
                        .addGap(90, 90, 90))
                    .addGroup(panelFiadorLayout.createSequentialGroup()
                        .addComponent(lblFiador, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        panelFiadorLayout.setVerticalGroup(
            panelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedulaFiador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(26, 26, 26)
                .addGroup(panelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblFiador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        PanelCard.add(panelFiador, "card2");

        panelGarantia.setBackground(new java.awt.Color(255, 255, 255));

        txtGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGarantiaActionPerformed(evt);
            }
        });
        txtGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyTyped(evt);
            }
        });

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        txtUbicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUbicacionKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setText("GARANTÍA:");

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel16.setText("VALOR:");

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel17.setText("UBICACIÓN:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setText("$");

        javax.swing.GroupLayout panelGarantiaLayout = new javax.swing.GroupLayout(panelGarantia);
        panelGarantia.setLayout(panelGarantiaLayout);
        panelGarantiaLayout.setHorizontalGroup(
            panelGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGarantiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(panelGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelGarantiaLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                    .addComponent(txtGarantia)
                    .addComponent(txtUbicacion))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelGarantiaLayout.setVerticalGroup(
            panelGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGarantiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panelGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PanelCard.add(panelGarantia, "card3");

        panelDefecto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelDefectoLayout = new javax.swing.GroupLayout(panelDefecto);
        panelDefecto.setLayout(panelDefectoLayout);
        panelDefectoLayout.setHorizontalGroup(
            panelDefectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        panelDefectoLayout.setVerticalGroup(
            panelDefectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        PanelCard.add(panelDefecto, "card4");

        PanelDatos.add(PanelCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 330, 160));

        lblArchivo.setText(".");
        PanelDatos.add(lblArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 150, 30));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel15.setText("ARCHIVO:");
        PanelDatos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, 30));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel18.setText("$");
        PanelDatos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 10, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 27);
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
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 87;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(218, 200, 20, 0);
        jPanel1.add(jPanel3, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("INGRESE EL CÓDIGO DEL  PRÉSTAMO: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 280, 0, 0);
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
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 0);
        jPanel1.add(txtCodigo, gridBagConstraints);

        lblImagen.setText("...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 10, 0, 0);
        jPanel1.add(lblImagen, gridBagConstraints);

        lblMensaje.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblMensaje.setText("...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        jPanel1.add(lblMensaje, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 1009;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 30, 0, 27);
        jPanel1.add(jSeparator1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 1009;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 30, 0, 27);
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
        PanelCard.add(panelDefecto,"default");
        vista.show(PanelCard,"default"); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        if (txtCodigo.getText().isEmpty() == false){
            consultarPrestamo();
        }else{
            lblMensaje.setText("");
            lblImagen.setIcon(null);
            bloquearDesbloquear(false);
            btnActualizar.setEnabled(false);
            limpiar2();
        }
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarantiaActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtCedulaFiadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaFiadorKeyReleased
        consultarFiador();
    }//GEN-LAST:event_txtCedulaFiadorKeyReleased

    private void txtCedulaFiadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaFiadorKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtCedulaFiadorKeyTyped

    private void txtGarantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGarantiaKeyTyped
        validarTexto(evt);
    }//GEN-LAST:event_txtGarantiaKeyTyped

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtUbicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUbicacionKeyTyped
        
    }//GEN-LAST:event_txtUbicacionKeyTyped
    void validarTexto(java.awt.event.KeyEvent evt){
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
    
    void consultarFiador(){
        f = cd.consultarCliente(txtCedulaFiador.getText());
               
        if (f.getCedula() != null){
            lblFiador.setText(f.getNombre()+" "+f.getApellido());
        }else{
            lblFiador.setText("");
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
        txtGarantia.setText("");
        txtValor.setText("");
        txtUbicacion.setText("");
        txtCedulaFiador.setText("");
        lblFiador.setText("");
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
        txtGarantia.setText("");
        txtValor.setText("");
        txtUbicacion.setText("");
        txtCedulaFiador.setText("");
        lblFiador.setText("");
        PanelCard.add(panelDefecto,"default");
        vista.show(PanelCard,"default"); 
        btnActualizar.setEnabled(false);
    }
    
    void consultarPrestamo(){
        
        p = pd.validarFiadorGarantia(Integer.parseInt(txtCodigo.getText()),"En Proceso");
        if (p.getCodigo() == 0){
            lblMensaje.setText(" Sin resultado en la búsqueda");
            lblImagen.setIcon(rojo);
            bloquearDesbloquear(false);
            limpiar2();
        }else{
            lblMensaje.setText(" Préstamo Encontrado");
            lblImagen.setIcon(azul);
            bloquearDesbloquear(true);
            btnActualizar.setEnabled(true);
            visualizarPrestamo(p);
        }
    }
    
    void visualizarPrestamo(Prestamo p){
        String [] consulta;
        if (p.getFiador() != 0){
            PanelCard.add(panelFiador,"fiador");
            vista.show(PanelCard,"fiador");   
            consulta = pd.consultarPrestamoFiador(Integer.parseInt(txtCodigo.getText()),"En Proceso");
            lblCedula.setText(consulta[0]);
            lblCliente.setText(consulta[1]);
            lblSolicitud.setText(consulta[2]);
            fechaInicio.setDate(formatoFecha(consulta[3]));
            fechaTermino.setDate(formatoFecha(consulta[4]));
            comboInteres.setSelectedItem(consulta[5]);
            txtMonto.setText(consulta[6].substring(1,consulta[6].length()));
            txtCedulaFiador.setText(consulta[9]);
            lblFiador.setText(consulta[10]);
        }else{
            PanelCard.add(panelGarantia,"garantia");
            vista.show(PanelCard,"garantia");  
            consulta = pd.consultarPrestamoGarantia(Integer.parseInt(txtCodigo.getText()),"En Proceso");
            lblCedula.setText(consulta[0]);
            lblCliente.setText(consulta[1]);
            lblSolicitud.setText(consulta[2]);
            fechaInicio.setDate(formatoFecha(consulta[3]));
            fechaTermino.setDate(formatoFecha(consulta[4]));
            comboInteres.setSelectedItem(consulta[5]);
            txtMonto.setText(consulta[6].substring(1,consulta[6].length()));
            txtGarantia.setText(consulta[10]);
            txtValor.setText(consulta[11].substring(1,consulta[11].length()));
            txtUbicacion.setText(consulta[12]);
        }
        lblArchivo.setText("Préstamo #"+" "+txtCodigo.getText());
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
            p.setPdf(pdf);
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
        
        if(fechaInicio.getDate() == null || fechaTermino.getDate() == null || txtMonto.getText().equals("") || camposFiadorGarantia()){
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }else{
            if(verificarFechas() == true){
                prestatarioIgualFiador();
            }
        }
    }
    
    void prestatarioIgualFiador(){
        if(lblCedula.getText().equals(txtCedulaFiador.getText())){
            JOptionPane.showMessageDialog(null, "El prestatario y el  fiador deben ser diferentes");
        }else{
            actualizarPrestamo();   
        }
    }
    boolean camposFiadorGarantia(){
        boolean rpta = false;
        if(p.getFiador() != 0){
            if(lblFiador.getText().isEmpty()){
                rpta = true;
            }
        }else{
            if(txtGarantia.getText().isEmpty() || txtValor.getText().isEmpty() || txtUbicacion.getText().isEmpty()){
                rpta = true;
            }
            
        }
        return rpta;
    }
    void actualizarPrestamo(){
        
        if(p.getFiador() != 0){
            actualizarPrestamoFiador();                       
        }else{
            actualizarPrestamoGarantia();
        }
        vistaInicial();
    }
    
    void actualizarPrestamoFiador(){
        p = new Prestamo();
        p.setCodigo(Integer.parseInt(txtCodigo.getText()));
        p.setFechaInicio(((JTextField)fechaInicio.getDateEditor().getUiComponent()).getText());
        p.setFechaTermino(((JTextField)fechaTermino.getDateEditor().getUiComponent()).getText());
        p.setMonto(Double.parseDouble(txtMonto.getText()));
        String interes = formatoInversion(comboInteres.getSelectedItem().toString());
        p.setInteres(Double.parseDouble(interes));
        p.setFiador(f.getIdPersona());
        if (ruta_archivo.isEmpty() == false){
            File ruta = new File(ruta_archivo);
            guardarPdf(ruta);   
        }
        if (pd.actualizarPrestamoFiador(p) > 0){
            JOptionPane.showMessageDialog(null, "Préstamo Actualizado Satisfactoriamente");
        }
    }
    
    void actualizarPrestamoGarantia(){
        p = new Prestamo();
        g = new Garantia();
        p.setCodigo(Integer.parseInt(txtCodigo.getText()));
        p.setFechaInicio(((JTextField)fechaInicio.getDateEditor().getUiComponent()).getText());
        p.setFechaTermino(((JTextField)fechaTermino.getDateEditor().getUiComponent()).getText());
        p.setMonto(Double.parseDouble(txtMonto.getText()));
        String interes = formatoInversion(comboInteres.getSelectedItem().toString());
        p.setInteres(Double.parseDouble(interes));
        g.setTipo(txtGarantia.getText());
        g.setValor(Double.parseDouble(txtValor.getText()));
        g.setUbicacion(txtUbicacion.getText());
        if (ruta_archivo.isEmpty() == false){
            File ruta = new File(ruta_archivo);
            guardarPdf(ruta);   
        }
        if (gd.actualizarGarantia(g, p.getCodigo()) != 0){
            if (pd.actualizarPrestamoGarantia(p) > 0){
                JOptionPane.showMessageDialog(null, "Préstamo Actualizado Satisfactoriamente");
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
    private javax.swing.JPanel PanelCard;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFiador;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JPanel panelDefecto;
    private javax.swing.JPanel panelFiador;
    private javax.swing.JPanel panelGarantia;
    private javax.swing.JTextField txtCedulaFiador;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

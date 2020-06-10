package vista;
import entidad.Cliente;
import entidad.Garantia;
import entidad.Prestamo;
import java.awt.CardLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import logica.ClienteDAO;
import logica.GarantiaDAO;
import logica.PrestamoDAO;


public class FrameRegistrarPrestamo extends javax.swing.JInternalFrame {
    
    private PrestamoDAO pd = new PrestamoDAO();
    private GarantiaDAO gd = new GarantiaDAO();
    private Prestamo p;
    private ClienteDAO cd = new ClienteDAO();
    private CardLayout vista;
    private Cliente c;
    private Cliente f = null;
    private Garantia g= null;
    private String ruta_archivo="";
    public boolean btnpresionado=false;
    private Icon m;
    
    public FrameRegistrarPrestamo() {
        initComponents();
        limpiar();
        lblFiador.setText("");
        vista = (CardLayout) PanelCardLayout.getLayout();
        PanelCardLayout.add(PanelDefecto,"default");
        vista.show(PanelCardLayout,"default");   
        generarFechaSolicitud();
        generarCodigoPrestamo();
        generarCodigoGarantia();
    }
        
    void generarFechaSolicitud(){
        Calendar fecha = new GregorianCalendar();
        lblSolicitud.setText(fecha.get(Calendar.YEAR)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.DAY_OF_MONTH));
    }
    void generarCodigoPrestamo(){// genera el código del préstamo en turno 
        int codigo = pd.codigoSolicitud();
        
        if (codigo == 0){
            txtCodigo.setText("1100");
        }else{
            codigo = codigo +1;
            txtCodigo.setText(String.valueOf(codigo));
        }
    }
    void generarCodigoGarantia(){// genera el código del préstamo en turno 
        int codigo = gd.codigoGarantia();
        
        if (codigo == 0){
            txtCodigoGarantia.setText("3000");
        }else{
            codigo = codigo +1;
            txtCodigoGarantia.setText(String.valueOf(codigo));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        Prestamo = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();
        txtCedulaCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboInteres = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        fechaTermino = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblSolicitud = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblArchivo = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        PanelFiadorGarantia = new javax.swing.JPanel();
        PanelCardLayout = new javax.swing.JPanel();
        PanelGarantia = new javax.swing.JPanel();
        txtubicacion = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnAñadirGarantía = new javax.swing.JButton();
        txtUbicacion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCodigoGarantia = new javax.swing.JTextField();
        btnCancelarGarantia = new javax.swing.JButton();
        PanelFiador = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtCedulaFiador = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnBuscarFiador = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnAñadirFiador = new javax.swing.JButton();
        btnCancelarFiador = new javax.swing.JButton();
        lblFiador = new javax.swing.JLabel();
        PanelDefecto = new javax.swing.JPanel();
        btnFiador = new javax.swing.JRadioButton();
        btnGarantia = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro Péstamos");
        setToolTipText("");

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("REGISTRAR PRÉSTAMO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 250, 0, 0);
        PanelPrincipal.add(jLabel9, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jButton3)
                .addGap(45, 45, 45)
                .addComponent(jButton4)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 120, 0, 0);
        PanelPrincipal.add(jPanel3, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SOLICITUD ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("CODIGO: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, 30));

        txtCodigo.setEditable(false);
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 101, -1));

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarCliente.png"))); // NOI18N
        jButton2.setText("CC");
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
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 80, 80));

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
        jPanel2.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 170, -1));

        txtCedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaClienteActionPerformed(evt);
            }
        });
        txtCedulaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaClienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaClienteKeyTyped(evt);
            }
        });
        jPanel2.add(txtCedulaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("CÉDULA CLIENTE: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("CLIENTE: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("FECHA SOLICITUD: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("FECHA INICIO: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("MONTO: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, 30));

        comboInteres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1%", "1.5%", "2%", "2.5%", "3%" }));
        jPanel2.add(comboInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 180, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("INTERÉS: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, 30));

        fechaInicio.setDateFormatString("yyyy/MM/dd");
        jPanel2.add(fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 120, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("FECHA TERMINO:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        fechaTermino.setDateFormatString("yyyy/MM/dd");
        jPanel2.add(fechaTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 120, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setText("$");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 10, 20));

        lblCliente.setText(".");
        jPanel2.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 180, 20));

        lblSolicitud.setText(".");
        jPanel2.add(lblSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 120, 20));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel17.setText("ARCHIVO:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 80, -1));

        lblArchivo.setText(".");
        jPanel2.add(lblArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 150, 20));

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
        jPanel2.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 70, 50));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = -10;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 0);
        PanelPrincipal.add(jPanel2, gridBagConstraints);

        PanelFiadorGarantia.setBackground(new java.awt.Color(255, 255, 255));
        PanelFiadorGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FIADOR/GARANTÍA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N

        PanelCardLayout.setBackground(new java.awt.Color(255, 255, 255));
        PanelCardLayout.setLayout(new java.awt.CardLayout());

        PanelGarantia.setBackground(new java.awt.Color(255, 255, 255));
        PanelGarantia.setLayout(new java.awt.BorderLayout());

        txtubicacion.setBackground(new java.awt.Color(255, 255, 255));
        txtubicacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtubicacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setText("CÓDIGO:");
        txtubicacion.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        btnAñadirGarantía.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAñadirGarantía.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        btnAñadirGarantía.setText("AÑADIR");
        btnAñadirGarantía.setContentAreaFilled(false);
        btnAñadirGarantía.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAñadirGarantía.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        btnAñadirGarantía.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadirpressed.png"))); // NOI18N
        btnAñadirGarantía.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAñadirGarantía.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirGarantíaActionPerformed(evt);
            }
        });
        txtubicacion.add(btnAñadirGarantía, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
            }
        });
        txtubicacion.add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 150, -1));

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel16.setText("UBICACIÓN:");
        txtubicacion.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });
        txtubicacion.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, -1));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel15.setText("VALOR:");
        txtubicacion.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        txtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoKeyTyped(evt);
            }
        });
        txtubicacion.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 150, -1));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel14.setText("TIPO:");
        txtubicacion.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        txtCodigoGarantia.setEditable(false);
        txtubicacion.add(txtCodigoGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 99, -1));

        btnCancelarGarantia.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCancelarGarantia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar50px.png"))); // NOI18N
        btnCancelarGarantia.setText("CANCELAR");
        btnCancelarGarantia.setContentAreaFilled(false);
        btnCancelarGarantia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelarGarantia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarGarantia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar50px.png"))); // NOI18N
        btnCancelarGarantia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnCancelarGarantia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarGarantiaActionPerformed(evt);
            }
        });
        txtubicacion.add(btnCancelarGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        PanelGarantia.add(txtubicacion, java.awt.BorderLayout.CENTER);

        PanelCardLayout.add(PanelGarantia, "card3");

        PanelFiador.setBackground(new java.awt.Color(255, 255, 255));
        PanelFiador.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCedulaFiador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaFiadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaFiadorKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("CÉDULA:");

        btnBuscarFiador.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        btnBuscarFiador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarCliente.png"))); // NOI18N
        btnBuscarFiador.setText("CONSULTAR F");
        btnBuscarFiador.setContentAreaFilled(false);
        btnBuscarFiador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarFiador.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarCliente.png"))); // NOI18N
        btnBuscarFiador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarCliente - pressed.png"))); // NOI18N
        btnBuscarFiador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarFiador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFiadorActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setText("FIADOR: ");

        btnAñadirFiador.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAñadirFiador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        btnAñadirFiador.setText("AÑADIR");
        btnAñadirFiador.setContentAreaFilled(false);
        btnAñadirFiador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAñadirFiador.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        btnAñadirFiador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadirpressed.png"))); // NOI18N
        btnAñadirFiador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAñadirFiador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirFiadorActionPerformed(evt);
            }
        });

        btnCancelarFiador.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCancelarFiador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar50px.png"))); // NOI18N
        btnCancelarFiador.setText("CANCELAR");
        btnCancelarFiador.setContentAreaFilled(false);
        btnCancelarFiador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelarFiador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarFiador.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar50px.png"))); // NOI18N
        btnCancelarFiador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnCancelarFiador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarFiador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFiadorActionPerformed(evt);
            }
        });

        lblFiador.setText(".");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblFiador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(8, 8, 8))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(txtCedulaFiador, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAñadirFiador)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarFiador)
                        .addGap(24, 24, 24))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnBuscarFiador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCedulaFiador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarFiador)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblFiador))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarFiador)
                    .addComponent(btnAñadirFiador))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        PanelFiador.add(jPanel4, java.awt.BorderLayout.CENTER);

        PanelCardLayout.add(PanelFiador, "card2");

        PanelDefecto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelDefectoLayout = new javax.swing.GroupLayout(PanelDefecto);
        PanelDefecto.setLayout(PanelDefectoLayout);
        PanelDefectoLayout.setHorizontalGroup(
            PanelDefectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );
        PanelDefectoLayout.setVerticalGroup(
            PanelDefectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        PanelCardLayout.add(PanelDefecto, "card4");

        Prestamo.add(btnFiador);
        btnFiador.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnFiador.setText("FIADOR");
        btnFiador.setContentAreaFilled(false);
        btnFiador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiadorMouseClicked(evt);
            }
        });
        btnFiador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiadorActionPerformed(evt);
            }
        });

        Prestamo.add(btnGarantia);
        btnGarantia.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnGarantia.setText("GARANTÍA");
        btnGarantia.setContentAreaFilled(false);
        btnGarantia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGarantiaMouseClicked(evt);
            }
        });
        btnGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGarantiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFiadorGarantiaLayout = new javax.swing.GroupLayout(PanelFiadorGarantia);
        PanelFiadorGarantia.setLayout(PanelFiadorGarantiaLayout);
        PanelFiadorGarantiaLayout.setHorizontalGroup(
            PanelFiadorGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelFiadorGarantiaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnFiador)
                .addGap(18, 18, 18)
                .addComponent(btnGarantia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFiadorGarantiaLayout.setVerticalGroup(
            PanelFiadorGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFiadorGarantiaLayout.createSequentialGroup()
                .addGroup(PanelFiadorGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFiador)
                    .addComponent(btnGarantia))
                .addGap(18, 18, 18)
                .addComponent(PanelCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 13, 16);
        PanelPrincipal.add(PanelFiadorGarantia, gridBagConstraints);

        getContentPane().add(PanelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if (txtCedulaCliente.getText().isEmpty() || txtMonto.getText().isEmpty() || lblCliente.getText().isEmpty() 
            || fechaInicio.getDate() == null || fechaTermino.getDate() == null || PanelDefecto.isVisible() || ruta_archivo.isEmpty() ){
                m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
                JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.INFORMATION_MESSAGE, m);
                      
    }else{
            p = new Prestamo();
            p.setCodigo(Integer.parseInt(txtCodigo.getText()));
            p.setFechaSolicitud(lblSolicitud.getText());
            p.setFechaInicio(((JTextField)fechaInicio.getDateEditor().getUiComponent()).getText());
            p.setFechaTermino(((JTextField)fechaTermino.getDateEditor().getUiComponent()).getText());
            p.setMonto(Double.parseDouble(txtMonto.getText()));
            p.setEstado("En proceso");
            String interes = formatoInversion(comboInteres.getSelectedItem().toString());
            p.setInteres(Double.parseDouble(interes));
            p.setPrestatario(c.getIdPersona());
            File ruta = new File(ruta_archivo);
            guardarPdf(ruta);
            garantiaOfiador(p);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpiar();
        limpiarFiadorGarantia();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cd = new ClienteDAO();
        
        if (txtCedulaCliente.getText().isEmpty()){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null, "Debe digitar la cédula del cliente","Cédula del Cliente Vacía", JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            if(txtCedulaFiador.getText().equals(txtCedulaCliente.getText())){
                JOptionPane.showMessageDialog(null,"El prestatario y el  fiador deben ser diferentes", "Prestatario igual a Fiador", JOptionPane.ERROR_MESSAGE);
                txtCedulaCliente.setText("");
                lblCliente.setText("");
            }else{
                c = cd.consultarCliente(txtCedulaCliente.getText());
                if (c.getCedula() != null){
                   lblCliente.setText(c.getNombre()+" "+c.getApellido());
                }else{
                    llamarFrameRegistro();
                }
            }
        }   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        
    }//GEN-LAST:event_txtMontoActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtMontoKeyTyped

    private void txtCedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaClienteActionPerformed
       
    }//GEN-LAST:event_txtCedulaClienteActionPerformed

    private void txtCedulaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaClienteKeyReleased
        lblCliente.setText("");
    }//GEN-LAST:event_txtCedulaClienteKeyReleased

    private void txtCedulaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaClienteKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtCedulaClienteKeyTyped

    private void btnFiadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiadorMouseClicked
       
    }//GEN-LAST:event_btnFiadorMouseClicked

    private void btnGarantiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGarantiaMouseClicked
     
    }//GEN-LAST:event_btnGarantiaMouseClicked

    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void btnFiadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiadorActionPerformed
        PanelCardLayout.add(PanelFiador,"Fiador");
        vista.show(PanelCardLayout,"Fiador");   
        txtTipo.setText("");
        txtValor.setText("");
        txtUbicacion.setText("");
        g = null;
    }//GEN-LAST:event_btnFiadorActionPerformed

    private void btnGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGarantiaActionPerformed
        PanelCardLayout.add(PanelGarantia,"Garantia");
        vista.show(PanelCardLayout,"Garantia" );
        txtCedulaFiador.setText("");
        lblFiador.setText("");
        f = null;
    }//GEN-LAST:event_btnGarantiaActionPerformed

    private void btnBuscarFiadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFiadorActionPerformed
        cd = new ClienteDAO();
        
        if (txtCedulaFiador.getText().isEmpty()){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null, "Debe digitar la cédula del fiador", "Cédula del Fiador Vacía", JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            if(txtCedulaFiador.getText().equals(txtCedulaCliente.getText())){
                JOptionPane.showMessageDialog(null,"El prestatario y el  fiador deben ser diferentes", "Fiador igual a Prestatario", JOptionPane.ERROR_MESSAGE);
                txtCedulaFiador.setText("");
                lblFiador.setText("");
            }else{
                f = cd.consultarCliente(txtCedulaFiador.getText());
                if (f.getCedula() != null){
                    lblFiador.setText(f.getNombre()+" "+f.getApellido());
                }else{
                    llamarFrameRegistro();
                }
            }
        }   
    }//GEN-LAST:event_btnBuscarFiadorActionPerformed

    private void txtCedulaFiadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaFiadorKeyTyped
       validarDigitos(evt);
    }//GEN-LAST:event_txtCedulaFiadorKeyTyped

    private void btnAñadirFiadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirFiadorActionPerformed
        if (txtCedulaFiador.getText().isEmpty() || lblFiador.getText().isEmpty()){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null, "Debe digitar la cédula del fiador", "Consultar Fiador",JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            m = new ImageIcon(getClass().getResource("/imagenes/exito.png"));
            txtCedulaFiador.setEnabled(false);
            JOptionPane.showMessageDialog(null,"Fiador Añadido","Añadir Fiador", JOptionPane.INFORMATION_MESSAGE, m);
            btnpresionado = true;
            btnGarantia.setEnabled(false);
        }
    }//GEN-LAST:event_btnAñadirFiadorActionPerformed

    private void txtCedulaFiadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaFiadorKeyReleased
        lblFiador.setText("");
        g = null;
    }//GEN-LAST:event_txtCedulaFiadorKeyReleased

    private void btnCancelarFiadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFiadorActionPerformed
        f = null;
        txtCedulaFiador.setEnabled(true);
        txtCedulaFiador.setText("");
        lblFiador.setText("");
        btnGarantia.setEnabled(true);
        btnpresionado = false;
    }//GEN-LAST:event_btnCancelarFiadorActionPerformed

    private void txtTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoKeyTyped
        validarTexto(evt);
    }//GEN-LAST:event_txtTipoKeyTyped

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtValorKeyTyped

    private void btnAñadirGarantíaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirGarantíaActionPerformed
        if (txtTipo.getText().isEmpty() || txtUbicacion.getText().isEmpty() || txtValor.getText().isEmpty()){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Campos Vacíos", JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            m = new ImageIcon(getClass().getResource("/imagenes/exito.png"));
            JOptionPane.showMessageDialog(null,"Garantía Añadida", "Añadir Garantía", JOptionPane.INFORMATION_MESSAGE, m);
            txtTipo.setEnabled(false);
            txtValor.setEnabled(false);
            txtUbicacion.setEnabled(false);
            g = new Garantia();
            g.setCodigo(Integer.parseInt(txtCodigoGarantia.getText()));
            g.setTipo(txtTipo.getText());
            g.setValor(Double.parseDouble(txtValor.getText()));
            g.setUbicacion(txtUbicacion.getText());
            btnFiador.setEnabled(false);
            btnpresionado = true;
        }
    }//GEN-LAST:event_btnAñadirGarantíaActionPerformed

    private void btnCancelarGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarGarantiaActionPerformed
        g = null;
        txtTipo.setEnabled(true);
        txtUbicacion.setEnabled(true);
        txtValor.setEnabled(true);
        txtTipo.setText("");
        txtUbicacion.setText(""); 
        txtValor.setText("");
        btnFiador.setEnabled(true);
        btnpresionado = false;
    }//GEN-LAST:event_btnCancelarGarantiaActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        seleccionarPdf();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void txtCedulaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaClienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaClienteKeyPressed
    void validarTexto(java.awt.event.KeyEvent evt){
        char validar = evt.getKeyChar();
        if ((validar >= 33 && validar <= 64) || (validar >= 91 && validar <=96) || (validar >=123 && validar <= 208)
            || (validar >=210 && validar <=224) || (validar >=252 && validar<=255)){
            
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "Debe ingresar solo letras", "Datos Erróneos", JOptionPane.ERROR_MESSAGE);
        }
    }
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
    void garantiaOfiador(Prestamo p){
        if(verificarFechas() == true){
            if (btnpresionado == true){
                m = new ImageIcon(getClass().getResource("/imagenes/exito.png"));
                if (g == null){
                    registroPrestamoFiador();
                }else{
                    registroPrestamoGarantia();
                }
                limpiar();
                limpiarFiadorGarantia();
            }else{
                m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
                JOptionPane.showMessageDialog(null, "Debe añadir un fiador o garantía", "Falta de Fiador O Garantía", JOptionPane.ERROR_MESSAGE, m);
            }
        }
    }
    void registroPrestamoFiador(){
        p.setFiador(f.getIdPersona());
        if(pd.registrarPrestamoFiador(p) != 0){
            JOptionPane.showMessageDialog(null, "Préstamo Registrado Satisfacoriamente", "Registro", JOptionPane.INFORMATION_MESSAGE ,m);
            generarCodigoPrestamo();
        }else{
            JOptionPane.showMessageDialog(null, "NO SE PUDO REGISTRAR");
        }
    }
    void registroPrestamoGarantia(){
        if (gd.registrarGarantia(g) != 0){
            if(pd.registrarPrestamoGarantia(p) != 0){
                JOptionPane.showMessageDialog(null, "Préstamo Registrado Satisfacoriamente", "Registro", JOptionPane.INFORMATION_MESSAGE ,m);
                generarCodigoPrestamo();
                generarCodigoGarantia();
            }else{
                JOptionPane.showMessageDialog(null, "Error en la base de datos");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error en la base de datos");
        }
    }
    void limpiar(){
        txtCedulaCliente.setText("");
        txtMonto.setText("");
        lblCliente.setText("");
        comboInteres.setSelectedIndex(0);
        lblArchivo.setText("");
        fechaInicio.setDate(null);
        fechaTermino.setDate(null);
        ruta_archivo = "";
    }
    void limpiarFiadorGarantia(){
        txtCedulaFiador.setText("");
        txtCedulaFiador.setEnabled(true);
        lblFiador.setText("");
        txtTipo.setText("");
        txtTipo.setEnabled(true);
        txtValor.setText("");
        txtValor.setEnabled(true);
        txtUbicacion.setText("");
        txtUbicacion.setEnabled(true);
        btnFiador.setEnabled(true);
        btnGarantia.setEnabled(true);
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
    
    void llamarFrameRegistro(){
        int rpta = JOptionPane.showConfirmDialog(null, "Cliente no registrado, Desea Registrar?", "Cliente NO Encontrado", JOptionPane.YES_NO_OPTION);
        if (rpta == 0){
            FrameRegistrarCliente frc = new FrameRegistrarCliente();
            Principal.VentanaPrincipal.add(frc);
            frc.setVisible(true);
        }
    }
    
    boolean verificarFechas(){
        boolean validar = false;
        Date fechaInicioDate = fechaInicio.getDate();
        Date fechTerminoDate = fechaTermino.getDate();
      
        if (fechaInicioDate.after(fechTerminoDate)){
            JOptionPane.showMessageDialog(null, "La fecha de término debe ser mayor a la fecha de inicio", "Fechas Incorrectas", JOptionPane.ERROR_MESSAGE);
        }else{
            validar = true;
        } 
        return validar;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCardLayout;
    private javax.swing.JPanel PanelDefecto;
    private javax.swing.JPanel PanelFiador;
    private javax.swing.JPanel PanelFiadorGarantia;
    private javax.swing.JPanel PanelGarantia;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.ButtonGroup Prestamo;
    private javax.swing.JButton btnAñadirFiador;
    private javax.swing.JButton btnAñadirGarantía;
    private javax.swing.JButton btnBuscarFiador;
    private javax.swing.JButton btnCancelarFiador;
    private javax.swing.JButton btnCancelarGarantia;
    private javax.swing.JRadioButton btnFiador;
    private javax.swing.JRadioButton btnGarantia;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> comboInteres;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private com.toedter.calendar.JDateChooser fechaTermino;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFiador;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtCedulaFiador;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoGarantia;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtValor;
    private javax.swing.JPanel txtubicacion;
    // End of variables declaration//GEN-END:variables
}

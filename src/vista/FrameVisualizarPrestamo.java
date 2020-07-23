package vista;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.PrestamoDAO;

/**
 *
 * @author Juan Jose
 */
public class FrameVisualizarPrestamo extends javax.swing.JInternalFrame {
    
    private CardLayout vista;
    private PrestamoDAO pd = new PrestamoDAO();
    private int fila = -1;
    private String estado = "";
    
    public FrameVisualizarPrestamo() {
        initComponents();
        this.setSize(1300, 500);
        vista = (CardLayout) PanelCardLayout.getLayout();
        PanelCardLayout.add(PanelDefecto,"defecto");
        vista.show(PanelCardLayout, "defecto");
    }
    
     void formatoColumnaGarantia(){
        TablaGarantia.getColumnModel().getColumn(0).setMaxWidth(60);//codigo
        TablaGarantia.getColumnModel().getColumn(6).setMaxWidth(60);//interes
        TablaGarantia.getColumnModel().getColumn(12).setMinWidth(85);//faprobacion
        TablaGarantia.getColumnModel().getColumn(11).setMaxWidth(80);//estado
    }
    void formatoColumnaFiador(){       
        TablaFiador.getColumnModel().getColumn(0).setMaxWidth(60);//codigo      
        TablaFiador.getColumnModel().getColumn(6).setMaxWidth(60);//interés      
    }
    
    void visualizarPrestamoFiador(String estado, String cedula){// Muestra los prestamos que tienen asociados un fiador
        
        DefaultTableModel modelo = pd.visualizarPrestamosFiador(estado,cedula);
        TablaFiador.setModel(modelo);
        TablaFiador.getTableHeader().setFont(new Font("Segue UI",Font.BOLD, 12));
        TablaFiador.getTableHeader().setOpaque(false);
        TablaFiador.getTableHeader().setForeground(Color.BLUE);
        TablaFiador.setRowHeight(25);
        formatoColumnaFiador();
    }
    void visualizarPrestamoGarantia(String estado, String cedula){// Muestra los prestamos que tienen asociados una garantía
        DefaultTableModel modelo = pd.visualizarPrestamosGarantia(estado, cedula);
        TablaGarantia.setModel(modelo);
        TablaGarantia.getTableHeader().setFont(new Font("Segue UI",Font.BOLD, 12));
        TablaGarantia.getTableHeader().setOpaque(false);
        TablaGarantia.getTableHeader().setForeground(Color.BLUE);
        TablaGarantia.setRowHeight(25);
        formatoColumnaGarantia();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grupoEstado = new javax.swing.ButtonGroup();
        grupoVista = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbProceso = new javax.swing.JRadioButton();
        rbAprobado = new javax.swing.JRadioButton();
        rbDenegado = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        rbTodo = new javax.swing.JRadioButton();
        btnActualizar = new javax.swing.JButton();
        PanelCardLayout = new javax.swing.JPanel();
        PanelFiador = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaFiador = new javax.swing.JTable();
        PanelGarantia = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaGarantia = new javax.swing.JTable();
        PanelDefecto = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rbFiador = new javax.swing.JRadioButton();
        rbGarantia = new javax.swing.JRadioButton();

        jMenu1.setText("jMenu1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Visualizar Préstamos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("VISUALIZAR PRÉSTAMOS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 400, 0, 0);
        jPanel1.add(jLabel9, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILTRAR POR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("ESTADO");

        grupoEstado.add(rbProceso);
        rbProceso.setText("En Proceso");
        rbProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProcesoActionPerformed(evt);
            }
        });

        grupoEstado.add(rbAprobado);
        rbAprobado.setText("Aprobado");
        rbAprobado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAprobadoActionPerformed(evt);
            }
        });

        grupoEstado.add(rbDenegado);
        rbDenegado.setText("Denegado");
        rbDenegado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDenegadoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("CÉDULA ClLIENTE");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        grupoEstado.add(rbTodo);
        rbTodo.setText("Todo");
        rbTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(rbProceso)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rbAprobado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbDenegado, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 83, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(215, 215, 215)
                        .addComponent(jLabel2)
                        .addGap(144, 144, 144))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAprobado)
                    .addComponent(rbDenegado)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbProceso)
                    .addComponent(rbTodo))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 60, 0, 0);
        jPanel1.add(jPanel3, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 17, 0, 0);
        jPanel1.add(btnActualizar, gridBagConstraints);

        PanelCardLayout.setBackground(new java.awt.Color(255, 255, 255));
        PanelCardLayout.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRÉSTAMOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N
        PanelCardLayout.setLayout(new java.awt.CardLayout());

        PanelFiador.setBackground(new java.awt.Color(255, 255, 255));

        TablaFiador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaFiador.setFocusable(false);
        TablaFiador.setGridColor(new java.awt.Color(153, 153, 153));
        TablaFiador.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablaFiador.setRowHeight(25);
        TablaFiador.setSelectionBackground(new java.awt.Color(232, 57, 95));
        TablaFiador.setSelectionForeground(new java.awt.Color(0, 0, 204));
        TablaFiador.setShowVerticalLines(false);
        TablaFiador.getTableHeader().setReorderingAllowed(false);
        TablaFiador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaFiadorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaFiador);

        javax.swing.GroupLayout PanelFiadorLayout = new javax.swing.GroupLayout(PanelFiador);
        PanelFiador.setLayout(PanelFiadorLayout);
        PanelFiadorLayout.setHorizontalGroup(
            PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1233, Short.MAX_VALUE)
            .addGroup(PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelFiadorLayout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1223, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelFiadorLayout.setVerticalGroup(
            PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
            .addGroup(PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
        );

        PanelCardLayout.add(PanelFiador, "card2");

        PanelGarantia.setBackground(new java.awt.Color(255, 255, 255));

        TablaGarantia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "CLIENTE", "CÉDULA", "F.SOLICITUD", "F.INICIO", "F.TERMINO", "INTERÉS", "MONTO", "GARANTÍA", "TIPO", "VALOR", "UBICACIÓN"
            }
        ));
        TablaGarantia.setFocusable(false);
        TablaGarantia.setGridColor(new java.awt.Color(153, 153, 153));
        TablaGarantia.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablaGarantia.setRowHeight(25);
        TablaGarantia.setSelectionBackground(new java.awt.Color(232, 57, 95));
        TablaGarantia.setSelectionForeground(new java.awt.Color(0, 0, 204));
        TablaGarantia.setShowVerticalLines(false);
        TablaGarantia.getTableHeader().setReorderingAllowed(false);
        TablaGarantia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaGarantiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaGarantia);

        javax.swing.GroupLayout PanelGarantiaLayout = new javax.swing.GroupLayout(PanelGarantia);
        PanelGarantia.setLayout(PanelGarantiaLayout);
        PanelGarantiaLayout.setHorizontalGroup(
            PanelGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1233, Short.MAX_VALUE)
        );
        PanelGarantiaLayout.setVerticalGroup(
            PanelGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGarantiaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelCardLayout.add(PanelGarantia, "card3");

        javax.swing.GroupLayout PanelDefectoLayout = new javax.swing.GroupLayout(PanelDefecto);
        PanelDefecto.setLayout(PanelDefectoLayout);
        PanelDefectoLayout.setHorizontalGroup(
            PanelDefectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1233, Short.MAX_VALUE)
        );
        PanelDefectoLayout.setVerticalGroup(
            PanelDefectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        PanelCardLayout.add(PanelDefecto, "card4");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 1200;
        gridBagConstraints.ipady = 165;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 20, 22, 11);
        jPanel1.add(PanelCardLayout, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SECCIÓN POR:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N

        grupoVista.add(rbFiador);
        rbFiador.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        rbFiador.setText("FIADOR");
        rbFiador.setContentAreaFilled(false);
        rbFiador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFiadorActionPerformed(evt);
            }
        });

        grupoVista.add(rbGarantia);
        rbGarantia.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        rbGarantia.setText("GARANTIA");
        rbGarantia.setContentAreaFilled(false);
        rbGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGarantiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbGarantia)
                    .addComponent(rbFiador))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbFiador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbGarantia)
                .addGap(18, 18, 18))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 0);
        jPanel1.add(jPanel2, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProcesoActionPerformed
        estado = "En Proceso";
        vistaFiadorGarantia(estado, txtCedula.getText());
        
    }//GEN-LAST:event_rbProcesoActionPerformed

    private void rbAprobadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAprobadoActionPerformed
        estado = "Aprobado";
        vistaFiadorGarantia(estado, txtCedula.getText());
    }//GEN-LAST:event_rbAprobadoActionPerformed

    private void rbDenegadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDenegadoActionPerformed
        estado = "Denegado";
        vistaFiadorGarantia(estado, txtCedula.getText());
    }//GEN-LAST:event_rbDenegadoActionPerformed

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        if (rbProceso.isSelected() == false && rbAprobado.isSelected() == false && rbDenegado.isSelected() == false && rbTodo.isSelected() == false){
            vistaFiadorGarantia("", txtCedula.getText());
        }else{
            vistaFiadorGarantia(estado, txtCedula.getText());
        }

    }//GEN-LAST:event_txtCedulaKeyReleased

    private void rbTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodoActionPerformed
        estado = "";
        vistaFiadorGarantia(estado, txtCedula.getText());
    }//GEN-LAST:event_rbTodoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        vistaFiadorGarantia("", "");
        txtCedula.setText("");
        grupoEstado.clearSelection();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        TablaFiador.getSelectionModel().removeSelectionInterval(fila, fila);
        TablaGarantia.getSelectionModel().removeSelectionInterval(fila, fila);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void TablaFiadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaFiadorMouseClicked
        fila = TablaFiador.getSelectedRow();  
    }//GEN-LAST:event_TablaFiadorMouseClicked

    private void TablaGarantiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaGarantiaMouseClicked
        fila = TablaGarantia.getSelectedRow();
    }//GEN-LAST:event_TablaGarantiaMouseClicked

    private void rbFiadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFiadorActionPerformed
        PanelCardLayout.add(PanelFiador,"fiador");
        vista.show(PanelCardLayout, "fiador");
        visualizarPrestamoFiador("", "");
        limpiar();
    }//GEN-LAST:event_rbFiadorActionPerformed

    private void rbGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGarantiaActionPerformed
        PanelCardLayout.add(PanelGarantia,"garantia");
        vista.show(PanelCardLayout, "garantia");
        visualizarPrestamoGarantia("", "");
        limpiar();
    }//GEN-LAST:event_rbGarantiaActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        validarDigitos(evt);
    }//GEN-LAST:event_txtCedulaKeyTyped
    void validarDigitos(java.awt.event.KeyEvent evt){//Método que permite ingresar números solamente
        char validar = evt.getKeyChar();
        if ((validar >=32 && validar<=47) || (validar >=58 && validar<=255)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Debe ingresar solo números", "Datos Erróneos", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void limpiar(){
        grupoEstado.clearSelection();
        txtCedula.setText("");
    }
    
    void vistaFiadorGarantia(String estado, String cedula){
        
        if(rbFiador.isSelected()){
            visualizarPrestamoFiador(estado, cedula);
        }else{
            visualizarPrestamoGarantia(estado, cedula);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCardLayout;
    private javax.swing.JPanel PanelDefecto;
    private javax.swing.JPanel PanelFiador;
    private javax.swing.JPanel PanelGarantia;
    private javax.swing.JTable TablaFiador;
    private javax.swing.JTable TablaGarantia;
    private javax.swing.JButton btnActualizar;
    private javax.swing.ButtonGroup grupoEstado;
    private javax.swing.ButtonGroup grupoVista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbAprobado;
    private javax.swing.JRadioButton rbDenegado;
    private javax.swing.JRadioButton rbFiador;
    private javax.swing.JRadioButton rbGarantia;
    private javax.swing.JRadioButton rbProceso;
    private javax.swing.JRadioButton rbTodo;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}

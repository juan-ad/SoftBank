package vista;

import entidad.Prestamo;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.PdfEjecucion;
import logica.PrestamoDAO;

public class FrameRevisarPrestamo extends javax.swing.JInternalFrame {
    
    private PdfEjecucion pe = new PdfEjecucion();
    private CardLayout vista;
    private int fila = -1;
    private PrestamoDAO pd= new PrestamoDAO();
    private Prestamo p = new Prestamo();
    private Icon m;
    
    public FrameRevisarPrestamo() {
        initComponents();
        vista = (CardLayout) PanelCardLayout.getLayout();
        PanelCardLayout.add(PanelDefecto,"defecto");
        vista.show(PanelCardLayout, "defecto");
        this.setSize(1200, 500);       
    }
    void ocultarColumnaGarantia(){
        TablaRevisarGarantia.getColumnModel().getColumn(0).setMaxWidth(0);//id
        TablaRevisarGarantia.getColumnModel().getColumn(0).setMinWidth(0);
        TablaRevisarGarantia.getColumnModel().getColumn(0).setPreferredWidth(0);
        TablaRevisarGarantia.getColumnModel().getColumn(1).setMaxWidth(60);//codigo
        TablaRevisarGarantia.getColumnModel().getColumn(1).setMinWidth(40);
        TablaRevisarGarantia.getColumnModel().getColumn(1).setPreferredWidth(60);
        TablaRevisarGarantia.getColumnModel().getColumn(2).setMaxWidth(140);//cliente
        TablaRevisarGarantia.getColumnModel().getColumn(2).setMinWidth(80);
        TablaRevisarGarantia.getColumnModel().getColumn(2).setPreferredWidth(110);
        TablaRevisarGarantia.getColumnModel().getColumn(7).setMaxWidth(60);//interés
        TablaRevisarGarantia.getColumnModel().getColumn(7).setMinWidth(40);
        TablaRevisarGarantia.getColumnModel().getColumn(7).setPreferredWidth(60);
        TablaRevisarGarantia.getColumnModel().getColumn(9).setMaxWidth(70);//garantia
        TablaRevisarGarantia.getColumnModel().getColumn(9).setMinWidth(40);
    }
    void ocultarColumnaFiador(){       
        TablaRevisarFiador.getColumnModel().getColumn(0).setMaxWidth(0);//id
        TablaRevisarFiador.getColumnModel().getColumn(0).setMinWidth(0);
        TablaRevisarFiador.getColumnModel().getColumn(0).setPreferredWidth(0);
        TablaRevisarFiador.getColumnModel().getColumn(1).setMaxWidth(60);//codigo
        TablaRevisarFiador.getColumnModel().getColumn(1).setMinWidth(40);
        TablaRevisarFiador.getColumnModel().getColumn(1).setPreferredWidth(60);
        TablaRevisarFiador.getColumnModel().getColumn(2).setMaxWidth(170);//cliente
        TablaRevisarFiador.getColumnModel().getColumn(2).setMinWidth(80);
        TablaRevisarFiador.getColumnModel().getColumn(2).setPreferredWidth(140);
        TablaRevisarFiador.getColumnModel().getColumn(3).setMaxWidth(100);//cedula
        TablaRevisarFiador.getColumnModel().getColumn(3).setMinWidth(100);
        TablaRevisarFiador.getColumnModel().getColumn(4).setMaxWidth(100);//solicitud
        TablaRevisarFiador.getColumnModel().getColumn(4).setMinWidth(100);
        TablaRevisarFiador.getColumnModel().getColumn(5).setMaxWidth(100);//inicio
        TablaRevisarFiador.getColumnModel().getColumn(5).setMinWidth(100);
        TablaRevisarFiador.getColumnModel().getColumn(6).setMaxWidth(100);//termino
        TablaRevisarFiador.getColumnModel().getColumn(6).setMinWidth(100);
        TablaRevisarFiador.getColumnModel().getColumn(7).setMaxWidth(70);//interés
        TablaRevisarFiador.getColumnModel().getColumn(7).setMinWidth(70);
        TablaRevisarFiador.getColumnModel().getColumn(9).setMaxWidth(170);//fiador
        TablaRevisarFiador.getColumnModel().getColumn(9).setMinWidth(80);
        TablaRevisarFiador.getColumnModel().getColumn(9).setPreferredWidth(140);
        TablaRevisarFiador.getColumnModel().getColumn(10).setMaxWidth(100);//cedula fiador
        TablaRevisarFiador.getColumnModel().getColumn(10).setMinWidth(100);
       
    }
    void visualizarPrestamoFiador(){// Muestra los prestamos que tienen asociados un fiador
        
        DefaultTableModel modelo = pd.revisarPrestamoFiador(TablaRevisarFiador);
        TablaRevisarFiador.setModel(modelo);
        TablaRevisarFiador.getTableHeader().setFont(new Font("Segue UI",Font.BOLD, 12));
        TablaRevisarFiador.getTableHeader().setOpaque(false);
        TablaRevisarFiador.getTableHeader().setForeground(Color.BLUE);
        TablaRevisarFiador.setRowHeight(25);
        ocultarColumnaFiador();
    }
    void visualizarPrestamoGarantia(){// Muestra los prestamos que tienen asociados una garantía
        DefaultTableModel modelo = pd.revisarPrestamoGarantia(TablaRevisarGarantia);
        TablaRevisarGarantia.setModel(modelo);
        TablaRevisarGarantia.getTableHeader().setFont(new Font("Segue UI",Font.BOLD, 12));
        TablaRevisarGarantia.getTableHeader().setOpaque(false);
        TablaRevisarGarantia.getTableHeader().setForeground(Color.BLUE);
        TablaRevisarGarantia.setRowHeight(25);
        ocultarColumnaGarantia();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoFiadorGarantia = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        PanelCardLayout = new javax.swing.JPanel();
        PanelFiador = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaRevisarFiador = new javax.swing.JTable();
        PanelGarantia = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRevisarGarantia = new javax.swing.JTable();
        PanelDefecto = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Revisión Préstamos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("REVISAR PRÉSTAMO");

        PanelCardLayout.setBackground(new java.awt.Color(255, 255, 255));
        PanelCardLayout.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRÉSTAMOS A REVISAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N
        PanelCardLayout.setLayout(new java.awt.CardLayout());

        PanelFiador.setBackground(new java.awt.Color(255, 255, 255));

        TablaRevisarFiador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "CLIENTE", "CÉDULA", "F.SOLICITUD", "F.INICIO", "F.TERMINO", "INTERÉS", "MONTO", "FIADOR", "CÉDULA", "DOCUMENTO"
            }
        ));
        TablaRevisarFiador.setFocusable(false);
        TablaRevisarFiador.setGridColor(new java.awt.Color(153, 153, 153));
        TablaRevisarFiador.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablaRevisarFiador.setRowHeight(25);
        TablaRevisarFiador.setSelectionBackground(new java.awt.Color(232, 57, 95));
        TablaRevisarFiador.setSelectionForeground(new java.awt.Color(0, 0, 204));
        TablaRevisarFiador.setShowVerticalLines(false);
        TablaRevisarFiador.getTableHeader().setReorderingAllowed(false);
        TablaRevisarFiador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaRevisarFiadorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaRevisarFiador);

        javax.swing.GroupLayout PanelFiadorLayout = new javax.swing.GroupLayout(PanelFiador);
        PanelFiador.setLayout(PanelFiadorLayout);
        PanelFiadorLayout.setHorizontalGroup(
            PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1143, Short.MAX_VALUE)
            .addGroup(PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1143, Short.MAX_VALUE))
        );
        PanelFiadorLayout.setVerticalGroup(
            PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
            .addGroup(PanelFiadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelFiadorLayout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 15, Short.MAX_VALUE)))
        );

        PanelCardLayout.add(PanelFiador, "card2");

        PanelGarantia.setBackground(new java.awt.Color(255, 255, 255));

        TablaRevisarGarantia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "CLIENTE", "CÉDULA", "F.SOLICITUD", "F.INICIO", "F.TERMINO", "INTERÉS", "MONTO", "GARANTÍA", "TIPO", "VALOR", "UBICACIÓN", "DOCUMENTO"
            }
        ));
        TablaRevisarGarantia.setFocusable(false);
        TablaRevisarGarantia.setGridColor(new java.awt.Color(153, 153, 153));
        TablaRevisarGarantia.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablaRevisarGarantia.setRowHeight(25);
        TablaRevisarGarantia.setSelectionBackground(new java.awt.Color(232, 57, 95));
        TablaRevisarGarantia.setSelectionForeground(new java.awt.Color(0, 0, 204));
        TablaRevisarGarantia.setShowVerticalLines(false);
        TablaRevisarGarantia.getTableHeader().setReorderingAllowed(false);
        TablaRevisarGarantia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaRevisarGarantiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaRevisarGarantia);

        javax.swing.GroupLayout PanelGarantiaLayout = new javax.swing.GroupLayout(PanelGarantia);
        PanelGarantia.setLayout(PanelGarantiaLayout);
        PanelGarantiaLayout.setHorizontalGroup(
            PanelGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1143, Short.MAX_VALUE)
        );
        PanelGarantiaLayout.setVerticalGroup(
            PanelGarantiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGarantiaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        PanelCardLayout.add(PanelGarantia, "card3");

        javax.swing.GroupLayout PanelDefectoLayout = new javax.swing.GroupLayout(PanelDefecto);
        PanelDefecto.setLayout(PanelDefectoLayout);
        PanelDefectoLayout.setHorizontalGroup(
            PanelDefectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1143, Short.MAX_VALUE)
        );
        PanelDefectoLayout.setVerticalGroup(
            PanelDefectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        PanelCardLayout.add(PanelDefecto, "card4");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APRUEBA O RECHAZA UN PRÉSTAMO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N

        jButton4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aprobar.png"))); // NOI18N
        jButton4.setText("APROBAR");
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aprobar.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aprobarpressed.png"))); // NOI18N
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rechazar.png"))); // NOI18N
        jButton5.setText("RECHAZAR");
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rechazar.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rechazaepressed.png"))); // NOI18N
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescar.png"))); // NOI18N
        jButton6.setText("REFRESCAR");
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescar.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescarPressed.png"))); // NOI18N
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(29, 29, 29)
                .addComponent(jButton5)
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        GrupoFiadorGarantia.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jRadioButton1.setText("FIADOR");
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        GrupoFiadorGarantia.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jRadioButton2.setText("GARANTIA");
        jRadioButton2.setContentAreaFilled(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(365, 365, 365))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(PanelCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(fila == -1){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null, "Debe seleccionar un préstamo", "Préstamo NO Seleccionado", JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            p.setFechaAprobacion(generarFecha());
            p.setEstado("Aprobado");
            if (pd.aceptarPrestamo(p) >0 ){
                m = new ImageIcon(getClass().getResource("/imagenes/exito.png"));
                JOptionPane.showMessageDialog(null, "Préstamo Aprobado", "Revisión", JOptionPane.INFORMATION_MESSAGE, m);
                visualizarPrestamoFiador();
                visualizarPrestamoGarantia();
                fila = -1;
            }else{
                JOptionPane.showMessageDialog(null, "Error en la base de datos");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(fila == -1 ){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null, "Debe seleccionar un préstamo", "Préstamo NO Seleccionado", JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            p.setEstado("Denegado");
            if (pd.rechazarPrestamo(p) >0 ){
                JOptionPane.showMessageDialog(null, "Préstamo Rechazado","Revisión", JOptionPane.INFORMATION_MESSAGE);
                visualizarPrestamoFiador();
                visualizarPrestamoGarantia();
                fila = -1;
            }else{
                JOptionPane.showMessageDialog(null, "Error en la base de datos");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        visualizarPrestamoFiador();
        visualizarPrestamoGarantia();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void TablaRevisarGarantiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRevisarGarantiaMouseClicked
    fila = TablaRevisarGarantia.getSelectedRow();
    int id = Integer.parseInt(TablaRevisarGarantia.getValueAt(fila, 0).toString());
    p.setIdPrestamo(id);
    String codigo = TablaRevisarGarantia.getValueAt(fila, 1).toString();
    if (TablaRevisarGarantia.getSelectedColumn() == 13){
            Object value = TablaRevisarGarantia.getValueAt(fila, 13);
             visualizarPdf(value, id, codigo);
    }
    }//GEN-LAST:event_TablaRevisarGarantiaMouseClicked

    private void TablaRevisarFiadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRevisarFiadorMouseClicked
    fila = TablaRevisarFiador.getSelectedRow();
    int id = Integer.parseInt(TablaRevisarFiador.getValueAt(fila, 0).toString());
    String codigo = TablaRevisarFiador.getValueAt(fila, 1).toString();
    p.setIdPrestamo(id);
    
    if (TablaRevisarFiador.getSelectedColumn() == 11){
            Object value = TablaRevisarFiador.getValueAt(fila, 11);
            visualizarPdf(value, id, codigo);
    }
    }//GEN-LAST:event_TablaRevisarFiadorMouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       PanelCardLayout.add(PanelFiador,"fiador");
       vista.show(PanelCardLayout, "fiador");
       visualizarPrestamoFiador();
       fila = -1;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       PanelCardLayout.add(PanelGarantia,"garantia");
       vista.show(PanelCardLayout, "garantia");
       visualizarPrestamoGarantia();
       fila = -1;
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        TablaRevisarGarantia.getSelectionModel().removeSelectionInterval(fila, fila);
        TablaRevisarFiador.getSelectionModel().removeSelectionInterval(fila, fila);
        fila = -1;
    }//GEN-LAST:event_jPanel1MouseClicked

    String generarFecha(){
        Calendar fecha = new GregorianCalendar();
        String fechaAprobacion = fecha.get(Calendar.YEAR)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.DAY_OF_MONTH);
        
        return fechaAprobacion;
    }
    
    void visualizarPdf(Object value, int id, String codigo){
        if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                pe.ejecutarArchivoPDF(id,"Prestamo");
                try {
                     Desktop.getDesktop().open(new File("Prestamo#"+codigo+".pdf"));
                }catch (IOException ex) {
                }
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoFiadorGarantia;
    private javax.swing.JPanel PanelCardLayout;
    private javax.swing.JPanel PanelDefecto;
    private javax.swing.JPanel PanelFiador;
    private javax.swing.JPanel PanelGarantia;
    private javax.swing.JTable TablaRevisarFiador;
    private javax.swing.JTable TablaRevisarGarantia;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

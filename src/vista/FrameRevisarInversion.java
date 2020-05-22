package vista;

import entidad.Inversion;
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
import logica.InversionDAO;
import logica.PdfEjecucion;


public class FrameRevisarInversion extends javax.swing.JInternalFrame {

    private InversionDAO ind = new InversionDAO();
    private PdfEjecucion pd = new PdfEjecucion();
    private Inversion inv;
    private int fila = -1;
    private Icon m;
    
    public FrameRevisarInversion() {
        initComponents();
        this.setSize(950, 500);
        visualizar();
    }
    void ocultarColumna(){
        TablaRevisarInversiones.getColumnModel().getColumn(0).setMaxWidth(0);//id
        TablaRevisarInversiones.getColumnModel().getColumn(0).setMinWidth(0);
        TablaRevisarInversiones.getColumnModel().getColumn(0).setPreferredWidth(0);
        TablaRevisarInversiones.getColumnModel().getColumn(1).setMaxWidth(80);//codigo
        TablaRevisarInversiones.getColumnModel().getColumn(1).setMinWidth(60);
        TablaRevisarInversiones.getColumnModel().getColumn(2).setMaxWidth(230);//cliente
        TablaRevisarInversiones.getColumnModel().getColumn(2).setMinWidth(130);
        TablaRevisarInversiones.getColumnModel().getColumn(2).setPreferredWidth(130);//interés
        TablaRevisarInversiones.getColumnModel().getColumn(7).setMaxWidth(70);
        TablaRevisarInversiones.getColumnModel().getColumn(7).setMinWidth(50);
        
    }
    void visualizar(){// muestra las inversiones 
        
        DefaultTableModel modelo= ind.revisarInversiones(TablaRevisarInversiones);
        TablaRevisarInversiones.setModel(modelo);
        TablaRevisarInversiones.getTableHeader().setFont(new Font("Segue UI",Font.BOLD, 12));
        TablaRevisarInversiones.getTableHeader().setOpaque(false);
        TablaRevisarInversiones.getTableHeader().setForeground(Color.BLUE);
        TablaRevisarInversiones.setRowHeight(25);
        ocultarColumna();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRevisarInversiones = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Revisión Inversiones");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INVERSIONES A REVISAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        TablaRevisarInversiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "CLIENTE", "CÉDULA", "F.SOLICITUD", "F.INICIO", "F.TERMINO", "INTERÉS", "MONTO"
            }
        ));
        TablaRevisarInversiones.setFocusable(false);
        TablaRevisarInversiones.setGridColor(new java.awt.Color(153, 153, 153));
        TablaRevisarInversiones.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablaRevisarInversiones.setRowHeight(25);
        TablaRevisarInversiones.setSelectionBackground(new java.awt.Color(232, 57, 95));
        TablaRevisarInversiones.setSelectionForeground(new java.awt.Color(0, 0, 204));
        TablaRevisarInversiones.setShowVerticalLines(false);
        TablaRevisarInversiones.getTableHeader().setReorderingAllowed(false);
        TablaRevisarInversiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaRevisarInversionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaRevisarInversiones);
        if (TablaRevisarInversiones.getColumnModel().getColumnCount() > 0) {
            TablaRevisarInversiones.getColumnModel().getColumn(0).setPreferredWidth(20);
            TablaRevisarInversiones.getColumnModel().getColumn(1).setPreferredWidth(100);
            TablaRevisarInversiones.getColumnModel().getColumn(6).setMinWidth(50);
            TablaRevisarInversiones.getColumnModel().getColumn(6).setPreferredWidth(50);
            TablaRevisarInversiones.getColumnModel().getColumn(6).setMaxWidth(80);
        }

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 867;
        gridBagConstraints.ipady = 112;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 23, 0, 31);
        jPanel2.add(jPanel1, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("REVISAR INVERSIÓN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 265, 0, 0);
        jPanel2.add(jLabel7, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APRUEBA O RECHAZA UNA INVERSIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aprobar.png"))); // NOI18N
        jButton1.setText("APROBAR");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aprobar.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aprobarpressed.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rechazar.png"))); // NOI18N
        jButton2.setText("RECHAZAR");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rechazar.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rechazaepressed.png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescar.png"))); // NOI18N
        jButton3.setText("REFRESCAR");
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescar.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescarPressed.png"))); // NOI18N
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 217, 28, 0);
        jPanel2.add(jPanel3, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (fila == -1){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null, "Debe seleccionar una inversion", "Inversión NO Seleccionada", JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            inv.setFechaAprobación(generarFecha());
            inv.setEstado("Aprobado");
            if (ind.aceptarInversion(inv) != 0){
                m = new ImageIcon(getClass().getResource("/imagenes/exito.png"));
                JOptionPane.showMessageDialog(null, "Inversion Aprobada", "Revisión", JOptionPane.INFORMATION_MESSAGE, m);
                fila = -1;
            }
            visualizar();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (fila == -1){
            m = new ImageIcon(getClass().getResource("/imagenes/digitar.png"));
            JOptionPane.showMessageDialog(null, "Debe seleccionar una inversion", "Inversión NO Seleccionada", JOptionPane.INFORMATION_MESSAGE, m);
        }else{
            inv.setEstado("Denegado");
            if (ind.rechazarInversion(inv) != 0){
                JOptionPane.showMessageDialog(null, "Inversion Rechazada", "Revisión", JOptionPane.INFORMATION_MESSAGE);
                fila = -1;
            }
            visualizar();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TablaRevisarInversionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRevisarInversionesMouseClicked
        fila = TablaRevisarInversiones.getSelectedRow();
        inv = new Inversion();
        String codigo = TablaRevisarInversiones.getValueAt(fila, 1).toString();
        String id = TablaRevisarInversiones.getValueAt(fila, 0).toString();
        inv.setIdInversion(Integer.parseInt(id));
        
        if (TablaRevisarInversiones.getSelectedColumn() == 9){
            Object value = TablaRevisarInversiones.getValueAt(fila, 9);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                pd.ejecutar_archivoPDF(Integer.parseInt(id),"Inversion");
                try {
                     Desktop.getDesktop().open(new File("Inversion#"+codigo+".pdf"));
                }catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_TablaRevisarInversionesMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        visualizar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        TablaRevisarInversiones.getSelectionModel().removeSelectionInterval(fila, fila);
        fila = -1;
    }//GEN-LAST:event_jPanel2MouseClicked
    String generarFecha(){
        Calendar fecha = new GregorianCalendar();
        String fechaAprobacion = fecha.get(Calendar.YEAR)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.DAY_OF_MONTH);
        
        return fechaAprobacion;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaRevisarInversiones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

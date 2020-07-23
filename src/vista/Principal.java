package vista;

import entidad.Usuario;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import logica.Fondo;


public class Principal extends javax.swing.JFrame {
    
   
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);      
        VentanaPrincipal.setBorder(new Fondo());
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/fondoPantalla.jpg")).getImage());
        validarUsuario();
    }
    
    
    void validarUsuario(){
        Usuario us = Login.usr;
        switch (us.getRol()){
                                           
            case "Jefe Credito":
                menuUsuarios.setVisible(false);
                break;                
            case "Auxiliar Credito":
                menuUsuarios.setVisible(false);
                menuItemRevisarP.setVisible(false);
                menuItemRevisarI.setVisible(false);
                break;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuItemRevisarP = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        menuItemRevisarI = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANK OF AMERICA");

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu1.png"))); // NOI18N
        jMenu5.setText("Menú");
        jMenu5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jMenuItem17.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contrasena.png"))); // NOI18N
        jMenuItem17.setText("Cambiar Clave");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuItem16.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar-sesion.png"))); // NOI18N
        jMenuItem16.setText("Cerrar Sesión");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuItem3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        jMenu3.setText("Clientes");
        jMenu3.setContentAreaFilled(false);
        jMenu3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registroCliente.png"))); // NOI18N
        jMenuItem1.setText("Registrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ConsultarCliente.png"))); // NOI18N
        jMenuItem2.setText("Consultar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarCliente.png"))); // NOI18N
        jMenuItem10.setText("Actualizar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/visualizarClientes.png"))); // NOI18N
        jMenuItem13.setText("Visualizar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prestamo.png"))); // NOI18N
        jMenu10.setText("Préstamos");
        jMenu10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarprestamo.png"))); // NOI18N
        jMenuItem4.setText("Registrar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultarPrestamo.png"))); // NOI18N
        jMenuItem5.setText("Consultar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem5);

        menuItemRevisarP.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        menuItemRevisarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/revisionPestamo.png"))); // NOI18N
        menuItemRevisarP.setText("Revisar");
        menuItemRevisarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRevisarPActionPerformed(evt);
            }
        });
        jMenu10.add(menuItemRevisarP);

        jMenuItem11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarServicio.png"))); // NOI18N
        jMenuItem11.setText("Actualizar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem11);

        jMenuItem14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/visualizarPrestamo.png"))); // NOI18N
        jMenuItem14.setText("Visualizar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem14);

        jMenuBar1.add(jMenu10);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inversion.png"))); // NOI18N
        jMenu4.setText("Inversiones");
        jMenu4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarinversion.png"))); // NOI18N
        jMenuItem6.setText("Registrar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultarInversion.png"))); // NOI18N
        jMenuItem7.setText("Consultar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        menuItemRevisarI.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        menuItemRevisarI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/revisionInversion.png"))); // NOI18N
        menuItemRevisarI.setText("Revisar");
        menuItemRevisarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRevisarIActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemRevisarI);

        jMenuItem12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarServicio.png"))); // NOI18N
        jMenuItem12.setText("Actualizar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/visualizarInversion.png"))); // NOI18N
        jMenuItem15.setText("Visualizar");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuBar1.add(jMenu4);

        menuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Customers.png"))); // NOI18N
        menuUsuarios.setText("Usuarios");
        menuUsuarios.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jMenuItem18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarUsr.png"))); // NOI18N
        jMenuItem18.setText("Registrar");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        menuUsuarios.add(jMenuItem18);

        jMenuItem19.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultarUsr.png"))); // NOI18N
        jMenuItem19.setText("Consultar");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        menuUsuarios.add(jMenuItem19);

        jMenuItem20.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acrualizarUsr.png"))); // NOI18N
        jMenuItem20.setText("Actualizar");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        menuUsuarios.add(jMenuItem20);

        jMenuItem21.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/visualziarUsr.png"))); // NOI18N
        jMenuItem21.setText("Visualizar");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        menuUsuarios.add(jMenuItem21);

        jMenuBar1.add(menuUsuarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrameRegistrarCliente fc = new FrameRegistrarCliente();
        centrarVentana(fc);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FrameConsultarCliente fv = new FrameConsultarCliente();
        centrarVentana(fv);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrameRegistrarPrestamo frp = new FrameRegistrarPrestamo();
        centrarVentana(frp);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        FrameRegistrarInversion frp = new FrameRegistrarInversion();
        centrarVentana(frp);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        FrameConsultarInversion fci = new FrameConsultarInversion();
        centrarVentana(fci);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void menuItemRevisarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRevisarIActionPerformed
        FrameRevisarInversion fri = new FrameRevisarInversion();
        centrarVentana(fri);
    }//GEN-LAST:event_menuItemRevisarIActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FrameConsultarPrestamo fcp = new FrameConsultarPrestamo();
        centrarVentana(fcp);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void menuItemRevisarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRevisarPActionPerformed
        FrameRevisarPrestamo frp = new FrameRevisarPrestamo();
        centrarVentana(frp);
    }//GEN-LAST:event_menuItemRevisarPActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        FrameActualizarCliente fac = new FrameActualizarCliente();
        centrarVentana(fac);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        FrameActualizarInversion fai = new FrameActualizarInversion();
        centrarVentana(fai);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        FrameVisualizarPrestamo fvp = new FrameVisualizarPrestamo();
        centrarVentana(fvp);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        FrameVisualizarInversion fvi = new FrameVisualizarInversion();
        centrarVentana(fvi);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        FrameVisualizarCliente fvc = new FrameVisualizarCliente();
        centrarVentana(fvc);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        FrameActualizarPrestamo fap = new FrameActualizarPrestamo();
        centrarVentana(fap);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        this.setVisible(false);
        Login lg = new Login();
        lg.setLocationRelativeTo(null);
        lg.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        FrameCambioClave fcc = new FrameCambioClave(this, true);
        Dimension dimension = VentanaPrincipal.getSize();
        Dimension dFrame = fcc.getSize();
        fcc.setLocation((dimension.width - dFrame.width)/2, (dimension.height - dFrame.height)/2);
        fcc.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        FrameVisualizarUsuario fvu = new FrameVisualizarUsuario();
        centrarVentana(fvu);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        FrameRegistrarUsuario fru = new FrameRegistrarUsuario();
        centrarVentana(fru);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        FrameConsultarUsuario fcu = new FrameConsultarUsuario();
        centrarVentana(fcu);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        FrameActualizarUsuario fau = new FrameActualizarUsuario();
        centrarVentana(fau);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    public void centrarVentana(JInternalFrame frame){
        VentanaPrincipal.add(frame);
        Dimension dimension = VentanaPrincipal.getSize();
        Dimension dFrame = frame.getSize();
        frame.setLocation((dimension.width - dFrame.width)/2, (dimension.height - dFrame.height)/2);
        frame.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JDesktopPane VentanaPrincipal = new javax.swing.JDesktopPane();
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem menuItemRevisarI;
    private javax.swing.JMenuItem menuItemRevisarP;
    private javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables
}

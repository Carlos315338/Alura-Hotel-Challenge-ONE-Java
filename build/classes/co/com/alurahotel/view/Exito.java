package co.com.alurahotel.view;

import co.com.alurahotel.util.ColoresComponentesUtil;
import java.awt.Image;
import java.awt.Toolkit;
import co.com.alurahotel.modelo.Reserva;

/**
 *
 * @author carlos
 */
public class Exito extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    Reservas ventanaReservas = new Reservas();

    /**
     * Creates new form Exito
     */
    public Exito() {
        initComponents();
        configurarColoresComponentes();
        mostrarIdReserva();
    }
    
    private void configurarColoresComponentes() {
        setBackground(ColoresComponentesUtil.TRANSPARENTE);
        btnCerrar.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
        btnConfirmar.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
    }

    private void mostrarIdReserva() {
        jLabelClave.setText(ventanaReservas.getReserva().getId_Reserva());
    }
    
    public static void mostrarMenuUsuario(Exito e) {
        e.dispose();
        MenuUsuario menuUsuario = new MenuUsuario();
        menuUsuario.setVisible(true);
    }

    /**
     * Para logo de escritorio.
     */
    @Override
    public Image getIconImage() {
        Image retImage = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("co/com/alurahotel/imagenes/Ha-100px.png"));
        return retImage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                panelPrincipal = new JPanelTransparente();
                btnCerrar = new javax.swing.JLabel();
                jLabelInfoMensaje = new javax.swing.JLabel();
                jLabelIconoHotelAlura = new javax.swing.JLabel();
                btnConfirmar = new javax.swing.JLabel();
                jLabelClave = new javax.swing.JLabel();
                jLabelNumeroReserva = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
                setIconImage(getIconImage());
                setUndecorated(true);

                panelPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                        public void mouseDragged(java.awt.event.MouseEvent evt) {
                                panelPrincipalMouseDragged(evt);
                        }
                });
                panelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                panelPrincipalMousePressed(evt);
                        }
                });

                btnCerrar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
                btnCerrar.setForeground(new java.awt.Color(204, 204, 204));
                btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                btnCerrar.setText("x");
                btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                btnCerrar.setOpaque(true);
                btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btnCerrarMouseClicked(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                btnCerrarMouseEntered(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                btnCerrarMouseExited(evt);
                        }
                });

                jLabelInfoMensaje.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabelInfoMensaje.setForeground(new java.awt.Color(12, 138, 199));
                jLabelInfoMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabelInfoMensaje.setText("Datos Guardados Satisfactoriamente.");

                jLabelIconoHotelAlura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabelIconoHotelAlura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/alurahotel/imagenes/Ha-100px.png"))); // NOI18N

                btnConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                btnConfirmar.setForeground(new java.awt.Color(204, 204, 204));
                btnConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                btnConfirmar.setText("Confirmar");
                btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                btnConfirmar.setOpaque(true);
                btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btnConfirmarMouseClicked(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                btnConfirmarMouseEntered(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                btnConfirmarMouseExited(evt);
                        }
                });

                jLabelClave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabelClave.setForeground(new java.awt.Color(12, 138, 199));
                jLabelClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabelClave.setText("null");

                jLabelNumeroReserva.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabelNumeroReserva.setForeground(new java.awt.Color(12, 138, 199));
                jLabelNumeroReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabelNumeroReserva.setText("No. de Reserva:");

                javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
                panelPrincipal.setLayout(panelPrincipalLayout);
                panelPrincipalLayout.setHorizontalGroup(
                        panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabelInfoMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelIconoHotelAlura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelClave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                                        .addComponent(jLabelNumeroReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                                .addContainerGap())
                );
                panelPrincipalLayout.setVerticalGroup(
                        panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelIconoHotelAlura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelInfoMensaje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNumeroReserva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelClave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        evt.consume();
        this.dispose();
        MenuUsuario menuUsuario = new MenuUsuario();
        menuUsuario.setVisible(true);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        evt.consume();
        btnCerrar.setBackground(ColoresComponentesUtil.ROJO_OSCURO);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        evt.consume();
        btnCerrar.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked
        evt.consume();
        this.dispose();
        MenuUsuario menuUsuario = new MenuUsuario();
        menuUsuario.setVisible(true);
    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void btnConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseEntered
        evt.consume();
        btnConfirmar.setBackground(ColoresComponentesUtil.GRIS_CLARO);
    }//GEN-LAST:event_btnConfirmarMouseEntered

    private void btnConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseExited
        evt.consume();
        btnConfirmar.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
    }//GEN-LAST:event_btnConfirmarMouseExited

    private void panelPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelPrincipalMousePressed

    private void panelPrincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelPrincipalMouseDragged

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Exito().setVisible(true);
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel btnCerrar;
        private javax.swing.JLabel btnConfirmar;
        private javax.swing.JLabel jLabelClave;
        private javax.swing.JLabel jLabelIconoHotelAlura;
        private javax.swing.JLabel jLabelInfoMensaje;
        private javax.swing.JLabel jLabelNumeroReserva;
        private javax.swing.JPanel panelPrincipal;
        // End of variables declaration//GEN-END:variables
}

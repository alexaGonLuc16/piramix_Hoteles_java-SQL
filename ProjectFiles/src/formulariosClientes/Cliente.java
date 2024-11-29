package formulariosClientes;
import formulariosClientes.HacerReservacion;

/**
 * @author PC
 */
public class Cliente extends javax.swing.JFrame {

    public Cliente() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHabitaciones1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labNombreUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnReservar = new javax.swing.JButton();
        btnHabitaciones = new javax.swing.JButton();
        btnVerHoteles = new javax.swing.JButton();

        btnHabitaciones1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHabitaciones1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Pictures\\iconos\\icons8_calendar_22_35px_1.png")); // NOI18N
        btnHabitaciones1.setText("Reservar");
        btnHabitaciones1.setBorder(null);
        btnHabitaciones1.setBorderPainted(false);
        btnHabitaciones1.setContentAreaFilled(false);
        btnHabitaciones1.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Pictures\\iconos\\icons8_calendar_22_35px_1.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 36, 51));

        jPanel3.setBackground(new java.awt.Color(15, 37, 59));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cliente");

        labNombreUsuario.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        labNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_user_35px_2.png"))); // NOI18N

        btnCerrar.setBackground(new java.awt.Color(255, 153, 102));
        btnCerrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setText("Cerrar sesión");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(66, 66, 66))
        );

        jPanel2.setBackground(new java.awt.Color(10, 25, 40));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        btnReservar.setBackground(new java.awt.Color(0, 204, 204));
        btnReservar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReservar.setForeground(new java.awt.Color(0, 0, 0));
        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_calendar_19_30px.png"))); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.setBorder(null);
        btnReservar.setBorderPainted(false);
        btnReservar.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Pictures\\iconos\\icons8_calendar_22_35px_1.png")); // NOI18N
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        btnHabitaciones.setBackground(new java.awt.Color(0, 204, 204));
        btnHabitaciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHabitaciones.setForeground(new java.awt.Color(0, 0, 0));
        btnHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_watch_tv_30px.png"))); // NOI18N
        btnHabitaciones.setText("Habitaciones");
        btnHabitaciones.setBorder(null);
        btnHabitaciones.setBorderPainted(false);
        btnHabitaciones.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Pictures\\iconos\\icons8_calendar_22_35px_1.png")); // NOI18N
        btnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionesActionPerformed(evt);
            }
        });

        btnVerHoteles.setBackground(new java.awt.Color(0, 204, 204));
        btnVerHoteles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerHoteles.setForeground(new java.awt.Color(0, 0, 0));
        btnVerHoteles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_hotel_30px.png"))); // NOI18N
        btnVerHoteles.setText("Hoteles");
        btnVerHoteles.setBorder(null);
        btnVerHoteles.setBorderPainted(false);
        btnVerHoteles.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Pictures\\iconos\\icons8_calendar_22_35px_1.png")); // NOI18N
        btnVerHoteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHotelesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVerHoteles, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerHoteles, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 161, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //evento del botón VerHoteles, se encarga de abrir el formulario VerHoteles y cerrar el formulario actual
    private void btnVerHotelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHotelesActionPerformed
        VerHoteles reservar=new VerHoteles();
        reservar.labUsuarioHotel.setText(labNombreUsuario.getText());//asignar el nombre del usuario a la etiqueta del formulario Habitaciones
        this.dispose();
        reservar.setVisible(true);
    }//GEN-LAST:event_btnVerHotelesActionPerformed

    //evento del botón Reservar, se encarga de abrir el formulario Reservar y cerrar el formulario actual
    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        HacerReservacion reservar=new HacerReservacion();
        reservar.labNombreUsuario.setText(labNombreUsuario.getText());//asignar el nombre del usuario a la etiqueta del formulario Habitaciones
        this.dispose();
        reservar.setVisible(true);
    }//GEN-LAST:event_btnReservarActionPerformed

    //evento del botón VerHabitaciones, se encarga de abrir el formulario VerHabitaciones y cerrar el formulario actual
    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        VerHabitaciones habitacion=new VerHabitaciones();
        habitacion.labUsuarioHabitacion.setText(labNombreUsuario.getText());//asignar el nombre del usuario a la etiqueta del formulario Habitaciones
        this.dispose();
        habitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacionesActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnHabitaciones1;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnVerHoteles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JLabel labNombreUsuario;
    // End of variables declaration//GEN-END:variables
}

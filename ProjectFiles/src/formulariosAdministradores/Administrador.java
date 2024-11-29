package formulariosAdministradores;
import conexionBD.ConexionBD;
import formulariosClientes.HacerReservacion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import login.MetodosLogin;
/**
 *
 * @author PC
 */
public class Administrador extends javax.swing.JFrame {

    public Administrador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labNombreUsuario = new javax.swing.JLabel();
        btnHabit = new javax.swing.JButton();
        btnReserv = new javax.swing.JButton();
        btnHoteles = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 37, 59));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrador");

        labNombreUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labNombreUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_user_35px_2.png"))); // NOI18N

        btnHabit.setBackground(new java.awt.Color(255, 153, 102));
        btnHabit.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnHabit.setText("Ver habitaciones");
        btnHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitActionPerformed(evt);
            }
        });

        btnReserv.setBackground(new java.awt.Color(255, 153, 102));
        btnReserv.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnReserv.setText("Ver reservaciones");
        btnReserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservActionPerformed(evt);
            }
        });

        btnHoteles.setBackground(new java.awt.Color(255, 153, 102));
        btnHoteles.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnHoteles.setText("Ver Hoteles");
        btnHoteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHotelesActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnCerrar.setText("Cerrar sesión");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHoteles, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReserv)
                            .addComponent(btnHabit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(labNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(btnHabit)
                .addGap(28, 28, 28)
                .addComponent(btnReserv)
                .addGap(32, 32, 32)
                .addComponent(btnHoteles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //evento del botón "Ver Habitaciones" , se encarga de abrir el formulario Habitaciones y cerrar el actual(Administrador)
    private void btnHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitActionPerformed
        Habitaciones habitacion=new Habitaciones();
        habitacion.labUsuarioHabit.setText(labNombreUsuario.getText());//asignar el nombre del usuario a la etiqueta del formulario Habitaciones
        this.dispose();
        habitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitActionPerformed
    //evento del botón "Ver Hoteles" , se encarga de abrir el formulario Hoteles y cerrar el actual(Administrador)
    private void btnHotelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHotelesActionPerformed
        Hoteles hotel=new Hoteles();
        hotel.txtNombreUs.setText(labNombreUsuario.getText());//asignar el nombre del usuario a la etiqueta del formulario Hoteles
        this.dispose();
        hotel.setVisible(true); 
    }//GEN-LAST:event_btnHotelesActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    //evento del botón "Ver Reservaciones" , se encarga de abrir el formulario HacerReservacion y cerrar el actual(Administrador) 
    private void btnReservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservActionPerformed
        HacerReservacion reservar= new HacerReservacion();
        reservar.labNombreUsuario.setText(labNombreUsuario.getText());
        this.dispose();
        reservar.setVisible(true);
    }//GEN-LAST:event_btnReservActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnHabit;
    private javax.swing.JButton btnHoteles;
    private javax.swing.JButton btnReserv;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel labNombreUsuario;
    // End of variables declaration//GEN-END:variables
    
    //coneccion a base de datos
    ConexionBD cc=new ConexionBD();
    Connection cnn=cc.conectar();
}

package formulariosClientes;
import conexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class HacerReservacion extends javax.swing.JFrame {
    public HacerReservacion() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    void limpiarTxt(){
        txtIdHabit.setText("");
        txtIdHotel.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fechaIngreso = new com.toedter.calendar.JDateChooser();
        fechaSalida = new com.toedter.calendar.JDateChooser();
        fechaReserv = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labNombreUsuario = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnHabitacion = new javax.swing.JButton();
        btnHotel = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        spinnerHospedados = new javax.swing.JSpinner();
        txtIdHabit = new javax.swing.JTextField();
        txtIdHotel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReservacion = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnInsertarReserv = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnMostrarReserv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(46, 15, 15));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha de reservación:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Num. de  Habitación:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha Ingreso:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha Salida:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Num. de Hospedados:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Num. de Hotel:");

        fechaReserv.setForeground(new java.awt.Color(255, 255, 255));
        fechaReserv.setDateFormatString("dd/MM/yyyy");
        fechaReserv.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(187, 68, 68));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reservaciones");

        labNombreUsuario.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        labNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_user_35px_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(113, 48, 48));

        btnHabitacion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_watch_tv_26px.png"))); // NOI18N
        btnHabitacion.setText("Habitaciones");
        btnHabitacion.setBorder(null);
        btnHabitacion.setBorderPainted(false);
        btnHabitacion.setContentAreaFilled(false);
        btnHabitacion.setFocusPainted(false);
        btnHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionActionPerformed(evt);
            }
        });

        btnHotel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnHotel.setForeground(new java.awt.Color(255, 255, 255));
        btnHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_hotel_25px_2.png"))); // NOI18N
        btnHotel.setText("  Hoteles");
        btnHotel.setBorder(null);
        btnHotel.setBorderPainted(false);
        btnHotel.setContentAreaFilled(false);
        btnHotel.setFocusPainted(false);
        btnHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHotelActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(255, 153, 102));
        btnMenu.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnMenu.setText("Menu Principal");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnMenu)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        spinnerHospedados.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        spinnerHospedados.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));

        tableReservacion.setBackground(new java.awt.Color(51, 51, 51));
        tableReservacion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tableReservacion.setForeground(new java.awt.Color(255, 255, 255));
        tableReservacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Reservación", "Email", "Fecha de Reservación", "id Habitación", "Fecha Ingreso", "Fecha Salida", "Num Hospedados", "Id Hotel"
            }
        ));
        tableReservacion.setToolTipText("");
        tableReservacion.setRowHeight(20);
        jScrollPane1.setViewportView(tableReservacion);

        btnGuardar.setBackground(new java.awt.Color(255, 153, 102));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnInsertarReserv.setBackground(new java.awt.Color(255, 153, 102));
        btnInsertarReserv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnInsertarReserv.setForeground(new java.awt.Color(0, 0, 0));
        btnInsertarReserv.setText("Registrar mi reservación");
        btnInsertarReserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarReservActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        btnEditar.setBackground(new java.awt.Color(255, 153, 102));
        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 153, 102));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Email:");

        btnMostrarReserv.setBackground(new java.awt.Color(255, 153, 102));
        btnMostrarReserv.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnMostrarReserv.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrarReserv.setText("Mostrar reservaciones");
        btnMostrarReserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarReservActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnGuardar)
                        .addGap(73, 73, 73)
                        .addComponent(btnInsertarReserv)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(spinnerHospedados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtIdHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdHabit, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fechaReserv, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnMostrarReserv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addGap(31, 31, 31)
                        .addComponent(btnEliminar)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(fechaReserv, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdHabit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtIdHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(spinnerHospedados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertarReserv)
                    .addComponent(btnGuardar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnMostrarReserv))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
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
    
    //evento mostrarDtos, se encarga de mosstrar en la tabla del formulario las Reservaciones registradas
    public void mostrarDatos(String valor){
        DefaultTableModel modelo =new DefaultTableModel();// creación del objeto modelo de la clase DefaultTableModel, con este objeto constriremos el modelo de la tabla
        //añadir cada columna del modelo de tabla mediante el método addColumn() y mandar como parámetros el texto que aparecerá en la columna
        modelo.addColumn("Id Reservación");
        modelo.addColumn("Email");
        modelo.addColumn("Fecha de Reservación");
        modelo.addColumn("idHabitación");
        modelo.addColumn("Fecha de Ingreso");
        modelo.addColumn("Fecha de salida");
        modelo.addColumn("Hospedados");
        modelo.addColumn("idHotel");//Columna con el texto "Teléfono"
        this.tableReservacion.setModel(modelo);//asignar el objeto <modelo> a la tableDatos mediante el método setModel() 
        String sql="";
        if(valor.equals("")){
            sql="SELECT* FROM reservacion";
            
        }
        else{
            sql="SELECT* FROM reservacion WHERE email='"+valor+"'";
        }
            
        try {           
            Statement st=cnn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){//mientras la variable tipo resultStatement tenga valores.. 
                String datos[]=new String[8];//crear una vector de tipo String con el tamaño correspondiente al número de columnas en nuestra tabla(9) para guardar los valores obtenidos en la consulta
                datos[0]=rs.getString(1);//asignar en orden cada dato obtenido en la consulta a los elementos del arreglo datos que creamos(los valores obtenidos están guardados en el objeto ResultSet)
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                modelo.addRow(datos);
                
            }
            this.tableReservacion.setModel(modelo);//asignar el objeto construido<modelo> a la tableDatos mediante el método setModel() 
        } catch (SQLException ex) {
            Logger.getLogger(HacerReservacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    //métodos que obtiene la fecha seleccionada en el componente JDateChooser y convertirlo a dato tipo Date
    public Date fechaReservacion(){
        Calendar cal;
        int d,m,a;
        cal=fechaReserv.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR)-1900;
        return new Date(a,m,d);
    }
     public Date fechaIngreso(){
        Calendar cal;
        int d,m,a;
        cal=fechaIngreso.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR)-1900;
        return new Date(a,m,d);
    }
      public Date fechaSalida(){
        Calendar cal;
        int d,m,a;
        cal=fechaSalida.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR)-1900;
        return new Date(a,m,d);
    }
    
    //evento del botón Habitacion, abre el formulario VerHabitaciones y cierra el actual
    private void btnHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionActionPerformed
        VerHabitaciones habitacion=new VerHabitaciones();
        habitacion.labUsuarioHabitacion.setText(labNombreUsuario.getText());//asignar el nombre del usuario a la etiqueta del formulario Habitaciones
        this.dispose();
        habitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacionActionPerformed

    //evento del botón Hotel, abre el formulario VerHoteles y cierra el actual
    private void btnHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHotelActionPerformed
        VerHoteles reservar=new VerHoteles();
        reservar.labUsuarioHotel.setText(labNombreUsuario.getText());//asignar el nombre del usuario a la etiqueta del formulario Habitaciones
        this.dispose();
        reservar.setVisible(true);
    }//GEN-LAST:event_btnHotelActionPerformed

    //método encargado de Guardar la reservación del usuario
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(JOptionPane.YES_OPTION==JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios de la reservación?", "Confirmación de modificación de datos", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)){//si el usuario responde "Sí al mensaje de confirmacion de modificaión de datos,los datos se modificarán
            try {
                
                PreparedStatement pst=cnn.prepareStatement("UPDATE reservacion SET fechaReserv='"+fechaReservacion()+"',idHabitacion='"+Integer.parseInt(txtIdHabit.getText())+"' ,fechaIngreso='"+fechaIngreso()+"' ,fechaSalida='"+fechaSalida()+"',numHospedados="+((int)spinnerHospedados.getValue())+",idHotel="+Integer.parseInt(txtIdHotel.getText()));
                pst.executeUpdate();
                mostrarDatos("");

            } catch (SQLException ex) {
                Logger.getLogger(HacerReservacion.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error: "+ex, "ERROR AL MODIFICAR", JOptionPane.ERROR_MESSAGE);
            }
            limpiarTxt();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    //método encargado de insertar en la base de datos la reserva realizada por el usuario
    private void btnInsertarReservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarReservActionPerformed

        if(JOptionPane.YES_OPTION==JOptionPane.showConfirmDialog(null, "¿Desea registrar la reservación?", "Confirmación de registro", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)){//si el usuario responde "Sí al mensaje de confirmacion de  inserción de datos,los datos se insertarán
            try {//validar campos y poner formato de numero
                PreparedStatement pst=cnn.prepareStatement("INSERT INTO reservacion (email,fechaReserv,idHabitacion,fechaIngreso,fechaSalida,numHospedados,idHotel) VALUES(?,?,?,?,?,?,?)");
                pst.setString(1,txtEmail.getText());
                Calendar cal;
                int d,m,a;
                cal=fechaReserv.getCalendar();
                d=cal.get(Calendar.DAY_OF_MONTH);
                m=cal.get(Calendar.MONTH);
                a=cal.get(Calendar.YEAR)-1900;
                pst.setDate(2,(fechaReservacion()));
                pst.setInt(3,Integer.parseInt(txtIdHabit.getText()));
                cal=fechaIngreso.getCalendar();
                d=cal.get(Calendar.DAY_OF_MONTH);
                m=cal.get(Calendar.MONTH);
                a=cal.get(Calendar.YEAR)-1900;
                pst.setDate(4,(fechaIngreso()));
                cal=fechaSalida.getCalendar();
                d=cal.get(Calendar.DAY_OF_MONTH);
                m=cal.get(Calendar.MONTH);
                a=cal.get(Calendar.YEAR)-1900;
                pst.setDate(5,(fechaSalida()));
                pst.setInt(6, (int) spinnerHospedados.getValue());
                pst.setInt(7,Integer.parseInt(txtIdHotel.getText()));
                pst.executeUpdate();
                mostrarDatos(txtEmail.getText());
                limpiarTxt();
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex, "ERROR: Datos duplicados", HEIGHT);       
                System.out.println("ERROR: "+ex);    
             }
        }
    }//GEN-LAST:event_btnInsertarReservActionPerformed

    //evento del botón Editar, asigna los datos a editar en los campos de texto
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       int fila=tableReservacion.getSelectedRow();
        if(fila>=0){
            txtEmail.setText(tableReservacion.getValueAt(fila,1).toString());//obtener el texto de la columna correspondiente al dato y a la variable fila(la fila seleccionada) y lo mandamos como parámetro a la caja de texto de cada dato para que puedan ser modificados
            txtIdHabit.setText(tableReservacion.getValueAt(fila,3).toString());
            txtIdHotel.setText(tableReservacion.getValueAt(fila,7).toString());
        }
        else{//si no hay fila seleccionada:
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "No hay datos seleccionados", JOptionPane.INFORMATION_MESSAGE);//pedirle al usuario que seleccione una fila
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    //evento del botón eliminar, elimina la reservación seleccionada, referenciando el Id de la reservación
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila=tableReservacion.getSelectedRow();
        if(fila>=0){//evaluar si hay una fila seleccionada en la tableHoteles, si la condición es verdadera se realiza lo siguiente:
            String idHotel=tableReservacion.getValueAt(fila,0).toString();
            int respuesta=JOptionPane.showConfirmDialog(null, "¿Desea eliminar su reserva?", "Confirmación de eliminación de reserva", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(respuesta==JOptionPane.YES_OPTION){//si el usuario responde "Sí" al mensaje de confirmacion de  eliminación de datos,los datos se eliminarán
                try {
                    PreparedStatement pst=cnn.prepareStatement("DELETE FROM reservacion WHERE idReservacion="+Integer.parseInt(tableReservacion.getValueAt(fila,0).toString())+" ");
                    pst.executeUpdate();
                    mostrarDatos("");
                } catch (SQLException ex) {
                    Logger.getLogger(HacerReservacion.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Error al eliminar: "+ex, "ERROR DE ELIMINACIÓN", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        else{//si no hay fila seleccionada:
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "No hay datos seleccionados", JOptionPane.INFORMATION_MESSAGE);//pedirle al usuario que seleccione una fila
        }    
    }//GEN-LAST:event_btnEliminarActionPerformed

    //evento del botón mostrarDatos
    private void btnMostrarReservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarReservActionPerformed
        mostrarDatos("");
    }//GEN-LAST:event_btnMostrarReservActionPerformed

    //botón para volver al menú
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Cliente cliente=new Cliente();
        cliente.labNombreUsuario.setText(labNombreUsuario.getText());
        this.dispose();
        cliente.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HacerReservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHabitacion;
    private javax.swing.JButton btnHotel;
    private javax.swing.JButton btnInsertarReserv;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMostrarReserv;
    private com.toedter.calendar.JDateChooser fechaIngreso;
    private static com.toedter.calendar.JDateChooser fechaReserv;
    private com.toedter.calendar.JDateChooser fechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel labNombreUsuario;
    private javax.swing.JSpinner spinnerHospedados;
    public javax.swing.JTable tableReservacion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdHabit;
    private javax.swing.JTextField txtIdHotel;
    // End of variables declaration//GEN-END:variables
    //conectar con la base de datos
    ConexionBD cc=new ConexionBD();
    Connection cnn=cc.conectar();
}

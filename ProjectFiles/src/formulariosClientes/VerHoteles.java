package formulariosClientes;
import conexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class VerHoteles extends javax.swing.JFrame {

    /** Creates new form VerHoteles */
    public VerHoteles() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarDatos("");
    }
    //método mostrarDatos, se encarga de mostrar los resultados de la consulta que se relice dependiendo de los parámetros enviados
    void mostrarDatos(String valor){
        DefaultTableModel modelo =new DefaultTableModel();// creación del objeto modelo llamando al método constructor de la clase
        modelo.addColumn("Id Hotel");//añadir cada columna del modelo de tabla mediante el método addColumn(), mandar como parámetros el texto que aparecerá en la columna
        modelo.addColumn("Nombre");//Columna con el texto "Apellido"
        modelo.addColumn("Ciudad");//Columna con el texto "Teléfono"
        modelo.addColumn("Dirección");//Columna con el texto "Teléfono"
        modelo.addColumn("País");//Columna con el texto "Teléfono"
        modelo.addColumn("Recepción");//Columna con el texto "Teléfono"
        this.tableHoteles.setModel(modelo);//asignar el objeto <modelo> a la tableDatos mediante el método setModel()
        String sql="";
        if(valor.equals("")){
            sql="SELECT* FROM hotel";
            
        }
        else{
            sql="SELECT* FROM hotel WHERE idHotel='"+valor+"'";
        }
            
        try {           
            Statement st=cnn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){//mientras la variable tipo resultStatement esé leyendo.. 
                String datos[]=new String[6];//crear una vector de tipo String con el tamaño correspondiente al número de columnas en nuestra tabla(6) para guardar los valores obtenidos en la consulta
                datos[0]=rs.getString(1);//asignar en orden cada dato obtenido en la consulta a los elementos del arreglo <datos> que creamos(los valores obtenidos están guardados en el objeto ResultSet)
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                modelo.addRow(datos);
                
            }
            this.tableHoteles.setModel(modelo);//asignar el objeto construido<modelo> a la tableDatos mediante el método setModel() 
        } catch (SQLException ex) {
            Logger.getLogger(VerHoteles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHoteles = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labUsuarioHotel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnReservar = new javax.swing.JButton();
        btnHabitaciones = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        tableHoteles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableHoteles.setRowHeight(25);
        jScrollPane1.setViewportView(tableHoteles);

        jPanel2.setBackground(new java.awt.Color(5, 33, 61));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hoteles");

        labUsuarioHotel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        labUsuarioHotel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_user_35px_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labUsuarioHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labUsuarioHotel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(5, 33, 61));

        btnReservar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReservar.setForeground(new java.awt.Color(255, 255, 255));
        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_calendar_19_25px.png"))); // NOI18N
        btnReservar.setText("  Reservar");
        btnReservar.setBorder(null);
        btnReservar.setBorderPainted(false);
        btnReservar.setContentAreaFilled(false);
        btnReservar.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Pictures\\iconos\\icons8_calendar_22_35px_1.png")); // NOI18N
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        btnHabitaciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_watch_tv_26px.png"))); // NOI18N
        btnHabitaciones.setText("Habitaciones");
        btnHabitaciones.setBorder(null);
        btnHabitaciones.setBorderPainted(false);
        btnHabitaciones.setContentAreaFilled(false);
        btnHabitaciones.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Pictures\\iconos\\icons8_calendar_22_35px_1.png")); // NOI18N
        btnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionesActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(255, 153, 102));
        btnMenu.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnMenu.setText("Menú principal");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnMostrar.setBackground(new java.awt.Color(255, 153, 102));
        btnMostrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrar.setText("Mostrar Hoteles");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        txtBuscar.setToolTipText("introduzca el numero de la habitación para buacarla");

        btnBuscar.setBackground(new java.awt.Color(255, 153, 102));
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_search_25px_1.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
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
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(335, 335, 335)
                                        .addComponent(btnMostrar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrar)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //evento del botón Reservar, abre el formulario HacerReservacion y cierra el actual(VerHoteles)
    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        HacerReservacion reservar=new HacerReservacion();
        reservar.labNombreUsuario.setText(labUsuarioHotel.getText());//asignar el nombre del usuario a la etiqueta del formulario Habitaciones
        this.dispose();
        reservar.setVisible(true);
    }//GEN-LAST:event_btnReservarActionPerformed

    //evento del botón VerHabitaciones, abre el formulario VerHabitaciones y cierra el actual(VerHoteles)
    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        VerHabitaciones habitacion=new VerHabitaciones();
        habitacion.labUsuarioHabitacion.setText(labUsuarioHotel.getText());//asignar el nombre del usuario a la etiqueta del formulario Habitaciones
        this.dispose();
        habitacion.setVisible(true);
    }//GEN-LAST:event_btnHabitacionesActionPerformed

    //evento del botón Mostrar, muestra los hoteles registrados
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarDatos("");
    }//GEN-LAST:event_btnMostrarActionPerformed

    //evento del botón Buscar, llama al método mostrar datos y manda como parámetro el idHotel introducido en el txtBuscar, así la consulta se realiza donde se encuentre este registro
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    //evento del botón Menu, abre el formulario Cliente y cierra el actual(VerHoteles)
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Cliente cliente=new Cliente();
        cliente.labNombreUsuario.setText(labUsuarioHotel.getText());
        this.dispose();
        cliente.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerHoteles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labUsuarioHotel;
    private javax.swing.JTable tableHoteles;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
    ConexionBD cc=new ConexionBD();
    Connection cnn=cc.conectar();
}

package formulariosClientes;
import conexionBD.ConexionBD;
import formulariosAdministradores.Habitaciones;
import formulariosAdministradores.Hotel;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC
 */
public class VerHabitaciones extends javax.swing.JFrame {

    public VerHabitaciones() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarDatos("");//llamar al método mostrarDatos para mostrar las habitaciones en la tabla del formulario 
    }
    Habitaciones habitacion=new Habitaciones();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labUsuarioHabitacion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnReservar = new javax.swing.JButton();
        btnVerHoteles = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHabit = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 24, 50));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Habitaciones");

        labUsuarioHabitacion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        labUsuarioHabitacion.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_user_35px_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(labUsuarioHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labUsuarioHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(5, 33, 61));

        btnReservar.setBackground(new java.awt.Color(0, 102, 153));
        btnReservar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReservar.setForeground(new java.awt.Color(255, 255, 255));
        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_calendar_19_25px.png"))); // NOI18N
        btnReservar.setText("  Reservar");
        btnReservar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnReservar.setBorderPainted(false);
        btnReservar.setContentAreaFilled(false);
        btnReservar.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Pictures\\iconos\\icons8_calendar_22_35px_1.png")); // NOI18N
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        btnVerHoteles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerHoteles.setForeground(new java.awt.Color(255, 255, 255));
        btnVerHoteles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_hotel_25px_2.png"))); // NOI18N
        btnVerHoteles.setText("Hoteles");
        btnVerHoteles.setBorder(null);
        btnVerHoteles.setBorderPainted(false);
        btnVerHoteles.setContentAreaFilled(false);
        btnVerHoteles.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Pictures\\iconos\\icons8_calendar_22_35px_1.png")); // NOI18N
        btnVerHoteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHotelesActionPerformed(evt);
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerHoteles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerHoteles, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnMenu)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnMostrar.setBackground(new java.awt.Color(255, 153, 102));
        btnMostrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrar.setText("Mostrar Habitaciones");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        tableHabit.setBackground(new java.awt.Color(51, 51, 51));
        tableHabit.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tableHabit.setForeground(new java.awt.Color(255, 255, 255));
        tableHabit.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableHabit);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 105, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMostrar)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnMostrar)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //método mostrarDatos, se encarga de mostrar los resultados de la consulta que se relice dependiendo de los parámetros enviados
    public void mostrarDatos(String valor){
        DefaultTableModel modelo =new DefaultTableModel();// creación del objeto modelo de la clase DefaultTableModel, con este objeto constriremos el modelo de la tabla
        modelo.addColumn("Id Habitación");//añadir cada columna del modelo de tabla mediante el método addColumn(), mandar como parámetros el texto que aparecerá en la columna
        modelo.addColumn("Id Hotel");//Columna "Hotel"
        modelo.addColumn("Num. Piso");
        modelo.addColumn("Cant. Camas");//Columna con el texto "Teléfono"
        modelo.addColumn("Costo");//Columna con el texto "Teléfono"
        modelo.addColumn("Servicios");//Columna con el texto "Teléfono"
        modelo.addColumn("Tipo");//Columna con el texto "Teléfono"
        modelo.addColumn("Descuento");//Columna con el texto "Teléfono"
        modelo.addColumn("Estado");//Columna con el texto "Teléfono"
        this.tableHabit.setModel(modelo);//asignar el objeto <modelo> a la tableDatos mediante el método setModel() 
        String sql="";
        if(valor.equals("")){
            sql="SELECT* FROM habitacion";
            
        }
        else{
            sql="SELECT* FROM habitacion WHERE idHabitacion='"+valor+"'";
        }
            
        try {           
            Statement st=cnn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){//mientras la variable tipo resultStatement esé leyendo.. 
                String datos[]=new String[9];//crear una vector de tipo String con el tamaño correspondiente al número de columnas en nuestra tabla(9) para guardar los valores obtenidos en la consulta
                datos[0]=rs.getString(1);//asignar en orden cada dato obtenido en la consulta a los elementos del arreglo datos que creamos(los valores obtenidos están guardados en el objeto ResultSet)
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                modelo.addRow(datos);  
            }
            this.tableHabit.setModel(modelo);//asignar el objeto construido<modelo> a la tableDatos mediante el método setModel() 
        } catch (SQLException ex) {
            Logger.getLogger(VerHabitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //evento del botón Reservar, abre el formulario HacerReservacion y cierra el actual(VerHabitaciones)
    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        HacerReservacion reservar=new HacerReservacion();
        reservar.labNombreUsuario.setText(labUsuarioHabitacion.getText());//asignar el nombre del usuario a la etiqueta del formulario Habitaciones
        this.dispose();
        reservar.setVisible(true);
    }//GEN-LAST:event_btnReservarActionPerformed
    //evento del botón VerHoteles, abre el formulario VerHoteles y cierra el actual(VerHabitaciones)
    private void btnVerHotelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHotelesActionPerformed
        VerHoteles reservar=new VerHoteles();
        reservar.labUsuarioHotel.setText(labUsuarioHabitacion.getText());//asignar el nombre del usuario a la etiqueta del formulario Habitaciones
        this.dispose();
        reservar.setVisible(true);
    }//GEN-LAST:event_btnVerHotelesActionPerformed
    //evento del botón Mostrar, muestra las habitaciones registradas
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarDatos("");
    }//GEN-LAST:event_btnMostrarActionPerformed

    //evento del botón Buscar, llama al método mostrar datos y manda como parámetro el idHabitacion introducido en el txtBuscar, así la consulta se realiza donde se encuentre este registro
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrarDatos(txtBuscar.getText());

    }//GEN-LAST:event_btnBuscarActionPerformed

    //evento del botón Menu, abre el formulario Cliente y cierra el actual(VerHabitaciones)
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Cliente cliente=new Cliente();
        cliente.labNombreUsuario.setText(labUsuarioHabitacion.getText());
        this.dispose();
        cliente.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerHabitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnVerHoteles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labUsuarioHabitacion;
    private javax.swing.JTable tableHabit;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
    ConexionBD cc=new ConexionBD();//crear objeto de la clase que creamos para establecer la conexión con la base de datos
    Connection cnn=cc.conectar();
}

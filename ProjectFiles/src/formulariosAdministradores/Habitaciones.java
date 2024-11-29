package formulariosAdministradores;
import conexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
/**
 * @author PC
 */
public class Habitaciones extends javax.swing.JFrame {

    public Habitaciones() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarDatos("");
    }
    
    void limpiarTxt(){
        txtIdHabit.setText("");
        txtIdHotel.setText("");
        txtPiso.setText("");
        txtCamas.setText("");
        txtCosto.setText("");
        txtServicios.setText("");
        txtTipo.setText("");
        txtDescuento.setText("");
        txtEstado.setText("");
    }
    
    
    public void mostrarDatos(String valor){
        DefaultTableModel modelo =new DefaultTableModel();// creación del objeto modelo de la clase DefaultTableModel, con este objeto constriremos el modelo de la tabla
        modelo.addColumn("Id Habitación");//añadir cada columna del modelo de tabla mediante el método addColumn(), mandar como parámetros el texto que aparecerá en la columna
        modelo.addColumn("Id Hotel");
        modelo.addColumn("Num. Piso");
        modelo.addColumn("Cant. Camas");
        modelo.addColumn("Costo");
        modelo.addColumn("Servicios");
        modelo.addColumn("Tipo");
        modelo.addColumn("Descuento");
        modelo.addColumn("Estado");
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
            while(rs.next()){//mientras la variable tipo resultStatement tenga valores.. 
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
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuModificar = new javax.swing.JPopupMenu();
        itemModificar = new javax.swing.JMenuItem();
        itemEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labUsuarioHabit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHabit = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnVolverMenu = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdHabit = new javax.swing.JTextField();
        txtIdHotel = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtServicios = new javax.swing.JTextField();
        txtPiso = new javax.swing.JTextField();
        txtCamas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        itemModificar.setText("Modificar");
        itemModificar.setToolTipText("Haga clic para modificar la habitación");
        itemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModificarActionPerformed(evt);
            }
        });
        menuModificar.add(itemModificar);

        itemEliminar.setText("Eliminar");
        itemEliminar.setToolTipText("");
        itemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarActionPerformed(evt);
            }
        });
        menuModificar.add(itemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HABITACIONES");

        labUsuarioHabit.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        labUsuarioHabit.setForeground(new java.awt.Color(255, 255, 255));
        labUsuarioHabit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labUsuarioHabit.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Pictures\\iconos\\icons8_male_user_35px.png")); // NOI18N
        labUsuarioHabit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tableHabit.setBackground(new java.awt.Color(51, 51, 51));
        tableHabit.setFont(new java.awt.Font("Segoe UI Symbol", 0, 13)); // NOI18N
        tableHabit.setForeground(new java.awt.Color(255, 255, 255));
        tableHabit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Habitación", "Id Hotel", "Piso", "Cant. de camas", "Costo/ día", "Servicios", "Tipo", "Descripción", "Descuento", "Estado"
            }
        ));
        tableHabit.setToolTipText("Selecciona una fila y haz clic derecho en ella para modificar o eliminarla");
        tableHabit.setComponentPopupMenu(menuModificar);
        tableHabit.setRowHeight(30);
        jScrollPane1.setViewportView(tableHabit);

        btnEliminar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        btnEliminar.setText("Eliminar Habitación");
        btnEliminar.setToolTipText("Selecciona una fila y presiona este botón para eliminarla");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMostrar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        btnMostrar.setText("Mostrar Habitaciones");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnVolverMenu.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        btnVolverMenu.setText("Volver al Menú");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Habitación", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI Symbol", 1, 18), new java.awt.Color(51, 204, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Id Habitación:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Id Hotel:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Piso:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cant Camas:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Costo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Servicios:");

        txtIdHabit.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtIdHabit.setForeground(new java.awt.Color(255, 255, 255));
        txtIdHabit.setOpaque(false);
        txtIdHabit.setPreferredSize(new java.awt.Dimension(140, 24));

        txtIdHotel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtIdHotel.setForeground(new java.awt.Color(255, 255, 255));
        txtIdHotel.setOpaque(false);

        txtCosto.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtCosto.setForeground(new java.awt.Color(255, 255, 255));
        txtCosto.setOpaque(false);
        txtCosto.setPreferredSize(new java.awt.Dimension(140, 24));

        txtServicios.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtServicios.setForeground(new java.awt.Color(255, 255, 255));
        txtServicios.setOpaque(false);
        txtServicios.setPreferredSize(new java.awt.Dimension(140, 24));

        txtPiso.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtPiso.setForeground(new java.awt.Color(255, 255, 255));
        txtPiso.setOpaque(false);
        txtPiso.setPreferredSize(new java.awt.Dimension(140, 24));

        txtCamas.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtCamas.setForeground(new java.awt.Color(255, 255, 255));
        txtCamas.setOpaque(false);
        txtCamas.setPreferredSize(new java.awt.Dimension(140, 24));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tipo:");

        txtTipo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(255, 255, 255));
        txtTipo.setOpaque(false);
        txtTipo.setPreferredSize(new java.awt.Dimension(140, 24));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Descuento %:");

        txtDescuento.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtDescuento.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento.setOpaque(false);
        txtDescuento.setPreferredSize(new java.awt.Dimension(140, 24));

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Estado:");

        txtEstado.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(255, 255, 255));
        txtEstado.setOpaque(false);
        txtEstado.setPreferredSize(new java.awt.Dimension(140, 24));

        btnInsertar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        btnInsertar.setText("Insertar Nueva Habitación");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        btnGuardar.setText("Guardar cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdHotel)
                    .addComponent(txtCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCamas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIdHabit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdHabit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtIdHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolverMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(labUsuarioHabit, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(382, 382, 382)
                                .addComponent(btnMostrar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))
                        .addContainerGap(35, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(btnVolverMenu))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labUsuarioHabit)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(220, 220, 220)
                        .addComponent(btnMostrar))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarDatos("");
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        Administrador admin=new Administrador();
        admin.labNombreUsuario.setText(labUsuarioHabit.getText());//volver a asignar el nombre del usuario a la etiqueta del formulario Administrador
        this.dispose();
        admin.setVisible(true);
    }//GEN-LAST:event_btnVolverMenuActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if(JOptionPane.YES_OPTION==JOptionPane.showConfirmDialog(null, "¿Desea insertar los datos?", "Confirmación de inserción de datos", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)){//si el usuario responde "Sí al mensaje de confirmacion de  inserción de datos,los datos se insertarán
            try {
                PreparedStatement pst=cnn.prepareStatement("INSERT INTO habitacion (idHabitacion,idHotel,pisoHabit,cantCamas,costoDia,serviciosIncluidos,tipoHabitacion,descuento,estadoHabit) VALUES(?,?,?,?,?,?,?,?,?)");
                pst.setInt(1,Integer.parseInt(txtIdHabit.getText()));
                pst.setInt(2,Integer.parseInt(txtIdHotel.getText()));
                pst.setInt(3,Integer.parseInt(txtPiso.getText()));
                pst.setInt(4,Integer.parseInt(txtCamas.getText()));
                pst.setBigDecimal(5,new BigDecimal(txtCosto.getText()));
                pst.setString(6,txtServicios.getText());
                pst.setString(7,txtTipo.getText());
                pst.setBigDecimal(8,new BigDecimal(txtDescuento.getText()));
                pst.setString(9,txtEstado.getText());

                pst.executeUpdate();
                mostrarDatos("");
                limpiarTxt();
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex, "ERROR: Datos duplicados", HEIGHT);       
                System.out.println("ERROR: "+ex);    
             }
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void itemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemModificarActionPerformed
        int fila=tableHabit.getSelectedRow();
        if(fila>=0){//
            txtIdHabit.setText(tableHabit.getValueAt(fila,0).toString());
            txtIdHotel.setText(tableHabit.getValueAt(fila,1).toString());//obtener el texto de la columna correspondiente al dato y a la variable fila(la fila seleccionada) y lo mandamos como parámetro a la caja de texto de cada dato para que puedan ser modificados
            txtPiso.setText(tableHabit.getValueAt(fila,2).toString());
            txtCamas.setText(tableHabit.getValueAt(fila,3).toString());
            txtCosto.setText(tableHabit.getValueAt(fila,4).toString());
            txtServicios.setText(tableHabit.getValueAt(fila,5).toString());
            txtTipo.setText(tableHabit.getValueAt(fila,6).toString());
            txtDescuento.setText(tableHabit.getValueAt(fila,7).toString());
            txtEstado.setText(tableHabit.getValueAt(fila,8).toString());
        }
        else{//si no hay fila seleccionada:
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "No hay datos seleccionados", JOptionPane.INFORMATION_MESSAGE);//pedirle al usuario que seleccione una fila
        }
        
    }//GEN-LAST:event_itemModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(JOptionPane.YES_OPTION==JOptionPane.showConfirmDialog(null, "¿Desea guardar los datos?", "Confirmación de modificación de datos", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)){//si el usuario responde "Sí al mensaje de confirmacion de  inserción de datos,los datos se insertarán
            try {
                PreparedStatement pst=cnn.prepareStatement("UPDATE habitacion SET idHabitacion='"+Integer.parseInt(txtIdHabit.getText())+"',idHotel='"+Integer.parseInt(txtIdHotel.getText())+"',pisoHabit='"+Integer.parseInt(txtPiso.getText())+"' ,cantCamas='"+Integer.parseInt(txtCamas.getText())+"' ,costoDia='"+new BigDecimal(txtCosto.getText())+"',serviciosIncluidos='"+txtServicios.getText()+"',tipoHabitacion='"+txtTipo.getText()+"', descuento='"+new BigDecimal(txtDescuento.getText())+"',estadoHabit='"+txtEstado.getText()+"' WHERE idHabitacion="+Integer.parseInt(txtIdHabit.getText())+" ");
                pst.executeUpdate();
                mostrarDatos("");

            } catch (SQLException ex) {
                Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error: "+ex, "ERROR AL MODIFICAR", JOptionPane.ERROR_MESSAGE);
            }
            limpiarTxt();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void itemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarActionPerformed
        int fila=tableHabit.getSelectedRow();
        if(fila>=0){//evaluar si hay una fila seleccionada en la tableHoteles, si la condición es verdadera se realiza lo siguiente:
            String idHabit=tableHabit.getValueAt(fila,0).toString();
            int respuesta=JOptionPane.showConfirmDialog(null, "¿Desea eliminar los datos?", "Confirmación de eliminación de datos", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(respuesta==JOptionPane.YES_OPTION){//si el usuario responde "Sí" al mensaje de confirmacion de  eliminación de datos,los datos se eliminarán
                try {
                    PreparedStatement pst=cnn.prepareStatement("DELETE FROM habitacion WHERE idHabitacion="+Integer.parseInt(idHabit)+" ");
                    pst.executeUpdate();
                    mostrarDatos("");
                } catch (SQLException ex) {
                    Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Error al eliminar: "+ex, "ERROR DE ELIMINACIÓN", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        else{//si no hay fila seleccionada:
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "No hay datos seleccionados", JOptionPane.INFORMATION_MESSAGE);//pedirle al usuario que seleccione una fila
        }    
    }//GEN-LAST:event_itemEliminarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila=tableHabit.getSelectedRow();
        if(fila>=0){//evaluar si hay una fila seleccionada en la tableHoteles, si la condición es verdadera se realiza lo siguiente:
            String idHabit=tableHabit.getValueAt(fila,0).toString();
            int respuesta=JOptionPane.showConfirmDialog(null, "¿Desea eliminar los datos?", "Confirmación de eliminación de datos", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(respuesta==JOptionPane.YES_OPTION){//si el usuario responde "Sí" al mensaje de confirmacion de  eliminación de datos,los datos se eliminarán
                try {
                    PreparedStatement pst=cnn.prepareStatement("DELETE FROM habitacion WHERE idHabitacion="+Integer.parseInt(idHabit)+" ");
                    pst.executeUpdate();
                    mostrarDatos("");
                } catch (SQLException ex) {
                    Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Error al eliminar: "+ex, "ERROR DE ELIMINACIÓN", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        else{//si no hay fila seleccionada:
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "No hay datos seleccionados", JOptionPane.INFORMATION_MESSAGE);//pedirle al usuario que seleccione una fila
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Habitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JMenuItem itemEliminar;
    private javax.swing.JMenuItem itemModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labUsuarioHabit;
    private javax.swing.JPopupMenu menuModificar;
    private javax.swing.JTable tableHabit;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCamas;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIdHabit;
    private javax.swing.JTextField txtIdHotel;
    private javax.swing.JTextField txtPiso;
    private javax.swing.JTextField txtServicios;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    ConexionBD cc=new ConexionBD();//crear objetos para establecer la conexión con la base de datos
    Connection cnn=cc.conectar();//asignar el objeto de la clase que creamos para conectar a un objeto de tipo Connection
}

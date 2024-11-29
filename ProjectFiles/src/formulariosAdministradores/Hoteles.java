package formulariosAdministradores;
import conexionBD.ConexionBD;
import formulariosAdministradores.Administrador;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;//importar clase DefaultTableModel
/**
 *
 * @author PC
 */
public class Hoteles extends javax.swing.JFrame {
    public Hoteles() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarDatos("");
        
    }
    void limpiarTxt(){
        labIdHotel.setText("");
        txtIdHotel.setText("");
        txtNombre.setText("");
        txtCiudad.setText("");
        txtDireccion.setText("");
        txtPais.setText("");
        txtTel.setText("");
    }
    
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
            Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuItemModificar = new javax.swing.JMenuItem();
        menuItemEliminar = new javax.swing.JMenuItem();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHoteles = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtIdHotel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnInsertarHotel = new javax.swing.JButton();
        labIdHotel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labTitulo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreUs = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        menuItemModificar.setText("Modificar");
        menuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemModificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuItemModificar);

        menuItemEliminar.setText("Eliminar");
        menuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuItemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 47, 90));

        tableHoteles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Hotel", "Nombre", "Ciudad", "Direccion", "País", "Recepción"
            }
        ));
        tableHoteles.setToolTipText("Selecciona una fila y haz clic derecho en ella para modificar o eliminarla");
        tableHoteles.setComponentPopupMenu(jPopupMenu1);
        tableHoteles.setRowHeight(30);
        jScrollPane1.setViewportView(tableHoteles);

        btnMostrar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_database_export_30px.png"))); // NOI18N
        btnMostrar.setText("Mostrar hoteles");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_trash_can_30px.png"))); // NOI18N
        btnEliminar.setText("Eliminar Hotel");
        btnEliminar.setToolTipText("Selecciona una fila y presiona este botón para eliminarla");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(106, 116, 145));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Hotel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 1, 16), new java.awt.Color(0, 51, 102))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Id Hotel:");

        txtIdHotel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtIdHotel.setForeground(new java.awt.Color(51, 51, 51));
        txtIdHotel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ciudad");

        txtCiudad.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtCiudad.setForeground(new java.awt.Color(51, 51, 51));
        txtCiudad.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dirección");

        txtDireccion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(51, 51, 51));
        txtDireccion.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("País");

        txtPais.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtPais.setForeground(new java.awt.Color(51, 51, 51));
        txtPais.setOpaque(false);

        txtTel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtTel.setForeground(new java.awt.Color(51, 51, 51));
        txtTel.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono recepción:");

        btnGuardar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_save_close_30px.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnInsertarHotel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        btnInsertarHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_new_copy_30px.png"))); // NOI18N
        btnInsertarHotel.setText("Insertar Hotel");
        btnInsertarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarHotelActionPerformed(evt);
            }
        });

        labIdHotel.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 1));

        jSeparator3.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labIdHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(btnInsertarHotel)
                                .addGap(90, 90, 90))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator6)
                                    .addComponent(jSeparator4)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(txtNombre)
                                    .addComponent(txtIdHotel)
                                    .addComponent(txtCiudad))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                            .addComponent(txtDireccion)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator5)
                                            .addComponent(txtPais, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator7)
                            .addComponent(txtTel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnInsertarHotel))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(labIdHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMenu.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(51, 51, 51));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_back_arrow_30px.png"))); // NOI18N
        btnMenu.setText("Volver al Menú");
        btnMenu.setOpaque(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        txtBuscar.setOpaque(false);

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(51, 51, 51));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_search_25px.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setOpaque(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        labTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 43)); // NOI18N
        labTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setText("Hoteles PIRAMIX");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labTitulo)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_male_user_35px.png"))); // NOI18N

        txtNombreUs.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu)
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreUs, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreUs, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrar)
                        .addGap(31, 31, 31)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnMostrar))
                        .addGap(32, 32, 32)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
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

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Administrador admin=new Administrador();
        admin.labNombreUsuario.setText(this.txtNombreUs.getText());//volver a asignar el nombre del usuario a la etiqueta del formulario Administrador
        this.dispose();
        admin.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnInsertarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarHotelActionPerformed
        if(JOptionPane.YES_OPTION==JOptionPane.showConfirmDialog(null, "¿Desea insertar los datos?", "Confirmación de inserción de datos", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)){//si el usuario responde "Sí al mensaje de confirmacion de  inserción de datos,los datos se insertarán
            try {
                PreparedStatement pst=cnn.prepareStatement("INSERT INTO hotel (idHotel,nombreHotel,ciudad,direccion,pais,telRecepcion) VALUES(?,?,?,?,?,?)");
                pst.setString(1,txtIdHotel.getText());
                pst.setString(2,txtNombre.getText());
                pst.setString(3,txtCiudad.getText());
                pst.setString(4,txtDireccion.getText());
                pst.setString(5,txtPais.getText());
                pst.setString(6,txtTel.getText());

                pst.executeUpdate();
                mostrarDatos("");
                limpiarTxt();
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex, "ERROR: Datos duplicados", HEIGHT);       
                System.out.println("ERROR: "+ex);
                limpiarTxt();    
             }
        }
        
    }//GEN-LAST:event_btnInsertarHotelActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(JOptionPane.YES_OPTION==JOptionPane.showConfirmDialog(null, "¿Desea guardar los datos?", "Confirmación de modificación de datos", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)){//si el usuario responde "Sí al mensaje de confirmacion de  inserción de datos,los datos se insertarán
            try {
                PreparedStatement pst=cnn.prepareStatement("UPDATE hotel SET idHotel="+Integer.parseInt(txtIdHotel.getText())+", nombreHotel='"+txtNombre.getText()+"', ciudad='"+txtCiudad.getText()+"', direccion='"+txtDireccion.getText()+"', pais='"+txtPais.getText()+"', telRecepcion='"+txtTel.getText()+"' WHERE idHotel="+Integer.parseInt(labIdHotel.getText())+" ");
                pst.executeUpdate();
                mostrarDatos("");

            } catch (SQLException ex) {
                Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error: "+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            limpiarTxt();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    private void menuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemModificarActionPerformed
        int fila=tableHoteles.getSelectedRow();
        if(fila>=0){//
            labIdHotel.setText(tableHoteles.getValueAt(fila,0).toString());
            txtIdHotel.setText(tableHoteles.getValueAt(fila,0).toString());
            txtNombre.setText(tableHoteles.getValueAt(fila,1).toString());//obtener el texto de la columna correspondiente al dato y a la variable fila(la fila seleccionada) y lo mandamos como parámetro a la caja de texto de cada dato para que puedan ser modificados
            txtCiudad.setText(tableHoteles.getValueAt(fila,2).toString());
            txtDireccion.setText(tableHoteles.getValueAt(fila, 3).toString());
            txtPais.setText(tableHoteles.getValueAt(fila, 4).toString());
            txtTel.setText(tableHoteles.getValueAt(fila, 5).toString());
        }
        else{//si no hay fila seleccionada:
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "No hay datos seleccionados", JOptionPane.INFORMATION_MESSAGE);//pedirle al usuario que seleccione una fila
        }    
    }//GEN-LAST:event_menuItemModificarActionPerformed

    private void menuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarActionPerformed
        int fila=tableHoteles.getSelectedRow();
        if(fila>=0){//evaluar si hay una fila seleccionada en la tableHoteles, si la condición es verdadera se realiza lo siguiente:
            String idHotel=tableHoteles.getValueAt(fila,0).toString();
            int respuesta=JOptionPane.showConfirmDialog(null, "¿Desea eliminar los datos?", "Confirmación de eliminación de datos", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(respuesta==JOptionPane.YES_OPTION){//si el usuario responde "Sí" al mensaje de confirmacion de  eliminación de datos,los datos se eliminarán
                try {
                    PreparedStatement pst=cnn.prepareStatement("DELETE FROM hotel WHERE idHotel="+idHotel+" ");
                    pst.executeUpdate();
                    mostrarDatos("");
                } catch (SQLException ex) {
                    Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Error al eliminar: "+ex, "ERROR DE ELIMINACIÓN", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        else{//si no hay fila seleccionada:
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "No hay datos seleccionados", JOptionPane.INFORMATION_MESSAGE);//pedirle al usuario que seleccione una fila
        }    
    }//GEN-LAST:event_menuItemEliminarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila=tableHoteles.getSelectedRow();        
        if(fila>=0){//evaluar si hay una fila seleccionada en la tableHoteles, si la condición es verdadera se realiza lo siguiente:
            String idHotel=tableHoteles.getValueAt(fila,0).toString();
            if(JOptionPane.YES_OPTION==JOptionPane.showConfirmDialog(null, "¿Desea eliminar los datos?", "Confirmación de eliminación de datos", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)){//si el usuario responde "Sí" al mensaje de confirmacion de  eliminación de datos,los datos se eliminarán
                try {
                    PreparedStatement pst=cnn.prepareStatement("DELETE FROM hotel WHERE idHotel="+idHotel+" ");
                    pst.executeUpdate();
                    mostrarDatos("");
                } catch (SQLException ex) {
                    Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
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
                new Hoteles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInsertarHotel;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labIdHotel;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JMenuItem menuItemEliminar;
    private javax.swing.JMenuItem menuItemModificar;
    private javax.swing.JTable tableHoteles;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdHotel;
    private javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNombreUs;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
    ConexionBD cc=new ConexionBD();
    Connection cnn=cc.conectar();
}

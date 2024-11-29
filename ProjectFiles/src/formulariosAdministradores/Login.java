package formulariosAdministradores;//importaciones de clases requeridas
import formulariosClientes.Cliente;
import conexionBD.ConexionBD;
import formulariosClientes.HacerReservacion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import login.MetodosLogin;

/**
 * @author PC
 */
public class Login extends javax.swing.JFrame {//con esta clase se evalúa a través de métodos el email y contraseña del usuario para validar su tipo de acceso a la aplicación

    public Login() {//método constructor de la clase
        initComponents();
        setLocationRelativeTo(null);
    }

    MetodosLogin metodos=new MetodosLogin();//creación de un objeto de la clase MetodosLogin para usar sus métodos
    public void acceder(String email,String password){//método para determinar el tipo de acceso que el usuario tiene a la aplicación, se puede acceder como cliente o administrador, dependiendo del tipo de usuario con el que esté registrado
        String sqlSentence= "SELECT * FROM usuario WHERE email='"+email+"' AND password='"+password+"' ";//sentencia SQL que consulta el registro referente a el email y contraseña ingresados por el usuario
        String cap="";
 
        String nombreUsuario=metodos.buscarNombre(txtEmail.getText());//llamar al método buscarNombre de la clase MetodosLogin, mandar como parámetro el email que el usuario escribió al ingresar 
        try {//hay que usar try catch cada vez que ejecutemos las sentencias SQL, así podremos saber qué errores pueden surgir al ejecutar
            Statement ingresar=conn.createStatement();//usamos el objeto conn que establece la conexión con MySql
            ResultSet resIngreso=ingresar.executeQuery(sqlSentence);//ejecutar la sentencia que consulta los datos referentes al email y contraseña ingresados
  
            if(resIngreso.next()){//el objeto tipo ResultSet contiene los reesultados de la consulta hecha a la base de datos
                //obtener el resultado de la columna indicada en el parámetro, así obtiene el tipo de usuario con el que está registrada la persona
                cap=resIngreso.getString("tipoUsuario");//el resultado de la columna tipoUsuario se guarda en la variable cap
            }
            else{//si no se obtienen resultados en la consulta, significa que el registro del usuario no existe
                JOptionPane.showMessageDialog(null, "ACCESO DENEGADO", "Sus datos no son correctos intentelo nuevamente", JOptionPane.ERROR_MESSAGE);
            }
            
            if(cap.equals("cliente")){//si el valor de la columna tipoUsuario es "cliente" se lleva a cabo el algotitmo para abrir el formulario Cliente
                Cliente cliente= new Cliente();//si se cumple la condición se instancia un objeto del formulario Cliente 
                cliente.labNombreUsuario.setText(nombreUsuario);//asignar al la etiqueta del formulario Cliente el nombre del usuario que ingresó, así se mostrará misntras su sesión esté iniciada
                this.dispose();//cerrar el formulario actual(Login)
                cliente.setVisible(true);//hacer visible el formulario Cliente
                JOptionPane.showMessageDialog(null, "Bienvenido a HOTELES PIRAMIX", "Sesión iniciada", JOptionPane.INFORMATION_MESSAGE);//mostrar mensaje de bienvenida
                cliente.pack();
                
            }
            if(cap.equals("administrador")){//si el resultado del tipo de usuario es "administrador" se lleva a cabo el proceso para abrir el formulario de Administrador
                Administrador admin= new Administrador();//instanciar objeto de formulario Administrador
                admin.labNombreUsuario.setText(nombreUsuario);//asignar el nombre del usuario a la etiqueta correspodiente
                this.dispose();//cerrar el formulario Login
                admin.setVisible(true);//hacer visible el formulario Administrador
                JOptionPane.showMessageDialog(null, "Bienvenido a HOTELES PIRAMIX", "Sesión iniciada", JOptionPane.INFORMATION_MESSAGE);//mostrar mensaje de bienvenida
                admin.pack();
            }
   
            if((!cap.equals("administrador"))&&(!cap.equals("cliente"))){//si el tipo de usuario no es cliente ni administrador
                JOptionPane.showMessageDialog(this, "Su usuario no existe");//el usuario no existe
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);       
           }
        
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        passwordClave = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Correo electronico:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Contraseña");

        btnIngresar.setBackground(new java.awt.Color(255, 153, 102));
        btnIngresar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(255, 153, 153));
        btnRegresar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("Cancelar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        passwordClave.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordClave.setForeground(new java.awt.Color(204, 204, 204));
        passwordClave.setBorder(null);
        passwordClave.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordClave.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Inicio de sesión");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        jTextField1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Hoteles PIRAMIX");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordClave)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(8, 8, 8))
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 136, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegresar)
                            .addComponent(btnIngresar))
                        .addGap(62, 62, 62))))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    MetodosLogin metlogin=new MetodosLogin(); 
    //el evento del botón Ingresar llama al método acceder y manda el email y la contraseña ingresadas para realizar la validación de usuario 
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        String usuario=txtEmail.getText();
        String clave=String.valueOf(passwordClave.getPassword());
        acceder(usuario,clave);
        this.dispose();
    }//GEN-LAST:event_btnIngresarActionPerformed
    //el evento del botón Regresar(Cancelar) abre el formulario Menu y cierra el Login, esta opción permite al usuario cancelar el ingreso y regresar el menú principal
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu menuInicio=new Menu();
        menuInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JPasswordField passwordClave;
    public static javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
    
    
    //instanciar un objeto de la clase que creamos para conectar con MySql
    ConexionBD cc=new ConexionBD();
    Connection conn=cc.conectar();//inatanciar objeto de tipo Connection que establecerá la conexión. Esto se realiza en todos los formularios
}

//con esta clase nos conectaremos a la base de datos
package conexionBD;
import java.sql.Connection;//librería importada para usar la clase Connection
import java.sql.DriverManager;//librería para usar la clase DriverManager y establecer la conexión
import java.sql.SQLException;//librería importada para usar la clase SQLException que proporcionan información de los errores que se producen al ejecutar
import javax.swing.JOptionPane;

/** @author González Lucio Alexa Jimena  3AMPRO
 */
public class ConexionBD {//clase ConexionBD
    private static Connection conn;//creación de objeto privado de la Clase Connection
    //variables privadas, estáticas y constantes(no modificables en tiempo de ejecución de tipo String)
    private static final String DRIVER="com.mysql.cj.jdbc.Driver";//variable DRIVER en donde almacenaremos una cadena de caracteres con la que nos referimos a el driver que importamos al proyecto
    private static final String USER="root";//variable USER en donde almacenaremos el nombre de nuestro usuario(root)
    private static final String PASSWORD="";//variable PASSWORD en donde almacenaremos nuestra contraseña 
    private static final String URL="jdbc:mysql://localhost:3306/cadena_hotelera?serverTimezone=UTC";//variable URL en donde almacenaremos la dirección en donde tenemos alojada nuestra base de datos (tienda), 
    //en la url se indica el localhost y el nombre de la base de datos

    public static Connection conectar() {//método constructor de la clase ConexionBD, se encarga de conectar a la base de datos
        conn=null;//inicializar el objeto conn con valor nulo
        try{//creación de try catch. En caso de que haya un error al conectar con la base de datos la consola nos mostrará el error o excepción   
           Class.forName(DRIVER);//registrar el driver de conexión para la base de datos con el método forName al que le pasamos la variable driver
           conn=DriverManager.getConnection(URL,USER,PASSWORD);//Método que nos permite establecer la conexión con la base de datos, debemos pasar las variables url, user y password como parametros 
        }catch(ClassNotFoundException | SQLException e){//multi catch que atrapa los errores al intentar hacer conexión en caso de que los haya      
            JOptionPane.showMessageDialog(null, e, "ERROR DE CONEXIÓN",JOptionPane.ERROR_MESSAGE );
            System.out.println("ERROR AL CONECTAR "+e);//si hay un error se imprime un mensaje de error y también se muestra el error o excepción
        }
    
        return conn;//
    }
    
}
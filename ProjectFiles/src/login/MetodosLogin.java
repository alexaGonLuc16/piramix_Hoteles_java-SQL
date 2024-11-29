package login;

import conexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author 
 */
public class MetodosLogin {
    //instanciar objetos para conectar con MySql
    ConexionBD cc=new ConexionBD();
    Connection cnn=cc.conectar();
    
    //buscar y concatenar el nombre del usuario para mostrarlo mientras tiene la sesión iniciada
    public String buscarNombre(String email){
        String nombreUsuario="";
        try {
            String sqlNombre=("SELECT nombre,apellidoPat,apellidoMat FROM usuario WHERE email='"+email+"'");
            Statement buscar=cnn.createStatement();
            ResultSet resBusqueda=buscar.executeQuery(sqlNombre);
            if(resBusqueda.next()){
                String nombre=resBusqueda.getString("nombre");//el resultado de la consulta se guarda en la variable resBusqueda, después se obtiene el String que esté en la fila indicada por el método getString("nombre del campo");
                String apellidoPat=resBusqueda.getString("apellidoPat");
                String apellidoMat=resBusqueda.getString("apellidoMat");
                nombreUsuario=nombre+" "+apellidoPat+" "+apellidoMat;
            }
                   
        } catch (SQLException e) {
            System.out.println(e);
        }
        return nombreUsuario;
    }
    //verificar que el usuario no exista
    public String buscarUsuario(String email, String password){
        String busquedaUsuario=null;
        try {
            cnn=cc.conectar();
            String sqlEmail="SELECT email,telefono,contraseña FROM usuario WHERE email'"+email+"' AND password='"+password+"'";
            Statement buscar=cnn.createStatement();
            ResultSet resBusqueda=buscar.executeQuery(sqlEmail);
            if(resBusqueda.next()){
                busquedaUsuario="USUARIO ENCONTRADO";
            }else{
                busquedaUsuario="USUARIO NO ENCONTRADO";               
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return busquedaUsuario;
       
    }
}   

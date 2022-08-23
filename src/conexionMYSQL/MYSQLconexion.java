/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionMYSQL;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author zujeily
 */
public class MYSQLconexion {
    private final String Nombre = "USER";
    private final String Usuario = "root";
    private final String Pass = "Alejandro@2020";
    private final String DBurl = "jdbc:mysql://localhost:3306/proyecto";
    Connection connection = null;
    Statement stmt = null;
    private final String driver = "com.mysql.cj.jdbc.Driver";
    
    
    
    
    public void createConnetion(){
        
    try{
        Class.forName(driver);
         connection= DriverManager.getConnection(DBurl,Usuario, Pass);
         System.out.println("Conexion establecida");
    }catch (Exception e){
         System.out.println("Conexion no establecida");
         e.printStackTrace();
    }
    }

     public void shutdown() {
        try
        {
            if (stmt != null)
            {
                stmt.close();
            }
            if (connection != null)
            {
                DriverManager.getConnection(DBurl,Usuario, Pass);
                connection.close();
            }          
        }
        catch (SQLException e)
        {
          e.printStackTrace();
        }
    }
    
    public void UsuarioNew (String IDName, String pass, int Cedula, String email){
        try{
        stmt = connection.createStatement();
        
         String sql = "INSERT INTO USER"+" VALUES('"+IDName+"','"+pass+ "','"+Cedula+"','"+email+ "')";
      
         stmt.executeUpdate(sql);
       
         System.out.println("done");
 
        }catch (SQLException e){
         e.printStackTrace();
           
        }
     }
      
    public boolean VerificarUser (String dato){
        Boolean resultado= true;
        String sql = "SELECT * FROM USER WHERE IDNombre = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, dato.trim());
            
            ResultSet busqueda = statement.executeQuery();
            
            if(busqueda.next()){
                resultado= true;   
            }else{
                resultado= false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLconexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;    
    }    
}

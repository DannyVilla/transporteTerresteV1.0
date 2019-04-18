
package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    private final String base = "transporte";
    private final String usuario="root";
    private final String contraseña="";    
    private String url="jdbc:mysql://127.0.0.1:3306/" + base;
   
    private Connection con = null;
   

    public Connection getConexion(){
       
        
       try{
       Class.forName("com.mysql.jdbc.Driver");
       con=DriverManager.getConnection(this.url, this.usuario, this.contraseña);  
          
       }catch(ClassNotFoundException | SQLException e){
           System.err.println(e);
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
       }
       
       return con;
    
    }
    
}
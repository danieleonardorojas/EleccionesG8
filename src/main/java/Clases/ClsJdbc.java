package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author danie
 */
public class ClsJdbc {
    
    String driver = "com.mysql.cj.jdbc.Driver";
    String user  = "root";
    String password = "";
    String db = "db_elections_g8";
    String url = "jdbc:mysql://localhost:3306/" + this.db;
    
    public Connection connectDBElectionsG8;
    
    // Método / función
    public void electionConnectig(){
        
        try{
            
            Class.forName(driver);
            this.connectDBElectionsG8 = DriverManager.getConnection(url, user, password);
            
            if(this.connectDBElectionsG8 != null){
                System.out.println("Successful connection");
            }
            
        }catch(Exception e){
            System.out.println("Error establishing a database connection\n" + e.getMessage());
        }
        
    }
    
}

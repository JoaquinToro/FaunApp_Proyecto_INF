package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Conexion {
    private String db;
    private String url;
    private String user;
    private String pass;
    private Connection link;
    
    
    public Conexion(){
        this.db = "faunappdb";
        this.url = "jdbc:mysql://localhost/" + db;
        this.user="root";
        this.pass="";
        this.link = null;
    }
    
    public Connection Conectar() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
            System.out.println("Conectado.....");
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return link;
    }

    public void CerrarConexion(){
        
        try {
            link.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
}

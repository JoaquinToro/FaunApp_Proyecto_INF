/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sandracano
 */
public class Usuario {
    public String query;
    public boolean Leer(Connection link, String Usuario,String Clave){
        int count=0;
        try {
            Statement s = link.createStatement();
            query="select * from Usuario where nombreDeUsuario='"+Usuario+"' and password='"+Clave+"'";
            ResultSet rs=s.executeQuery(query);
   
            while (rs.next()){
                count++;
            }
            if(count>0){
                System.out.print("SI");
                return true;
            }
  
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}

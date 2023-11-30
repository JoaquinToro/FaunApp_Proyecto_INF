/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controladores;

import Modelos.NoticiaDB;
import Modelos.Noticia;
import Modelos.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author usuario
 */
public class NoticiaG implements NoticiaDB{
    public String query;
    public ArrayList<Modelos.Informacion> Leer(Connection link){
        try{
            Statement s = link.createStatement();
            query=  "select *"
                    + "from noticia"
                    + "inner join informacion"
                    + "on noticia.informacionID = informacion.informacionID";
            ResultSet rs=s.executeQuery(query);
            while (rs.next()){
                Noticia noticia = new Noticia();
                noticia.setNoticiaID(Integer.parseInt(rs.getString("noticiaID")));
                noticia.setAutor(rs.getString("autor"));
                noticia.setTitulo(rs.getString("titulo"));
                noticia.setFecha(rs.getDate("fecha"));
                listaNoticias.add(noticia);            

        }
        return listaNoticias;
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean Crear(Connection link, Noticia noticia) {
        try{
            Statement s = link.createStatement();
            query="INSERT INTO Noticia(noticiaID,titulo,fecha,fechaNacimiento,autor,informacionID)VALUES('"+noticia.getNoticiaID()+"','"+noticia.getTitulo()+"','"+noticia.getAutor()+"','"+noticia.getFecha()+"','"+noticia.getAutor()+"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    public boolean Actualizar(Connection link, Noticia noticia ) {
        try{
            Statement s = link.createStatement();
            query="UPDATE noticia set noticiaID='"+noticia.getNoticiaID()+"',titulo='"+noticia.getTitulo()+"',fecha='"+noticia.getFecha()+"',autor='"+noticia.getAutor()+"',comuna='"+"' WHERE noticiaID='"+noticia.getNoticiaID()+"'";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
               
    }

    public Noticia Buscar(Connection link, int id) {
        Noticia noticia=new Noticia();
        try {
            Statement s = link.createStatement();
            query="select * from noticia where noticiaID='"+id+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next()){
               noticia.setNoticiaID(rs.getInt("noticiaID"));
               noticia.setTitulo(rs.getString("titulo"));
               noticia.setFecha(rs.getDate("fecha"));
               noticia.setAutor(rs.getString("autor"));
            }
            return noticia;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }        

    public boolean Eliminar(Connection link, int id) {
           try {
            //aqui hay que buscar si se encuentra 
            
            Statement s = link.createStatement();
            query="delete * noticia where noticiaID='"+id+"'";
            ResultSet rs=s.executeQuery(query);
            
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
} 

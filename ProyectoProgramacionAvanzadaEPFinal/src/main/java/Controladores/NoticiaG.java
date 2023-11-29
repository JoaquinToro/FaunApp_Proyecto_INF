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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean Actualizar(Connection link, Noticia noticia ) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean Eliminar(Connection link, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Usuario Buscar(Connection link, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }            
        
        
        
}

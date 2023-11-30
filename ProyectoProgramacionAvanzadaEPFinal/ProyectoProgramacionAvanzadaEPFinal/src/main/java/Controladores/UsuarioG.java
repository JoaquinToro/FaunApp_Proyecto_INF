/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Usuario;
import Modelos.UsuarioDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miles
 */
public class UsuarioG implements UsuarioDB{
    public String query;
    public ArrayList<Usuario> Leer(Connection link){

        try{
            Statement s = link.createStatement();
            query="select * from Clientes";
            ResultSet rs=s.executeQuery(query);
            while (rs.next()){
               Usuario usuario = new Usuario();
               usuario.setNombreDeUsuario(rs.getString("nombreDeUsario"));
               usuario.setPassword(rs.getString("password"));
               usuario.setGenero(rs.getString("genero"));
               usuario.setEdad(rs.getString("edad"));
               
               listaUsuarios.add(usuario);
                
            }
            
            return listaUsuarios;
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Usuario Buscar(Connection link, String nombre){
        Usuario usuario=new Usuario();
        try {
            Statement s = link.createStatement();
            query="select * from Usuario where nombreDeUsuario='"+nombre+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next()){
               usuario.setNombreDeUsuario(rs.getString("nombreDeUsario"));
               usuario.setPassword(rs.getString("password"));
               usuario.setGenero(rs.getString("genero"));
               usuario.setEdad(rs.getString("edad"));
                
            }
            return usuario;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean Crear(Connection link, Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Actualizar(Connection link, Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Eliminar(Connection link, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario Buscar(Connection link, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

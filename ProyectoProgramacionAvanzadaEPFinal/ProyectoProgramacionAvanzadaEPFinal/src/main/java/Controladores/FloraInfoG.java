/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.FloraInfoDB;
import Modelos.FloraInfo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joaquin
 */
public class FloraInfoG implements FloraInfoDB{
    public String query;

    @Override
    public ArrayList<Modelos.FloraInfo> Leer(Connection link){
        try{
            Statement s = link.createStatement();
            query=  "SELECT * " +
                    "FROM flora " +
                    "INNER JOIN taxonomia " +
                    "ON flora.taxonomiaID = taxonomia.taxonomiaID";
            ResultSet rs=s.executeQuery(query);
            while (rs.next()){
                FloraInfo flora = new FloraInfo();
                flora.setDivision(rs.getString("Division"));
                flora.setSubdivision(rs.getString("SubDivision"));
                flora.setClase(rs.getString("Clase"));
                flora.setOrden(rs.getString("Orden"));
                flora.setFamilia(rs.getString("Familia"));
                flora.setGenero(rs.getString("Genero"));
                flora.setEspecie(rs.getString("Especie"));
                flora.setNombreCientifico(rs.getString("nombreCientifico"));
                flora.setNombreComun(rs.getString("nombreComun"));
                
                flora.setFloraId(Integer.parseInt(rs.getString("floraID")));
                flora.setDescripcion(rs.getString("Descripcion"));
                flora.setFuncion(rs.getString("Funcion"));
                listaFlora.add(flora);
                
            }
            
            return listaFlora;
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

    @Override
     public FloraInfo Buscar(Connection link, String nombre){
        FloraInfo flora = new FloraInfo();
        try {
            Statement s = link.createStatement();
            query=  "select *"
                    + "from flora"
                    + "inner join taxonomia"
                    + "on flora.taxonomiaID = taxonomia.taxonomiaID"
                    + "where flora.nombreComun = '" +nombre+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next()){
               flora.setDivision(rs.getString("Division"));
               flora.setSubdivision(rs.getString("SubDivision"));
               flora.setClase(rs.getString("Clase"));
               flora.setOrden(rs.getString("Orden"));
               flora.setFamilia(rs.getString("Familia"));
               flora.setGenero(rs.getString("Genero"));
               flora.setEspecie(rs.getString("Especie"));
               flora.setNombreCientifico(rs.getString("nombreCientifico"));
               flora.setNombreComun(rs.getString("nombreComun"));

               flora.setFloraId(Integer.parseInt(rs.getString("floraID")));
               flora.setDescripcion(rs.getString("Descripcion"));
               flora.setFuncion(rs.getString("Funcion"));
                
            }
            return flora;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}

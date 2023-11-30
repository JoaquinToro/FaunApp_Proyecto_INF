/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.FaunaInfo;
import Modelos.FaunaInfoDB;
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
public class FaunaInfoG implements FaunaInfoDB{
    public String query;

    @Override
    public ArrayList<FaunaInfo> Leer(Connection link){
        try{
            Statement s = link.createStatement();
            query=  "select *"
                    + "from fauna"
                    + "inner join taxonomia"
                    + "on fauna.taxonomiaID = taxonomia.taxonomiaID";
            ResultSet rs=s.executeQuery(query);
            while (rs.next()){
                FaunaInfo fauna = new FaunaInfo();
                fauna.setDivision(rs.getString("Division"));
                fauna.setSubdivision(rs.getString("SubDivision"));
                fauna.setClase(rs.getString("Clase"));
                fauna.setOrden(rs.getString("Orden"));
                fauna.setFamilia(rs.getString("Familia"));
                fauna.setGenero(rs.getString("Genero"));
                fauna.setEspecie(rs.getString("Especie"));
                fauna.setNombreCientifico(rs.getString("nombreCientifico"));
                fauna.setNombreComun(rs.getString("nombreComun"));
                
                fauna.setFaunaId(Integer.parseInt(rs.getString("floraID")));
                fauna.setUbicacion(rs.getString("ubicacion"));
                fauna.setAlimentacion(rs.getString("alimentacion"));
                fauna.setPeligrosidad(Integer.parseInt("peligrosidad"));
                listaFauna.add(fauna);
                
            }
            
            return listaFauna;
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

    @Override
     public FaunaInfo Buscar(Connection link, String nombre){
        FaunaInfo fauna = new FaunaInfo();
        try {
            Statement s = link.createStatement();
            query=  "select *"
                    + "from fauna"
                    + "inner join taxonomia"
                    + "on fauna.taxonomiaID = taxonomia.taxonomiaID"
                    + "where fauna.nombreComun = '" +nombre+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next()){
               fauna.setDivision(rs.getString("Division"));
               fauna.setSubdivision(rs.getString("SubDivision"));
               fauna.setClase(rs.getString("Clase"));
               fauna.setOrden(rs.getString("Orden"));
               fauna.setFamilia(rs.getString("Familia"));
               fauna.setGenero(rs.getString("Genero"));
               fauna.setEspecie(rs.getString("Especie"));
               fauna.setNombreCientifico(rs.getString("nombreCientifico"));
               fauna.setNombreComun(rs.getString("nombreComun"));

               fauna.setFaunaId(Integer.parseInt(rs.getString("faunaID")));
               fauna.setUbicacion(rs.getString("ubicacion"));
               fauna.setAlimentacion(rs.getString("alimentacion"));
               fauna.setPeligrosidad(Integer.parseInt("peligrosidad"));
                
            }
            return fauna;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}

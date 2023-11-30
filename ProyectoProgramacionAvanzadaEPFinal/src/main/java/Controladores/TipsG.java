/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Tips;
import Modelos.TipsDB;
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
public class TipsG implements TipsDB{
    public String query;
    
    @Override
    public ArrayList<Tips> Leer(Connection link){
        try{
            Statement s = link.createStatement();
            query=  "select *"
                    + "from tips"
                    + "inner join informacion"
                    + "on tips.informacionID = informacion.informacionID";
            ResultSet rs=s.executeQuery(query);
            while (rs.next()){
                Tips tip = new Tips();
                
                tip.setTexto_Principal(rs.getString("textoPrincipal"));
                tip.setInformacionID(Integer.parseInt(rs.getString("informacionID")));
                
                tip.setTipID(Integer.parseInt(rs.getString("tipID")));
                tip.setCategoria(rs.getString("area"));
                
                listaTips.add(tip);            

        }
        return listaTips;
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean Crear(Connection link, Tips tip) {
        try{
            Statement s = link.createStatement();
            query="INSERT INTO Tips(tipID,area,informacionID)VALUES('"+tip.getTipID()+"','"+tip.getCategoria()+"','"+tip.getInformacionID()+"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    @Override
    public boolean Actualizar(Connection link, Tips tip){
        try{
            Statement s = link.createStatement();
            query="UPDATE Tips set area='"+tip.getCategoria()+"',informacionID='"+tip.getInformacionID()+"' WHERE tipID='"+tip.getTipID()+"'";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
       
    }

    @Override
    public boolean Eliminar(Connection link, int tipID) {
           try {
            //aqui hay que buscar si se encuentra 
            
            Statement s = link.createStatement();
            query="delete * Tips where tipID="+tipID+"";
            ResultSet rs=s.executeQuery(query);
            
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    @Override
    public Tips Buscar(Connection link, int tipID){
        Tips tip=new Tips();
        try {
            Statement s = link.createStatement();
            query="select * from Tips where tipID="+tipID+"";
            ResultSet rs=s.executeQuery(query);
   
            while (rs.next()){
               tip.setTexto_Principal(rs.getString("textoPrincipal"));
               tip.setInformacionID(Integer.parseInt(rs.getString("informacionID")));
                
               tip.setTipID(Integer.parseInt(rs.getString("tipID")));
               tip.setCategoria(rs.getString("area"));
                
            }
            return tip;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

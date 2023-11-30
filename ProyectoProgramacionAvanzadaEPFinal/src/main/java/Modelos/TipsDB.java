/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelos;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Joaquin
 */
public interface TipsDB {
    public ArrayList<Tips>listaTips = new ArrayList<>();
    
    public ArrayList<Tips> Leer(Connection link);
    public boolean Crear(Connection link, Tips tips);
    public boolean Actualizar(Connection link, int tipID);
    public boolean Eliminar(Connection link, int tipID);
    public Tips Buscar(Connection link, int tipID);
}

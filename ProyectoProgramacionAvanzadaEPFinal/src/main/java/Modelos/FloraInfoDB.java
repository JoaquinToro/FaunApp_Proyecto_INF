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
public interface FloraInfoDB {
    public ArrayList<FloraInfo> listaFlora = new ArrayList<>();
    
    public ArrayList<FloraInfo> Leer(Connection link);
    public FloraInfo Buscar(Connection link, String nombreComun);
}

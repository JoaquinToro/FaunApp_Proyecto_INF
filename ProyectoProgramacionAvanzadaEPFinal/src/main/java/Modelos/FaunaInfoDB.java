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
public interface FaunaInfoDB {
    public ArrayList<FaunaInfo> listaFauna = new ArrayList<>();
    
    public ArrayList<FaunaInfo> Leer(Connection link);
    public FloraInfo Buscar(Connection link, String nombreComun);
}

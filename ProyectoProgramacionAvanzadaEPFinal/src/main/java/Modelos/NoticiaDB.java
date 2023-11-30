/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Joaquin
 */
public interface NoticiaDB {
    public ArrayList<Noticia>listaNoticias = new ArrayList<>();
    
    public ArrayList<Noticia> Leer(Connection link);
    public boolean Crear(Connection link, Noticia noticia);
    public boolean Actualizar(Connection link, Noticia noticia);
    public boolean Eliminar(Connection link, String rut);
    public Noticia Buscar(Connection link, String rut);
}

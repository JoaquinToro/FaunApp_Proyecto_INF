/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public interface UsuarioDB {
    public ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public boolean Crear(Connection link, Usuario usuario);
    public boolean Actualizar(Connection link, Usuario usuario);
    public boolean Eliminar(Connection link, int id);
    public ArrayList<Usuario> Leer(Connection link);
    public Usuario Buscar(Connection link, int id);
}

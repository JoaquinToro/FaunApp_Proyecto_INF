/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelos;

/**
 *
 * @author Miles
 */
public interface Sesion {
   public static final int abierta = 1;
   public static final int cerrada = 0;
   
   public void abrirSesion();
   public void cerrarSesion();
   
}

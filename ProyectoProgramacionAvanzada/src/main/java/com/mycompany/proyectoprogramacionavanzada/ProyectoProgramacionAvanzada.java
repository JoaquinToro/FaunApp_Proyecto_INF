/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner
package com.mycompany.proyectoprogramacionavanzada;

/**
 *
 * @author Joaquin
 */
public class ProyectoProgramacionAvanzada {

    public static void main(String[] args) {
        System.out.println("Hola es necesario crear un usuario primero, porfavor crea tu usuario");
        
        FloraInfo flora = new FloraInfo();
        FaunaInfo fauna = new FaunaInfo();
        Usuario usuario = new Usuario();
        Region region = new Region();
        menu();
    }
    public static void menu(){
        
        
        int decision;
        int subdecision;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a FaunApp que deseas hacer?");
        while(true)
        {
            System.out.println("0: Terminar 1:Agregar 2:Mostrar 3:Actualizar/Modificar 4:Eliminar");

            decision = entrada.nextInt();
            if(decision == 0)
            {
                break;
            }
            switch(decision){
                case 1:
                    System.out.println("A que clase deseas agregar?");
                    System.out.println("1: Flora 2:Fauna 3:Usuario 4:Region");
                    subdecision = entrada.nextInt();
                    switch(subdecision)
                    {
                        case 1:
                            flora.crearDatos();
                            break;
                        case 2:
                            fauna.crearDatos();
                            break;
                        case 3:
                            usuario.crearDatos();
                            break;
                        case 4:
                            region.crearDatos();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Que clase quieres mostrar?");
                    System.out.println("1: Flora 2:Fauna 3:Usuario 4:Region");
                    subdecision = entrada.nextInt();
                    switch(subdecision)
                    {
                        case 1:
                            flora.mostrarFlora();
                            break;
                        case 2:
                            fauna.mostrarFauna();
                            break;
                        case 3:
                            usuario.mostrarUsuarios();
                            break;
                        case 4:
                            region.mostrarRegion();
                            break;
                    }
                case 3:
                    System.out.println("Que clase quieres actualizar?");
                    System.out.println("1: Flora 2:Fauna 3:Usuario 4:Region");
                    subdecision = entrada.nextInt();
                    int idBuscado;
                    String nombre;
                    switch(subdecision)
                    {
                        case 1:
                            System.out.println("Ingrese el id");
                            idBuscado = entrada.nextInt();
                            flora.Actualizar(idBuscado);
                            break;

                        case 2:
                            System.out.println("Ingrese el id");
                            idBuscado = entrada.nextInt();
                            fauna.Actualizar(idBuscado);
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre de usuario");
                            nombre = entrada.nextLine();
                            usuario.Actualizar(nombre);
                            break;
                        case 4:
                            System.out.println("Ingrese el id");
                            idBuscado = entrada.nextInt();
                            region.Actualizar(idBuscado);
                            break;
                        
                    }
                case 4:
                    System.out.println("Que clase quieres eliminar?");
                    System.out.println("1: Flora 2:Fauna 3:Usuario 4:Region");
                    subdecision = entrada.nextInt();
                    switch(subdecision)
                    {
                        case 1:
                            System.out.println("Ingrese el id");
                            idBuscado = entrada.nextInt();
                            flora.Eliminar(idBuscado);
                            break;
                        case 2:
                            System.out.println("Ingrese el id");
                            idBuscado = entrada.nextInt();
                            fauna.Eliminar(idBuscado);
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre de usuario");
                            nombre = entrada.nextLine();
                            usuario.Eliminar(nombre);
                            
                            break;
                        case 4:
                            System.out.println("Ingrese el id");
                            idBuscado = entrada.nextInt();
                            region.Eliminar(idBuscado);
                            break;
                        
                    }
            }
        }
    }
}

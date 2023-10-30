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
        
        Usuario yo = new Usuario("Joaquin Toro","Hombre",21);
        yo.leerDatos();
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
                            FloraInfo newFlora = new FloraInfo();
                            newFlora.crearDatos();
                            break;
                        case 2:
                            FaunaInfo newFauna = new FaunaInfo();
                            newFauna.crearDatos();
                            break;
                        case 3:
                            Usuario newUser = new Usuario();
                            newUser.crearDatos();
                            break;
                        case 4:
                            Region newRegion = new Region();
                            newRegion.crearDatos();
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
                            FloraInfo newFlora = new FloraInfo();
                            newFlora.mostrarFlora();
                            break;
                        case 2:
                            FaunaInfo newFauna = new FaunaInfo();
                            newFauna.mostrarFauna();
                            break;
                        case 3:
                            Usuario newUser = new Usuario();
                            newUser.mostrarUsuarios();
                            break;
                        case 4:
                            Region newRegion = new Region();
                            newRegion.mostrarRegion();
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
                            FloraInfo newFlora = new FloraInfo();
                            newFlora.Actualizar(idBuscado);
                            break;

                        case 2:
                            System.out.println("Ingrese el id");
                            idBuscado = entrada.nextInt();
                            FaunaInfo newFauna = new FaunaInfo();
                            newFauna.Actualizar(idBuscado);
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre de usuario");
                            nombre = entrada.nextLine();
                            Usuario newUser = new Usuario();
                            newUser.Actualizar(nombre);
                            break;
                        case 4:
                            System.out.println("Ingrese el id");
                            idBuscado = entrada.nextInt();
                            Region newRegion = new Region();
                            newRegion.Actualizar(idBuscado);
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
                            FloraInfo newFlora = new FloraInfo();
                            newFlora.Eliminar(idBuscado);
                            break;
                        case 2:
                            System.out.println("Ingrese el id");
                            idBuscado = entrada.nextInt();
                            FaunaInfo newFauna = new FaunaInfo();
                            newFauna.Eliminar(idBuscado);
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre de usuario");
                            nombre = entrada.nextLine();
                            Usuario newUser = new Usuario();
                            newUser.Eliminar(nombre);
                            
                            break;
                        case 4:
                            System.out.println("Ingrese el id");
                            idBuscado = entrada.nextInt();
                            Region newRegion = new Region();
                            newRegion.Eliminar(idBuscado);
                            break;
                        
                    }
            }
        }
    }
}

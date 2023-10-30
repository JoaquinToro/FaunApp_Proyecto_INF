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
        System.out.println("Hello World!");
        
        Usuario yo = new Usuario("Joaquin Toro","Hombre",21);
        yo.leerDatos();
        
    }
    public void menu(){
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
                    System.out.println("1: Flora 2:Fauna 3:Taxonomia 4:Usuario 5:Region");
                    subdecision = entrada.nextInt();
                    switch(subdecision)
                    {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break;
                        case 5:
                            
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Que clase quieres mostrar?");
                    System.out.println("1: Flora 2:Fauna 3:Taxonomia 4:Usuario 5:Region");
                    subdecision = entrada.nextInt();
                    switch(subdecision)
                    {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break;
                        case 5:
                            
                            break;
                        
                    }
                case 3:
                    System.out.println("Que clase quieres actualizar?");
                    System.out.println("1: Flora 2:Fauna 3:Taxonomia 4:Usuario 5:Region");
                    subdecision = entrada.nextInt();
                    switch(subdecision)
                    {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break;
                        case 5:
                            
                            break;
                        
                    }
                case 4:
                    System.out.println("Que clase quieres eliminar?");
                    System.out.println("1: Flora 2:Fauna 3:Taxonomia 4:Usuario 5:Region");
                    subdecision = entrada.nextInt();
                    switch(subdecision)
                    {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break;
                        case 5:
                            
                            break;
                        
                    }



            }
        }
    }
}

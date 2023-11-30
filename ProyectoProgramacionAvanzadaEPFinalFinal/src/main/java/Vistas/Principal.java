/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vistas;
import Modelos.Usuario;
import Modelos.Region;
import Modelos.FaunaInfo;
import Modelos.FloraInfo;
import Controladores.Reporte;
import com.opencsv.exceptions.CsvValidationException;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Principal {

    public static void main(String[] args) throws CsvValidationException {
        
        
        Reporte reporte=new Reporte("src/test/usuarios.csv");
        reporte.Leer();
        
        FloraInfo flora = new FloraInfo();
        FaunaInfo fauna = new FaunaInfo();
        Usuario usuario = new Usuario();
        Region region = new Region();
        

        menu(flora,fauna,usuario,region);
    }
    public static void menu(FloraInfo flora,FaunaInfo fauna,Usuario usuario, Region region){
        
        
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
                        case 4:
                            region.mostrarRegion();
                            break;
                    }
                    break;
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
                            break;
                        case 4:
                            System.out.println("Ingrese el id");
                            idBuscado = entrada.nextInt();
                            region.Actualizar(idBuscado);
                            break;
                        
                    }
                    break;
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
                            
                            break;
                        case 4:
                            System.out.println("Ingrese el id");
                            idBuscado = entrada.nextInt();
                            region.Eliminar(idBuscado);
                            break;
                         
                    }
                    break;
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Region {
    
    //Atributos
    private int id;
    private String nombre;
    private String descripcion;
    private String clima;

    
    private Scanner Entrada = new Scanner(System.in);
    private ArrayList<Region> listaRegiones = new ArrayList<>();
    //Constructor

    
    public Region() {
        this.id = 0;
        this.nombre = null;
        this.descripcion = null;
        this.clima = null;
    }
    
    public Region(int id, String nombre, String descripcion, String clima) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clima = clima;
    }

    
    
    //Getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getClima() {
        return clima;
    }
    
    
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }


    
    //Crear Datos
    public void crearDatos(){
        this.id = comprobar();
        this.nombre = comprobarString();
        this.descripcion = comprobarString();
        this.clima = comprobarString();
        listaRegiones.add(new Region(this.id,this.nombre,this.descripcion,this.clima));
    }
    
    //leer Datos
    public void leerDatos(){
        System.out.println("Información General");
        System.out.println(this.id);
        System.out.println(this.nombre);
        System.out.println(this.clima);
        System.out.println(this.descripcion);
        
    }

    public void mostrarRegion(){
        int longitud = this.listaRegiones.size();
        
        for(int i = 0; i<longitud; i++)
            this.listaRegiones.get(i).leerDatos();
    }
    public void mostrarFlora(ArrayList<Region> listaRegiones){
        int longitud = listaRegiones.size();
        
        for(int i = 0; i<longitud; i++)
            listaRegiones.get(i).leerDatos();
    }
    public void Actualizar(int id){
        int longitud = this.listaRegiones.size();
        for(int i = 0; i<longitud; i++)
        {
            if(this.listaRegiones.get(i).getId() == id){
                this.listaRegiones.get(i).crearDatos();
                return;
            }
        }
    }
    public void Eliminar(int id){
        int longitud = this.listaRegiones.size();
        for(int i = 0; i<longitud; i++)
        {
            if(this.listaRegiones.get(i).getId() == id){
                this.listaRegiones.remove(i);
                return;
            }
        }
    }
    
    public int comprobar(){
        int num2;
        while (true) {
            try {
                num2 = Integer.parseInt(Entrada.nextLine());
                return num2;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            }
        }
    }
    
    private String comprobarString() {
        String linea;
        while (true) {
            try {
                linea = Entrada.nextLine();
                return linea;
            } catch (Exception e) {
                System.out.println("Error: Ingrese un nombre válido.");
            }
        }
    }   
}


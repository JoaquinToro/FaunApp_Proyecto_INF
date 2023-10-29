/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogramacionavanzada;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miles
 */
public class Region {
    
    //Atributos
    private int id;
    private String nombre;
    private ArrayList<FloraInfo> FloraRegion = new ArrayList<>();
    private ArrayList<FaunaInfo> FaunaRegion = new ArrayList<>();
    
    private Scanner Entrada = new Scanner(System.in);
    private ArrayList<Region> listaRegiones = new ArrayList<>();
    //Constructor

    public Region(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    //Getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<FloraInfo> getFloraRegion() {
        return FloraRegion;
    }

    public ArrayList<FaunaInfo> getFaunaRegion() {
        return FaunaRegion;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFloraRegion(ArrayList<FloraInfo> FloraRegion) {
        this.FloraRegion = FloraRegion;
    }

    public void setFaunaRegion(ArrayList<FaunaInfo> FaunaRegion) {
        this.FaunaRegion = FaunaRegion;
    }
    
    //Crear Datos
    public void crearDatos(){
        this.id = Entrada.nextInt();
        this.nombre = Entrada.next();
        
        listaRegiones.add(new Region(this.id,this.nombre));
    }
    
    //leer Datos
    public void leerDatos(){
        System.out.println("Información General");
        System.out.println(this.id);
        System.out.println(this.nombre);
        
        System.out.println("Información Flora En La Región");
        for (int i = 0; i < FloraRegion.size(); i++) 
            System.out.println(FloraRegion.get(i));
        
        System.out.println("Información Fauna En La Región");
        for (int i = 0; i < FaunaRegion.size(); i++) 
            System.out.println(FaunaRegion.get(i));
    }
}

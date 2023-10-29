/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogramacionavanzada;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class FloraInfo {
    
    //ATRIBUTOS
    private int floraId;
    private String nombreComun;
    private String nombreCientifico;
    private String ubicacion;
    private String funcion;
    private Scanner Entrada = new Scanner(System.in);
    private ArrayList<FloraInfo> listaFlora = new ArrayList<>();
    //taxonomia
    private String division;
    private String subdivision;
    private String clase;
    private String orden;
    private String familia;
    private String genero;
    private String especie;
    
    //CONSTRUCTORES SOBRECARGA

    public FloraInfo(int floraId, String nombreComun, String nombreCientifico, String ubicacion, String funcion, String division) {
        this.floraId = floraId;
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.ubicacion = ubicacion;
        this.funcion = funcion;
        this.division = division;
    }

    public FloraInfo(int floraId, String nombreComun, String nombreCientifico, String ubicacion, String funcion, String division, String subdivision, String clase, String orden, String familia, String genero, String especie) {
        this.floraId = floraId;
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.ubicacion = ubicacion;
        this.funcion = funcion;
        this.division = division;
        this.subdivision = subdivision;
        this.clase = clase;
        this.orden = orden;
        this.familia = familia;
        this.genero = genero;
        this.especie = especie;
    }
    
    //GETTERS Y SETTERS
    //getters
    public int getFloraId() {
        return floraId;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getDivision() {
        return division;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public String getClase() {
        return clase;
    }

    public String getOrden() {
        return orden;
    }

    public String getFamilia() {
        return familia;
    }

    public String getGenero() {
        return genero;
    }

    public String getEspecie() {
        return especie;
    }

    public String getFuncion() {
        return funcion;
    }

    public Scanner getEntrada() {
        return Entrada;
    }

    public ArrayList<FloraInfo> getListaFlora() {
        return listaFlora;
    }
    
    
    //setters

    public void setFloraId(int floraId) {
        this.floraId = floraId;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEntrada(Scanner Entrada) {
        this.Entrada = Entrada;
    }

    public void setListaFlora(ArrayList<FloraInfo> listaFlora) {
        this.listaFlora = listaFlora;
    }
    
    //Crear Datos
    public void crearDatos(){
        this.floraId = Entrada.nextInt();
        this.nombreComun = Entrada.next();
        this.nombreCientifico = Entrada.next();
        this.ubicacion = Entrada.next();
        this.funcion = Entrada.next();
        this.division = Entrada.next();
        this.subdivision = Entrada.next();
        this.clase = Entrada.next();
        this.orden = Entrada.next();
        this.familia = Entrada.next();
        this.genero = Entrada.next();
        this.especie = Entrada.next();
        
        listaFlora.add(new FloraInfo(this.floraId,this.nombreComun,this.nombreCientifico,
                                     this.ubicacion, this.funcion, this.division,this.subdivision,
                                     this.clase, this.orden, this.familia, this.genero,this.especie ));
    }
    //Leer Datos
    public void leerDatos(){
        System.out.println("Información Taxonómica");
        System.out.println(this.division);
        System.out.println(this.subdivision);
        System.out.println(this.clase);
        System.out.println(this.orden);
        System.out.println(this.familia);
        System.out.println(this.genero);
        System.out.println(this.especie);
        
        System.out.println("Información General");
        System.out.println(this.nombreCientifico);
        System.out.println(this.nombreComun);
        System.out.println(this.ubicacion);
        System.out.println(this.funcion);
        
        System.out.println("Fin Información");
    }
    
}
    
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
public class FaunaInfo {
    //ATRIBUTOS
    private int faunaId;
    private String nombreComun;
    private String nombreCientifico;
    private String ubicacion;
    private String alimentacion;
    private int peligrosidad;
    private Scanner Entrada = new Scanner(System.in);
    private ArrayList<FaunaInfo> listaFauna = new ArrayList<>();
    //taxonomia
    private String division;
    private String subdivision;
    private String clase;
    private String orden;
    private String familia;
    private String genero;
    private String especie;
    
    //Constructor

    public FaunaInfo(int faunaId, String nombreComun, String nombreCientifico, String ubicacion, String alimentacion, int peligrosidad, Scanner Entrada, String division, String subdivision, String clase, String orden, String familia, String genero, String especie) {
        this.faunaId = faunaId;
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.ubicacion = ubicacion;
        this.alimentacion = alimentacion;
        this.peligrosidad = peligrosidad;
        this.division = division;
        this.subdivision = subdivision;
        this.clase = clase;
        this.orden = orden;
        this.familia = familia;
        this.genero = genero;
        this.especie = especie;
    }

    private FaunaInfo(int faunaId, String nombreComun, String nombreCientifico, String ubicacion, String alimentacion, int peligrosidad, String division, String subdivision, String clase, String orden, String familia, String genero, String especie) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //getters

    public int getFaunaId() {
        return faunaId;
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

    public String getAlimentacion() {
        return alimentacion;
    }

    public int getPeligrosidad() {
        return peligrosidad;
    }

    public Scanner getEntrada() {
        return Entrada;
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

    public ArrayList<FaunaInfo> getListaFauna() {
        return listaFauna;
    }
    
    //setters

    public void setFaunaId(int faunaId) {
        this.faunaId = faunaId;
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

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void setPeligrosidad(int peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    public void setEntrada(Scanner Entrada) {
        this.Entrada = Entrada;
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

    public void setListaFauna(ArrayList<FaunaInfo> listaFauna) {
        this.listaFauna = listaFauna;
    }
    
    //Crear Datos
    
    public void crearDatos(){
        this.faunaId = Entrada.nextInt();
        this.nombreComun = Entrada.next();
        this.nombreCientifico = Entrada.next();
        this.ubicacion = Entrada.next();
        this.alimentacion = Entrada.next();
        this.peligrosidad = Entrada.nextInt();
        this.division = Entrada.next();
        this.subdivision = Entrada.next();
        this.clase = Entrada.next();
        this.orden = Entrada.next();
        this.familia = Entrada.next();
        this.genero = Entrada.next();
        this.especie = Entrada.next();
        
        listaFauna.add(new FaunaInfo(this.faunaId,this.nombreComun,this.nombreCientifico,
                                     this.ubicacion,this.alimentacion,this.peligrosidad,
                                     this.division,this.subdivision,this.clase,this.orden,
                                     this.familia,this.genero,this.especie));
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
        System.out.println(this.alimentacion);
        System.out.println(this.peligrosidad);
      
        System.out.println("Fin Información");
    }
}

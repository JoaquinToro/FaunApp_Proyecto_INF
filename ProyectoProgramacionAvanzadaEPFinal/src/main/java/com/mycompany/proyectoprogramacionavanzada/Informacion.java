/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogramacionavanzada;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public abstract class Informacion {
    //atributos
    private int informacionID;
    private String texto_Principal;
    private Scanner Entrada = new Scanner(System.in);
    
    //constructor

    public Informacion() {
    }

    public Informacion(int informacionID, String texto_Principal) {
        this.informacionID = informacionID;
        this.texto_Principal = texto_Principal;
    }

    public Informacion(String texto_Principal) {
        this.texto_Principal = texto_Principal;
    }
    
    
    //Getter y Setters

    public String getTexto_Principal() {
        return texto_Principal;
    }
    
    public int getInformacionID() {
        return informacionID;
    }

    public Scanner getEntrada() {
        return Entrada;
    }

    public void setTexto_Principal(String texto_Principal) {
        this.texto_Principal = texto_Principal;
    }

    public void setEntrada(Scanner Entrada) {
        this.Entrada = Entrada;
    }

    public void setInformacionID(int informacionID) {
        this.informacionID = informacionID;
    }
    
    //Metodos
    
    public void crearInformacion(){
        System.out.println("Ingrese el ID de la informacion");
        this.informacionID = Integer.parseInt(Entrada.nextLine());
        
        System.out.println("Ingrese el texto");
        this.texto_Principal = Entrada.nextLine();
    }
    
    public abstract void leerInformacion();
    
}

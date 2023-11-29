/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogramacionavanzada;

import java.util.Scanner;

/**
 *
 * @author Miles
 */
public abstract class Informacion {
    //atributos
    private String texto_Principal;
    private Scanner Entrada = new Scanner(System.in);
    
    //constructor

    public Informacion() {
    }

    public Informacion(String texto_Principal) {
        this.texto_Principal = texto_Principal;
    }
    
    
    //Getter y Setters

    public String getTexto_Principal() {
        return texto_Principal;
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
    
    //Metodos
    
    public void crearInformacion(){
        System.out.println("Ingrese el texto");
        this.texto_Principal = Entrada.nextLine();
    }
    
    public abstract void leerInformacion();
    
}

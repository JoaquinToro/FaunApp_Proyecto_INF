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
public class Noticia extends Informacion{
    //atributos
    private int noticiaID;
    private String titulo;
    private String autor;
    private int fecha;
    private Scanner Entrada = new Scanner(System.in);
    private ArrayList<Noticia> listaNoticias = new ArrayList<>();
    
    //Constructores

    public Noticia(int noticiaID, String titulo, String autor, int fecha) {
        this.noticiaID = noticiaID;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }

    public Noticia(int noticiaID, String titulo, String autor, int fecha, String texto_Principal) {
        super(texto_Principal);
        this.noticiaID = noticiaID;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }
    

    public Noticia() {
    }
    
    //Getters

    public int getNoticiaID() {
        return noticiaID;
    }

    public String getAutor() {
        return autor;
    }

    public int getFecha() {
        return fecha;
    }

    public ArrayList<Noticia> getListaNoticias() {
        return listaNoticias;
    }
    
    //Setters

    public void setNoticiaID(int noticiaID) {
        this.noticiaID = noticiaID;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setListaNoticias(ArrayList<Noticia> listaNoticias) {
        this.listaNoticias = listaNoticias;
    }
    
    //Metodos
    public void crearDatos(){
        System.out.println("Ingrese el id");
        this.noticiaID = Integer.parseInt(Entrada.nextLine());
        
        System.out.println("Ingrese el titulo");
        this.titulo = Entrada.nextLine();
        
        System.out.println("Ingrese el autor");
        this.autor = Entrada.nextLine();
        
        System.out.println("Ingrese la fecha en format yyyyMMdd");
        this.fecha = Integer.parseInt(Entrada.nextLine());
        
        this.crearInformacion();
        
        this.listaNoticias.add(this);
    }
    
    public void leerDatos(){
        System.out.println(this.noticiaID);
        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println(this.fecha);
        System.out.println(this.getTexto_Principal());
    }
    
    @Override
    public void leerInformacion(){
        System.out.println("Noticia: ");
        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println(this.fecha);
        System.out.println();
        System.out.println(this.getTexto_Principal());
    }
    public void Actualizar(int id){
        int longitud = this.listaNoticias.size();
        for(int i = 0; i<longitud; i++)
        {
            if(this.listaNoticias.get(i).getNoticiaID()== id){
                this.listaNoticias.get(i).crearDatos();
                return;
            }
        }
    }
    public void Eliminar(int id){
        int longitud = this.listaNoticias.size();
        for(int i = 0; i<longitud; i++)
        {
            if(this.listaNoticias.get(i).getNoticiaID() == id){
                this.listaNoticias.remove(i);
                return;
            }
        }
    }    
    public void mostrarNoticias(){
        int longitud = this.listaNoticias.size();
        
        for(int i = 0; i<longitud; i++)
            this.listaNoticias.get(i).leerDatos();
    }
}

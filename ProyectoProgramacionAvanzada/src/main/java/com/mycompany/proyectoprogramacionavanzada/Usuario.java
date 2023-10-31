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
public class Usuario {
    
    //atributos
    private String nombreDeUsuario;
    private String password;
    private String genero;
    private int edad;
    private Scanner Entrada = new Scanner(System.in);
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    private ArrayList<FloraInfo> FloraFavorita = new ArrayList<>();
    private ArrayList<FaunaInfo> FaunaFavorita = new ArrayList<>();   
    
    //constructor
    
    public Usuario() {
        this.nombreDeUsuario = null;
        this.password = null;
        this.genero = null;
        this.edad = 0;
    }

    public Usuario(String nombreDeUsuario, String genero) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.genero = genero;
    }

    public Usuario(String nombreDeUsuario, String genero, int edad) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.genero = genero;
        this.edad = edad;
    }
    public Usuario(String nombreDeUsuario,String password,String genero, int edad){
        this.nombreDeUsuario =  nombreDeUsuario;
        this.password = password;
        this.genero = genero;
        this.edad = edad;
    }
    
    
    
    //Getters

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<FloraInfo> getFloraFavorita() {
        return FloraFavorita;
    }

    public ArrayList<FaunaInfo> getFaunaFavorita() {
        return FaunaFavorita;
    }

    //Setters

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFloraFavorita(ArrayList<FloraInfo> FloraFavorita) {
        this.FloraFavorita = FloraFavorita;
    }

    public void setFaunaFavorita(ArrayList<FaunaInfo> FaunaFavorita) {
        this.FaunaFavorita = FaunaFavorita;
    }
    
    //Crear Datos
    public void crearDatos(){
        this.nombreDeUsuario = Entrada.nextLine();
        this.password = Entrada.nextLine();
        this.genero = Entrada.nextLine();
        this.edad = Integer.parseInt(Entrada.nextLine());
        
        this.listaUsuarios.add(new Usuario(this.nombreDeUsuario,this.password,this.genero, this.edad));
    }
    
    //Leer Datos
    public void leerDatos(){
        System.out.println(this.nombreDeUsuario);
        System.out.println(this.genero);
        System.out.println(this.edad);
        
        if(!FloraFavorita.isEmpty()){
            System.out.println("Flora Favorita");
            for (int i = 0; i < FloraFavorita.size(); i++) 
                System.out.println(FloraFavorita.get(i));
        }
        
        if(!FaunaFavorita.isEmpty()){
            System.out.println("Fauna Favorita");
            for (int i = 0; i < FaunaFavorita.size(); i++) 
                System.out.println(FaunaFavorita.get(i));
        }
                    
    }
    public void mostrarUsuarios(){
        int longitud = this.listaUsuarios.size();
        
        for(int i = 0; i<longitud; i++)
            this.listaUsuarios.get(i).leerDatos();
    }
    public void mostrarFlora(ArrayList<Usuario> listaUsuarios){
        int longitud = listaUsuarios.size();
        
        for(int i = 0; i<longitud; i++)
            listaUsuarios.get(i).leerDatos();
    }
    public void Actualizar(String nombre){
        int longitud = this.listaUsuarios.size();
        for(int i = 0; i<longitud; i++)
        {
            if(this.listaUsuarios.get(i).getNombreDeUsuario().contentEquals(nombre)){
                this.listaUsuarios.get(i).crearDatos();
                return;
            }
        }
    }
    public void Eliminar(String nombre){
        int longitud = this.listaUsuarios.size();
        for(int i = 0; i<longitud; i++)
        {
            if(this.listaUsuarios.get(i).getNombreDeUsuario().contentEquals(nombre)){
                this.listaUsuarios.remove(i);
                return;
            }
        }
    }
}

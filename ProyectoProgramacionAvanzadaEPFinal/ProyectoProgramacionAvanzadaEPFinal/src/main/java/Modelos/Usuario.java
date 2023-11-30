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
public class Usuario implements Sesion{
    
    //atributos
    private int id;
    private String nombreDeUsuario;
    private String password;
    private String genero;
    private String edad;
    private int estadoSesion = 0;
    private Scanner Entrada = new Scanner(System.in);
    
    private ArrayList<FloraInfo> FloraFavorita;
    private ArrayList<FaunaInfo> FaunaFavorita;   
    
    //constructor
    
    public Usuario() {
        this.nombreDeUsuario = null;
        this.password = null;
        this.genero = null;
        this.edad = null;
        this.FloraFavorita = new ArrayList<>();
        this.FaunaFavorita = new ArrayList<>();
    }


    public Usuario(String nombreDeUsuario,String password,String genero, String edad){
        this.nombreDeUsuario =  nombreDeUsuario;
        this.password = password;
        this.genero = genero;
        this.edad = edad;
        this.FloraFavorita = new ArrayList<>();
        this.FaunaFavorita = new ArrayList<>();
    }

    public Usuario(String nombreDeUsuario, String password, String genero, String edad, ArrayList<FloraInfo> FloraFavorita, ArrayList<FaunaInfo> FaunaFavorita) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.password = password;
        this.genero = genero;
        this.edad = edad;
        this.FloraFavorita = FloraFavorita;
        this.FaunaFavorita = FaunaFavorita;
    }


    
    
    //Getters

    public int getId() {
        return id;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public String getPassword() {
        return password;
    }



    public String getGenero() {
        return genero;
    }

    public String getEdad() {
        return edad;
    }

    public ArrayList<FloraInfo> getFloraFavorita() {
        return FloraFavorita;
    }

    public ArrayList<FaunaInfo> getFaunaFavorita() {
        return FaunaFavorita;
    }

    public int getSesionActiva() {
        return estadoSesion;
    }

    public Scanner getEntrada() {
        return Entrada;
    }

    //Setters
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setFloraFavorita(ArrayList<FloraInfo> FloraFavorita) {
        this.FloraFavorita = FloraFavorita;
    }

    public void setFaunaFavorita(ArrayList<FaunaInfo> FaunaFavorita) {
        this.FaunaFavorita = FaunaFavorita;
    }

    public void setSesionActiva(int estadoSesion) {
        this.estadoSesion = estadoSesion;
    }
    
    //Crear Datos
    public void crearDatos(){
        this.id = comprobar();
        this.nombreDeUsuario = comprobarString();
        this.password = comprobarString();
        this.genero = comprobarString();
        this.edad = comprobarString();
        
    }
    
    //Leer Datos
    public void leerDatos(){
        System.out.println(this.id);
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
    
    

    @Override
    public void abrirSesion() {
        this.estadoSesion=abierta;
    }

    @Override
    public void cerrarSesion() {
        this.estadoSesion=cerrada;
    }
    
    public void agregarFlora(FloraInfo flora){
        this.FloraFavorita.add(flora);
    }
    public void agregarFauna(FaunaInfo fauna){
        this.FaunaFavorita.add(fauna);
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

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
    private String nombreDeUsuario;
    private String password;
    private String genero;
    private String edad;
    private int estadoSesion = 0;
    private Scanner Entrada = new Scanner(System.in);
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
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

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
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

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
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
        this.nombreDeUsuario = Entrada.nextLine();
        this.password = Entrada.nextLine();
        this.genero = Entrada.nextLine();
        this.edad =Entrada.nextLine();
        
        this.listaUsuarios.add(new Usuario(this.nombreDeUsuario,this.password,this.genero, this.edad, this.FloraFavorita, this.FaunaFavorita));
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
    
    public void agregarALista(ArrayList<Usuario> Usuarios){
        int longitud = Usuarios.size();
        for(int i = 0; i<longitud; i++){
            this.listaUsuarios.add(new Usuario(Usuarios.get(i).getNombreDeUsuario(),
                    Usuarios.get(i).getPassword(),Usuarios.get(i).getGenero(),
                    Usuarios.get(i).getEdad()));
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
}

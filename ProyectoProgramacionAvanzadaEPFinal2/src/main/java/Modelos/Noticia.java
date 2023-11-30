/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
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
    private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private Date fecha = new Date();
    private Scanner Entrada = new Scanner(System.in);
    private ArrayList<Noticia> listaNoticias = new ArrayList<>();
    
    //Constructores

    public Noticia(int noticiaID, String titulo, String autor, Date fecha) {
        this.noticiaID = noticiaID;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }

    public Noticia(int noticiaID, String titulo, String autor, Date fecha, String texto_Principal) {
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

    public Date getFecha() {
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

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setListaNoticias(ArrayList<Noticia> listaNoticias) {
        this.listaNoticias = listaNoticias;
    }
    
    //Metodos
    public void crearDatos() throws ParseException{
        System.out.println("Ingrese el id");
        this.noticiaID = comprobar();
        
        System.out.println("Ingrese el titulo");
        this.titulo = comprobarString();
        
        System.out.println("Ingrese el autor");
        this.autor = comprobarString();
        
        System.out.println("Ingrese la fecha en format dd/MM/yyyy");
        comprobarFecha();
        
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
    public void Actualizar(int id) throws ParseException{
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
    
    public String comprobarString() {
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

    public void comprobarFecha() throws ParseException{
            try {
                System.out.println("Ingrese la fecha en formato dd/MM/yyyy:");
                String inputFecha = Entrada.nextLine();
                this.fecha = formato.parse(inputFecha);
            } catch(NumberFormatException e){
               System.out.println("Este dato no es válido");
               comprobarFecha();
            }
        }
}
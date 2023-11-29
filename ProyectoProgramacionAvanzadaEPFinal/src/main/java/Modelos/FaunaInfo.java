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
public class FaunaInfo extends Taxonomia{
    //ATRIBUTOS
    private int faunaId;
    private String nombreComun;
    private String nombreCientifico;
    private String ubicacion;
    private String alimentacion;
    private int peligrosidad;
    private Scanner Entrada = new Scanner(System.in);
    private ArrayList<FaunaInfo> listaFauna = new ArrayList<>();
    
    //Constructor

    public FaunaInfo(int faunaId, String nombreComun, String nombreCientifico, String ubicacion, String alimentacion, int peligrosidad, String division, String subdivision, String clase, String orden, String familia, String genero, String especie) {
        super(division,subdivision,clase,orden,familia,genero,especie);
        this.faunaId = faunaId;
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.ubicacion = ubicacion;
        this.alimentacion = alimentacion;
        this.peligrosidad = peligrosidad;
        
    }

    public FaunaInfo(){
        super(null, null, null, null, null, null, null);
        this.faunaId = 0;
        this.nombreComun = null;
        this.nombreCientifico = null;
        this.ubicacion = null;
        this.alimentacion = null;
        this.peligrosidad = 0;
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

    public void setListaFauna(ArrayList<FaunaInfo> listaFauna) {
        this.listaFauna = listaFauna;
    }
    
    //Crear Datos
    
    public void crearDatos(){
        System.out.println("Ingrese el id");
        this.faunaId = Integer.parseInt(Entrada.nextLine());
        System.out.println("Ingrese el nombreComun");
        this.nombreComun = Entrada.nextLine();
        System.out.println("Ingrese el nombre Cientifico");
        this.nombreCientifico = Entrada.nextLine();
        System.out.println("Ingrese la ubicacion");
        this.ubicacion = Entrada.nextLine();
        System.out.println("Ingrese la alimentacion");
        this.alimentacion = Entrada.nextLine();
        System.out.println("Ingrese la peligrosidad");
        this.peligrosidad = Integer.parseInt(Entrada.nextLine());
        
        
        
        this.crearDatosTaxonomia();
        
        listaFauna.add(new FaunaInfo(this.faunaId,this.nombreComun,this.nombreCientifico,
                                     this.ubicacion,this.alimentacion,this.peligrosidad,this.getDivision(),this.getSubdivision(),
                                     this.getClase(), this.getOrden(), this.getFamilia(), this.getGenero(),this.getEspecie()));
    }
    
    //Leer Datos
    public void leerDatos(){
        System.out.println("Información Taxonómica");
        System.out.println(this.getDivision());
        System.out.println(this.getSubdivision());
        System.out.println(this.getClase());
        System.out.println(this.getOrden());
        System.out.println(this.getFamilia());
        System.out.println(this.getGenero());
        System.out.println(this.getEspecie());
        
        System.out.println("Información General");
        System.out.println(this.nombreCientifico);
        System.out.println(this.nombreComun);
        System.out.println(this.ubicacion);
        System.out.println(this.alimentacion);
        System.out.println(this.peligrosidad);
      
        System.out.println("Fin Información");
    }
    public void mostrarFauna(){
        int longitud = this.listaFauna.size();
        
        for(int i = 0; i<longitud; i++)
            this.listaFauna.get(i).leerDatos();
    }
    public void mostrarFauna(ArrayList<FaunaInfo> listaFauna){
        int longitud = listaFauna.size();
        
        for(int i = 0; i<longitud; i++)
            listaFauna.get(i).leerDatos();
    }
    public void Actualizar(int id){
        int longitud = this.listaFauna.size();
        for(int i = 0; i<longitud; i++)
        {
            if(this.listaFauna.get(i).getFaunaId() == id){
                this.listaFauna.get(i).crearDatos();
                return;
            }
        }
    }
    public void Eliminar(int id){
        int longitud = this.listaFauna.size();
        for(int i = 0; i<longitud; i++)
        {
            if(this.listaFauna.get(i).getFaunaId() == id){
                this.listaFauna.remove(i);
                return;
            }
        }
    }
    
    @Override
    public void imprimirCategoria(){
        System.out.println("Fauna");
    }
}

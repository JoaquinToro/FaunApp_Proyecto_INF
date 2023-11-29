/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Modelos.Taxonomia;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class FloraInfo extends Taxonomia {
    
    //ATRIBUTOS
    private int floraId;
    private String nombreComun;
    private String nombreCientifico;
    private String ubicacion;
    private String funcion;
    private Scanner Entrada = new Scanner(System.in);
    private ArrayList<FloraInfo> listaFlora = new ArrayList<>();
    
    
    //CONSTRUCTORES SOBRECARGA

    public FloraInfo(){
        super(null, null, null, null, null, null, null);
        this.floraId = 0;
        this.nombreComun = null;
        this.nombreCientifico = null;
        this.ubicacion = null;
        this.funcion = null;
        
    }

    public FloraInfo(int floraId, String nombreComun, String nombreCientifico, String ubicacion, String funcion, String division, String subdivision, String clase, String orden, String familia, String genero, String especie) {
        super(division, subdivision,clase,orden,familia,genero,especie);
        this.floraId = floraId;
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.ubicacion = ubicacion;
        this.funcion = funcion;
        
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

    public void setEntrada(Scanner Entrada) {
        this.Entrada = Entrada;
    }

    public void setListaFlora(ArrayList<FloraInfo> listaFlora) {
        this.listaFlora = listaFlora;
    }
    
    //Crear Datos
    public void crearDatos(){
        System.out.println("Ingrese el id");
        this.floraId = Integer.parseInt(Entrada.nextLine());
        
        System.out.println("Ingrese el nombre comun");
        this.nombreComun = Entrada.nextLine();
        
        System.out.println("Ingrese el nombre cientifico");
        this.nombreCientifico = Entrada.nextLine();
        
        System.out.println("Ingrese la ubicacion");
        this.ubicacion = Entrada.nextLine();
        
        System.out.println("Ingrese la funcion");
        this.funcion = Entrada.nextLine();
        
        this.crearDatosTaxonomia();
        
        listaFlora.add(new FloraInfo(this.floraId,this.nombreComun,this.nombreCientifico,
                                     this.ubicacion, this.funcion, this.getDivision(),this.getSubdivision(),
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
        System.out.println(this.funcion);
        
        System.out.println("Fin Información");
    }
    
    public void mostrarFlora(){
        int longitud = this.listaFlora.size();
        
        for(int i = 0; i<longitud; i++)
            this.listaFlora.get(i).leerDatos();
    }
    public void mostrarFlora(ArrayList<FloraInfo> listaFlora){
        int longitud = listaFlora.size();
        
        for(int i = 0; i<longitud; i++)
            listaFlora.get(i).leerDatos();
    }
    public void Actualizar(int id){
        int longitud = this.listaFlora.size();
        for(int i = 0; i<longitud; i++)
        {
            if(this.listaFlora.get(i).getFloraId() == id){
                this.listaFlora.get(i).crearDatos();
                return;
            }
        }
    }
    public void Eliminar(int id){
        int longitud = this.listaFlora.size();
        for(int i = 0; i<longitud; i++)
        {
            if(this.listaFlora.get(i).getFloraId() == id){
                this.listaFlora.remove(i);
                return;
            }
        }
    }    
    
    @Override
    public void imprimirCategoria(){
        System.out.println("Flora");
    }
}
    

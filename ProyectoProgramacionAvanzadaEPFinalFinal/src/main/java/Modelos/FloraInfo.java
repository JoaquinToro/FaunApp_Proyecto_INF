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
    private String descripcion;
    private String funcion;
    private Scanner Entrada = new Scanner(System.in);
    private ArrayList<FloraInfo> listaFlora = new ArrayList<>();
    
    
    //CONSTRUCTORES SOBRECARGA

    public FloraInfo(){
        super(null, null, null, null, null, null, null);
        this.floraId = 0;
        this.nombreComun = null;
        this.nombreCientifico = null;
        this.descripcion = null;
        this.funcion = null;
        
    }

    public FloraInfo(int floraId, String nombreComun, String nombreCientifico, String ubicacion, String funcion, String division, String subdivision, String clase, String orden, String familia, String genero, String especie) {
        super(division, subdivision,clase,orden,familia,genero,especie);
        this.floraId = floraId;
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = ubicacion;
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

    public String getDescripcion() {
        return descripcion;
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

    public void setDescripcion(String ubicacion) {
        this.descripcion = ubicacion;
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
        this.floraId = comprobar();
        
        System.out.println("Ingrese el nombre comun");
        this.nombreComun = comprobarString();
        
        System.out.println("Ingrese el nombre cientifico");
        this.nombreCientifico = comprobarString();
        
        System.out.println("Ingrese la ubicacion");
        this.descripcion = comprobarString();
        
        System.out.println("Ingrese la funcion");
        this.funcion = comprobarString();
        
        this.crearDatosTaxonomia();
        
        listaFlora.add(new FloraInfo(this.floraId,this.nombreComun,this.nombreCientifico,
                                     this.descripcion, this.funcion, this.getDivision(),this.getSubdivision(),
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
        System.out.println(this.descripcion);
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
    
    
    
    @Override
    public void imprimirCategoria(){
        System.out.println("Flora");
    }
}
    

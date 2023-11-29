/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public abstract class Taxonomia {
    //Atributos
    private int taxonomiaID;
    private String division;
    private String subdivision;
    private String clase;
    private String orden;
    private String familia;
    private String genero;
    private String especie;
    private Scanner Entrada = new Scanner(System.in);

    public Taxonomia(String division, String subdivision, String Clase, String Orden, String familia, String genero, String especie) {
        this.division = division;
        this.subdivision = subdivision;
        this.clase = Clase;
        this.orden = Orden;
        this.familia = familia;
        this.genero = genero;
        this.especie = especie;
    }
    public Taxonomia() {
        this.division = null;
        this.subdivision = null;
        this.clase = null;
        this.orden = null;
        this.familia = null;
        this.genero = null;
        this.especie = null;
    }

    public int getTaxonomiaID() {
        return taxonomiaID;
    }

    public Scanner getEntrada() {
        return Entrada;
    }

    public void setTaxonomiaID(int taxonomiaID) {
        this.taxonomiaID = taxonomiaID;
    }

    public void setEntrada(Scanner Entrada) {
        this.Entrada = Entrada;
    }
    
    
    
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String Clase) {
        this.clase = Clase;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String Orden) {
        this.orden = Orden;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void crearDatosTaxonomia(){
        System.out.println("Ingrese el ID de la informacion");
        this.taxonomiaID = Integer.parseInt(Entrada.nextLine());
        System.out.println("Escriba la division");
        this.division = Entrada.nextLine();
        System.out.println("Escriba la subdivision");
        this.subdivision = Entrada.nextLine();
        System.out.println("Escriba la clase");
        this.clase = Entrada.nextLine();
        System.out.println("Escriba el orden");
        this.orden = Entrada.nextLine();
        System.out.println("Escriba la familia");
        this.familia = Entrada.nextLine();
        System.out.println("Escriba el genero");
        this.genero = Entrada.nextLine();
        System.out.println("Escriba la especie");
        this.especie = Entrada.nextLine();
    }
    public void leerDatos(){
        System.out.println(this.division);
        System.out.println(this.subdivision);
        System.out.println(this.clase);
        System.out.println(this.orden);
        System.out.println(this.familia);
        System.out.println(this.genero);
        System.out.println(this.especie);
        
    }
    
    public abstract void imprimirCategoria();
}

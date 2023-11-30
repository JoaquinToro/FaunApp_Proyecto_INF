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
public class Tips extends Informacion{
    //Atributos
    private int tipID;
    private String categoria;
    private ArrayList<Tips>listaTips = new ArrayList<>();
    private Scanner Entrada = new Scanner(System.in);
    
    //Constructores
    public Tips(){
    }

    public Tips(int tipID, String categoria, String texto_Principal) {
        super(texto_Principal);
        this.tipID = tipID;
        this.categoria = categoria;
    }
    
    //Getters y Setters

    public int getTipID() {
        return tipID;
    }

    public String getCategoria() {
        return categoria;
    }

    public ArrayList<Tips> getListaTips() {
        return listaTips;
    }

    public void setTipID(int tipID) {
        this.tipID = tipID;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setListaTips(ArrayList<Tips> listaTips) {
        this.listaTips = listaTips;
    }
    
    //Metodos
    public void crearDatos(){
        System.out.println("Ingrese el id");
        this.tipID = comprobar();
        
        System.out.println("Ingrese la categoria");
        this.categoria = comprobarString();
        
        this.crearInformacion();
        
        this.listaTips.add(this);
    }
    
    public void leerDatos(){        
        System.out.println(this.tipID);
        System.out.println(this.categoria);
        System.out.println(this.getTexto_Principal());
    }
    
    @Override
    public void leerInformacion(){
        System.out.println("Tip del dia: ");
        System.out.println(this.getTexto_Principal());
    }
    public void Actualizar(int id){
        int longitud = this.listaTips.size();
        for(int i = 0; i<longitud; i++)
        {
            if(this.listaTips.get(i).getTipID()== id){
                this.listaTips.get(i).crearDatos();
                return;
            }
        }
    }
    public void Eliminar(int id){
        int longitud = this.listaTips.size();
        for(int i = 0; i<longitud; i++)
        {
            if(this.listaTips.get(i).getTipID()== id){
                this.listaTips.remove(i);
                return;
            }
        }
    }    
    public void mostrarTips(){
        int longitud = this.listaTips.size();
        
        for(int i = 0; i<longitud; i++)
            this.listaTips.get(i).leerDatos();
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Usuario;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Reporte {
    private String Ruta;
    private ArrayList<Usuario>listaUsuariosReporte=new ArrayList<>();
    
    
    
    public Reporte(String Ruta){
        this.Ruta=Ruta;
        
    }

    public String getRuta() {
        return Ruta;
    }

    public ArrayList<Usuario> getListaUsuariosReporte() {
        return listaUsuariosReporte;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public void setListaUsuariosReporte(ArrayList<Usuario> listaUsuariosReporte) {
        this.listaUsuariosReporte = listaUsuariosReporte;
    }
    
    
    
    public void Leer() throws CsvValidationException{
        File file = new File(this.Ruta);
        try {
            FileReader inputfile = new FileReader(file);
            CSVReader reader = new CSVReader(inputfile);
        
            String[] nextRecord;
            
            // we are going to read data line by line
            int i=0;
            while ((nextRecord = reader.readNext()) != null) {
                
                if(i>0)
                    listaUsuariosReporte.add(new Usuario(nextRecord[0],
                                                         nextRecord[1],
                                                         nextRecord[2],
                                                         nextRecord[3]));
                i++;
            }
            
        
        }catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }
    
    public void Escribir(String [] header, ArrayList <Usuario> Datos){
        File file = new File(this.Ruta);
        try {
        // create FileWriter object with file as parameter
        FileWriter outputfile = new FileWriter(file);
  
        // create CSVWriter object filewriter object as parameter
        
        CSVWriter writer = new CSVWriter(outputfile);
  
        // adding header to csv
        //String[] header = { "Name", "Class", "Marks" };
        writer.writeNext(header);
        
        
        // add data to csv
        
        
        for(int i=0;i<Datos.size();i++){
            String[] data = {Datos.get(i).getNombreDeUsuario(),Datos.get(i).getPassword(),Datos.get(i).getGenero(),
                             Datos.get(i).getEdad()};
            writer.writeNext(data);
        }
        
        
  
        // closing writer connection
        writer.close();
    }
    catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
        
    }
}


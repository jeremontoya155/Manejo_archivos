
package org.proydesa.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class testArchivos {
    
    
    public static void main(String[] args) {
        
        try {
            //Sintaxis FileReader(lector de archivos txt)
            //FilerReader nombreFile=new FileReader("Ruta");
            //PUEDE SER ABSOLUTA O RELATIVA
            //Aboluta
            //FileReader lector= new FileReader("D:\\CURSOS TODOS\\Clase Java\\MedioCompleto\\Clase8Alumnos\\Notas.txt");
            //Relativa ->MAS CONVENIENTE PARA TRABJOS ACCIONES GRUPALES
            FileReader lector= new FileReader("ejemploUno.txt");
            //ready() nos da un true en caso de que el archivo este disponible para trabajar
            if (lector.ready()) {
                
              
                
                //SINTAXIS DE EXTRACCION
                
                int c=lector.read();
                
                while(c!=-1){
                
                    
                    System.out.print((char)c);
                    c=lector.read();
                
                }
                
                
            }
            
            //Cierre finalizacion del programa 
            lector.close();
            
        } catch (IOException ex) {
            System.out.println("Error con el archivo");
            ex.printStackTrace(System.out);
        } 
                    
        
        
    }
    
    
}

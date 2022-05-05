
package org.proydesa.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class testArchivoCompleto {
    
    public static void main(String[] args) {
        
        List<String> lista=new ArrayList<>();
        
        lista.add("Hola mundo\n");
        lista.add("Hola mundoDos\n");
        lista.add("Hola mundoTres\n");
        lista.add("Hola mundoCuatro\n");
        lista.add("Hola mundoCinco\n");
        
        String  ruta="ejemploDos.txt";
        
        escritura("\nHola mundo\n",ruta);
        
        lectura(ruta);
        
    }
    
    public static void lectura(String texto){
    
    
        try {
            FileReader lector=new FileReader(texto);
            
            int c=lector.read();
            
            
            while(c!=-1){
            
                
                System.out.print((char)c);
                c=lector.read();
            }
            
            
            
            lector.close();
        } catch (IOException ex) {
            
            System.out.println("Ocurrio un error");
            ex.printStackTrace(System.out);//ES QUE ME DA LA UBICACION EN EL CODIGO DE MI ERORR
        }
        
    
    }
    
    public static void escritura(String texto,String direccion){
    
    
        try {
            //FileWriter nombreW=new FileWriter(direccion,true)
            //EL TRUE NOS PERMITE INDICAR SOBREESCRITURA O CREACION 

            //VERIFICAR SI TENEMOS ALGO EN EL PROGRAMA
            //VERIFICAR SI YA EXISTE LA RUTA
            
            FileWriter escritor=new FileWriter(direccion,true);
            
                
            escritor.write(texto);
                
            
            
            escritor.close();
        } catch (IOException ex) {

            System.out.println("Error en la escritura");
            ex.printStackTrace(System.out);//NO SE OLVIDEN DEL SYSTEM.OUT
        }
            
        
    }
    
    
}

/*


Con la lista cargada de strings
cargar un archivo y hacer la lectura 


*/
package Practica_15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerObject {
     public static void main(String[] args)throws ClassNotFoundException{
         try{
             FileInputStream fi = new FileInputStream("pArchivo2.dat");
             ObjectInputStream oi= new ObjectInputStream(fi);
             Alumno obj1= (Alumno)oi.readObject();
             obj1.MostrarDatos();
             Profesor obj2= (Profesor)oi.readObject();
             obj2.MostrarDatos();
             oi.close();
             
         }catch(IOException e){
            System.out.println("Error en la escritura de Datos");
        }
     }
}

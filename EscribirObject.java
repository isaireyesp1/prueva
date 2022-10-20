package Practica_15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class EscribirObject {

    public static void main(String[] args) {
        Date ahora = new Date();
        Alumno obj1 = new Alumno("123456", "Ana ", "Ortiz Lopez", ahora);
        Profesor obj2 = new Profesor("Jorge ", "Cruz Perez ", 27);
        try {
            FileOutputStream fo = new FileOutputStream("pArchivo2.dat");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(obj1);
            oo.writeObject(obj2);
            oo.close();
            System.out.println("Los datos se guardaron en el archivo");
        } catch (IOException e) {
            System.out.println("Error en la escritura de Datos");
        }
    }
}

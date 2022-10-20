package Practica_15;

import java.util.Date;

public class Alumno extends Persona {

    private String NumControl;
    private Date fIngreso;

    Alumno(String numControl, String nombre, String apellido, Date fIngreso) {
        super(nombre, apellido);
        this.NumControl = numControl;
        this.fIngreso = fIngreso;
    }

    public void MostrarDatos() {
        System.out.println("Numero de Control: " + this.NumControl + "; " + this.nombre + " " + this.apellidos + "; Hora: " + this.fIngreso);
    }
}

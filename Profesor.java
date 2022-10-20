package Practica_15;

public class Profesor extends Persona {

    private int Edad;

    public Profesor(String nombre, String apellidos, int Edad) {
        super(nombre, apellidos);
        this.Edad = Edad;
    }

    public void MostrarDatos() {
        System.out.println("Nombre: " + this.nombre + " " + this.apellidos + ": " + this.Edad);
    }
}

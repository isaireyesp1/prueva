package Practica_15;

import java.io.Serializable;

public abstract class Persona implements Serializable {

    protected String nombre;
    protected String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public abstract void MostrarDatos();
}


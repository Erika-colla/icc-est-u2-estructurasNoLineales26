package models;

public class Persona implements Comparable<Persona> {
    private int edad;
    private String nombre;

    public Persona(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Persona o) {
        return Integer.compare(this.edad, o.edad);
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}
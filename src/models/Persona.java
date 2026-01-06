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
    public int compareTo(Persona otra) {
        //this.edad > otra.getEdad();
        int resulComp = Integer.compare(this.edad, otra.getEdad());
        if(resulComp != 0) {
            return resulComp;
        }
        //Compara otro elemento
        return this.nombre.compareTo(otra.getNombre());
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}
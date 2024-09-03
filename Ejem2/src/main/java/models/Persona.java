package models;

/**
 * Clase Persona
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private double peso;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Datos Persona \n" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", peso=" + peso ;
    }

    //Aumentar peso
    public void aumentarPeso (double aumento) {
        this.peso += aumento;
    }


    //Disminuir peso
    public void disminuirPeso (double disminucion) {
        this.peso -= disminucion;
    }
}

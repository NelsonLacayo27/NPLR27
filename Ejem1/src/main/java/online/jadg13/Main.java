package online.jadg13;

import javax.swing.*;

/**
 * Sesión 1 - Ejemplo 1
 * Esto es un comentario javadoc
 */
public class Main {
    //Esto es comentario de una linea.
    public static void main(String[] args) {
        System.out.println("Hola mundo desde la UAM");
        System.out.println("Tipos de datos");
        int num = 10;
        float precio = 10.3f;
        double peso = 140.4;
        String asignatura = "Metodología y Programación Orientada a Objetos";
        /*
        Esto es un comentario multilinea
        Mostrar los datos de las variables
         */

        System.out.print("\u001B[36m");
       /* Cambiar el color de texto  30: Negro
        31: Rojo
        32: Verde
        33: Amarillo
        34: Azul
        35: Magenta
        36: Cyan
        37: Blanco */
        System.out.println("*".repeat(113));
        System.out.println("Nombre de la asignatura: "+ asignatura);
        System.out.println("Numero: "+ num);
        System.out.println("Precio: "+ precio);
        System.out.println("Peso: "+ peso);
        System.out.println("*".repeat(113));
    }
}
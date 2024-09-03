package online.jadg13;

import models.Persona;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String nombre;
        int edad;
        System.out.print("Dime tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Dime tu edad: ");
        edad = Integer.parseInt(sc.nextLine());
        System.out.println("Hola "+ nombre +", mucho gusto.");
        */

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona oliver;
        persona1.setNombre("Cesar");
        persona1.setApellido("Silva");
        persona1.setEdad(19);
        persona1.setPeso(120);
/*
        System.out.print("Dime tu nombre: ");
        persona2.setNombre(sc.nextLine());
        System.out.print("Dime tu apellido: ");
        persona2.setApellido(sc.nextLine());
        System.out.print("Dime tu edad: ");
        persona2.setEdad(sc.nextInt());
        System.out.println("Dime tu peso: ");
        persona2.setPeso(sc.nextDouble());
*/
        oliver = new Persona("Oliver", "Espinoza", 19, 130);

        System.out.println(persona1.toString());
       // System.out.println(persona2);
        System.out.println(oliver);

        oliver.disminuirPeso(5);
        persona1.aumentarPeso(10);

        System.out.println(oliver);
        System.out.println(persona1);

    }
}
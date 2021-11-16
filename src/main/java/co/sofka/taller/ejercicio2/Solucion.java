package co.sofka.taller.ejercicio2;

import java.util.Scanner;

public class Solucion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Captura de datos por consola
        System.out.println("Ingresa el valor de la variable 1");
        int variable1 = entrada.nextInt();
        System.out.println("Ingresa el valor de la variable 2");
        int variable2 = entrada.nextInt();

        // Mostrando información
        System.out.println("Variable1= " + variable1);
        System.out.println("Variable2= " + variable2);

        // Lógica para comparar y mostrar el resultado
        if (variable1 > variable2) {
            System.out.println("La variable 1 es mayor a variable 2 ya que: " + variable1 + ">" + variable2);
        } else if (variable1 < variable2) {
            System.out.println("La variable 2 es mayor a variable 1 ya que: " + variable2 + ">" + variable1);
        } else {
            System.out.println("La variable 1 es igual a variable 2 ya que: " + variable1 + "=" + variable2);
        }
    }
}

package co.sofka.taller.ejercicio14;

import java.util.Scanner;

public class Solucion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el número: ");
        int numero = Integer.parseInt(entrada.next());

        for (int i = numero; i <= 1000; i+=2) {
            System.out.println("Número: " + i);
        }
    }
}

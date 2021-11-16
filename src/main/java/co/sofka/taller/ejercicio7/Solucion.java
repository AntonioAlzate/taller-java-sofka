package co.sofka.taller.ejercicio7;

import java.util.Scanner;

public class Solucion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero = 0;

        do {
            System.out.println("Ingresa el número: ");
            numero = Double.parseDouble(entrada.next());

        }while (numero < 0);

        System.out.println("El número ingresado valido fue: " + numero);
    }
}

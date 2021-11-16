package co.sofka.taller.ejercicio10;

import java.util.Scanner;

public class Solucion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la frase a la que deseas eliminar los espacios");
        String frase = entrada.nextLine();

        String fraseSinEspacios = frase.trim().replace(" ", "");

        System.out.println("Frase Original:" + frase);
        System.out.println("Frase sin espacios:" + fraseSinEspacios);
    }
    
}

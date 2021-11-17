package co.sofka.taller.ejercicio11;

import java.util.Locale;
import java.util.Scanner;

public class Solucion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la frase: ");
        String frase = entrada.nextLine().toLowerCase();

        mostrarLongitudYCantidadVocales(frase);
    }

    private static void mostrarLongitudYCantidadVocales(String frase) {
        int longitud = frase.length();
        int cantidadA = 0, cantidadE = 0, cantidadI = 0, cantidadO = 0, cantidadU = 0;

        for (int i = 0; i < longitud; i++) {
            switch (frase.charAt(i)) {
                case 'a':
                    cantidadA++;
                    break;
                case 'e':
                    cantidadE++;
                    break;
                case 'i':
                    cantidadI++;
                    break;
                case 'o':
                    cantidadO++;
                    break;
                case 'u':
                    cantidadU++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("La longitud de la frase es " + longitud);
        System.out.println("La cantidad de vocales 'a' es: " + cantidadA);
        System.out.println("La cantidad de vocales 'e' es: " + cantidadE);
        System.out.println("La cantidad de vocales 'i' es: " + cantidadI);
        System.out.println("La cantidad de vocales 'o' es: " + cantidadO);
        System.out.println("La cantidad de vocales 'u' es: " + cantidadU);

    }

}

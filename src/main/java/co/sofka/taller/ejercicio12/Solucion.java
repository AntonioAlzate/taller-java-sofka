package co.sofka.taller.ejercicio12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solucion {
    //QUEDA PENDIENTE
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa las dos palabras de las que quieres conocer su diferencia");

        System.out.println("Ingresa la palabra número 1");
        String palabra1 = entrada.next().trim();
        System.out.println("Ingresa la palabra número 2");
        String palabra2 = entrada.next().trim();

        char[] palabra1Dividida = palabra1.toCharArray();
        char[] palabra2Dividida = palabra2.toCharArray();

        if (palabra1.compareTo(palabra2) == 0) {
            System.out.println("No existen diferencias");
        } else {
            ArrayList<Character> letrasDiferentes = encontrarDiferencia(palabra1Dividida, palabra2Dividida);

            System.out.println("Las palabras no son iguales tienen diferencias en " + letrasDiferentes.size()
                    + " letras, estas son: ");

            for (int i = 0; i < letrasDiferentes.size(); i++) {
                System.out.print(letrasDiferentes.get(i) + ", ");
            }
        }

    }

    private static ArrayList<Character> encontrarDiferencia(char[] palabra1Dividida, char[] palabra2Dividida) {

        ArrayList<Character> letrasDiferentes = new ArrayList<>();

        int longitudMayor = Math.max(palabra1Dividida.length, palabra2Dividida.length);

        for (int i = 0; i < longitudMayor; i++) {
            Character letra1 = palabra1Dividida[i];
            Character letra2 = palabra2Dividida[i];

            if (letra1 == null && letra2 != null)
                letrasDiferentes.add(letra2);
            else if (letra1 != null && letra2 == null)
                letrasDiferentes.add(letra1);
            else if (letra1.compareTo(letra2) != 0)
                letrasDiferentes.add(letra1);
        }

        return letrasDiferentes;
    }
}

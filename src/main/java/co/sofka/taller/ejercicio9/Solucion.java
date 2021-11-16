package co.sofka.taller.ejercicio9;

import java.util.Scanner;

public class Solucion {

    private static final String TEXTO_BASE = "La sonrisa sera la mejor arma contra la tristeza";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la frase adicional a concatenar: ");
        String fraseAdicional = entrada.nextLine();

        String textoReemplazoAconE = TEXTO_BASE.replace('a', 'e');

        System.out.println("Texto original: " + TEXTO_BASE);
        System.out.println("Texto reemplazando a por e:" + textoReemplazoAconE);
        System.out.println("Texto concatenado con frase adicional: " + textoReemplazoAconE + fraseAdicional);
    }
}

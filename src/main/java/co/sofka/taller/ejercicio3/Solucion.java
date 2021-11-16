package co.sofka.taller.ejercicio3;

import java.util.Scanner;

public class Solucion {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a esta aplicación que calcula el área de un circulo");
        System.out.print("Ingresa el valor del radio del circulo: ");

        // Captura de dato por consola
        double radio = Double.parseDouble(entrada.next());

        double resultado = calcularRadio(radio);

        System.out.println("El área del circulo de radio " + radio + " es igual a: " + resultado);
    }

    private static double calcularRadio(double radio){
        double resultado = 0;
        double PI = Math.PI;

        resultado = (PI)*(Math.pow(radio, 2));

        return resultado;
    }
}

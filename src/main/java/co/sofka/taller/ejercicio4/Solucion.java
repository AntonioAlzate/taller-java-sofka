package co.sofka.taller.ejercicio4;

import java.util.Scanner;

public class Solucion {

    // Constante del IVA
    private static final double valorIva = 0.21;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el precio del producto que deseas calcular");
        double precioProducto = entrada.nextDouble();

        double valorFinal = calcularValorConIva(precioProducto);

        System.out.println("El valor final del producto es: " + valorFinal + " $");
    }

    private static double calcularValorConIva(double valorProducto) {

        double resultado = (valorProducto * valorIva) + valorProducto;

        return resultado;
    }
}

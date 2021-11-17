package co.sofka.taller.ejercicio17;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Televisor(120, 28);
        electrodomesticos[2] = new Televisor();
        electrodomesticos[3] = new Lavadora();
        electrodomesticos[4] = new Lavadora(300, 80);
        electrodomesticos[5] = new Lavadora(450, 90, Colores.NEGRO, ConsumosEnergeticos.F, 45);
        electrodomesticos[6] = new Televisor();
        electrodomesticos[7] = new Televisor(400, 21);
        electrodomesticos[8] = new Televisor(520, 12, Colores.ROJO, ConsumosEnergeticos.A, 45, true);
        electrodomesticos[9] = new Televisor(600, 18, Colores.AZUL, ConsumosEnergeticos.C, 28, false);

        double precioTelevisores = 0;
        double precioLavadoras = 0;
        double precioTotalElectrodomesticos = 0;

        for (int i = 0; i < electrodomesticos.length; i++) {
            Electrodomestico electrodomestico = electrodomesticos[i];

            if(electrodomestico instanceof Lavadora){
                precioLavadoras += electrodomestico.precioFinal();
                System.out.println("Lavadora " + electrodomestico.precioFinal());
            }
            if(electrodomestico instanceof Televisor){
                precioTelevisores += electrodomestico.precioFinal();
                System.out.println("Televisor " + electrodomestico.precioFinal());
            }
        }

        System.out.println("El precio final de todos los electrodomesticos es: " + (precioLavadoras + precioTelevisores));
        System.out.println("Precio Televisores: " + precioTelevisores);
        System.out.println("Precios Lavadoras: " + precioLavadoras);

    }
}

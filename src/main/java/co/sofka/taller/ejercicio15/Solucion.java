package co.sofka.taller.ejercicio15;

import java.util.Scanner;

public class Solucion {

    private static final String OPCION_INCORRECTA = "OPCION INCORRECTA";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al menú de opciones");

        boolean deseaSalir = false;
        int opcion = 0;

        while (!deseaSalir) {

            System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6-VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");

            System.out.print("Ingresa la opción: ");

            try {
                opcion = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("No ingresaste un número entero por lo tanto es imposible continuar");
                break;
            }


            switch (opcion) {
                case 1, 2, 3, 4, 5, 6, 7:
                    break;
                case 8:
                    deseaSalir = true;
                    break;
                default:
                    System.out.println(OPCION_INCORRECTA);
                    break;
            }
        }
    }
}

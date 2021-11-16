package co.sofka.taller.ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Solucion {

    private static final String LABORAL = "Es un día laboral";
    private static final String NO_LABORAL = "NO es un día laboral";
    private static final String DIA_NO_VALIDO = "ES INVALIDA LA INFORMACIÓN INGRESADA";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("días: lunes, martes, miercoles, jueves, viernes, sabado, domingo");
        System.out.println("Escribe un día de la semana para decir si es laboral o no");

        String diaSemana = entrada.next().toLowerCase();

        switch (diaSemana){
            case "lunes":
                System.out.println(LABORAL);
                break;
            case "martes":
                System.out.println(LABORAL);
                break;
            case "miercoles":
                System.out.println(LABORAL);
                break;
            case "jueves":
                System.out.println(LABORAL);
                break;
            case "viernes":
                System.out.println(LABORAL);
                break;
            case "sabado":
                System.out.println(NO_LABORAL);
                break;
            case "domingo":
                System.out.println(NO_LABORAL);
                break;
            default:
                System.out.println(DIA_NO_VALIDO);
                break;
        }
    }
}

package co.sofka.taller.ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solucion {

    public static void main(String[] args) {
        System.out.println(consultarFechaYHora());
    }

    // Algoritmo para consultar la hora en formato AAAA/MM/DD HH:MM:SS
    private static String consultarFechaYHora(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
        String fechaHora = LocalDateTime.now().format(formatter);
        return fechaHora;
    }
}

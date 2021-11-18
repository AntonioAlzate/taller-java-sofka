package co.sofka.taller.ejercicio18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        series[0] = new Serie();
        series[1] = new Serie("La casita grande", "Pepito Moreno");
        series[2] = new Serie("Hola que tal", "Maria Luisa", 6, "Romace");
        series[3] = new Serie("El rio Grande", "Aureliano");
        series[4] = new Serie("10 Historias de terror", "Ramiro Fuentes", 3, "Terror");

        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego("FIFA 22", 24);
        videojuegos[2] = new Videojuego("Pong", 1, "Arcade", "KONAMI");
        videojuegos[3] = new Videojuego("80 days", 31);
        videojuegos[4] = new Videojuego("Inside", 4, "Rompecabezas", "palydead");

        // Entregar algunos videojuegos
        series[2].entregar();
        series[4].entregar();
        series[0].entregar();
        videojuegos[2].entregar();
        videojuegos[1].entregar();

        // cuantas series y videojuegos entregados
        List<Serie> seriesEntregadas = Arrays.stream(series)
                .filter(serie -> serie.isEntregado())
                .collect((Collectors.toList()));

        List<Videojuego> videojuegosEntregados = Arrays.stream(videojuegos)
                .filter(videojuego -> videojuego.isEntregado())
                .collect((Collectors.toList()));

        System.out.println("Se han entregado " + seriesEntregadas.size() + " series");
        seriesEntregadas.forEach(s -> System.out.println("Serie: " + s.getTitulo()));

        System.out.println("Se han entregado " + videojuegosEntregados.size() + " videojuegos");
        videojuegosEntregados.forEach(s -> System.out.println("Videojuego: " + s.getTitulo()));

        // Videojuego con mas horas y Serie con mas temporadas

        Videojuego videojuegoConMasHoras = new Videojuego();

        for (int i = 0; i < videojuegos.length; i++) {
            if(i==0)
                videojuegoConMasHoras = videojuegos[i];
            else {
                if(videojuegoConMasHoras.compareTo(videojuegos[i]) == -1){
                    videojuegoConMasHoras = videojuegos[i];
                }
            }
        }

        Serie serieConMasTemporadas = new Serie();

        for (int i = 0; i < series.length; i++) {
            if(i==0)
                serieConMasTemporadas = series[i];
            else {
                if(serieConMasTemporadas.compareTo(series[i]) == -1){
                    serieConMasTemporadas = series[i];
                }
            }
        }

        System.out.println("El videojuego con mas horas es: \n" + videojuegoConMasHoras.toString());
        System.out.println("La serie con mas temporadas es: \n" + serieConMasTemporadas.toString());
    }
}

package co.sofka.taller.ejercicio16;

public class TablaLetras {

    private static char[] tabla = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static char calcularLetra(int resto) {
        return tabla[resto];
    }
}

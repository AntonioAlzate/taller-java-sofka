package co.sofka.taller.ejercicio17;

public class ConsumosEnergeticos {

    public static final char A = 'A';
    public static final char B = 'B';
    public static final char C = 'C';
    public static final char D = 'D';
    public static final char E = 'E';
    public static final char F = 'F';

    private static final double precioA = 100;
    private static final double precioB = 80;
    private static final double precioC = 60;
    private static final double precioD = 50;
    private static final double precioE = 30;
    private static final double precioF = 10;

    public static double precioPorConsumo(char letra) {
        if (letra == A)
            return precioA;
        else if (letra == B)
            return precioB;
        else if (letra == C)
            return precioC;
        else if (letra == D)
            return precioD;
        else if (letra == E)
            return precioE;
        else
            return precioF;
    }
}

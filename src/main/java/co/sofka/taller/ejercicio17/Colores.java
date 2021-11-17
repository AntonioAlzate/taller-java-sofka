package co.sofka.taller.ejercicio17;

public class Colores {

    public static String BLANCO = "BLANCO";
    public static String NEGRO = "NEGRO";
    public static String ROJO = "ROJO";
    public static String AZUL = "AZUL";
    public static String GRIS = "GRIS";

    public static boolean existeColor(String color) {
        if(color == BLANCO || color == NEGRO || color == ROJO || color == AZUL || color == GRIS)
            return true;
        else
            return false;
    }
}

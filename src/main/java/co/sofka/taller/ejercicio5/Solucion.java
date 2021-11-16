package co.sofka.taller.ejercicio5;

public class Solucion {

    public static void main(String[] args) {

        int contador = 1;

        while (contador <= 100){

            if(contador % 2 == 0)
                System.out.println(contador + " Es par");
            else
                System.out.println(contador + " Es impar");

            contador++;
        }
    }
}

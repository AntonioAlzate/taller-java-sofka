package co.sofka.taller.ejercicio1;

public class Solucion {

    public static void main(String[] args) {

        // Declaracion de variables
        int variable1 = 5;
        int variable2 = 2;

        // Mostrando información
        System.out.println("Variable1= " + variable1);
        System.out.println("Variable2= " + variable2);

        // Lógica para comparar y mostrar el resultado
        if (variable1 > variable2) {
            System.out.println("La variable 1 es mayor a variable 2 ya que: " + variable1 + ">" + variable2);
        } else if (variable1 < variable2) {
            System.out.println("La variable 2 es mayor a variable 1 ya que: " + variable2 + ">" + variable1);
        } else {
            System.out.println("La variable 1 es igual a variable 2 ya que: " + variable1 + "=" + variable2);
        }
    }
}

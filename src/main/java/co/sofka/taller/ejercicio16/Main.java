package co.sofka.taller.ejercicio16;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        char sexo;
        double peso, altura;

        // Pidiendo los datos por consola
        System.out.println("A continuacón ingresa los datos requeridos");
        System.out.print("Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Edad: ");
        edad = Integer.parseInt(entrada.next());
        System.out.print("Sexo (H hombre, M mujer): ");
        sexo = entrada.next().toUpperCase().charAt(0);
        System.out.print("Peso (kg): ");
        peso = Double.parseDouble(entrada.next());
        System.out.print("Altura (m): ");
        altura = Double.parseDouble(entrada.next());

        // Declarando las 3 diferentes personas
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        // Asignación de valores a la persona creada por defecto
        persona3.setNombre("Juanito");
        persona3.setEdad(25);
        persona3.setSexo(Persona.SEXO_HOMBRE);
        persona3.setPeso(72.5);
        persona3.setAltura(1.78);

        // Una lista para llevar a cabo las comprobaciones de manera mas comoda
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

        // Comprobación de peso ideal
        System.out.println("----------------PESO IDEAL----------------");
        for (int i = 0; i < personas.size(); i++) {

            if (personas.get(i).calcularIMC() == Persona.PESO_IDEAL) {
                System.out.println("La persona número " + (i+1) + " se encuentra en su peso ideal FELICIDADES!");
            } else if (personas.get(i).calcularIMC() == Persona.ABAJO_PESO_IDEAL) {
                System.out.println("La persona número " + (i+1) + " se encuentra abajo de su peso ideal A COMER!");
            } else if (personas.get(i).calcularIMC() == Persona.SOBREPESO) {
                System.out.println("La persona número " + (i+1) + " se encuentra con sobrepeso A CUIDARSE!");
            }
        }

        // Comprobación mayor de edad
        System.out.println("----------------MAYORIA DE EDAD----------------");
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).esMayorDeEdad())
                System.out.println("La persona número " + (i+1) + " es MAYOR DE EDAD");
            else
                System.out.println("La persona número " + (i+1) + " es MENOR DE EDAD");
        }

        // Mostrando la información de cada persona
        System.out.println("----------------INFORMACIÓN GENERAL----------------");
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i).toString());
        }
    }
}

package co.sofka.taller.ejercicio17;

public class Electrodomestico {

    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    // Constantes por defecto
    public static final double precioBaseDefecto = 100;
    public static final String  colorDefecto = Colores.BLANCO;
    public static final char consumoEnergeticoDefecto = ConsumosEnergeticos.F;
    public static final double pesoDefecto = 5;

    public Electrodomestico(){
        this.precioBase = precioBaseDefecto;
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
        this.peso = pesoDefecto;
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
    }

    public Electrodomestico(double precioBase, double peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
    }

    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico ) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
    }

    private void comprobarConsumoEnergetico(char letra){
        Character.toUpperCase(letra);
        this.consumoEnergetico = letra >='A' && letra <= 'F' ? letra : consumoEnergeticoDefecto;
    }

    private void comprobarColor(String color){
        color = color.toUpperCase();
        if(Colores.existeColor(color))
            this.color = color;
        else
            this.color = colorDefecto;
    }

    public double precioFinal(){
        double precioConsumo = ConsumosEnergeticos.precioPorConsumo(this.consumoEnergetico);
        double precioTamano = calcularPrecioPorPeso(this.peso);

        return precioConsumo + precioTamano + this.precioBase;
    }

    private double calcularPrecioPorPeso(double peso) {
        if(peso >= 20 && peso <= 49)
            return 50;
        else if(peso >= 50 && peso <= 79)
            return 80;
        else if(peso >= 80)
            return 100;
        else
            return 10; // Para los valores entre 0 y 19 que es donde entra el valor por default que es 5
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
}

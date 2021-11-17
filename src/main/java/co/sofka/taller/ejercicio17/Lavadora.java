package co.sofka.taller.ejercicio17;

public class Lavadora extends Electrodomestico {

    private double carga;

    // defecto
    private static final double cargaDefecto = 5;

    public Lavadora(){
        super();
        this.carga = cargaDefecto;
    }

    public Lavadora(double precio, double peso){
        super(precio, peso);
        this.carga = cargaDefecto;
    }

    public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        double precioLavadora = super.precioFinal();
        if(this.carga > 30){
            precioLavadora += 50;
        }
        return precioLavadora;
    }

    public double getCarga() {
        return carga;
    }
}

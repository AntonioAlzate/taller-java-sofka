package co.sofka.taller.ejercicio17;

public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean sintonizadorTDT;

    // Defecto
    private static final double resolucionDefecto = 20;
    private static final boolean sintonizadorTDTDefecto = false;

    public Televisor() {
        super();
        this.resolucion = resolucionDefecto;
        this.sintonizadorTDT = sintonizadorTDTDefecto;
    }

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = resolucionDefecto;
        this.sintonizadorTDT = sintonizadorTDTDefecto;
    }

    public Televisor(double precioBase, double peso, String color, char consumoEnergetico,  double resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioTelevisor = super.precioFinal();

        if(sintonizadorTDT){
            precioTelevisor += 50;
        }

        if(resolucion > 40){
            double valor = precioTelevisor * 0.3;
            precioTelevisor += valor;
        }

        return precioTelevisor;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
}

package co.sofka.taller.ejercicio18;

public class Serie implements Entregable{

    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    // defecto
    public static final int numeroTemporadasDefault = 3;
    public static final boolean entregadoDefault = false;

    public Serie(){
        this.titulo = new String();
        this.genero = new String();
        this.creador = new String();
        this.numeroDeTemporadas = numeroTemporadasDefault;
        this.entregado = entregadoDefault;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = new String();
        this.numeroDeTemporadas = numeroTemporadasDefault;
        this.entregado = entregadoDefault;
    }

    public Serie(String titulo,String creador, int numeroDeTemporadas, String genero) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = entregadoDefault;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        int resultado = ((Integer)this.numeroDeTemporadas).compareTo(((Serie)a).getNumeroDeTemporadas());
        return resultado;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

}

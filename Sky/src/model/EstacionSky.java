package model;

public class EstacionSky {
    private String nombre;
    private int numeroPistas;
    private int numeroEsquiadores;


    public EstacionSky() {
    }

    public EstacionSky(String nombre, int numeroPistas, int numeroEsquiadores) {
        this.nombre = nombre;
        this.numeroPistas = numeroPistas;
        this.numeroEsquiadores = numeroEsquiadores;

    }

    public int calcularRecaudacion(int numeroEsquiadores) {
        int recaudacionTotalDia=numeroEsquiadores*50;
        return  recaudacionTotalDia;
    }


}

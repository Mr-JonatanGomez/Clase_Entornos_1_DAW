package model;

public class Colegio {

    private int precioTotalRecaudado, precioAsignatura;
    private int numeroAsignaturas, numeroAlumnos;
    private String nombre;

    public Colegio(String nombre, int numeroAlumnos, int numeroAsignaturas) {
        this.nombre = nombre;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroAsignaturas = numeroAsignaturas;
        this.precioAsignatura = 75;
    }

    public int calcularTotalRecaudado() {
        int pagadoCadaAlumno = numeroAsignaturas * precioAsignatura;
        precioTotalRecaudado = pagadoCadaAlumno * numeroAlumnos;


        return precioTotalRecaudado;
    }

}

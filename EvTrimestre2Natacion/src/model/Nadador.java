package model;

import java.util.Date;
import java.util.Scanner;

public class Nadador {
    private String nombre, DNI;
    private int dorsal;
    private float puntuacion, dificultadEjercicio;
    private Date fechaNacimiento;

    public Nadador() {
    }
    public Nadador(String nombre, String DNI, int dorsal, float puntuacion, float dificultadEjercicio){
        this.nombre=nombre;
        this.DNI=DNI;
        //NADADOR DE PRUEBA
        this.dorsal=dorsal;
        this.puntuacion=puntuacion;
        this.dificultadEjercicio=dificultadEjercicio;
    }
    public Nadador(String nombre, String DNI, Date fechaNacimiento, int dorsal, float puntuacion, float dificultadEjercicio){
        this.nombre=nombre;
        this.DNI=DNI;
        this.fechaNacimiento=fechaNacimiento;
        this.dorsal=dorsal;
        this.puntuacion=puntuacion;
        this.dificultadEjercicio=dificultadEjercicio;
    }

    public void mostrarDatos (){
        System.out.println("Participante con el dorsal: "+getDorsal());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Fecha de Nacimiento: "+getFechaNacimiento());
        System.out.println("DNI: "+getDNI());
    }
/*
➢ Contiene un 1 método para calcular la puntuación final del componente del equipo.
( Este se calcula multiplicando la puntuación por el valor de dificultad).
*/
    public float puntuacionNadador(float puntuacion){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dificultad ejercicio");
        dificultadEjercicio=sc.nextFloat();
        this.puntuacion+=puntuacion*dificultadEjercicio;
        System.out.println("La puntuacion es: "+getPuntuacion());
        return getPuntuacion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public float getDificultadEjercicio() {
        return dificultadEjercicio;
    }

    public void setDificultadEjercicio(float dificultadEjercicio) {
        this.dificultadEjercicio = dificultadEjercicio;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}



/*
➢ Se requiere hacer una clase para un equipo de natacion sincronizada, se creará una
clase que tendrá un nombre, un dni, una fecha, un dorsal, la puntuación del ejercicio y
el valor de dificultad.

➢ Contiene un 1 método para calcular la puntuación final del componente del equipo.
( Este se calcula multiplicando la puntuación por el valor de dificultad).

➢ Contiene un 2 método para calcular si el componente del equipo es mayor de edad y
puede participar en la prueba.
*/
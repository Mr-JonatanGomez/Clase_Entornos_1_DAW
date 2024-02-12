package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Nadador {
    private String nombre, DNI;
    private int dorsal, edad;
    private float puntuacionEjercicio, dificultadEjercicio, puntuacionFinal;


    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");


    public Nadador() {
    }

    public Nadador(String nombre, String DNI, int edad, int dorsal, float puntuacionEjercicio, float dificultadEjercicio) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.dorsal = dorsal;
        this.puntuacionEjercicio = puntuacionEjercicio;

        this.dificultadEjercicio = dificultadEjercicio;
    }

    public Nadador(String nombre, float puntuacionEjercicio, float dificultadEjercicio) {//PARA TEST
        this.nombre = nombre;
        //NADADOR DE PRUEBA
        this.puntuacionEjercicio = puntuacionEjercicio;
        this.dificultadEjercicio = dificultadEjercicio;
    }

    public Nadador(int edad, float puntuacionEjercicio, float dificultadEjercicio, float puntuacionFinal) {//prueba
        this.edad = edad;
        //NADADOR DE PRUEBA
        this.puntuacionEjercicio = puntuacionEjercicio;
        this.dificultadEjercicio = dificultadEjercicio;
        this.puntuacionFinal = puntuacionFinal;
    }


    public void mostrarDatos() {
        System.out.println("Participante con el dorsal: " + getDorsal());
        System.out.println("Nombre: " + getNombre());
        System.out.println("DNI: " + getDNI());
        System.out.println("Edad: " + getEdad());
    }

    public float puntuacionNadador(float puntuacionEjercicio, float dificultadEjercicio) {

        this.puntuacionFinal = puntuacionEjercicio * dificultadEjercicio;
        System.out.println("puntuacion total: " + getPuntuacionFinal());
        return getPuntuacionFinal();
    }

    public boolean esMayorDeEdad(Nadador nadador) {
        if (nadador.getEdad()<18){

        }
        return true;
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

    public float getPuntuacionEjercicio() {
        return puntuacionEjercicio;
    }

    public void setPuntuacionEjercicio(float puntuacionEjercicio) {
        this.puntuacionEjercicio = puntuacionEjercicio;
    }

    public float getDificultadEjercicio() {
        return dificultadEjercicio;
    }

    public void setDificultadEjercicio(float dificultadEjercicio) {
        this.dificultadEjercicio = dificultadEjercicio;
    }

    public float getPuntuacionFinal() {
        return puntuacionFinal;
    }

    public void setPuntuacionFinal(float puntuacionFinal) {
        this.puntuacionFinal = puntuacionFinal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
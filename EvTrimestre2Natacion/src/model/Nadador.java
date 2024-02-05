package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Nadador {
    private String nombre, DNI;
    private int dorsal;
    private float puntuacionEjercicio, dificultadEjercicio, puntuacionFinal;
    private Date fechaNacimiento;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");


    public Nadador() {
    }

    public Nadador(String nombre, String DNI, int dorsal, float puntuacionEjercicio, float dificultadEjercicio) {
        this.nombre = nombre;
        this.DNI = DNI;
        //NADADOR SIN FECHA
        this.dorsal = dorsal;
        this.puntuacionEjercicio = puntuacionEjercicio;

        this.dificultadEjercicio = dificultadEjercicio;
    }
    //nadador para TEST LINEA 31
    public Nadador(String nombre, float puntuacionEjercicio, float dificultadEjercicio) {
        this.nombre = nombre;
        //NADADOR DE PRUEBA
        this.puntuacionEjercicio = puntuacionEjercicio;
        this.dificultadEjercicio = dificultadEjercicio;
    }
    public Nadador(String nombre, String DNI, Date fechaNacimientoStr, int dorsal, float puntuacionEjercicio, float dificultadEjercicio) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre: ");
        nombre=sc.nextLine();
        this.nombre = nombre;
        this.DNI = DNI;
        System.out.println("Introduce fecha de nacimiento (dd-mm-yyyy): ");
        fechaNacimientoStr=sdf.parse(sc.nextLine());
        this.fechaNacimiento =fechaNacimientoStr;
        this.dorsal = dorsal;
        this.puntuacionEjercicio = puntuacionEjercicio;
        this.dificultadEjercicio = dificultadEjercicio;
    }

    public void mostrarDatos() {
        System.out.println("Participante con el dorsal: " + getDorsal());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Fecha de Nacimiento: " + getFechaNacimiento());
        System.out.println("DNI: " + getDNI());
    }

    /*
    ➢ Contiene un 1 método para calcular la puntuación final del componente del equipo.
    ( Este se calcula multiplicando la puntuación por el valor de dificultad).
    */
    public float puntuacionNadador(float puntuacionEjercicio, float dificultadEjercicio) {
        /* ACTIVAR PARA EJERCICIO
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dificultad ejercicio");
        dificultadEjercicio = sc.nextFloat();
        System.out.println("Introduce puntuacion ejercicio");
        puntuacionEjercicio = sc.nextFloat();
        */


        this.puntuacionFinal = puntuacionEjercicio * dificultadEjercicio;
        System.out.println("La puntuacion es: " + getPuntuacionFinal());
        return getPuntuacionFinal();
    }

    public boolean esMayorDeEdad() {
        int edadMinima = 18;
        LocalDate fechaNacimientoLocalDate = convertirFechaNaciemiento();
        LocalDate fechaActual = LocalDate.now();
        Period periodoEntreFechas = Period.between(fechaNacimientoLocalDate, fechaActual);
        int edad = Period.ZERO.getYears();// que sera zero??
        return edad >= edadMinima;
    }

    private LocalDate convertirFechaNaciemiento() {
        // Convertir la fecha de nacimiento de Date a LocalDate
        return fechaNacimiento.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    // temas de las FECHAS
    private Date parsearFecha(String fechaNacimientoStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.parse(fechaNacimientoStr);
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
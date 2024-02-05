package model;

import org.junit.jupiter.api.*;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NadadorTest {


    Nadador nadadorPrueba1;//creo nadador sin declararlo
    Nadador nadadorPrueba2;//creo nadador sin declararlo
    Nadador nadadorPrueba3;//creo nadador sin declararlo


    @BeforeAll

    public static void inicioPruebas() {
        System.out.println("Iniciando las pruebas de clase");
    }

    @AfterAll
    public static void finPruebas() {
        System.out.println("IFinalizando las pruebas de clase");
    }

    @BeforeEach
    //antes del test creamos BeforeEach y creamos objeto para nocrearlo a cada test (es equivalente a Before de eclipse)
    public void crearNadador() {// aqui lo declaro lo creado arriba
        nadadorPrueba1 = new Nadador("Prueba1", 7.50f, 3.20f);
        nadadorPrueba2 = new Nadador("Prueba2", 3.50f, 2.00f);
        nadadorPrueba3 = new Nadador("Prueba3", 5.00f, 3.00f);
        System.out.println("Probando el beforeEach (en ecliplse es before)");
    }

    @AfterEach
    public void borraNadador() {
        nadadorPrueba1 = null;
        nadadorPrueba2 = null;
        nadadorPrueba3 = null;
        System.out.println("Fin pueba del metodo AfterEach (After en eclipse)");
    }

    @Test
    public void testPuntuacionNadador1() {

        float resultado = nadadorPrueba1.puntuacionNadador(7.50f, 3.20f);// aqui coge el metodo real
        assertEquals(24.00f, resultado, "Fallo de yo que sé");
        //compara 24 con el resultado del metodo, si la cuenta no sale igual lanza mensaje error

    }

    @Test
    public void testPuntuacionNadador2() {
        float resultado = nadadorPrueba2.puntuacionNadador(3.50f, 2.00f);
        assertEquals(7.00f, resultado, "Fallo de yo que sé");
        //si la cuenta no sale igual lanza mensaje error
    }

    @Test
    public void testPuntuacionNadador3() {
        float puntuacionFinal = nadadorPrueba2.puntuacionNadador(5.00f, 3.00f);
        assertEquals(15.00f, puntuacionFinal, "Fallo de yo que sé");
        //si la cuenta no sale igual lanza mensaje error
    }
}
package model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class NadadorTest {


    Nadador nadadorPrueba;//creo nadador sin declararlo

    @BeforeAll

    public static void inicioPruebas() {
        System.out.println("Iniciando las pruebas de clase");
    }

    @AfterAll
    public static void finPruebas() {
        System.out.println("IFinalizando las pruebas de clase");
    }

    @BeforeEach
    public void crearNadador() {// aqui lo declaro lo creado arriba
        nadadorPrueba = new Nadador("Probador", "Pruebas", 25, 7.00f, 2.50f);
        System.out.println("Probando el beforeEach (en ecliplse es before)");
    }

    @AfterEach
    public void borraNadador() {
        nadadorPrueba=null;
        System.out.println("Fin pueba del metodo");
    }
}
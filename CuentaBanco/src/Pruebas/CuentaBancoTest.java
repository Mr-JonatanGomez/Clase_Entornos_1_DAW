package Pruebas;

import Pruebas.CuentaBanco;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancoTest {

    CuentaBanco cuentaEnriquePerez;// creo objeto cuenta de quique
/*
    @BeforeClass// esto antes de crear la clase , test y anuncio las pruebas

    public static void inicioPruebas() {
        System.out.println("Iniciando las pruebas");
    }
*/
    /*
    @AfterClass //
    public static void inicioPruebas() {
        System.out.println("Iniciando las pruebas");
    }
*/

    @Before
    public void creaCuentaBanco(){
        cuentaEnriquePerez=new CuentaBanco(1500,"abc123");
        System.out.println("PROBANDO metodo BEFORE TEST");
    }

    @After
    public  void borraCuenta(){
        cuentaEnriquePerez=null;
        System.out.println("FIN PREUBA METODO");
    }



    @Test
    public void testIngresar() {
        int resultado = cuentaEnriquePerez.ingresar(500);
        assertEquals(2000, resultado, "Error en el test");//compara 2000 con resultado
    }
    @Test
    public void testIngresar2() {
        int resultado = cuentaEnriquePerez.ingresar(700);
        assertEquals(2200, resultado, "Error en el test");//compara 2000 con resultado
    }
    @Test
    public void testRetirar() {
        int resultado= cuentaEnriquePerez.retirar(500,"abc123");
        assertEquals(1000,resultado,"FALLO PRUEBA RETIRAR");
    }
}
package ejemplo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NadadorJ5ForEclipseTest {

    public static Collection<Object[]> parametros() {
        return Arrays.asList(new Object[][]{
                {25, 1, 5, 5}, {15, 2, 11, 22}, {55, 3, 7, 21}
        }
        );
    }

    @ParameterizedTest
    @MethodSource("parametros")
    public void puntuacionF(int edad, int valorEjercicio, int dificultadEjercicio, int puntuacionTotal) {
        NadadorJ5forEclipse nadador = new NadadorJ5forEclipse(edad, valorEjercicio, dificultadEjercicio);
        int puntuacionFinalTest = nadador.puntuacionFinal(valorEjercicio,dificultadEjercicio);
        assertEquals(puntuacionTotal,puntuacionFinalTest,"error al calcular");
        /////////////ESPERADA//////////ACTUAL///////////////////////MENSAJE/////////
    }

    @ParameterizedTest
    @MethodSource("parametros")
    public void esMayorEdad(int edad, int valorEjercicio, int dificultadEjercicio, int puntuacionTotal) {
        NadadorJ5forEclipse nadador = new NadadorJ5forEclipse(edad, valorEjercicio, dificultadEjercicio);
        boolean mayorEdad = nadador.permisoParticipacion(edad);
        if (edad > 17) {
            assertTrue(mayorEdad, "Es mayor de Edad");
        } else if (edad>50) {
            assertTrue(mayorEdad, "Es mayor de Edad, pero es viejo, SE AHOGARÁ si participa");
        } else {
            assertFalse(mayorEdad, "Es menor y no debe participar");
        }
    }


}

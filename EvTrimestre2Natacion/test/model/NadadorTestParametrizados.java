package model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NadadorTestParametrizados {

    @ParameterizedTest
    @MethodSource("provideNadadores")
    public void testPuntuacionFinal(Nadador nadador, float expectedPuntuacionFinal) {
        float actualPuntuacionFinal = nadador.puntuacionNadador(nadador.getPuntuacionEjercicio(), nadador.getDificultadEjercicio());
        assertEquals(expectedPuntuacionFinal, actualPuntuacionFinal, 0.01f,"Fallo");
    }

    private static Collection<Object[]> provideNadadores() {
        return Arrays.asList(new Object[][]{
                {new Nadador("Nadador1", 7.50f, 3.20f), 24.00f},
                {new Nadador("Nadador2", 7.50f, 3.00f), 22.50f},
                {new Nadador("Nadador3", 5.00f, 3.00f), 15.00f},
                {new Nadador("Nadador4", 10.0f, 3.00f), 30.00f}
                //                    (Nombre,puntuacionEjercicio,dificultadEjercicio), resultado esperado
        });
    }
}

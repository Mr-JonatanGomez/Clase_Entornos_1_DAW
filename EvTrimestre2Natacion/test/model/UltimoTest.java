package model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class UltimoTest {
    @ParameterizedTest
    @MethodSource("puntuacionNadadorTestData")
    void testPuntuacionNadador(float puntuacionEjercicio, float dificultadEjercicio, float expectedPuntuacionFinal) {
        Nadador nadador = new Nadador();
        float puntuacionFinal = nadador.puntuacionNadador(puntuacionEjercicio, dificultadEjercicio);
        assertEquals(expectedPuntuacionFinal, puntuacionFinal);
    }

    static Stream<Arguments> puntuacionNadadorTestData() {
        return Stream.of(
                Arguments.of(5.0f, 1.5f, 7.5f),
                Arguments.of(7.0f, 2.0f, 14.0f),
                Arguments.of(6.0f, 1.0f, 6.0f)
        );
    }

    @ParameterizedTest
    @MethodSource("esMayorDeEdadTestData")
    void testEsMayorDeEdad(int edad, boolean expected) {
        Nadador nadador = new Nadador();
        nadador.setEdad(edad);
        boolean result = nadador.esMayorDeEdad(nadador);
        assertEquals(expected, result);
    }

    static Stream<Arguments> esMayorDeEdadTestData() {
        return Stream.of(
                Arguments.of(20, true),
                Arguments.of(17, false),
                Arguments.of(18, true)
        );
    }
}

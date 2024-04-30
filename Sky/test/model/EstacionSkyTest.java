package model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class EstacionSkyTest {
    private String nombre;
    private int numeroPistas;
    private int numeroEsquiadores;
    private int recaudacionTotalDia;


    public EstacionSkyTest(String nombre, int numeroPistas, int numeroEsquiadores, int recaudacionTotalDia) {
        this.nombre = nombre;
        this.numeroPistas = numeroPistas;
        this.numeroEsquiadores = numeroEsquiadores;
        this.recaudacionTotalDia = recaudacionTotalDia;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Soto",5,21,1050},{"Soto9",9,10,500},{"Rey",5,3,122}
        });
    }

    @Test
    public void totalRecaudado() {
        EstacionSky estacionSky= new EstacionSky(nombre,numeroPistas,numeroEsquiadores);
        int resultados = estacionSky.calcularRecaudacion(numeroEsquiadores);
        assertEquals("Error en los calculos", resultados, recaudacionTotalDia);
    }
}
package com.tuempresa.vehiculos;

import static org.junit.jupiter.api.Assertions.*;

import java.main.tuempresa.vehiculos.Accesorio;

import org.junit.jupiter.api.Test;
public class AccesorioTest {

    @Test
    public void testConstructorAndGetDescripcion() {
        Accesorio accesorio = new Accesorio("Rieles de techo");

        assertEquals("Rieles de techo", accesorio.getDescripcion());
    }

    @Test
    public void testImprimir() {
        Accesorio accesorio = new Accesorio("Parlantes traseros");

        assertEquals("Accesorio: Parlantes traseros", accesorio.getDescripcion());
    }
}

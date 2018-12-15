package br.com.test.driven.development.tddlessons;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConversorDeNumeroRomanoTest {

    @Test
    public void deveEntenderOSimboloI() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("I");
        assertEquals(1, numero);
    }

    @Test
    public void deveEntenderOSimboloV() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("V");
        assertEquals(5, numero);
    }
}
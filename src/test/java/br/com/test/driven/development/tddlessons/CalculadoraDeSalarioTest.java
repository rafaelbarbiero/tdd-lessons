package br.com.test.driven.development.tddlessons;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraDeSalarioTest {

    @Test
    public void
    deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        Funcionario desenvolvedor = new Funcionario
                ("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);
        double salario = calculadora.calculaSalario(desenvolvedor);
        assertEquals(1500.0 * 0.9, salario, 0.00001);
    }
}
package br.com.test.driven.development.tddlessons;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraDeSalarioTest {
    @Test
    public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        Funcionario desenvolvedor = new Funcionario
                ("Mauricio", 500.0, Cargo.DBA);
        double salario = calculadora.calculaSalario(desenvolvedor);
        assertEquals(500.0 * 0.85, salario, 0.00001);
    }
}
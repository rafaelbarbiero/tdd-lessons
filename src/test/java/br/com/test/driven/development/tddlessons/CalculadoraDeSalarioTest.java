package br.com.test.driven.development.tddlessons;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraDeSalarioTest {
    @Test
    public void
    deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        Funcionario desenvolvedor = new Funcionario
                ("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);
        double salario = calculadora.calculaSalario(desenvolvedor);
        assertEquals(4000.0 * 0.8, salario, 0.00001);
    }

}
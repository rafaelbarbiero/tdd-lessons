package br.com.test.driven.development.tddlessons;

public class CalculadoraDeSalario {

    public double calculaSalario(Funcionario funcionario) {
        return funcionario.getSalario() * 0.9;
    }
}

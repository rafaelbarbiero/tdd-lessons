package br.com.test.driven.development.tddlessons;

public class CalculadoraDeSalario {
    public double calculaSalario(Funcionario funcionario) {
        if(funcionario.getSalario() > 3000) return 3200.0;
        return 1350.0;
    }
}

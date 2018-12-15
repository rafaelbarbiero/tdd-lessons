package br.com.test.driven.development.tddlessons;

public class Produto {

    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
}

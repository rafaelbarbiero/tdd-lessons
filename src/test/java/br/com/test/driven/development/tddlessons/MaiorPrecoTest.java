package br.com.test.driven.development.tddlessons;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaiorPrecoTest {

    @Test
    public void deveRetornarZeroSeCarrinhoVazio() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        MaiorPreco algoritmo = new MaiorPreco();
        double valor = algoritmo.encontra(carrinho);
        assertEquals(0.0, valor, 0.0001);
    }
}
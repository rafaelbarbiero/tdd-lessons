package br.com.test.driven.development.tddlessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaiorPrecoTest {

    CarrinhoDeCompras carrinho;

    @Before
    public void inicializa() {
        this.carrinho = new CarrinhoDeCompras();
    }

    @Test
    public void deveRetornarZeroSeCarrinhoVazio() {
        double valor = carrinho.maiorValor();
        assertEquals(0.0, valor, 0.0001);
    }

    @Test
    public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        double valor = carrinho.maiorValor();
        assertEquals(900.0, valor, 0.0001);
    }

    @Test
    public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        carrinho.adiciona(new Item("Fogão", 1, 1500.0));
        carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));
        double valor = carrinho.maiorValor();
        assertEquals(1500.0, valor, 0.0001);
    }
}
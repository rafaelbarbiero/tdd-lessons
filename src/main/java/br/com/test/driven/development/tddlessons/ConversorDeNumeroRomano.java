package br.com.test.driven.development.tddlessons;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeNumeroRomano {
    private static Map<String, Integer> tabela = new HashMap<String, Integer>() {{
        put("I", 1);
        put("II", 2);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};

    public int converte(String numeroEmRomano) {
        int acumulador = 0;
        for(int i = 0; i < numeroEmRomano.length(); i++) {
            acumulador += tabela.get(String.valueOf(numeroEmRomano.charAt(i)));
        }
        return acumulador;
    }
}

package com.magnorion.loja.tests;

import com.magnorion.loja.models.Comida;

public class ComidaTest {
    public static void main(String[] args) {
        Comida feijoada = new Comida("feijoada", 5.5);
        Comida strogonoff = new Comida("Strogonoff", 17.5);
        Comida risotto = new Comida("Risotto", 20.5);

        System.out.println(feijoada.toString());
        System.out.println(strogonoff.toString());
        System.out.println(risotto.toString());
    }
}

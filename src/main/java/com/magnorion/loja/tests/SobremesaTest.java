package com.magnorion.loja.tests;

import com.magnorion.loja.models.Sobremesa;

public class SobremesaTest {
    public static void main(String[] args) {
        Sobremesa pudim = new Sobremesa("Pudim de leite", 10.0);
        Sobremesa tortaCholate = new Sobremesa("Torta de Chocolate", 12.0);
        Sobremesa rosquinha = new Sobremesa("Rosquinha de leite", 5.5);

        System.out.println(pudim.toString());
        System.out.println(tortaCholate.toString());
        System.out.println(rosquinha.toString());
    }
}

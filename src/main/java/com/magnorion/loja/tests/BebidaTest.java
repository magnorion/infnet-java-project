package com.magnorion.loja.tests;

import com.magnorion.loja.models.Bebida;

public class BebidaTest {
    public static void main(String[] args) {
        Bebida bebidaUva = new Bebida("Tang sabor uva", "Uva");
        Bebida bebidaLaranja = new Bebida("Tang sabor Laranja", "Laranja");
        Bebida bebidaMelancia = new Bebida("Tang sabor Melancia", "Melancia");

        System.out.println(bebidaUva.toString());
        System.out.println(bebidaLaranja.toString());
        System.out.println(bebidaMelancia.toString());
    }
}

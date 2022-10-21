package com.magnorion.loja.models;

public class Bebida {
    private String nome;
    private String sabor;

    public Bebida(String nome, String sabor) {
        this.nome = nome;
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return this.nome + "," + this.sabor;
    }
}

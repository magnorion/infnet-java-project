package com.magnorion.loja.models;

public class Comida {
    private String nome;
    private Double valor;

    public Comida(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.nome + ", valor: " + this.valor.toString();
    }
}

package com.company;

class Carta{
    private String naipe;
    private String valor;

    public Carta(String valor, String naipe){
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.valor + " de " + this.naipe;
    }
}
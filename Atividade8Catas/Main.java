package com.company;

public class Main {
    public static void main (String[]args){

        DeckDeCartas deck = new DeckDeCartas();
        deck.embaralhar();

        System.out.println( deck.distribuir() );
    }
}
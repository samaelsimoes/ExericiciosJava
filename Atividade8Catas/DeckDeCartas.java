package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

class DeckDeCartas{
    private List<Carta> monte;
    private Integer cartaAtual;

    private final Integer TOTAL_DE_CARTAS = 52;
    private final List<String> VALORES = Arrays.asList(
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");

    private final List<String> NAIPES = Arrays.asList(
            "♠︎", "♣︎", "♥︎", "♦︎"
    );

    public DeckDeCartas(){
        this.cartaAtual = 0;
        this.monte = new ArrayList<>(TOTAL_DE_CARTAS);

        NAIPES.forEach(naipe -> {
            VALORES.forEach(valor -> {
                Carta carta = new Carta(valor, naipe);
                monte.add(carta);
            });
        });
    }
    public void embaralhar(){
        Collections.shuffle(monte);
    }

    public Carta distribuir(){
        Carta carta = monte.get(0);
        cartaAtual = cartaAtual + 1;
        monte.remove(0);
        return carta;
    }
}

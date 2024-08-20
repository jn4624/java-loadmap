package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>();

    public Deck() {
        init();
    }

    private void init() {
        for (Suit value : Suit.values()) {
            for (int i = 1; i <= 13; i++) {
                cards.add(new Card(i, value));
            }
        }
        shuffle();
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.removeFirst();
    }
}

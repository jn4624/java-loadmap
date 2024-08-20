package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private final List<Card> myCard;

    public Player(String name) {
        this.name = name;
        this.myCard = new ArrayList<>();
    }

    public void drawCard(Deck deck) {
        myCard.add(deck.drawCard());
    }

    public String getName() {
        return name;
    }

    public int getSumRank() {
        int sum = 0;
        for (Card card : myCard) {
            sum += card.getRank();
        }
        return sum;
    }

    public void print() {
        System.out.println(this.name + "의 카드: " + myCard + ", 합계: " + getSumRank());
    }
}

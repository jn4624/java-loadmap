package collection.compare.test;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.print();
        player2.print();

        Player winner = getWinner(player1, player2);
        if (winner != null) {
            System.out.println(winner.getName() + " 승리");
        } else {
            System.out.println("무승부");
        }
    }

    private static Player getWinner(Player player1, Player player2) {
        int sumRank1 = player1.getSumRank();
        int sumRank2 = player2.getSumRank();

        if (sumRank1 < sumRank2) {
            return player2;
        } else if (sumRank1 > sumRank2) {
            return player1;
        } else {
            return null;
        }
    }
}

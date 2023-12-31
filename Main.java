package blackjack;

import blackjack.interfaces.IBlackJack;
import blackjack.interfaces.IPlayer;

public class Main {

    public static void main(String[] args) {

        IBlackJack game = new BlackJack();
        IPlayer dealer = new Dealer();
        IPlayer pavel = new Player("Павел");
        IPlayer alex = new Player("Алексей");
        IPlayer vera = new Player("Вероника");

        game.addPlayerToGame(dealer);
        game.addPlayerToGame(pavel);
        game.addPlayerToGame(vera);
        game.addPlayerToGame(alex);

        game.dealThoCards();

        game.addCardsToPlayers();

        game.printWinner();
    }
}
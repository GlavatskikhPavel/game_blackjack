package blackjack.interfaces;

public interface IBlackJack {
    void dealThoCards();

    void addCardsToPlayers();

    void printWinner();

    void addPlayerToGame(IPlayer player);
}

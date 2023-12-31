package blackjack.interfaces;

public interface IPlayer {
    void addCardToHand(ICard card);

    boolean isNeedAnotherCard();

    void openCards ();

    int countValues();

    String getName();
}

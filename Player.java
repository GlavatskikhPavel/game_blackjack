package blackjack;

import blackjack.interfaces.ICard;
import blackjack.interfaces.IPlayer;
import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {
    private String name;

    private ArrayList<ICard> cards = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addCardToHand(ICard card) {
        cards.add(card);
    }

    /**
     * Нужна ли еще карта ?
     */
    @Override
    public boolean isNeedAnotherCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Карты на руках:");
        openCards();
        System.out.println(getName() + ", нужна ли еще карта ?");
        String input = scanner.nextLine();
        if ("да".equalsIgnoreCase(input)) {
            return true;
        }
        return false;
    }

    /**
     * Открыть все карты.
     */
    @Override
    public void openCards() {
        for (ICard card : cards) {
            card.open();
        }
    }

    /**
     * Подсчитать количество очков на руках.
     */
    @Override
    public int countValues() {
        int points = 0;
        for (ICard card : cards) {
            points += card.getValue();
        }
        return points;
    }
}

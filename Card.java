package blackjack;

import blackjack.interfaces.ICard;

public class Card implements ICard {
    private String name;

    private int value;

    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    @Override
    public void open() {
        System.out.println(name);
    }

    @Override
    public int getValue() {
        return value;
    }
}

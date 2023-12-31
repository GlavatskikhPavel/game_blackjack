package blackjack;

import blackjack.interfaces.IDealer;

public class Dealer extends Player implements IDealer {
    public Dealer() {
        super("Крупье");
    }

    /**
     * Нужна ли еще карта ?
     */
    @Override
    public boolean isNeedAnotherCard() {
        return countValues() < 17;
    }
}

package blackjack;

import blackjack.interfaces.IBlackJack;
import blackjack.interfaces.IDeck;
import blackjack.interfaces.IPlayer;

import java.util.ArrayList;
import java.util.Collection;

public class BlackJack implements IBlackJack {
    private IDeck deck;

    private ArrayList<IPlayer> players = new ArrayList<>();

    public BlackJack() {
        deck = new Deck();
    }

    /**
     * Раздать всем игрокам карты.
     */
    @Override
    public void dealThoCards() {
        for (IPlayer player : players) {
            player.addCardToHand(deck.getRandomCard());
            player.addCardToHand(deck.getRandomCard());
        }
    }

    /**
     * Раздать дополнительные карты.
     */
    @Override
    public void addCardsToPlayers() {
        for (IPlayer player : players) {
            while (player.isNeedAnotherCard()) {
                player.addCardToHand(deck.getRandomCard());
            }
        }
    }

    /**
     * Определить победителя.
     */
    @Override
    public void printWinner() {
        // Коллекция игроков у кого не перебор.
        ArrayList<IPlayer> notBustPlayers = new ArrayList<>();

        // Проверяем у кого не перебор добавляем в коллекцию.
        for (IPlayer player : players) {
            if (player.countValues() < 22) {
                notBustPlayers.add(player);
            }
        }

        // Проверка ! Если не у кого нет. То победитель крупье.
        if (notBustPlayers.size() == 0) {
            System.out.println("Победить крупье.");
            return;
        }

        // Если игрок один. То мы получаем его из коллекции по индексу ноль. Выводим что победить он.
        if (notBustPlayers.size() == 1) {
            IPlayer player = notBustPlayers.get(0);
            System.out.println("Победитель: " + player.getName());
            player.openCards();
            return;
        }

        // Кто из игроков набрал максимальное количество очков!
        int winnerValue = getWinnerValue(notBustPlayers);

        // Выведем тех у кого максимальное количество игроков.
        for (IPlayer player : notBustPlayers) {
            if (winnerValue == player.countValues()) {
                System.out.println("Победитель: " + player.getName());
                player.openCards();
            }
        }
    }

    /**
     * Подсчитать очки среди тех кто остался.
     */
    private int getWinnerValue(Collection<IPlayer> players) {
        int result = 0;
        for (IPlayer player : players) {
            int points = player.countValues();
            if (points > result) {
                result = points;
            }
        }
        return result;
    }

    /**
     * Добавляет игрока в игру
     */
    @Override
    public void addPlayerToGame(IPlayer player) {
        players.add(player);
    }
}

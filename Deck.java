package blackjack;

import blackjack.interfaces.IDeck;

public class Deck implements IDeck {

    private Card[] cards = new Card[52];

    /**
     * Создание колоды.
     */
    public Deck(){
        cards[0] = new Card("Двойка треф", 2);
        cards[1] = new Card("Двойка бубен", 2);
        cards[2] = new Card("Двойка червей", 2);
        cards[3] = new Card("Двойка пик", 2);

        cards[4] = new Card("Тройка треф", 3);
        cards[5] = new Card("Тройка бубен", 3);
        cards[6] = new Card("Тройка червей", 3);
        cards[7] = new Card("Тройка пик", 3);

        cards[8] = new Card("Четверка треф", 4);
        cards[9] = new Card("Четверка бубен", 4);
        cards[10] = new Card("Четверка червей", 4);
        cards[11] = new Card("Четверка пик", 4);

        cards[12] = new Card("Пятерка треф", 5);
        cards[13] = new Card("Пятерка бубен", 5);
        cards[14] = new Card("Пятерка червей", 5);
        cards[15] = new Card("Пятерка пик", 5);

        cards[16] = new Card("Шестерка треф", 6);
        cards[17] = new Card("Шестерка бубен", 6);
        cards[18] = new Card("Шестерка червей", 6);
        cards[19] = new Card("Шестерка пик", 6);

        cards[20] = new Card("Семерка треф", 7);
        cards[21] = new Card("Семерка бубен", 7);
        cards[22] = new Card("Семерка червей", 7);
        cards[23] = new Card("Семерка пик", 7);

        cards[24] = new Card("Восьмерка треф", 8);
        cards[25] = new Card("Восьмерка бубен", 8);
        cards[26] = new Card("Восьмерка червей", 8);
        cards[27] = new Card("Восьмерка пик", 8);

        cards[28] = new Card("Девятка треф", 9);
        cards[29] = new Card("Девятка бубен", 9);
        cards[30] = new Card("Девятка червей", 9);
        cards[31] = new Card("Девятка пик", 9);

        cards[32] = new Card("Десятка треф", 10);
        cards[33] = new Card("Десятка бубен", 10);
        cards[34] = new Card("Десятка червей", 10);
        cards[35] = new Card("Десятка пик", 10);

        cards[36] = new Card("Валет треф", 10);
        cards[37] = new Card("Валет бубен", 10);
        cards[38] = new Card("Валет червей", 10);
        cards[39] = new Card("Валет пик", 10);

        cards[40] = new Card("Дама треф", 10);
        cards[41] = new Card("Дама бубен", 10);
        cards[42] = new Card("Дама червей", 10);
        cards[43] = new Card("Дама пик", 10);

        cards[44] = new Card("Король треф", 10);
        cards[45] = new Card("Король бубен", 10);
        cards[46] = new Card("Король червей", 10);
        cards[47] = new Card("Король пик", 10);

        cards[48] = new Card("Туз треф", 11);
        cards[49] = new Card("Туз бубен", 11);
        cards[50] = new Card("Туз червей", 11);
        cards[51] = new Card("Туз пик", 11);
    }

    /**
     * Колода отдает одну карту.
     */
    @Override
    public Card getRandomCard(){
         int index = (int) ((Math.random()*(52)));
         Card card = cards [index];
         return card;
    }
}

package Chap_05;


public class BlackjackHand extends Hand {
    public int getBlackjackValue() {
        int blackjackValue = 0;
        for (Card card : getCards()) {
            blackjackValue += card.getValue();
        }
        return blackjackValue;
    }

    public void showCards() {
        for (Card card : getCards()) {
            System.out.println(card);
        }
    }
}

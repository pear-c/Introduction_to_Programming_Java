package Chap_05;

public class Deck {
    private Card[] cards;   // 52장 카드 저장
    private int check = 0;  // 사용된 카드 체크용

    // 52장 카드 생성
    public Deck() {
        cards = new Card[52];
        int index = 0;
        for(int i=0; i<4; i++) {
            for(int j=1; j<=13; j++) {
                cards[index] = new Card(i, j);
                index++;
            }
        }
    }

    // 사용된 모든 카드 덱에 다시 넣고, 셔플
    public void shuffle(){
        for(int i=0; i<cards.length; i++) {
            int randomIndex = (int)(Math.random()*(i+1));
            Card temp = cards[randomIndex];
            cards[randomIndex] = cards[i];
            cards[i] = temp;
        }
        check = 0;
    }

    // 덱에서 맨 앞에서 부터 딜
    public Card dealCard() {
        if(cardsLeft() == 0) {
            throw new IllegalStateException("Deck is empty");
        }
        return cards[check++];
    }

    public int cardsLeft() {
        return cards.length - check;
    }
}

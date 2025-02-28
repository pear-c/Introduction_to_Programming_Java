package Chap_05;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    // 초기 핸드
    public Hand() {
        cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    // 손 패에 카드 추가
    public void addCard(Card c) {
        if(c != null) {
            cards.add(c);
        } else {
            throw new NullPointerException("Card must not be null");
        }
    }

    // 지정된 위치의 카드 제거
    public void removeCard(int position) {
        cards.remove(position+1);
    }

    // 손패 카드 수 반환
    public int getCardCount() {
        return cards.size();
    }

    // 무늬 기준 정렬
    public void sortBySuit() {
        cards.sort((c1, c2) -> c1.getSuitAsString().compareTo(c2.getSuitAsString()));
    }

    // 값 기준 정렬
    public void sortByRank() {
        cards.sort((c1, c2) -> c1.getValueAsString().compareTo(c2.getValueAsString()));
    }
}

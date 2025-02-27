package Chap_05;

public class Card {
    public final static int SPADES = 0; // 스페이드
    public final static int HEARTS = 1; // 하트
    public final static int DIAMONDS = 2;   // 다이아몬드
    public final static int CLUBS = 3;  // 클럽

    public final static int ACE = 1;    // 에이스
    public final static int JACK = 11;  // 잭
    public final static int QUEEN = 12; // 퀸
    public final static int KING = 13;  // 킹

    private final int suit;
    private final int value;

    public Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuitAsString() {
        return switch (suit) {
            case SPADES -> "Spades";
            case HEARTS -> "Hearts";
            case DIAMONDS -> "Diamonds";
            case CLUBS -> "Clubs";
            default -> null;
        };
    }

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getValueAsString() {
        return switch (value) {
            case ACE -> "Ace";
            case 2 -> "2";
            case 3 -> "3";
            case 4 -> "4";
            case 5 -> "5";
            case 6 -> "6";
            case 7 -> "7";
            case 8 -> "8";
            case 9 -> "9";
            case 10 -> "10";
            case JACK -> "Jack";
            case QUEEN -> "Queen";
            case KING -> "King";
            default -> null;
        };
    }

    public String toString() {
        return getValueAsString() + " of " + getSuitAsString();
    }
}

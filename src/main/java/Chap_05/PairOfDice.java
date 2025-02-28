package Chap_05;

public class PairOfDice {
    private int die1;
    private int die2;

    public PairOfDice() {
    }

    public PairOfDice(int value1, int value2) {
        die1 = value1;
        die2 = value2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public void roll() {
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }

    public int rollCount(int target) {
        int count = 0;

        while(true) {
            roll();

            if((die1 + die2) == target)
                return count;
            count++;

            roll();
        }
    }

    @Override
    public String toString() {
        return "[" + die1 + ", " + die2 + "]";
    }
}

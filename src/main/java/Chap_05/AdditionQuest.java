package Chap_05;

public class AdditionQuest implements IntQuestion {
    private int a, b;

    public AdditionQuest() {
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }

    @Override
    public String getQuestion() {
        return "What is " + a + " + " + b + " ? ";
    }
    @Override
    public int getCorrectAnswer() {
        return a + b;
    }
}

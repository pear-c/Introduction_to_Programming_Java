package Chap_05;

public class SubtractionQuest implements IntQuestion{
    private int a, b;

    public SubtractionQuest(int a, int b) {
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }

    @Override
    public String getQuestion() {
        return "What is " + a + " - " + b + " ? ";
    }

    @Override
    public int getCorrectAnswer() {
        return a - b;
    }
}

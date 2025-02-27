package Chap_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                이 프로그램은 사용자가 간단한 카드 게임
                HighLow를 플레이할 수 있도록 합니다. 덱에서 카드가
                한 장 나옵니다. 사용자는 다음 카드가 더 높을지
                낮을지 예측해야 합니다. 게임 점수는 틀리기 전까지
                맞힌 예측의 수입니다.
                """);

        int gamesPlayed = 0;     // 사용자가 플레이한 게임 수.
        int sumOfScores = 0;     // 모든 게임에서 얻은 점수의 합.
        double averageScore;     // sumOfScores를 gamesPlayed로 나누어 계산한 평균 점수.
        boolean playAgain;       // 사용자가 또 다른 게임을 할지 여부를 기록.

        do {
            int scoreThisGame;      // 한 게임의 점수
            scoreThisGame = play(); // 게임을 플레이하고 점수를 얻음
            sumOfScores += scoreThisGame;
            gamesPlayed++;
            System.out.print("다시 플레이 하시겠습니까? ");
            playAgain = sc.nextBoolean();
        } while(playAgain);

        averageScore = ((double)sumOfScores / gamesPlayed);

        System.out.println();
        System.out.println("총 " + gamesPlayed + " 게임을 플레이했습니다.");
        System.out.printf("평균 점수는 %1.3f입니다.\\n", averageScore);
    }

    static int play() {
        Scanner sc = new Scanner(System.in);

        Deck deck = new Deck(); // 새 덱 생성
        Card currentCard;       // 사용자가 보는 현재 카드
        Card nextCard;          // 덱의 다음 카드
        int correctGuesses = 0;     // 사용자가 올바르게 예측한 횟수
        char guess;             // 사용자의 예측 (H or L)

        // 게임 시작 전 셔플
        deck.shuffle();
        currentCard = deck.dealCard();
        System.out.println("첫 번째 카드는 " + currentCard + "입니다.");

        while(true) {
            System.out.print("다음 카드가 더 높을까요(H) 아니면 더 낮을까요(L) ? ");
            do {
                guess = sc.next().charAt(0);
                guess = Character.toUpperCase(guess);
                if(guess != 'H' && guess != 'L') {
                    System.out.println("H 또는 L로 답해주세요: ");
                }
            } while (guess != 'H' && guess != 'L');

            // 다음 카드를 보여줌
            nextCard = deck.dealCard();
            System.out.println("다음 카드는 " + nextCard + "입니다.");

            // 예측 결과 확인
            if(nextCard.getValue() == currentCard.getValue()) {
                System.out.println("이전 카드와 값이 같습니다.");
                System.out.println("무승부에서는 패배로 간주합니다. 죄송합니다!");
                break;  // 게임 종료
            }
            else if(nextCard.getValue() > currentCard.getValue()) {
                if(guess == 'H') {
                    System.out.println("예측이 정확했습니다.");
                    correctGuesses++;
                }
                else {
                    System.out.println("예측이 틀렸습니다.");
                    break;
                }
            }
            else {
                if(guess == 'L') {
                    System.out.println("예측이 정확했습니다.");
                    correctGuesses++;
                }
                else {
                    System.out.println("예측이 틀렸습니다.");
                    break;
                }
            }

            currentCard = nextCard;
            System.out.println();
            System.out.println("현재 카드는 " + currentCard + "입니다.");
        }

        System.out.println();
        System.out.println("게임이 끝났습니다.");
        System.out.println("총 " + correctGuesses + "번의 올바른 예측을 했습니다.");
        System.out.println();

        return correctGuesses;
    }
}

package Chap_05;

import java.util.Scanner;

public class Exercise_5 {
    // 연습문제 5.1 : PairOfDice 클래스를 이용하여 SnakeEyes 가 얼마만에 나왔는지 구하시오
    static void Problem01() {
        PairOfDice dice = new PairOfDice();

        int count = 0;
        while(true) {
            if(dice.getDie1() == 1 && dice.getDie2() == 1) {
                System.out.println(dice);
                System.out.println(count);
                break;
            }
            dice.roll();
            System.out.println(dice);
            count++;
        }
    }


    // 연습문제 5.2: StatClac를 생성하여 항목 중 가장 큰 값과 가장 작은 값을 반환하도록 테스트
    static void Problem02() {
        Scanner sc = new Scanner(System.in);

        StatCalc calc = new StatCalc();
        while(true) {
            System.out.print("데이터 셋 입력: ");
            double n = sc.nextDouble();
            if(n == 0)  break;

            calc.enter(n);
        }

        System.out.println("입력 데이터 셋 개수: " + calc.getCount());
        System.out.println("총합: " + calc.getSum());
        System.out.println("평균: " + calc.getMean());
        System.out.println("표준 편차: " + calc.getStandardDeviation());
        System.out.println("최댓값: " + calc.getMax());
        System.out.println("최솟값: " + calc.getMin());
    }

    // 연습문제 5.3: 주사위를 10000번 굴리고, 각 합계(2~12) 까지의 평균 롤 횟수, 표준 편차, 최대 롤 횟수 출력
    static void Problem03() {
        System.out.println("Total On Dice      Average Number of Rolls             표준 편차                 최대 롤 횟수");
        System.out.println("-------------      -----------------------         ---------------          ---------------");
        for(int i=2; i<=12; i++) {
            // 다이스, 데이터셋 생성
            PairOfDice dice = new PairOfDice();
            StatCalc calc = new StatCalc();

            for(int j=0; j<10000; j++) {
                calc.enter(dice.rollCount(i));
            }
            System.out.printf("     %2d                  %f                   %11f               %5.0f\n", i, calc.getMean(), calc.getStandardDeviation(), calc.getMax());
        }
    }

    // 연습문제 5.4: BlackjackHand 클래스 생성.
    static void Problem04() {
        Scanner sc = new Scanner(System.in);

        Deck deck;
        Card card;
        BlackjackHand hand;
        int cardsInHand;
        boolean again;

        deck = new Deck();

        do {
            deck.shuffle();
            hand = new BlackjackHand();
            cardsInHand = (int)(Math.random() * 5) + 2;
            System.out.println();
            System.out.println();
            System.out.println("Hand contains: ");
            for(int i=1; i<=cardsInHand; i++) {
                card = deck.dealCard();
                hand.addCard(card);
                System.out.println("  " + card);
            }
            System.out.println("Value of hand is " + hand.getBlackjackValue());
            System.out.println();
            System.out.println("Again? ");
            again = sc.nextBoolean();
        } while(again);
    }

    // 연습문제 5.5: 블랙잭 프로그램 (21에 최대한 가깝게 모으기)
    // 1) 카드 두 장씩 가짐(딜러, 플레이어) -> 이때, 핸드 값 21인 사람 승리 (단, 동점일 경우 딜러 승)
    // 2) 아무도 블랙잭 없다면 사용자에게 카드 추가 기회. -> Hit / Stand
    // 3) Hit : 사용자가 카드 한장 더 받음 -> Hit / Stand 선택
    // 4) Stand : 딜러 카드 총합이 16이하면 17넘을 때까지 딜러가 Hit. 이때 21 초과하면 사용자가 승리
    // 5) 둘다 버스트 X -> 21에 가까운 사람이 승리
    static int betMoney;
    static int money;
    static void Problem05() {
        Scanner sc = new Scanner(System.in);

        money = 100;
        boolean again = true;

        // 게임 시작
        while(money > 0) {
            if(!again) {
                break;
            }
            play();
            System.out.println();
            System.out.print("계속 하시겠습니까? (true/false): ");
            again = sc.nextBoolean();
        }
        System.out.println("게임 종료!");
        System.out.println("보유 머니: " + money);
    }
    static void play() {
        Scanner sc = new Scanner(System.in);

        Deck deck;
        Card card;
        BlackjackHand dealer, player;

        deck = new Deck();

        // 게임 시작
        A: while(true) {
            deck.shuffle();
            dealer = new BlackjackHand();
            player = new BlackjackHand();
            System.out.println("-------------게임 시작-----------------");
            System.out.print("보유 머니 (" + money + "$) / 베팅 금액: ");
            betMoney = sc.nextInt();

            // 1. 카드 2장씩 각각 배분
            for(int i=0; i<2; i++) {
                player.addCard(deck.dealCard());
                dealer.addCard(deck.dealCard());
                if(player.getBlackjackValue() > 21) {
                    System.out.println("게임 종료 : 패배 -> 당신은 버스트 되었습니다.");
                    System.out.println("<현재 카드>");
                    player.showCards();
                    money -= betMoney;
                    System.out.println("베팅 금액을 잃습니다. 보유머니 (" + money + "$)");
                    break A;
                }
                if(dealer.getBlackjackValue() > 21) {
                    System.out.println("게임 종료 : 승리 -> 딜러가 버스트 되었습니다.");
                    money += betMoney;
                    System.out.println("베팅 금 확보. 보유머니 (" + money + "$)");
                    break A;
                }
            }
            // 승패 결정 확인 (딜러가 블랙잭이면 게임 종료. -> 패배)
            if(dealer.getBlackjackValue() == 21) {
                System.out.println("게임 종료 : 패배 -> 딜러의 카드가 블랙잭입니다.");
                money -= betMoney;
                System.out.println("베팅 금액을 잃습니다. 보유머니 (" + money + "$)");
                break;
            }
            // 딜러가 블랙잭이 아닐 때
            else {
                // 플레이어가 블랙잭이면 게임 승리
                if(player.getBlackjackValue() == 21) {
                    System.out.println("게임 종료 : 승리 -> 플레이어의 카드가 블랙잭입니다.");
                    money += betMoney;
                    System.out.println("베팅 금 확보. 보유머니 (" + money + "$)");
                    break;
                }
                // 2. 둘다 블랙잭이 아닐 때, Hit / Stand 선택
                else {
                    System.out.println();
                    System.out.println("<현재 카드>");
                    player.showCards();
                    System.out.println();

                    // Hit / Stand 선택
                    System.out.print("Hit or Stand? -> ");
                    String input = sc.next();

                    // 3. Hit 선택
                    while(!input.equals("Stand")) {
                        player.addCard(deck.dealCard());
                        System.out.println();
                        if(player.getBlackjackValue() > 21) {
                            System.out.println("게임 종료 : 패배 -> 당신은 버스트 되었습니다.");
                            System.out.println("<현재 카드>");
                            player.showCards();
                            money -= betMoney;
                            System.out.println("베팅 금액을 잃습니다. 보유머니 (" + money + "$)");
                            break A;
                        }
                        else if(player.getBlackjackValue() == 21) {
                            System.out.println("<현재 카드>");
                            player.showCards();
                            System.out.println("당신은 블랙잭 입니다. 딜러의 차례를 기다리세요.");
                            System.out.println();
                            break;
                        }
                        System.out.println("<현재 카드>");
                        player.showCards();
                        System.out.print("Hit or Stand? -> ");
                        input = sc.next();
                    }

                    // 4. Stand 선택
                    System.out.println();
                    System.out.println("<딜러가 카드를 뽑는 중입니다...>");
                    System.out.println();
                    while(dealer.getBlackjackValue() < 17) {
                        dealer.addCard(deck.dealCard());
                        if(dealer.getBlackjackValue() > 21) {
                            System.out.println("게임 종료 : 승리 -> 딜러가 버스트 되었습니다.");
                            money += betMoney;
                            System.out.println("베팅 금 확보. 보유머니 (" + money + "$)");
                            break A;
                        }
                        else if(dealer.getBlackjackValue() == 21) {
                            System.out.println("게임 종료 : 패배 -> 딜러의 카드가 블랙잭입니다.");
                            money -= betMoney;
                            System.out.println("베팅 금액을 잃습니다. 보유머니 (" + money + "$)");
                            break A;
                        }
                    }

                    // 5. 결과 확인
                    int dealerScore = Math.abs(21 - dealer.getBlackjackValue());
                    int playerScore = Math.abs(21 - player.getBlackjackValue());
                    if(playerScore > dealerScore) {
                        System.out.println("게임 종료 : 패배");
                        System.out.println("플레이어 카드: " + player.getBlackjackValue() + " / 딜러 카드: " + dealer.getBlackjackValue());
                        money -= betMoney;
                        System.out.println("베팅 금액을 잃습니다. 보유머니 (" + money + "$)");
                        break;
                    }
                    else {
                        System.out.println("게임 종료 : 승리");
                        System.out.println("플레이어 카드: " + player.getBlackjackValue() + " / 딜러 카드: " + dealer.getBlackjackValue());
                        money += betMoney;
                        System.out.println("베팅 금 확보. 보유머니 (" + money + "$)");
                        break;
                    }
                }
            }
        }
    }

    static void Problem06() {
        for(int i=0; i<10; i++) {
            AdditionQuest quest = new AdditionQuest();
            System.out.println(quest.getQuestion());
        }
    }


    public static void main(String[] args) {
        Problem06();
    }
}

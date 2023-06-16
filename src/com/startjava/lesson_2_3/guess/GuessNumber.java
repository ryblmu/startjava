package src.com.startjava.lesson_2_3.guess;

import java.util.Scanner;
import src.com.startjava.lesson_2_3.person.Player;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int unknownNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        unknownNum = (int) (1 + Math.random() * (100 + 1));
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ход игрока под именем " + player1.getName());
            player1.setNum(scanner.nextInt());
            
            if (player1.getNum() == unknownNum) {
                System.out.println("Победил первый игрок по имени " + player1.getName());
                break;
            }

            if (player1.getNum() < unknownNum) {
                System.out.println("Число " + player1.getNum() + 
                        " меньше того, что загадал компьютер, ход переходит ко второму игроку " +
                        player2.getName());
            } else {
                System.out.println("Число " + player1.getNum() + 
                        " больше того, что загадал компьютер, ход переходит ко второму игроку " +
                        player2.getName());
            }

            System.out.println("Ход игрока под именем " + player2.getName());
            player2.setNum(scanner.nextInt());

            if (player2.getNum() == unknownNum) {
                System.out.println("Победил второй игрок по имени " + player2.getName());
                break;
            }

            if (player2.getNum() < unknownNum) {
                System.out.println("Число " + player2.getNum() + 
                        " меньше того, что загадал компьютер, ход переходит к первому игроку " +
                        player1.getName());
            } else {
                System.out.println("Число " + player2.getNum() + 
                        " больше того, что загадал компьютер, ход переходит к первому игроку " +
                        player1.getName());
            }
        } while (true);
    }
}
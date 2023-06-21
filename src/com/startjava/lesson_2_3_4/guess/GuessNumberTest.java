package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import com.startjava.lesson_2_3_4.person.Player;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());

        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());

        GuessNumber game = new GuessNumber(player1, player2);
        String option;

        do {
            game.play();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                option = scanner.next();
            } while (option.equals("yes") && option.equals("no"));
        } while (option.equals("yes"));
    }
}
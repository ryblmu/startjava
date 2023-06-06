import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());

        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());

        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String playersAnswer;
        
        do {
            guessNumber.playGame();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                playersAnswer = scanner.next();
            } while (playersAnswer.equals("yes") && playersAnswer.equals("no"));
        } while (playersAnswer.equals("yes"));
    }
}
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String userAnswer;

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());

            System.out.print("Введите знак:");
            calculator.setMathSign(scanner.next().charAt(0));

            System.out.print("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());

            System.out.print("Результат вычислений: ");
            calculator.calculateResult();

            System.out.println("Хотите продолжить вычисления? [yes/no]");
            userAnswer = scanner.next();

            if (userAnswer.equals("no")) {
                break;
            }
        } while (userAnswer.equals("yes"));
    }
}
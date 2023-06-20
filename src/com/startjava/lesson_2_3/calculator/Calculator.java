package src.com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char mathSign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public void calculate() {
        int result = 0;
        
        switch(mathSign) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            case '^' :
                result = num1;
                for (int i = 1; i < num2; i++) {
                    result *= num1;
                }
                break;
            case '%' :
                result = num1 % num2;
                break;
            default :
                System.out.println("Математическая операция не поддерживается");
                break;
        }

        System.out.println(result);
    }
}
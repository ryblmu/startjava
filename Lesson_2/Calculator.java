public class Calculator {

        int num1;
        int num2;
        char mathSign;

        public void setNum1(int num) {
            num1 = num;
        }

        public void setNum2(int num) {
            num2 = num;
        }

        public void setMathSign(char mathSign) {
            this.mathSign = mathSign;
        }

        public void calculateResult() {
            int result = 0;
            switch(mathSign) {
                case '+' :
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case '-' :
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case '*' :
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case '/' :
                    result = num1 / num2;
                    System.out.println(result);
                    break;
                case '^' :
                    result = num1;
                    for (int i = 1; i < num2; i++) {
                        result *= num1;
                    }
                    System.out.println(result);
                    break;
                case '%' :
                    result = num1 % num2;
                    System.out.println(result);
                    break;
                default :
                    System.out.println("Математическая операция не поддерживается");
                    break;
            }
        }
}
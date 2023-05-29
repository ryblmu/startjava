class Calculator {

    public static void main (String[] args) {
        int a = 1;
        int b = 3;
        int result = 0;
        char sign = '^';

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            if (a == 0) {
                result = 0;
            } else {
                result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
            }
        } else if (sign == '%') {
            result = a % b;
        }

        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
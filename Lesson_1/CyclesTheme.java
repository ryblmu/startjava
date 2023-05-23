public class CyclesTheme {

    public static void main(String[] args) {
        //1.Подсчет суммы четных и нечетных чисел
        System.out.println("1.Подсчет суммы четных и нечетных чисел");

        int counter = -10;
        int evenNum = 0;
        int oddNum = 0;

        do {
            if (counter % 2 == 0) {
                evenNum += counter;
            } else {
                oddNum += counter;
            }
            counter++;
        } while (counter <= 21);

        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + evenNum +
                ", а нечетных = " + oddNum);

        //2.Вывод чисел в интервале (min и max) в порядке убывания
        System.out.println("\n\n2.Вывод чисел в интервале (min и max) в порядке убывания");

        int num1 = -3;
        int num2 = -1;
        int num3 = 10;
        int min = 0;
        int max = 0;

        if (num1 > num2 & num1 > num3) {
            max = num1;
            if (num2 < num3) {
                min = num2;
            } else {
                min = num3;
            }
        }
        if (num2 > num1 & num2 > num3) {
            max = num2;
            if (num1 < num3) {
                min = num1;
            } else {
                min = num3;
            }
        }
        if (num3 > num1 & num3 > num2) {
            max = num3;
            if (num1 < num2) {
                min = num1;
            } else {
                min = num2;
            }
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        //3.Вывод реверсивного числа суммы его цифр
        System.out.println("\n\n3.Вывод реверсивного числа суммы его цифр\n");


        int num4 = 123434;
        int digit = 1;
        int sum = 0;
        int reverseNum = 0;

        while ((num4 / digit) % 10 > 0) {
            reverseNum = (num4 / digit) % 10;
            sum += reverseNum;
            digit *= 10;
            System.out.print(reverseNum);
        }

        System.out.println("\n" + sum);

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n\n4.Вывод чисел на консоль в несколько строк");
        
        num1 = 24;
        int zeroNum = 0; 

        for (int i = 1; i < num1; i += 2) {
            System.out.printf("%4d", i);
            zeroNum++;
            if (zeroNum % 5 == 0) {
                System.out.println();
                zeroNum = 0;
            }
        }

        if (zeroNum > 0) {
            for (int i = 0; i < 5 - zeroNum; i++){
                System.out.printf("%4d", 0);
            }
        }

        //5.Проверка количества двоек на четность/нечетность
        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность\n");

        int num = 3242592;
        int ratio = 1;
        int countTwos = 0;
        int remainder = 0;

        while (num / ratio != 0) {
            remainder = num / ratio % 10;
            if (remainder == 2) {
                countTwos++;
            }
            ratio *= 10;
        }
        
        if (countTwos % 2 == 0 & countTwos != 0) {
            System.out.println("Число " + num + " содержит " + countTwos +
                    " четное количество двоек");
        } else if (countTwos % 2 != 0) {
            System.out.println("Число " + num + " содержит " + countTwos +
                    " нечетное количество двоек");
        } else {
            System.out.println("В числе нет двоек");
        }

        //6.Отображение фигур в консоли
        System.out.println("\n\n6.Отображение фигур в консоли\n");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int counter1 = 0;
        counter = 0;

        while (counter <= 5) {
            counter1 = counter;
            while (counter1 < 5) {
                System.out.print("#");
                counter1++;
            }
            System.out.println();
            counter++;
        }

        counter = 1;
        counter1 = 0;

        do {
            counter1 = 0;
            while (counter1 < counter) {
                System.out.print("$");
                counter1++;
            }
            System.out.println();
            counter++;

            while (counter > 3 & counter < 6) {
                counter1 = counter;
                while (counter1 < 6) {
                    System.out.print("$");
                    counter1++;
            }
                System.out.println();
                counter++;
            }
        } while (counter < 5);

        //7.Отображение ASCII-символов
        System.out.println("\n\n7.Отображение ASCII-символов");

        System.out.printf("%10s%10s%n", "Dec", "Char");

        for (int i = 32; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%10d%10s%n", i , (char) i);
            }
        }

        for (int i = 97; i < 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%10d%10s%n", i , (char) i);
            }
        }
        //8. Проверка является ли число полиндромом
        System.out.println("\n\n8. Проверка является ли число полиндромом");

        num = 1234321;
        remainder = 0; 
        int temp = num;

        for (reverseNum = 0; num > 0; num /= 10) {
            remainder = num % 10;
            reverseNum *= 10;
            reverseNum += remainder;
        }

        if (reverseNum == temp) {
            System.out.println("Число " + temp + " является полиндромом");
            } else {
                System.out.println("Число " + temp + " не является полиндромом");
            }

        //9. Определение, является ли число счастливым
        System.out.println("\n\n9. Определение, является ли число счастливым");

        int firstHalfSum = 0;
        int nextHalfSum = 0;
        num = 123123;
        remainder = 0;

        for (int i = 0; num > 0; num /= 10) {
            remainder = num % 10;
            if (i < 3) {
                firstHalfSum += remainder;
            } else {
                nextHalfSum += remainder;
            }
            i++;
        }

        if (firstHalfSum == nextHalfSum) {
            System.out.println("Число " + num + " счастливое");
        } else {
            System.out.println("Число " + num + " несчастливое");
        }

        //10. Вывод таблицы умножения пифагора
        System.out.println("\n\n10. Определение, является ли число счастливым");

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j * i == 1) {
                    System.out.printf("%5s", " ");
                } else {
                    System.out.printf("%5d", i * j);
                }
                if (j == 1) {
                    System.out.print(" |");
                }
            }
            System.out.println();
            
            if (i == 1) {
                System.out.printf("%47s", "-------------------------------------------");
                System.out.println();
            }
        }
    }
}
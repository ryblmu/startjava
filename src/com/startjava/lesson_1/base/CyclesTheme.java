package src.com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        //1.Подсчет суммы четных и нечетных чисел
        System.out.println("1.Подсчет суммы четных и нечетных чисел");

        int counter = -10;
        int sumEvenNum = 0;
        int sumOddNum = 0;

        do {
            if (counter % 2 == 0) {
                sumEvenNum += counter;
            } else {
                sumOddNum += counter;
            }
            counter++;
        } while (counter <= 21);

        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEvenNum +
                ", а нечетных = " + sumOddNum);

        //2.Вывод чисел в интервале (min и max) в порядке убывания
        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");

        int num1 = -1;
        int num2 = 10;
        int num3 = -3;
        int min = num1;
        int max = num2;

        if (max < min) {
            max = min;
            min = num2;
        }
        if (num3 > max) {
            max = num3;
        } else if (num3 < min) {
            min = num3;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        //3.Вывод реверсивного числа суммы его цифр
        System.out.println("\n\n3.Вывод реверсивного числа суммы его цифр");

        int num4 = 123434;
        int sum = 0;

        while (num4 % 10 > 0) {
            int remainder = num4 % 10;
            num4 /= 10;
            sum += remainder;
            System.out.print(remainder);
        }

        System.out.println("\n" + sum);

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        
        int endSegment = 24;
        int countNums = 0; 

        for (int i = 1; i < endSegment; i += 2) {
            System.out.printf("%4d", i);
            countNums++;
            if (countNums % 5 == 0) {
                System.out.println();
                countNums = 0;
            }
        }

        if (countNums > 0) {
            for (int i = 0; i < 5 - countNums; i++) {
                System.out.printf("%4d", 0);
            }
        }

        //5.Проверка количества двоек на четность/нечетность
        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность\n");

        num1 = 3242592;
        int ratio = 1;
        int countTwos = 0;

        while (num1 / ratio > 0) {
            int remainder = num1 / ratio % 10;
            if (remainder == 2) {
                countTwos++;
            }
            ratio *= 10;
        }
        
        if (countTwos % 2 == 0 && countTwos != 0) {
            System.out.println("Число " + num1 + " содержит " + countTwos +
                    " четное количество двоек");
        } else if (countTwos % 2 != 0) {
            System.out.println("Число " + num1 + " содержит " + countTwos +
                    " нечетное количество двоек");
        } else {
            System.out.println("В числе нет двоек");
        }

        //6.Отображение фигур в консоли
        System.out.println("\n\n6.Отображение фигур в консоли\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int numSymbolString = 0;
        int numColumn = 0;

        while (numColumn <= 5) {
            numSymbolString = numColumn;
            while (numSymbolString < 5) {
                System.out.print("#");
                numSymbolString++;
            }
            System.out.println();
            numColumn++;
        }

        numSymbolString = 0;
        numColumn = 1;
        int midColumn = 4;

        do {
            do {
                if (numColumn < 4 || numColumn >= 4) {
                    System.out.print("$");
                    numSymbolString++;
                }
                
                if (numColumn < 4) {
                    midColumn = numColumn;
                } else {
                    midColumn--;
                }
            } while (numSymbolString < midColumn && midColumn >= 0);

            System.out.println();


            numSymbolString = 0;
            numColumn++;
        } while (numColumn < 6);

        //7.Отображение ASCII-символов
        System.out.println("\n\n7.Отображение ASCII-символов");

        System.out.printf("%10s%10s%n", "Dec", "Char");

        for (int i = 32; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%10d%10c%n", i, i);
            }
        }

        for (int i = 97; i < 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%10d%10c%n", i, i);
            }
        }

        //8. Проверка является ли число палиндромом
        System.out.println("\n\n8. Проверка является ли число палиндромом");

        num1 = 1234321;
        int temp = num1;
        int reverseNum = 0;

        for (reverseNum = 0; num1 > 0; num1 /= 10) {
            int remainder = num1 % 10;
            reverseNum = reverseNum * 10 + remainder;
        }

        if (reverseNum == temp) {
            System.out.println(temp + " является палиндромом");
        } else {
            System.out.println(temp + " не является палиндромом");
        }

        //9. Определение, является ли число счастливым
        System.out.println("\n\n9. Определение, является ли число счастливым");

        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        num1 = 123123;
        temp = num1;

        for (int i = 0; num1 > 0; num1 /= 10) {
            int remainder = num1 % 10;
            if (i < 3) {
                sumLeftHalf += remainder;
            } else {
                sumRightHalf += remainder;
            }
            i++;
        }

        if (sumLeftHalf == sumRightHalf) {
            System.out.println("Число " + temp + " счастливое");
        } else {
            System.out.println("Число " + temp + " несчастливое");
        }

        //10. Вывод таблицы умножения Пифагора
        System.out.println("\n\n10. Вывод таблицы умножения Пифагора");

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j * i == 1) {
                    System.out.printf("%3s", " ");
                } else {
                    System.out.printf("%3d", i * j);
                }
                if (j == 1) {
                    System.out.print(" |");
                }
            }
            System.out.println();
            
            if (i == 1) {
                System.out.printf("%29s%n", "---------------------------");
            }
        }
    }
}
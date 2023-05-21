public class CyclesTheme {

  public static void main(String[] args) {
    //1.Подсчет суммы четных и нечетных чисел
    System.out.println("Подсчет суммы четных и нечетных чисел");

    int i = -10;
    int evenNum = 0;
    int oddNum = 0;

    do {
        if (i % 2 == 0) {
            evenNum += i;
        } else {
            oddNum += i;
        }
        i++;
    } while (i <= 21);

    System.out.println("в промежутке [-10, 21] сумма четных чисел = " + evenNum +
             ", а нечетных = " + oddNum);

    //2.Вывод чисел в интервале (min и max) в порядке убывания
    System.out.println("2.Вывод чисел в интервале (min и max) в порядке убывания");

    int num1 = 5;
    int num2 = -1;
    int num3 = 10;
    int min = 0;
    int max = 0;

    if (num1 > num2) {
        max = num1;
        min = num2;
    }
    if (num3 < min) {
        min = num3;
    }
    if (num3 > max) {
        max = num3;
    }

    for (i = max - 1; i > min; i--){
        System.out.print(i + " ");
    }

    //3.Вывод реверсивного числа суммы его цифр
    System.out.println("\n\n3.Вывод реверсивного числа суммы его цифр");

    i = 0;
    int num4 = 1234;
    int k = 1;
    int numSum = 0;
    int reverseNum = 0;

    while (i < 4) {
        reverseNum = (num4 / k) % 10;
        numSum += reverseNum;
        i++;
        k *= 10;
        System.out.print(reverseNum);
    }
    System.out.println("\n" + numSum);

    //4. Вывод чисел на консоль в несколько строк
    System.out.println("4. Вывод чисел на консоль в несколько строк");

    System.out.println("\n\nВывод чисел на консоль в несколько строк");
    
    num1 = 24;
    int zeroCount = 0; 

    for(i = 2; i <= num1; i += 2) {
        System.out.printf("%4d", i);
        zeroCount++;
        if (i % 5 == 0) { 
            System.out.println();
            zeroCount = 0;
        }
    }

    if (zeroCount != 0){
        for (i = 0; i < 5 - zeroCount; i++){
        System.out.printf("%4d", 0);
       }
    }

    //5.Проверка количества двоек на четность/нечетность
    System.out.println("\n\n5.Проверка количества двоек на четность/нечетность\n");

    int num = 3242592;
    int ratio = 1;
    int digitsCount = 0;
    int digitLast = 0;
    
    while (num / ratio != 0 ){
        digitLast = num / ratio % 10;
        if (digitLast == 2){
            digitsCount++;
        }
        ratio *= 10;
    }
    
    if (digitsCount % 2 == 0 & digitsCount != 0) {
        System.out.println("Число " + num + " содержит " + digitsCount +
                " четное количество двоек");
    } else if (digitsCount % 2 != 0){
        System.out.println("Число " + num + " содержит " + digitsCount +
                " нечетное количество двоек");
    } else {
        System.out.println("В числе нет двоек");
    }

    //6.Отображение фигур в консоли
    System.out.println("\n\n3.Вывод реверсивного числа суммы его цифр");

    int j;

    for (i = 0; i < 5; i++){
        for(j = 0; j < 10; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println();

    i = 0;
    j = 0;

    while (i <= 5) {
        j = i;
        while (j < 5) {
            System.out.print("#");
            j++;
        }
        System.out.println();
        i++;
    }

    i = 1;
    j = 0;

    do {
        j = 0;
        while (j < i) {
            System.out.print("$");
            j++;
        }
        System.out.println();
        i++;

        while (i > 3 & i < 6) {
            j = i;
            while (j < 6) {
            System.out.print("$");
            j++;
        }
            System.out.println();
            i++;
        }
    } while (i < 5);

    //7.Отображение ASCII-символов
    System.out.println("\n\n7.Отображение ASCII-символов");

    System.out.printf("%10s%10s%n", "Dec", "Char");

    for(i = 32; i < 48; i++) {
        if (i % 2 != 0) {
            System.out.printf("%10d%10s%n", i , (char) i);
        }
    }

    for(i = 97; i < 122; i++) {
        if (i % 2 == 0) {
            System.out.printf("%10d%10s%n", i , (char) i);
        }
    }
    //8. Проверка является ли число полиндромом
    System.out.println("\n\n8. Проверка является ли число полиндромом");

    num = 1234321;
    int lastDigit = 0; 
    int temp = num;

    for (reverseNum = 0; num > 0; num /= 10){
        lastDigit = num % 10;
        reverseNum *= 10;
        reverseNum += lastDigit;
    }
       if (reverseNum == temp){
        System.out.println("Число " + temp + " является полиндромом");
       } else {
        System.out.println("Число " + temp + " не является полиндромом");
       }

    //9. Определение, является ли число счастливым
    System.out.println("\n\n8. Определение, является ли число счастливым");

    num = 123123;
    lastDigit = 0;
    int firstHalfSum = 0;
    int nextHalfSum = 0;

    for (i = 0; num > 0; num /= 10) {
        lastDigit = num % 10;
        if (i < 3) {
            firstHalfSum += lastDigit;
        } else {
            nextHalfSum += lastDigit;
        }
        i++;
    }
        
    if (firstHalfSum == nextHalfSum) {
        System.out.println("Число " + num + " счастливое");
    } else {
        System.out.println("Число " + num + " несчастливое");
    }
    //10. Вывод таблицы умножения пифагора
    System.out.println("\n\n8. Определение, является ли число счастливым");

    for (i = 1; i < 10; i++) {
        for (j = 1; j < 10; j++) {
            if (j*i == 1) {
            System.out.printf("%5s", " ");
        } else {
            System.out.printf("%5d", i * j);
        }
            if (j == 1) { 
                System.out.print(" |");
            }
        }
        System.out.println();
        
         if (i == 1){
            System.out.printf("%47s", "-------------------------------------------");
            System.out.println();
        }
    }
 }
}
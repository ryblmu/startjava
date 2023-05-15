class IfElseStatementTheme {
  
  public static void main(String[] args) {
    //1.Перевод псевдокода на язык Java
    System.out.println("1.Перевод псевдокода на язык \n");
    int age = 33;

    if (age > 20) {
        System.out.println("Возраст " + age + " больше 20 лет\n");
    } else {
        System.out.println("Возраст " + age + " меньше 20 лет\n");
    }
    
    boolean maleSex = false;

    if (!maleSex) {
        System.out.println("Пол мужской\n");
    } else {
        System.out.println("Пол не мужской\n");
    }

    double height = 1.84;

    if (height < 1.80) {
        System.out.println("Рост меньше 180см\n");
    } else {
        System.out.println("Рост больше 180см\n");
    }

    char firstLetterName = "Alyosha".charAt(0);

    if (firstLetterName == 'M') {
        System.out.println("Первая буква имени \'M\'\n\n");
    } else if(firstLetterName == 'I') {
        System.out.println("Первая буква имени \'I\'\n\n");
    } else {
        System.out.println("Первая буква имени какая-то другая\n\n");
    }

    //2.Поиск max и min числа
    System.out.println("2.Поиск max и min числа");

    int num1 = 12;
    int num2 = 6;
    int max;
    int min;

    if (num1 > num2) {
        max = num1;
        min = num2;

        System.out.println("Максимальное число равно " + max + ", а минимальное " + min);
    } else if (num1 < num2) {
        max = num2;
        min = num1;

        System.out.println("Максимальное число равно " + max + ", а минимальное " + min);
    } else {
        System.out.println("Число " + num1 +" равно числу " + num2);
    }

    //3.Проверка числа.Посмотреть на свежую голову заменит на else if
    System.out.println("\n\n3.Поиск max и min числа\n");

    int anyNum = 0;

    if (anyNum == 0) {
        System.out.println("Число равно " + anyNum);
    } else {
        if (anyNum % 2 == 0) {
            System.out.println("Число " + anyNum + " является четным\n");
        } else {
            System.out.println("Число " + anyNum + " является нечетным\n");
        }

        if (anyNum < 0) {
            System.out.println("Число " + anyNum + " является отрицательным\n");
        } else {
            System.out.println("Число " + anyNum + " является положительным\n");
        }
    }

    //4.Поиск одинаковых цифр в числах
    System.out.println("\n\n4.Поиск одинаковых цифр в числах\n");

    int val1 = 649;
    int val2 = 225;
    int hundredVal1 = val1 / 100;
    int tensVal1 = val1 / 10 % 10;
    int onesVal1 = val1 % 10;
    int hundredVal2 = val2 / 100;
    int tensVal2 = val2 / 10 % 10;
    int onesVal2 = val2 % 10;

    System.out.println(val1 + " первое число, " + val2 + " второе число\n");

    if (!(hundredVal1 == hundredVal2 || tensVal1 == tensVal2 || onesVal1 == onesVal2)) {
        System.out.println("Все цифры в двух числах разные!");
    } else if (hundredVal1 == hundredVal2) {
        System.out.println("Одинаковое число " + hundredVal2 +"\n3 разряд\n");
    } else if (tensVal1 == tensVal2) {
        System.out.println("Одинаковое число " + tensVal2 +"\n2 разряд\n");
    } else if (onesVal1 == onesVal2) {
        System.out.println("Одинаковое число " + onesVal2 +"\n1 разряд\n");
    }

    //5.Определение символа по его коду
    System.out.println("5.Определение символа по его коду\n");

    char unknownChar = '\u0057';

    if (unknownChar >= 'A' & unknownChar <= 'Z') { 
        System.out.println(unknownChar + " - большая буква\n\n");
    } else if (unknownChar >= 'a' & unknownChar <= 'z') {
        System.out.println(unknownChar + " - маленькая буква\n\n");
    } else if (unknownChar >= '0' & unknownChar <= '9') {
        System.out.println(unknownChar + " - число\n\n");
    } else {
        System.out.println(unknownChar + " - не буква и не число\n\n");
    }

    //6.Подсчет суммы вклада и начисленных банком %
    System.out.println("\n\n6.Подсчет суммы вклада и начисленных банком %\n");

    int deposit = 300_000;
    int percent;
    int totalDeposit;

    if (deposit < 100_000) {
        percent = deposit / 100 * 5;
        totalDeposit = percent + deposit;

        System.out.println(deposit + " сумма вклада\n" +
                percent + " начисленный процент 5%\n" +
                totalDeposit + " итоговая сумма\n\n");
    } else if (deposit >= 100_000 & deposit <= 300_000) {
        percent = deposit / 100 * 7;
        totalDeposit = percent + deposit;

        System.out.println(deposit + " сумма вклада\n" +
                percent + " начисленный процент 7%\n" +
                totalDeposit + " итоговая сумма\n\n");
    } else if (deposit > 300_000) {
        percent = deposit / 100 * 10;
        totalDeposit = percent + deposit;

        System.out.println(deposit + " сумма вклада\n" +
                percent + " начисленный процент 10%\n" +
                totalDeposit + " итоговая сумма\n\n");
    }

    //7.Определение оценки по предметам
    System.out.println("7.Определение оценки по предметам %\n");

    int historyScores = 59;
    int programmingScores = 97;
    int historyMark = 0;

    if (historyScores <= 60 ) {
        historyMark = 2;
        System.out.println(historyMark + " История");
    } else if (historyScores > 60 & historyScores < 73) {
        historyMark = 3;
        System.out.println(historyMark + " История");
    } else if (historyScores >= 73 & historyScores < 91) {
        historyMark = 4;
        System.out.println(historyMark + " История");
    } else if (historyScores >= 91) {
        historyMark = 5;
        System.out.println(historyMark + " История");
    }

    int programmingMark = 0;

    if (programmingScores <= 60 ) {
        programmingMark = 2;
        System.out.println(programmingMark + " Программирование");
    } else if (programmingScores > 60 & programmingScores < 73) {
        programmingMark = 3;
        System.out.println(programmingMark + " Программирование");
    } else if (programmingScores >= 73 & programmingScores < 91) {
        programmingMark = 4;
        System.out.println(programmingMark + " Программирование");
    } else if (programmingScores >= 91) {
        programmingMark = 5;
        System.out.println(programmingMark + " Программирование");
    }

    int middleMark = (programmingMark + historyMark) / 2;
    int middleScores = (programmingScores + historyScores) / 2;

    System.out.println(middleMark + " средняя оценка\n" + 
            middleScores + " средний % по предметам\n\n");

    //8.Расчет прибыли за год
    System.out.println("8.Расчет прибыли за год\n");

    int monthlyRent = 5000;
    int monthlySales = 13000;
    int avgPrice = 9000;
    int annualProfit = (monthlySales - avgPrice - monthlyRent) * 12;

    if (annualProfit > 0) {
        System.out.println("Прибыль за год: +" + annualProfit);
    } else {
        System.out.println("Прибыль за год: " + annualProfit);
    }

    //9.Подсчет количества банкнотиз банкомата
    System.out.println("\n\n9.Подсчет количества банкнот\n");

    int cash = 567;
    int hundreds = cash / 100;
    int tens = cash / 10 % 10;
    int ones = cash % 10;

    if (hundreds <= 10 & tens <= 5) {
        System.out.println("Для выдачи " + cash + " USD необходимо \n" + 
                hundreds + " банкнот номиналом 100 USD\n" +
                tens + " банкнот номиналом 10 USD\n" +
                ones + " банкнот номиналом 1 USD\n");
    } else if (hundreds < 10 & tens > 5) {
        tens = 5;
        ones = cash - hundreds * 100 - 50;

        System.out.println("Для выдачи " + cash + " USD необходимо:\n" +
                hundreds + " банкнот номиналом 100 USD\n" +
                tens + " банкнот номиналом 10 USD\n" +
                ones + " банкнот номиналом 1 USD\n");
    } else if ((hundreds >= 10 & hundreds < 11 & tens > 5) || (hundreds == 11 & tens == 0)) {
        hundreds = 10;
        tens = 5;
        ones = cash - 1050;

        System.out.println("Для выдачи " + cash + " USD необходимо:\n" +
                hundreds + " банкнот номиналом 100 USD\n" +
                tens + " банкнот номиналом 10 USD\n" +
                ones + " банкнот номиналом 1 USD\n");
    } else {
        System.out.println("В банкомате нет нужной суммы");
    }
  }
}







































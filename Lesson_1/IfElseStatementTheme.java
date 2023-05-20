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
        System.out.println("Первая буква имени \'M\'");
    } else if(firstLetterName == 'I') {
        System.out.println("Первая буква имени \'I\'");
    } else {
        System.out.println("Первая буква имени какая-то другая");
    }

    //2.Поиск max и min числа
    System.out.println("\n\n2.Поиск max и min числа");

    int num1 = 12;
    int num2 = 6;

    if (num1 > num2) {
        System.out.println("Максимальное число равно " + num1 + ", а минимальное " + num2);
    } else if (num1 < num2) {
        System.out.println("Максимальное число равно " + num2 + ", а минимальное " + num1);
    } else {
        System.out.println("Число " + num1 +" равно числу " + num2);
    }

    //3.Проверка числа.
    System.out.println("\n\n3.Поиск max и min числа\n");

    int anyNum = 4;

    if (anyNum == 0) {
        System.out.println("Число равно " + anyNum);
    } else {
        System.out.println(anyNum);

        if (anyNum % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }

        if (anyNum < 0) {
            System.out.println("отрицательное");
        } else {
            System.out.println("положительным");
        }
        
    }

    //4.Поиск одинаковых цифр в числах
    System.out.println("\n\n4.Поиск одинаковых цифр в числах\n");

    num1 = 649;
    num2 = 225;
    int hundredNum1 = num1 / 100;
    int tensNum1 = num1 / 10 % 10;
    int onesNum1 = num1 % 10;
    int hundredNum2 = num2 / 100;
    int tensNum2 = num2 / 10 % 10;
    int onesNum2 = num2 % 10;

    System.out.println(num1 + " первое число, " + num2 + " второе число\n");

    if (!(hundredNum1 == hundredNum2 || tensNum1 == tensNum2 || onesNum1 == onesNum2)) {
        System.out.println("Все цифры в двух числах разные!");
    } else if (hundredNum1 == hundredNum2) {
        System.out.println("Одинаковая цифра " + hundredNum2 +"\n3 разряд\n");
    } else if (tensNum1 == tensNum2) {
        System.out.println("Одинаковая цифра " + tensNum2 +"\n2 разряд\n");
    } else if (onesNum1 == onesNum2) {
        System.out.println("Одинаковая цифра " + onesNum2 +"\n1 разряд\n");
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
    int percent = 0;
    int totalDeposit = 0;

    if (deposit < 100_000) {
        percent = deposit / 100 * 5;
    } else if (deposit >= 100_000 & deposit <= 300_000) {
        percent = deposit / 100 * 7;
    } else if (deposit > 300_000) {
        percent = deposit / 100 * 10;
    }

    totalDeposit = percent + deposit;

    System.out.println(deposit + " сумма вклада\n" +
            percent + " начисленный процент\n" +
            totalDeposit + " итоговая сумма\n\n");

    //7.Определение оценки по предметам
    System.out.println("7.Определение оценки по предметам %\n");

    int historyScores = 59;
    int historyMark = 0;

    if (historyScores <= 60 ) {
        historyMark = 2;
    } else if (historyScores > 60 & historyScores < 73) {
        historyMark = 3;
    } else if (historyScores >= 73 & historyScores < 91) {
        historyMark = 4;
    } else if (historyScores >= 91) {
        historyMark = 5;
    }

    int programmingMark = 0;
    int programmingScores = 97;

    if (programmingScores <= 60 ) {
        programmingMark = 2;
    } else if (programmingScores > 60 & programmingScores < 73) {
        programmingMark = 3;
    } else if (programmingScores >= 73 & programmingScores < 91) {
        programmingMark = 4;
    } else if (programmingScores >= 91) {
        programmingMark = 5;
    }

    int avgMark = (programmingMark + historyMark) / 2;
    int avgScores = (programmingScores + historyScores) / 2;

    System.out.println(avgMark + " средняя оценка\n" + 
            avgScores + " средний % по предметам\n" +
            historyMark + " оценка по истории\n" +
            programmingMark + " оценка по программированию\n\n");

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

    //9.Подсчет количества банкнот из банкомата
    System.out.println("\n\n9.Подсчет количества банкнот\n");

    int cash = 599;
    int hundreds = cash / 100;
    int tens = cash / 10 % 10;
    int ones = cash % 10;
    int hundredsNum = 10;
    int tensNum = 5;
    int onesNum = 50;
    int atmCash = 1100;

    if (cash > atmCash) {
        System.out.println("В банкомате нет такой суммы");
    } else {
        if (hundreds < hundredsNum & tens > tensNum) {
            tens = tensNum;
            ones = cash - hundreds * 100 - onesNum;
        } else if ((hundreds >= hundredsNum & hundreds <= hundredsNum & tens > tensNum) ||
                        (hundreds > hundredsNum & tens == 0)) {
            hundreds = hundredsNum;
            tens = tensNum;
            ones = cash - hundreds * 100 - onesNum;
        }
        System.out.println("Для выдачи " + cash + " USD необходимо:\n" +
                hundreds + " банкнот номиналом 100 USD\n" +
                tens + " банкнот номиналом 10 USD\n" +
                ones + " банкнот номиналом 1 USD\n");
    }
  }
}
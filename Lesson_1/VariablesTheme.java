public class VariablesTheme {

  public static void main(String[] args) {
    //1.Вывод характеристик компьютера
    System.out.println("1.Вывод характеристик компьютера");

    boolean hasPc = true;
    byte ramSize = 16;
    short coresNumber = 8;
    int hddSize = 500;
    long dramFrequency = 3200l;
    float dramVoltage = 1.2f;
    double cpuFrequency = 2.6d;
    char monitorEnergy = 'A';

    System.out.println("\nНаличие компьютера " + hasPc +
            "\nОбъем оперативной памяти компьютера " + ramSize + "Mhz" +
            "\nОбъем жесткого диска " + hddSize + "Gb" +
            "\nЧастота оперативной памяти " + dramFrequency + "Mhz" +
            "\nЧастота центрального процессора " + cpuFrequency + "Ghz" +
            "\nКласс энергоэффективности монитора " + monitorEnergy);

    //2.Расчет стоимости товара со скидкой
    System.out.println("\n2.Расчет стоимости товара со скидкой");

    int penPrice = 100;
    int bookPrice = 200;
    int discount = 11;
    int sumPrice = penPrice + bookPrice;
    int discountSum = sumPrice / 100 * discount;
    int discountPrice = sumPrice - discountSum;

    System.out.println("\nОбщая стоимость товаров без скидки: " + sumPrice + " руб." +
            "\nСумма скидки: " + discountSum + " руб." + 
            "\nОбщая стоимость товаров со скидкой: " + discountPrice + " руб.");

    //3.Вывод слова JAVA
    System.out.println("3.Вывод слова JAVA\n");

    System.out.println("   J    a  v     v  a\n" + 
    	    "   J   a a  v   v  a a\n" + 
    	    "J  J  aaaaa  V V  aaaaa\n" + 
    	    " JJ  a     a  V  a     a\n");

    //4.Вывод min и max целых числовых типов
    System.out.println("4.Вывод min и max целых числовых типов");

    byte byteNum = 127;

    System.out.println("\nПервоначальное значение переменной типа byte: " + byteNum +
            "\nЗначение после инкремента на единицу: " + (++byteNum) + 
            "\nЗначение после декремента на единицу: " + (--byteNum));

    short shortNum = 32767;

    System.out.println("\nПервоначальное значение переменной типа short: " + shortNum +
            "\nЗначение после инкремента на единицу: " + (++shortNum) + 
            "\nЗначение после декремента на единицу: " + (--shortNum));

    int intNum = 2147483647;

    System.out.println("\nПервоначальное значение переменной типа integer: " + intNum +
            "\nЗначение после инкремента на единицу: " + (++intNum) + 
            "\nЗначение после декремента на единицу: " + (--intNum));

    long longNum = 9223372036854775807l;

    System.out.println("\nПервоначальное значение переменной типа long: " + longNum +
            "\nЗначение после инкремента на единицу: " + (++longNum) + 
            "\nЗначение после декремента на единицу: " + (--longNum));

    //5.Перестановка значений переменных
    System.out.println("\n5.Перестановка значений переменных");

    int num1 = 2;
    int num2 = 5;
    int temp = num1;
    
    System.out.println("\nС помощью третьей переменной temp" + 
            "\nИсходные значения переменных: num1 = " + num1 + " num2 = " + num2);

    num1 = num2;
    num2 = temp;

    System.out.println("Новые значения переменных: num1 = " + num1 + 
            " num2 = " + num2);
    System.out.println("\nС помощью арифметических операций" + 
            "\nИсходные значения переменных: num1 = " + num1 + " num2 = " + num2);
    
    num1 += num2;
    num2 = num1 - num2;
    num1 -= num2;

    System.out.println("Новые значения переменных: num1 = " + num1 + 
            " num2 = " + num2);

    System.out.println("\nС помощью побитовой оперпции ^" + 
            "\nИсходные значения переменных: num1 = " + num1 + " num2 = " + num2);
    
    num1 ^= num2;
    num2 ^= num1;
    num1 ^= num2;

    System.out.println("Новые значения переменных: num1 = " + num1 + 
            " num2 = " + num2);

    //6.Вывод символов и их кодов
    System.out.println("\n\n6.Вывод символов и их кодов");

    char poundKey = '#';
    char ampersand = '&';
    char at = '@';
    char xor = '^';
    char underscore = '_';

    System.out.println("\nСимвол " + poundKey + " ASCII " + (int) poundKey + 
            "\nСимвол " + ampersand + " ASCII " + (int) ampersand +
            "\nСимвол " + at + " ASCII " + (int) at +
            "\nСимвол " + xor + " ASCII " + (int) xor +
            "\nСимвол " + underscore + " ASCII " + (int) underscore);

    //7.Вывод в консоль ASCII-арт Дюка
    System.out.println("\n\n7.Вывод в консоль ASCII-арт Дюка\n");

    char slash = '/';
    char backSlash = '\\';
    char leftBracket = '(';
    char rightBracket = ')';

    System.out.println("    " + slash + backSlash + '\n' +
            "   " + slash + "  " + backSlash + '\n' +
            "  " + slash + underscore + leftBracket + " " + rightBracket + backSlash + '\n' +
            " " + slash + "      " + backSlash + '\n' +
            slash + underscore + underscore + underscore + underscore + slash + backSlash +
            underscore + underscore + backSlash);

    //8.Вывод количества сотен, десятков и единиц числа
    System.out.println("\n\n8.Вывод количества сотен, десятков и единиц числа\n");

    int num = 323;
    int hundreds = num / 100;
    int tens = num / 10;
    int ones = num / 1; 

    System.out.println("Число " + num + " содерижит:\n" +
            hundreds + " сотен\n" + 
            tens + " десятков\n" + 
            ones + " единиц\n");

    tens %= 10;
    ones %= 10;
    int sumDigits = hundreds + tens + ones;
    int productDigits = hundreds * tens * ones;

    System.out.println("Сумма его цифр = " + sumDigits +
            "\nПроизведение его цифр = " + productDigits);

    //9.Вывод времени
    System.out.println("\n9.Вывод времени");

    int totalSec = 86399;
    int hr = totalSec / 60 / 60;
    int min = totalSec / 60 % 60;
    int sec = totalSec % 60;

    System.out.println(hr + ":" + min + ":" + sec);
  }
}
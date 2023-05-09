public class VariablesTheme {

  public static void main(String[] args) {
    
  	boolean hasPC = true;
  	byte ramSize = 16;
  	short coresNumber = 8;
  	int hddSize = 500;
  	long dramFrequency = 3200l;
  	float dramVoltage = 1.2f;
  	double cpuFrequency = 2.6d;
  	char monitorEnergy = 'A';
    int pencilPrice = 100;
    int bookPrice = 200;
    int discount = 11;
    int sumPrice;
    int discountSum;
    int priceWithDiscount;
    byte byteNum = 127;
    short shortNum = 32767;
    int intNum = 2147483647;
    long longNum = 9223372036854775807l;
    int num1 = 2;
    int num2 = 5;
    int num3;
    char pndKey = '#';
    char amp = '&';
    char at = '@';
    char xor = '^';
    char spc = '_';
    char slh = '/';
    char bslh = '\\';
    char lbrc = '(';
    char rbrc = ')';
    int num = 123;
    int hundr;
    int tens;
    int ones;
    int dgtSum;
    int dgtProd;
    int totalSec = 86399;
    int hr;
    int min;
    int sec;

    //1.Вывод характеристик компьютера
    System.out.println("1.Вывод характеристик компьютера");
    
    System.out.println("\nНаличие компьютера " + hasPC +
            "\nОбъем оперативной памяти компьютера " + ramSize + "Mhz" +
            "\nОбъем жесткого диска " + hddSize + "Gb" +
            "\nЧастота оперативной памяти " + dramFrequency + "Mhz" +
            "\nЧастота центрального процессора " + cpuFrequency + "Ghz" +
            "\nКласс энергоэффективности монитора " + monitorEnergy);

    //2.Расчет стоимости товара со скидкой
    
    sumPrice = pencilPrice + bookPrice;
    discountSum = (pencilPrice + bookPrice) / 100 * discount;
    priceWithDiscount = sumPrice - discountSum;

    System.out.println("\n\n2.Расчет стоимости товара со скидкой");

    System.out.println("\nОбщая стоимость товаров без скидки: " + sumPrice + " руб." +
            "\nСумма скидки: " + discountSum + " руб." + 
            "\nОбщая стоимость товаров со скидкой: " + priceWithDiscount + " руб.");

    //3.Вывод слова JAVA
    System.out.println("3.Вывод слова JAVA");

    System.out.println("\n   J    a  v     v  a      " + 
    	    "\n   J   a a  v   v  a a      " + 
    	    "\nJ  J  aaaaa  V V  aaaaa    " + 
    	    "\n JJ  a     a  V  a     a");

    //4.Вывод min и max целых числовых типов   
    System.out.println("\n\n4.Вывод min и max целых числовых типов");

    System.out.println("\nПервоначальное значение переменной типа byte: " + byteNum +
            "\nЗначение после инкремента на единицу: " + (byteNum += 1) + 
            "\nЗначение после декремента на единицу: " + (byteNum -= 1));

    System.out.println("\nПервоначальное значение переменной типа short: " + shortNum +
            "\nЗначение после инкремента на единицу: " + (shortNum += 1) + 
            "\nЗначение после декремента на единицу: " + (shortNum -= 1));

    System.out.println("\nПервоначальное значение переменной типа integer: " + intNum +
            "\nЗначение после инкремента на единицу: " + (intNum += 1) + 
            "\nЗначение после декремента на единицу: " + (intNum -= 1));

    System.out.println("\nПервоначальное значение переменной типа long: " + longNum +
            "\nЗначение после инкремента на единицу: " + (longNum += 1) + 
            "\nЗначение после декремента на единицу: " + (longNum -= 1));

    //5.Перестановка значений переменных
    System.out.println("\n\n5.Перестановка значений переменных");
    
    System.out.println("\nС помощью третьей переменной num3" + 
            "\nИсходные значения переменных: num1 = " + num1 + " num2 = " + num2);

    num3 = num1;
    num1 = num2;
    num2 = num3;

    System.out.println("Новые значения переменных: num1 = " + num1 + 
            " num2 = " + num2);
    System.out.println("\nС помощью арифметических операций" + 
            "\nИсходные значения переменных: num1 = " + num1 + " num2 = " + num2);
    
    num1 += num2;
    num2 = (num1 - num2);
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

    System.out.println("\nСимвол " + pndKey + " ASCII " + (int) pndKey + 
            "\nСимвол " + amp + " ASCII " + (int) amp +
            "\nСимвол " + at + " ASCII " + (int) at +
            "\nСимвол " + xor + " ASCII " + (int) xor +
            "\nСимвол " + at + " ASCII " + (int) spc);

    //7.Вывод в консоль ASCII-арт Дюка
    System.out.println("\n\n7.Вывод в консоль ASCII-арт Дюка\n");

    System.out.println("    " + slh + bslh + "       " +
            "\n   " + slh + "  " + bslh + "      " +
            "\n  " + slh + spc + lbrc + " " + rbrc + bslh + "   " + 
            "\n " + slh + "      " + bslh + " \n" + 
            slh + spc + spc + spc + spc + slh + bslh + spc + spc + bslh);

    //8.Вывод количества сотен, десятков и единиц числа
    hundr = num / 100;
    tens = num / 10;
    ones = num / 1;
    dgtSum = (hundr % 10) + (tens % 10) + (ones % 10);
    dgtProd = (hundr % 10) * (tens % 10) * (ones % 10);

    System.out.println("\n\n8.Вывод количества сотен, десятков и единиц числа\n");

    System.out.println("Число " + num + " содерижит:\n" +
            hundr + " сотен\n" + 
            tens + " десятков\n" +
            ones + " единиц\n" + 
            "\nСумма его цифр = " + dgtSum +
            "\nПроизведение его цифр = " + dgtProd);

    //9.Вывод времени
    hr = totalSec / 60 / 60;
    min = totalSec / 60 % 60;
    sec = totalSec % 60;

    System.out.println("\n\n9.Вывод времени\n");

    System.out.println(hr + ":" + min + ":" + sec);
  }
}








































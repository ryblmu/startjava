package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        reverseArray();
        outputProductOfArrayElements();
        deleteElementsFromArray();
        outputOfArrayElementsReverseOrder();
        generateUniqueNumbers();
//        copyingNonEmptyStrings();
    }

    private static void reverseArray() {
        System.out.println("1.Реверс значений массива");

        int[] numbers = {3, 6, 2, 5, 1, 4, 7};
        int length = numbers.length;
        System.out.println(length);

        System.out.println("Значения массива до перестановки: ");
        showArray(numbers);

        int middleIndex = length / 2;
        for (int i = 0; i < middleIndex; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[--length];
            numbers[length] = temp;
        }
        System.out.println("\nЗначения массива после перестановки: ");
        showArray(numbers);
    }

    public static void outputProductOfArrayElements() {
        System.out.println("\n\n2.Вывод произведения элементов массива");

        int[] multipliers = new int[10];
        int length = multipliers.length;

        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }

        int product = 1;
        for (int i = 1; i < length - 1; i++) {
            product *= multipliers[i];
            System.out.print(i);
            System.out.print(i < length - 2 ? " * " : " = " + product + "\n");
        }

        System.out.println(multipliers[0] + " " + multipliers[length-1]);
    }

    public static void deleteElementsFromArray() {
        System.out.println("\n3.Удаление элементов массива");

        double[] realNumbers = new double[15];
        int length = realNumbers.length;

        for (int i = 0; i < length; i++) {
            realNumbers[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        for (double element : realNumbers) {
            System.out.printf("%,.3f ",element);
        }
        System.out.println();
        System.out.println("Измененный массив:");
        double middleCellValue = realNumbers[(length - 1) / 2];

        for (int i = 0; i < 8; i++) {
            System.out.printf("%,.3f ", realNumbers[i]);
        }

        System.out.println();

        int countZeros = 0;

        for (int i = 0; i < length - 8; i++) {
            if (realNumbers[i] > middleCellValue) {
                realNumbers[i] = 0;
                countZeros++;
            }
            System.out.printf("%,.3f ", realNumbers[i]);
        }
        System.out.println("\nКоличество обнуленных ячеек: " + countZeros);
    }

    public static void outputOfArrayElementsReverseOrder() {
        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");

        char[] alphabet = new char[26];
        int length = alphabet.length;

        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= length - 1 - i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    public static void generateUniqueNumbers() {
        System.out.println("\n5.Генерация уникальных чисел");

        int[] uniqueNumbers = new int[30];
        int length = uniqueNumbers.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((uniqueNumbers[i] == uniqueNumbers[j] && i != j) || (uniqueNumbers[j] == 0)) {
                    uniqueNumbers[j] = (int) (Math.random() * (100 - 60)) + 60;
                    i = 0;
                }
            }
        }

        Arrays.sort(uniqueNumbers);

        System.out.println("После сортировки:");
        int countOfArrayElements = 0;

        for (int number : uniqueNumbers) {
            System.out.print(number + " ");
            if (++countOfArrayElements % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void copyingNonEmptyStrings() {
        System.out.println("6. Копирование не пустых строк");
        //создать второй массив и поместить в него не пустые значения
        String[] array = {"   ", "AA", "", "BBB", "CC", "D", " ", "E", "FF", "G"};

        int size = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i].isEmpty() || array[i].charAt(0) == ' ') {
                size++;
            }
        }

        String[] array2 = new String[9];

    }

    public static void showArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
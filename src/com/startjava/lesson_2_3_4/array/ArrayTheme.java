package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        reverseArray();
        outputProductOfArrayElements();
        deleteElementsFromArray();
        outputOfArrayElements();
        generateUniqNumbers();
    }

    private static void reverseArray() {
        System.out.println("1.Реверс значений массива");

        int[] arrayOfNumbers = {3, 6, 2, 5, 1, 4, 7};

        System.out.println("Значения массива до перестановки: ");
        for (int i : arrayOfNumbers) {
            System.out.print(i + " ");
        }

        System.out.println();
        int temp = 0;

        for (int i = 0; i < arrayOfNumbers.length / 2; i++) {
            temp = arrayOfNumbers[i];
            arrayOfNumbers[i] = arrayOfNumbers[arrayOfNumbers.length - i - 1];
            arrayOfNumbers[arrayOfNumbers.length - i - 1] = temp;
        }
        System.out.println("Значения массива после перестановки: ");
        for (int i : arrayOfNumbers) {
            System.out.print(i + " ");
        }
    }

    public static void outputProductOfArrayElements() {
        System.out.println("\n\n2.Вывод произведения элементов массива");

        int[] arrayOfIntNumbers = new int[10];
        int product = 1;

        for (int i = 0; i < arrayOfIntNumbers.length; i++) {
            arrayOfIntNumbers[i] = i;
        }

        for (int i = 1; i < arrayOfIntNumbers.length - 1; i++) {
            product *= arrayOfIntNumbers[i];
            System.out.print( i < arrayOfIntNumbers.length - 2 ? i + " * " : i + " = " + product + "\n");
        }

        System.out.println(arrayOfIntNumbers[0] + " " + arrayOfIntNumbers[9]);
    }

    public static void deleteElementsFromArray() {
        System.out.println("\n\n3.Удаление элементов массива");

        double[] arrayOfRealNumbers = new double[15];
        //инициализация массива 15 вещественными числами
        for (int i = 0; i < arrayOfRealNumbers.length; i++) {
            arrayOfRealNumbers[i] = Math.random();
        }

        double number = arrayOfRealNumbers[(arrayOfRealNumbers.length - 1) / 2];

        for (double element : arrayOfRealNumbers) {
            System.out.printf("%,.3f ", element);
        }

        System.out.println();

        int zeroCount = 0;

        for (int i = 0; i < arrayOfRealNumbers.length; i++) {
            if (arrayOfRealNumbers[i] > number) {
                arrayOfRealNumbers[i] = 0;
                zeroCount++;
            }
            System.out.printf("%,.3f ", arrayOfRealNumbers[i]);
        }
        System.out.println("\nКоличество обнуленных ячеек: " + zeroCount);
    }

    public static void outputOfArrayElements() {
        System.out.println("\n4.Вывод элемента массивов лесенкой в обратном порядке");
        char[] arrayOfChars = new char[26];
        int firstChar = 65;

        for (int i = 0; i < arrayOfChars.length; i++) {
            arrayOfChars[i] = (char) firstChar++;
        }

        for (int i = 0; i < arrayOfChars.length; i++) {
            for (int k = arrayOfChars.length - 1; k >= arrayOfChars.length - 1 - i; k--) {
                System.out.print(arrayOfChars[k]);
            }
            System.out.println();
        }
    }

    public static void generateUniqNumbers() {
        System.out.println("\n5.Генерация уникальных чисел");
        int[] arrayOfNumbers = new int[30];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = (int) (Math.random() * (100 - 60)) + 60;
        }

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int k = 0; k < arrayOfNumbers.length; k++) {
                if (arrayOfNumbers[i] == arrayOfNumbers[k] && i != k) {
                    arrayOfNumbers[k] = (int) (Math.random() * (100 - 60)) + 60;
                    i = 0;
                }
            }
        }

        Arrays.sort(arrayOfNumbers);
        int countOfArrayElements = 0;

        for (int j : arrayOfNumbers) {
            System.out.print(j + " ");
            if (++countOfArrayElements % 10 == 0) {
                System.out.println();
            }
        }
    }
}
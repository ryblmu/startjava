package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        reverseArray();
        outputProductOfArrayElements();
        deleteElementsFromArray();
        outputOfArrayElementsReverseOrder();
        generateUniqueNumbers();
    }

    private static void reverseArray() {
        System.out.println("1.Реверс значений массива");

        int[] arrayOfNumbers = {3, 6, 2, 5, 1, 4, 7};
        int size = arrayOfNumbers.length;

        System.out.println("Значения массива до перестановки: ");
        for (int i : arrayOfNumbers) {
            System.out.print(i + " ");
        }

        int temp = 0;

        for (int i = 0; i < size / 2; i++) {
            temp = arrayOfNumbers[i];
            arrayOfNumbers[i] = arrayOfNumbers[size - i - 1];
            arrayOfNumbers[size - i - 1] = temp;
        }
        System.out.println("\nЗначения массива после перестановки: ");
        for (int i : arrayOfNumbers) {
            System.out.print(i + " ");
        }
    }

    public static void outputProductOfArrayElements() {
        System.out.println("\n\n2.Вывод произведения элементов массива");

        int[] arrayOfIntNumbers = new int[10];
        int product = 1;
        int size = arrayOfIntNumbers.length;

        for (int i = 0; i < size; i++) {
            arrayOfIntNumbers[i] = i;
        }

        for (int i = 1; i < size - 1; i++) {
            product *= arrayOfIntNumbers[i];
            System.out.print( i < size - 2 ? i + " * " : i + " = " + product + "\n");
        }

        System.out.println(arrayOfIntNumbers[0] + " " + arrayOfIntNumbers[9]);
    }

    public static void deleteElementsFromArray() {
        System.out.println("\n3.Удаление элементов массива");

        double[] realNumbers = new double[15];
        int size = realNumbers.length;

        for (int i = 0; i < size; i++) {
            realNumbers[i] = Math.random();
        }

        double middleCellValue = realNumbers[(size - 1) / 2];

        for (int i = 0; i < 8; i++) {
            System.out.printf("%,.3f ", realNumbers[i]);
        }

        System.out.println();

        int zeroCount = 0;

        for (int i = 0; i < 7; i++) {
            if (realNumbers[i] > middleCellValue) {
                realNumbers[i] = 0;
                zeroCount++;
            }
            System.out.printf("%,.3f ", realNumbers[i]);
        }
        System.out.println("\nКоличество обнуленных ячеек: " + zeroCount);
    }

    public static void outputOfArrayElementsReverseOrder() {
        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");

        char[] alphabet = new char[26];
        int size = alphabet.length;

        for (int i = 0; i < size; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= size - 1 - i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    public static void generateUniqueNumbers() {
        System.out.println("\n5.Генерация уникальных чисел");

        int[] uniqueNumbers = new int[30];
        int size = uniqueNumbers.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    uniqueNumbers[j] = (int) (Math.random() * (100 - 60)) + 60;
                }
                if ((uniqueNumbers[i] == uniqueNumbers[j] && i != j)) {
                    uniqueNumbers[j] = (int) (Math.random() * (100 - 60)) + 60;
                    i = 0;
                }
            }
        }

        Arrays.sort(uniqueNumbers);
        int countOfArrayElements = 0;

        for (int number : uniqueNumbers) {
            System.out.print(number + " ");
            if (++countOfArrayElements % 10 == 0) {
                System.out.println();
            }
        }
    }
}
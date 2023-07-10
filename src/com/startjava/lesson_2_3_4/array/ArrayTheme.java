package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        reverseArray();
        ratioOfArrayElements();
        deleteElementsFromArray();
        outputOfArrayElements();
        generateUniqNumbers();

    }

    private static void reverseArray() {
        System.out.println("1.Реверс значений массива");

        int[] array = {3, 6, 2, 5, 1, 4, 7};
        int[] invertedArray = new int[array.length];
        int arrayIndex = 0;

        System.out.println("Значения массива array до модификации и после:");

        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[arrayIndex] + " ");
            invertedArray[arrayIndex++] = array[i];
        }

        System.out.println();

        array = invertedArray;

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void ratioOfArrayElements() {
        System.out.println("\n2.Вывод произведения элементов массива");

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ratio = 1;

        for (int i = 1; i < array.length - 1; i++) {
            ratio *= array[i];
            System.out.print( i < array.length -2 ? i + " * " : i + " = " + ratio + "\n");
        }

        for (int i : array) {
            if (array[i] == 0 || array[i] == 9) System.out.print(i + " ");
        }
    }

    public static void deleteElementsFromArray() {
        System.out.println("\n3.Удаление элементов массива");

        int arraySize = 15;
        double[] array = new double[arraySize];
        int midIndex = (arraySize-1) / 2;

        for (int i = 0; i < arraySize; i++) {
            array[i] = Math.random();
        }

        double number = array[midIndex];
        double[] arrayWithZero = array;

        for (double element : array) {
            System.out.printf("%,.3f ", element);
        }

        System.out.println();

        int zeroCount = 0;

        for (int i = 0; i < arraySize; i++) {
            if (arrayWithZero[i] > number) {
                arrayWithZero[i] = 0;
                zeroCount++;
            }
            System.out.printf("%,.3f ", arrayWithZero[i]);
        }
        System.out.println("\nКоличество обнуленных ячеек: "+ zeroCount);
    }

    public static void outputOfArrayElements() {
        System.out.println("4.Вывод элемента массивов лесенкой в обратном порядке");
        char[] array = new char[26];
        int firstChar = 65;

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) firstChar++;
        }

        for (int i = 0; i < array.length; i++) {
            for (int k = array.length - 1; k >= array.length - 1 - i; k--) {
                System.out.print(array[k]);
            }
            System.out.println();
        }
    }

    public static void generateUniqNumbers() {
        System.out.println("5.Генерация уникальных чисел");
        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 60)) + 60;
        }

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (array[i] == array[k] && i != k) {
                    array[k] = (int) (Math.random() * (100 - 60)) + 60;
                    i = 0;
                }
            }
        }

        Arrays.sort(array);
        int countOfArrayElements = 0;

        for (int j : array) {
            System.out.print(j + " ");
            if (++countOfArrayElements % 10 == 0) {
                System.out.println();
            }

        }
    }
}

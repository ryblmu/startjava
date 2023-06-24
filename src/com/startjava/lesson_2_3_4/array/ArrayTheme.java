package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
//        reverseArray();

    }

    private static void reverseArray() {
        System.out.println("1.Реверс значений массива");

        int[] array = {3, 6, 2, 5, 1, 4, 7};
        int[] invertedArray = new int[array.length];
        int arrayIndex = 0;

        System.out.println("Значения массива array до модификации и после:");

        for(int i = array.length-1; i >= 0; i--) {
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
        System.out.println("2. Вывод произведения элементов массива");

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
}

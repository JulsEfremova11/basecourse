package week2;

import methods.ArrayUtils;

import java.sql.Array;

/**
 * 1. Создать массив челых чисел от 1 до 10 и вывести его на экран в виде сообщения "{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}"
 */
public class Task1 {
    public static void main(String[] args) {

        /* int[] mas = new int[10];

        for (int i=0; i < mas.length; i++) {
            mas[i] = i + 1;
        } */

        int[] array = ArrayUtils.generateArray(10);

        System.out.print("{");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");

        }

        System.out.print(array[array.length - 1] + "}");


    }
}

package week2;

import base.TaskUtils;

/**
 * 4. Найти минимальное и максимальное значения в массиве и вывести их на консоль.
 * Например "Min = 4, max = 46".
 * В случае, если массив == null или длинна массива == 0 - на экран вывести null или {}.
 */
public class Task4 {
    public static void main(String[] args) {

        int[] array = TaskUtils.arrayConverter(args);

        if (array == null) { System.out.print("null"); } else if (array.length == 0) { System.out.print("{}") };
        else {
            int min = array[0];
            int max = array[0];
for (int i = 1; i < array.length; i++) {
if (array[i] < min) {
min = array[i];
} else if (array[i] > max) {
max = array[i]; }
}
        }
        System.out.println("Min = " + min + ", max = " + max);
    }
}

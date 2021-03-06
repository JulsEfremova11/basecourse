package week2;

import base.TaskUtils;

/**
 * 3. Найти среднее арифметическое массива и вывести его на экран.
 * В случае, если массив == null или длинна массива == 0 - на экран вывести null или {}.
 */
public class Task3 {
    public static void main(String[] args) {

        int[] array = TaskUtils.arrayConverter(args);
        double sum = 0;

        if (array == null) {

            System.out.print("null");

        } else if (array.length == 0) System.out.print("{}");
        else {

            for (int i = 0; i < array.length; i++) {

                sum += array[i];

            }
            System.out.print(sum / array.length);

        }
    }
}

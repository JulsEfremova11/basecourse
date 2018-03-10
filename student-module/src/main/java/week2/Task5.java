package week2;

import base.TaskUtils;

/**
 * 5. Поменять местами наибольший и наименьший элементы в массиве и вывести его на экран в виде сообщения.
 * Если наименьший и наибольший элементы присутствуют в нескольких экземлярах, то поменять местами только те,
 * которые обладают наименьшим индексом в массиве.
 * Например "{1, 2, 1, 4, 5, 10, 7, 8, 9, 10}" -> "{10, 2, 1, 4, 5, 1, 7, 8, 9, 10}".
 * В случае, если массив == null или длинна массива == 0 - на экран вывести null или {}.
 */
public class Task5 {
    public static void main(String[] args) {


    //    int[] array = TaskUtils.arrayConverter(args);
int[] array = {2, 4, 0, 8, 1, 9, 9, 2};

        if (array == null) {
            System.out.print("null");
        } else if (array.length == 0) {
            System.out.print("{}");
        } else {
            int min = array[0];
            int max = array[0];
            int indexmin = array[min];
            int indexmax = array[max];

            System.out.print("{");
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                } else if (array[i] > max) {
                    max = array[i];
                }

               // System.out.print(array[i] + ", ");
            }                 System.out.print(min + " - min,");
            System.out.print(max + " - max");
            //System.out.print(array[array.length - 1] + "}");

        }


    }
}

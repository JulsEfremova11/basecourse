package week2;

import base.TaskUtils;

/**
 * 10. Перевести положительно число с двоичной системы счисления в десятичную.
 * Число будет переданно в виде массива (int[] number).
 * И вывести на экран.
 * <p>
 * 1000 -> 8
 * 1111 -> 15
 */
public class Task10 {
    public static void main(String[] args) {
        int[] number = TaskUtils.arrayConverter(args);

        int res = 0;

        for (int i = 0; i < number.length; i++) {
            res += number[i] * (int) Math.pow(2, (number.length - 1 - i));
        }
        System.out.println(res);
    }
}

package week2;

import base.TaskUtils;

/**
 * 9. Перевести положительное число с десятичной системы счисления в двоичную.
 * И вывести на экран в виде строки
<<<<<<< HEAD
 * <p>
=======
 *
>>>>>>> origin/master
 * 8 -> 1000
 * 15 -> 1111
 */
public class Task9 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        String res = "";

        while (number != 0) {
            if (number % 2 == 0) {
                res = 0 + res;
            } else {
                res = 1 + res;
            }
            number = number / 2;
        }
        System.out.println(res);
    }
}

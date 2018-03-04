package week1;

/**
 * 12. Определить, является ли шестизначное число "счастливым" (сумма первых трех цифр равна сумме последних трех цифр).
 * Ответ вывести в виде сообщения true/false.
 */
public class Task12 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int firstnum = number / 100000;
        int secondnum = number / 10000 % 10;
        int thirdnum = number / 1000 % 10;
        int fourthnum = number / 100 % 10;
        int fifthnum = number / 10 % 10;
        int sixthnum = number % 10;

        if (firstnum + secondnum + thirdnum == fourthnum + fifthnum + sixthnum) {

            System.out.println(true);

        } else {

            System.out.println(false);

        }

    }
}

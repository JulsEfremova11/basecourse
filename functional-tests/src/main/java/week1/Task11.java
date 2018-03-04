package week1;

/**
 * 11. Написать программу, которая при вводе числа в диапазоне от 1 до 99 добавляет к нему слово "копейка" в правильной форме.
 * Например, 1 копейка, 5 копеек, 42 копейки.
 */
public class Task11 {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int lastnum = number % 10;

        if (lastnum == 1 && number != 11) {System.out.println(number + " копейка");}
        else {
            if (number == 11 ||
                    number >= 5 && number <= 20 ||
                    number >= 25 && number <= 30 ||
                    number >= 35 && number <= 40 ||
                    number >= 45 && number <= 50 ||
                    number >= 55 && number <= 60 ||
                    number >= 65 && number <= 70 ||
                    number >= 75 && number <= 80 ||
                    number >= 85 && number <= 90 ||
                    number >= 95 && number <= 99) {

                System.out.println(number + " копеек");

            } else {

                System.out.println(number + " копейки");

            }
        }
    }
}

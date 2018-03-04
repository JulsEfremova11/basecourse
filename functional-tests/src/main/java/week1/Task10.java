package week1;

/**
 * 10. Дано трехзначное число. Определить:
 * а) верно ли, что все его цифры одинаковые;
 * б) есть ли среди его цифр одинаковые.
 * <p>
 * Взависимости от результата сделать вывод "Все цифры одинаковые" / "Некоторые цифры одинаковые" / "Нету одинаковых цифр"
 */
public class Task10 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int firstnum = number % 10;
        int secondnum = number / 10 % 10;
        int thirdnum = number / 100;

        if (firstnum == secondnum && firstnum == thirdnum && secondnum == thirdnum) {

            System.out.println("Все цифры одинаковые");

        }
        if (firstnum == secondnum || firstnum == thirdnum || secondnum == thirdnum) {

            System.out.println("Некоторые цифры одинаковые");

        } else {

            System.out.println("Нету одинаковых цифр");

        }
    }

}

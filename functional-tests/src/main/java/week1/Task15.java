package week1;

/**
 * 15. Посчитать сколько раз встречается символ 5 в заданном числе (число трехкратное)
 *      435  -   1
 *      505  -   2
 *      555  -   3
 *      305  -   1
 */
public class Task15 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int firstnum = number % 10;
        int secondnum = number / 10 % 10;
        int thirdnum = number / 100;

        if (firstnum == 5 && secondnum == 5 && thirdnum == 5) {

            System.out.println(3);

        } else if (firstnum == 5 && secondnum == 5 || firstnum == 5 && thirdnum == 5 || secondnum == 5 && thirdnum == 5){

            System.out.println(2);

        } else if (firstnum == 5 || secondnum == 5 && thirdnum == 5) {

            System.out.println(1);

        } else {

            System.out.println(0);

        }

    }
}

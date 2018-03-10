package week2;

/**
 * 11. Вычислить факториал числа. Если число меньше 0, вывести сообщение об ошибке ("Wrong number").
<<<<<<< HEAD
 * <p>
=======
 *
>>>>>>> origin/master
 * 0! -> 1
 * 5! -> 120
 * 3! -> 6
 * -7! -> Wrong number
 */
public class Task11 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        int res = 1;

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                res = i * res;
            }
            System.out.println(res);
        } else if (number == 0) {
            System.out.println(1);
        } else {
            System.out.println("Wrong number");
        }

    }
}

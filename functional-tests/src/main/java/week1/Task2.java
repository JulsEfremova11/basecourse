package week1;

/**
 * 2. Есть три числа, нужно вывести на консоль наибольшее
 */
public class Task2 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int maxnum;
        int minnum;

        if (a >= b) {
            maxnum = a;
        } else
            maxnum = b;

        if (c >= maxnum) {
            maxnum = c;
        }

        if (a <= b) {
            minnum = a;
        } else
            minnum = b;

        if (c <= minnum) {
            minnum = c;
        }

        System.out.println(maxnum);
    }
}

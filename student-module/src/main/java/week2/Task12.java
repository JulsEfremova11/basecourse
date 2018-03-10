package week2;

/**
 * 12. Посчитать сколько раз встречается символ 8 в заданном числе (размер числа - нефиксированый, но >= 0)
 *      5678  -   1
 *      5889  -   2
 *      8888  -   4
 *      989990  - 1
 */
public class Task12 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
int counter = 0;
int last;
        while (number!=0) {
            last = number % 10;

            if (last == 8) {
                counter++;
            }
            //number = number / 10;
            number /=10;
        }
System.out.println(counter);
    }
}

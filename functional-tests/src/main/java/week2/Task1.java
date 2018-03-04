package week2;

/**
 * 1. Создать массив челых чисел от 1 до 10 и вывести его на экран в виде сообщения "{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}"
 */
public class Task1 {
    public static void main(String[] args) {

        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("{" + mas[0] + ", ");
        System.out.print(mas[1] + ", ");
        System.out.print(mas[2] + ", ");
        System.out.print(mas[3] + ", ");
        System.out.print(mas[4] + ", ");
        System.out.print(mas[5] + ", ");
        System.out.print(mas[6] + ", ");
        System.out.print(mas[7] + ", ");
        System.out.print(mas[8] + ", ");
        System.out.print(mas[9] + "}");

    /*    for (int i=1; i < mas.length; i++) {

            System.out.print(mas[i]-1 + ", " + mas[i]);
        }

        System.out.println("}"); */
    }
}

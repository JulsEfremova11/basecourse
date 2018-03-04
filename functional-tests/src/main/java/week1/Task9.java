package week1;


import java.util.Scanner;

/**
 * 9. Написать программу вычисления идеального веса пользователя.
 * Выдать рекомендации о необходимости поправиться либо похудеть.
 */
public class Task9 {
    public static void main(String[] args) {

        System.out.println("Enter your growth: ");
        Scanner scanner = new Scanner(System.in);

        int growth = scanner.nextInt();

        System.out.println("Enter your weight: ");
        Scanner scanner1 = new Scanner(System.in);

        int weight = scanner1.nextInt();
        int idealweight = growth - 110;

        if (idealweight == weight) {

            System.out.println("У Вас идеальный вес!");

        }
        if (idealweight < weight) {

            System.out.println("Вам нужно похудеть");

        } else if (idealweight > weight) {

            System.out.println("Вам нужно поправиться");

        }
    }
}

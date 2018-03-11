package week3.methods.day1;

public class FormatterText {
    public static void main(String[] args) {

        int age = 27;
        String name = "Juls";

        System.out.printf("Hello %2$s! %nYou are %d years old. ", age, name);

        System.out.printf("\tPI = %.2f", Math.PI);

     /*  System.out.printf("PI = %2f%n", Math.PI);
        System.out.printf("PI = %0.2f%n", Math.PI);
        System.out.printf("PI = %0.4f%n", Math.PI);
        System.out.printf("PI = %0.6f%n", Math.PI);
        System.out.printf("PI = %0.3f%n", Math.PI); */
    }
}

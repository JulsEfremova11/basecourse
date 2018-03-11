package week3.methods.day1;

public class StringIntro {
    public static void main(String[] args) {
        String name = "Juls";

        String name2 = new String("Juls");

        char[] array = {'J', 'u', 'l', 's'};

        String name3 = new String(array);

        System.out.printf("Name - %s, name2 - %s, name3 - %s ",name, name2, name3 );
    }
}

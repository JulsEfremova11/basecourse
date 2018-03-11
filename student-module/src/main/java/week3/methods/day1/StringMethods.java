package week3.methods.day1;

import methods.Array;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Julsu";
        System.out.println(name.equals("Juls"));

        System.out.println(name.length());

        String newString = name.toUpperCase();
        System.out.println(newString);

        System.out.println(newString.toLowerCase());

        System.out.println(name.indexOf('l'));
        System.out.println(name.lastIndexOf('s'));

        System.out.println(name.indexOf('u', 2));

        System.out.println(name.charAt(4));

        System.out.println(name.substring(3));

        System.out.println(name.substring(1,3));

        System.out.println(name.contains("su"));

        System.out.println(name.equalsIgnoreCase("ul"));

        System.out.println(name.compareTo("Apple"));

        String text = "Hello my name is Juls";

        System.out.println("split");
        String[] words = text.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println(words.length);

        char[] letters = name.toCharArray();
        System.out.println(Arrays.toString(letters));

        System.out.println(name.isEmpty());
        System.out.println("".isEmpty());

        System.out.println(name.replace('u', 'a'));

        System.out.println(name.startsWith("J"));
        System.out.println(name.endsWith("J"));


    }
}

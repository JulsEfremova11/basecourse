package week3.methods.day1;

import java.util.Arrays;

public class WordsSorting {
    public static void main(String[] args) {

        String[] array = {"Yevhen", "anna", "Hanna", "Julia", "Vadim", "Alexsandr"};


        for (int j=0; j < array.length; j++) {
            boolean wasSwap = false;
            for (int i = 0; i < array.length - 1 -j; i++) {
                if (array[i].compareToIgnoreCase(array[i + 1])>0) {
                    String temp = array[i];

                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    wasSwap = true;
                }
            }
            if (!wasSwap) break;
        }
        System.out.printf(Arrays.toString(array));
    }
}

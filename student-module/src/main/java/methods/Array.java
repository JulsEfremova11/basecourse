package methods;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        printArray(array);

    }

    public static void printArray(int[] nums) {
        if (nums == null){
            System.out.println("null");
            return; //выход из метода
        }

        if (nums.length == 0) {
            System.out.println("{}");
            return; //выход из метода
        }
System.out.print("{");
        for (int i = 0; i < nums.length-1; i++) {

            System.out.print(nums[i] + ", ");

        }
        System.out.println(nums[nums.length - 1] + "}");
    }

    public static void printArray(double[] nums) {
        if (nums == null){
            System.out.println("null");
            return; //выход из метода
        }

        if (nums.length == 0) {
            System.out.println("{}");
            return; //выход из метода
        }
        System.out.print("{");
        for (int i = 0; i < nums.length-1; i++) {

            System.out.print(nums[i] + ", ");

        }
        System.out.println(nums[nums.length - 1] + "}");
    }

    public static String arrayToString(int[] array) {
        if (array == null){
            return null;
        }

        if (array.length == 0) {
            return "{}";
        }

        String string ="{";
        for (int i = 0; i < array.length - 1; i++) {

            string = string + array[i] + ", ";

        }
        string = string +array[array.length - 1] + "}";

        return string;

    }

    public static int[] findBiggerArrayHalf(int[] array) {

        if (array == null) {
            return null;
        }

        if (array.length == 0){
            return new int[0];
        }

        int[] firstHalf = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] secondHalf = Arrays.copyOfRange(array,array.length - firstHalf.length, array.length);

        double firstHalfAverage = findAverage(firstHalf);
        double secondHalfAverage = findAverage(secondHalf);

        if (firstHalfAverage > secondHalfAverage) {
            return firstHalf;
        } else if (secondHalfAverage > firstHalfAverage) {
            return secondHalf;
        } else {
            return array;
        }
    }

    private static double findAverage(int[] array) {
        double sum=0;

        for (int i=0; i < array.length; i++){
            sum = sum + array[i];
        }
        return  sum / array.length;
    }

    public static int findCountNumber(int[] array, int number) {
        if (array == null){
            return -1;
        }

        if (array.length == 0) {
            return 0;
        }

        int counter = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] == number) {
                counter++;
            }
        }
        return counter;
    }
}

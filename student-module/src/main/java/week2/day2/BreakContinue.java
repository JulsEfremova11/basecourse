package week2.day2;

public class BreakContinue {
    public static void main(String[] args) {
     int[] array = new int[15];

        for (int i=0; i < array.length; i++) {
//array[i] = i;

            if (i == 6 || i == 13) {
                break;
            }
                System.out.print(array[i] + ", ");

        }

    }
}

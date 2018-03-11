package week2;

import base.TaskUtils;

import java.util.Arrays;

/**
 * Сдвинуть массив на заданное количество позиций.
 * Длина массива > 0
 *
 *      {1,2,3,4,5} -> 2 = {4,5,1,2,3};
 *      {1,2,3,4,5} -> 3 = {3,4,5,1,2}
 */
public class Task15 {
    public static void main(String[] args) {

       // int[] array = TaskUtils.arrayConverter(Arrays.copyOfRange(args, 1, args.length));
       // int position = Integer.parseInt(args[0]);

        int[] array = {1,2,3,4,5};
        int position = 2;

        for (int i = 0; i < array.length; i++){
 //for (int k = 2;; )
           array[position] = array[0];
           array[position+1] = array[1];
           array[position+2] = array[2];;
           array[position-2] = array[3];;
           array[position-1] = array[4];;

            System.out.print(array[0]+", "+ array[1] +", "+array[2]+", "+array[3]+", "+array[4]);
        }

    }
}

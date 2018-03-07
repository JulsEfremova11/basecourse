package week2;

import base.TaskUtils;

import java.util.Arrays;

/**
 * 6. Вывести в консоль элементы той половины массива у которой среднее арифметическое максимальное.
 * Если длина массива - непарное число, то средний элемент не принимать в расчет.
 * Если среднее арифметическое половинок массива одинаковая, то вывести в консоль весь массив.
 * В случае, если массив == null или длинна массива == 0 - на экран вывести null или {}.
 *
 * {4, 19, 28, 25, 2, 9, 6, 17} -> {4, 19, 28, 25}
 * {7, 2, 15, 99, 12, 14, 18} -> {12, 14, 18}
 * {7, 2, 15, 99, 3, 14, 7} -> {7, 2, 15, 99, 3, 14, 7}
 */
public class Task6 {
    public static void main(String[] args) {

        int[] array = TaskUtils.arrayConverter(args);
// int[] array = {84, 99, 43, 31, 12, 79, 6, 17, 55};     
	  int sum1 = 0;     
	  int sum2 = 0;               
	  int arrayHalf = array.length / 2;             
	for (int i=0; i < array.length; i++) {      
		
	  	if (i >= 0 && i < arrayHalf) {    
	  		
			sum1 += array[i];  }      
		
	}
	  	sum1= sum1/arrayHalf;   
	  	
  	for (int i=arrayHalf; i < array.length; i++) {   
  		
		if (i >= arrayHalf && i < array.length) { 
			
			sum2 += array[i];  }      
  		
  	} 
		sum2 = sum2/arrayHalf;              
System.out.print("{");
if (sum1 > sum2) {
for (int i=0; i < arrayHalf-1; i++)  {
	if (sum1 > sum2) { 
		System.out.print(array[i]+", "); 
	}  
}
	System.out.print(array[arrayHalf-1] + "}");
} else {
for(int i=arrayHalf; i < array.length-1; i++) {
    System.out.print(array[i]+", ");
    
} 
	
	 System.out.print(array[array.length - 1] + "}");
}
        

    }
}

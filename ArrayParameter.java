
// create an array program that has 10 elements and pass it to methods min() and max(). 
// calculate the minimumm and maximum values of the given array respectively

import java.util.Arrays;

public class ArrayParameter {
    
    static int min(int[] myArray) {
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        return min;
    }

    static int max(int[] myArray) {
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int myArray[] = { 0, 1, 2, -3, 4, 5, 32, 7, 8, 9 };
        System.out.println("Min: " + Integer.toString(min(myArray)));
        System.out.println("Max: " + Integer.toString(max(myArray)));
    }
}


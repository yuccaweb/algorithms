package sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String args[]) {
        //one more testing of our bubble sort code logic in Java
        int[] test = {4, 5, 3, 8, 2, 9, 1, 6, 7};
        bubbleSort(test);
    }

    public static void bubbleSort(int[] unsorted) {
        System.out.println("Unsorted array before sorting : " + Arrays.toString(unsorted));

        // Outer loop - need n-1 iteration to sort n elements
        for (int i = 0; i < unsorted.length - 1; i++) {

            //Inner loop to compare and swap adjacent numbers
            //After each iteration one index from last is sorted
            for (int j = 1; j < unsorted.length - i; j++) {

                //If current number is greater than swap those two
                if (unsorted[j - 1] > unsorted[j]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j - 1];
                    unsorted[j - 1] = temp;
                }
            }
            System.out.printf("Array after %d pass %s: %n", i + 1, Arrays.toString(unsorted));
        }
    }

}

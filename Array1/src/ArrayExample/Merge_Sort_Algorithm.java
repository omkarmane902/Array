package ArrayExample;

import java.util.Arrays;

public class Merge_Sort_Algorithm {

    public static void main(String[] args) {

        int[] arr = {10, 3, 12, 7, 2, 11, 9};

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(" Array: " + Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr, int start, int end) {
    	
        // Base condition to stop recursion
    	
        if (start >= end) {
            return;
        }

        int middle = (start + end) / 2;

        // Recursive calls
        
        mergeSort(arr, start, middle);
        
        mergeSort(arr, middle + 1, end);

        // Merge the sorted halves
        merge(arr, start, middle, end);
    }

    public static void merge(int[] arr, int start, int middle, int end) {

        int leftSizeArr = middle - start + 1;
        
        int rightSizeArr = end - middle;

        int[] leftArray = new int[leftSizeArr];
        
        int[] rightArray = new int[rightSizeArr];

        // Copy data to temp arrays
        
        for (int i = 0; i < leftSizeArr; i++) {
        	
            leftArray[i] = arr[start + i]; // corrected from arr[i]
        }

        for (int j = 0; j < rightSizeArr; j++) {
        	
            rightArray[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0, k = start;

        // Merge the temp arrays back into arr
        while (i < leftSizeArr && j < rightSizeArr) {
        	
            if (leftArray[i] <= rightArray[j]) {
            	
                arr[k++] = leftArray[i++];
                
            } else {
            	
                arr[k++] = rightArray[j++];
            }
        }

        // Copy remaining elements
        while (i < leftSizeArr) {
        	
            arr[k++] = leftArray[i++];
        }

        while (j < rightSizeArr) {
        	
            arr[k++] = rightArray[j++];
        }
    }
}

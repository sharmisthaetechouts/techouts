package CJ5.Arrays;

import java.util.Arrays;

public class ArraysClassExampleDemo {
    public static void main(String[] args) {

        int arr[] = {50, 10, 40, 20, 30};

        // Sorting array
        Arrays.sort(arr);

        System.out.println("Sorted Array:");

        for(int i : arr) {
            System.out.print(i + " ");
        }

        // Searching element
        int index = Arrays.binarySearch(arr, 30);
        System.out.println("\nElement 30 found at index: " + index);
    }
}
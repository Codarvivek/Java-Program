package Sorting;

import Array.Print;

public class SelectionSort {
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(min!=i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,10,5,9,8};
        System.out.print("Original Array : ");
        Print.printArray(arr);
        selectionSort(arr);
        System.out.print("\nSorted Array :");
        Print.printArray(arr);
    }
}

package Sorting;

import Array.Print;

public class Question {
    static void placeZeroInLast(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]==0&& arr[j+1]!=0){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,0,5,0,3,4,0,21,11,0};
        placeZeroInLast(arr);
        Print.printArray(arr);
    }
}

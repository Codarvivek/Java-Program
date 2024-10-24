package Sorting;

import Array.Print;
//Space Complexity-----> O(1)
// Time Complexity-----> O(n^2)
public class BubbleSort {
    static void swap(int [] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void bubbleSort(int [] arr){
        boolean flag=false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr, j, j + 1);
                    flag=true;
                }
            }
            if(!flag)return;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,9,2,5,4,8,36,8};
        bubbleSort(arr);
        Print.printArray(arr);
    }
}

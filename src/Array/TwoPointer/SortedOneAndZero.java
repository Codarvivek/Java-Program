package Array.TwoPointer;

import Array.Print;

public class SortedOneAndZero {
    static void swap(int arr[],int left,int right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
    }
    static void sortOneZero(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        for (int i = 0; i < n; i++) {
           while (left<right){
               if(arr[left]==1 && arr[right]==0){
                   swap(arr,left,right);
                   left++;
                   right--;
               }
               if(arr[left]==0){
                   left++;
               }
               if(arr[right]==1){
                   right--;
               }
           }
        }
    }
    public static void main(String[] args) {
        int [] arr={1,0,1,0,1,0,0,0,1};
        System.out.println("\nBefore Sorted");
        Print.printArray(arr);
        System.out.println("\nAfter Sorted");
        sortOneZero(arr);
        Print.printArray(arr);
    }
}

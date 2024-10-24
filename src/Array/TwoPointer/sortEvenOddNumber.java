package Array.TwoPointer;

import Array.Print;

//Given An array of integers 'a' move all the even integers at the beginning of the array followed by all odd integers .The relative order not matter .Return any array that satisfies the condition.
public class sortEvenOddNumber {
    static void swap(int arr[],int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void oddEvenSorted(int arr[]){
        int l=arr.length;
        int left=0;
        int right=l-1;
        while (left<right){
            if(arr[left]%2==0 && arr[right]%2!=0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2!=0){
                left++;
            }
            if(arr[right]%2==0){
                right--;
            }
        }
    }
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10,12};
    oddEvenSorted(arr);
    Print.printArray(arr);
    }
}

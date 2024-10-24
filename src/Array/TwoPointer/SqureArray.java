package Array.TwoPointer;

import Array.Print;
//Given an Integers array arr sorted in non-decreasing order,return an array of the square of each number sorted in non decreasing order.
import java.util.Arrays;

public class SqureArray {
    static void revers(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    static int[] squareArray(int[] arr){
        int ans[]=new int[arr.length];
        int left=0,k=0;
        int right=arr.length-1;
        while (left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
               ans[k++]=arr[left]*arr[left];
               left++;

            }
            else {
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-10,-2,1,3,4,5,6,7};
        int ans[]=squareArray(arr);
        revers(ans);
        Print.printArray(ans);

    }
}

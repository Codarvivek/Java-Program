package Array;
import java.util.Arrays;

import java.lang.reflect.Array;

public class FindLargetSmallest {
    static int[] findLargestSmallestElement(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }if (arr[i] < smallest) {
                smallest=arr[i];
            }
        }
        int resultArray[]={largest,smallest};
        return resultArray;
    }
    static int[] largestSmallestUsingBuilt(int arr[]){
        Arrays.sort(arr);
        int []ans={arr[0],arr[arr.length-1]};
        return ans;

    }
    public static void main(String[] args) {
        int arr[]={1,5,9,6,8,80,100,9};
        int[] result=findLargestSmallestElement(arr);
        for (int i : result) {
            System.out.print(i+" ");
        }
        int[] ans=largestSmallestUsingBuilt(arr);
        System.out.print("\n");
        for (int an : ans) {
            System.out.print(an+" ");
        }
    }
}

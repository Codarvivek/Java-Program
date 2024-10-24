package Array;

import java.util.Arrays;

public class KthLargetElement {
    static int kthLarget(int arr[]){
        Arrays.sort(arr);
        int firstLargest=arr[arr.length-1];
        int secondLarget=arr[arr.length-2];
    return  secondLarget;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,9};
        System.out.print("Second Largest :"+kthLarget(arr));


    }
}

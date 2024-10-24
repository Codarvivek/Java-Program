package Array.TwoPointer;



import java.util.Arrays;

public class Question {
    public static int twoSum(int[] arr, int target) {
        int st=0;
        int end=arr.length-1;
        int ans=0;
        while(st<end){
            int total=arr[st]+arr[end];
            if(total==target){
                ans++;
                end--;
            }
            else if(total>target){
                end--;
            }
            else{
                st++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,7,8,9,10,14,15,16};
        int ans=twoSum(arr,17);
        System.out.println(ans);
    }
}


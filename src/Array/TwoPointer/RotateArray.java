package Array.TwoPointer;
//Rotate array by kth steps


import Array.Print;

public class RotateArray {
    static int[] rotateArrayStep(int[] arr,int k){
        int [] ans=new int[arr.length];
        int n=arr.length;
        int step=k%n;
        int j=0;
        for (int i = n-step;i<n ; i++) {
            ans[j++]=arr[i];
        }
        for (int i = 0; i <=n-step-1; i++) {
            ans[j++]=arr[i];
        }
        return ans;
    }
    //Reverse Array Without Using Extra Space..........................................................................
    static void reverseArray(int[]arr ,int j,int k){
        while (j<k){
            int temp=arr[j];
            arr[j]=arr[k];
            arr[k]=temp;
            j++;
            k--;
        }
    }
     static void rotateArraySteps(int[] arr,int x){
        int n=arr.length;
        int k=x%n;
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int rotateStep=5;
        rotateArraySteps(arr,rotateStep);
        Print.printArray(arr);

    }
}

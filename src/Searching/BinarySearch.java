package Searching;

public class BinarySearch {
    static boolean binarySearch(int[] arr,int target){
        int l=arr.length;
        int start=0;
        int end=l-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid])return true;
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,5,6,8,9,10};
        int i=10;
        while(i>0){
            System.out.println(i+" is available "+binarySearch(arr,i));
            i--;
        }
    }
}

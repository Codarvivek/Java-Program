package Searching.Question;

public class FindMInElement {
    static int findMinElement(int[] arr){
        int st=0;
        int end=arr.length-1;
        int min=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>arr[arr.length-1]){
                st=mid+1;

            }
            else if(arr[mid]<arr.length-1){
                end=mid-1;
                min=mid;

            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr={3,4,5,6,1,2};
        System.out.println(findMinElement(arr));
    }
}

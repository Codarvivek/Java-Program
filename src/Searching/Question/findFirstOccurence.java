package Searching.Question;

public class findFirstOccurence {
    static int FindFirstOccurence(int []arr,int target){
        int l=arr.length;
        int start=0;
        int end=l-1;
        int fo=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                fo=mid;
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int [] arr={1,2,5,5,5,6,6,9,9,18,18};
        System.out.println(FindFirstOccurence(arr,18));
    }
}

package Array;

public class SwapKth {
    static void swapKthElement(int[] arr,int k){
        int first=k-1;
        int last=arr.length-k;
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int k=3;
        swapKthElement(arr,k);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}

package Array;

public class SortZeroAndOne {
    static void sortZeroOneArray(int[]arr){
        int l=arr.length;
        int zeros=0;
        for (int i = 0; i < l; i++) {
            if(arr[i]==0)zeros++;
        }
        for (int i = 0; i < l; i++) {
            if(i<zeros){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={1,0,1,1,0,0,0,1,0,0,1};
        System.out.println("Original Array");
        Print.printArray(arr);
        sortZeroOneArray(arr);
        System.out.println("\nSorted Array");
        Print.printArray(arr);

    }
}
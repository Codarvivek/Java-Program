package Array;

public class FindPrefixSum {
    static void findPrefixSum(int []arr){
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            arr[i]=arr[i-1]+arr[i];
        }

    }
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        //System.out.printf("Original Array\n");
        Print.printArray(arr);
       findPrefixSum(arr);
        System.out.println("\nPrefix Array");
        Print.printArray(arr);
    }
}

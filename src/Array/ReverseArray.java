package Array;

public class ReverseArray {
    static void reverseArray(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println("Original Array");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("\nReverse Array");
        reverseArray(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}

package Array;
//Given Array is Sorted Or Not

public class CheakArraySorted {
    static boolean cheakArraySorted(int[] arr){

        for (int i = 1; i < arr.length; i++) {
           if(!(arr[i]>arr[i-1])||(arr[i]<arr[i-1])){
               return false;
           }

        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8};
        boolean cheak=cheakArraySorted(arr);
        if(cheak){
            System.out.print("Array is Sorted");
        }
        else{
            System.out.print("Array is not Sorted");
        }
    }
}

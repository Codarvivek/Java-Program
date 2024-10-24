package Recursion;
//Find the sum of the element of the Array
public class Questions5 {
    static int sumOfArray(int [] arr,int idx){
        if(arr.length-1==idx){
            return arr[idx];
        }
        int smallSum=sumOfArray(arr,idx+1);
        return smallSum+arr[idx];
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,9};
        System.out.println(sumOfArray(arr,0));
    }
}

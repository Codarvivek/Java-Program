package Recursion;
//Print the max value of the array
public class Questions4 {
    static int maxInArray(int [] arr,int idx){
        if(arr.length-1==idx){
            return arr[idx];
        }
        int smallans=maxInArray(arr,idx+1);
        return Math.max(arr[idx],smallans);
    }
    public static void main(String[] args) {
        int[] arr={3,10,3,2,5};
        System.out.print(maxInArray(arr,0));
    }
}

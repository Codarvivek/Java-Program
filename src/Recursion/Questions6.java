package Recursion;

public class Questions6 {
    static boolean findElement(int [] arr,int target,int idx){
        if(arr.length==idx)return false;
        //self work
        if(arr[idx]==target)return true;
        if(findElement(arr,target,idx+1)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {14, 15, 26, 22, 28, 19, 75};
        int find = 14;
        if(findElement(arr,find,0)==true){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}

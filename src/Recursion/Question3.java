package Recursion;
// Given an Array , Print all its values recursively
public class Question3 {
    static void printrec(int []arr,int len){
        if(len<=0){
            return;
        }
        printrec(arr,--len);
        System.out.println(arr[len]);
    }
    public static void main(String[] args) {
        int [] arr={5,4,6,8,7,9};
        printrec(arr,arr.length-1);
    }
}

package Recursion;
// Given  a number n. Find the sum of natural number till n but with alternate signs.
// That means n=5 then you have to return 1-2+3-4+5=3 as your answer.
// Constraints : 0<=n<10e6
public class Question2 {
    static int findSum(int n){
        if(n==0)return 0;

        if(n%2==0)return findSum(n - 1) - n;

        return findSum(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println(findSum(5));
    }
}

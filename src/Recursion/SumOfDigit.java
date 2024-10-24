package Recursion;
//Given an Integer ,Find out the sum of its digits using recursion
// 1234 => 1+2+3+4=?
public class SumOfDigit {
    static int sumOfDigit(int n){
        //base case
        if(n>=0 && n<=9){
            return n;
        }
        //Small Work
        //ans=small ans+last digit

        int smallAns=sumOfDigit(n/10);
        //Self Work
        return smallAns+n%10;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigit(1234));
    }
}

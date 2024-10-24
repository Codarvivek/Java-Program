package Recursion;
//Given two numbers x and y. Find the greatest common divisor of x and  y using recursion
// Constraints : 0<=0,y<1e6
// Input : x=4,y=9
// Output :1
public class GCD {
    static int findGCD(int n, int m){
        int min=Math.min(n,m);
        int gcd=1;
            while (min>0){
                if((n%min==0) && (m%min==0)) {
                    return min;
                }
                    min--;
            }
        return gcd;
    }
    static int findGCD2(int x, int y){
        while (x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    //using recursion find GCD
    static int findGCD3(int x,int y){
        if(y==0)return x;
        return findGCD3(y,x%y);
    }
    public static void main(String[] args) {
        System.out.println(findGCD(16,12));
        System.out.println(findGCD2(12,16));
        System.out.println(findGCD3(15,24));
    }
}

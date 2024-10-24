package Loop;

import java.util.Scanner;

public class ReverseNumber {
    static int reverseNumber(int num){
        int n=num;
        int ans=0;
        while (n>0){
            ans=(ans*10)+(n%10);
            n=n/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(reverseNumber(num));
    }
}

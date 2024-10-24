package Loop;
//find the sum of digit in a given number n

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.print("Enter the number n :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int sum=0;
        while (m>0){
            sum=sum+m%10;
            m=m/10;

        }
        System.out.printf("Sum of %d is %d",n,sum);
    }
}

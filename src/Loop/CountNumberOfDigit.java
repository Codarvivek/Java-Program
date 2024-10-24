package Loop;

import java.util.Scanner;

public class CountNumberOfDigit {
    public static void main(String[] args) {
        System.out.print("Enter your number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int count=0;
        while(m>0){
            m=m/10;
            count++;
        }
        System.out.printf("Number of digit %d is %d",n,count);
    }
}

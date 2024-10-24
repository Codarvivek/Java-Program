package Loop;
// find the sum of following series
// S=1-2+3-4+5..n

import java.util.Scanner;

public class FindSumOfSeries {
    public static void main(String[] args) {
        System.out.print("Enter the number of nth terms :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i = 0; i < n+1; i++) {
            if(i%2==0){
                sum=sum-i;
            }
            else{
                sum=sum+i;
            }
        }
        System.out.printf("Ans =%d",sum);

    }
}

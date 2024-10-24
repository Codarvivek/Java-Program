package Loop;

import java.util.Scanner;

public class FactorialNumber  {
    static int count=0;
    static  int factorial(int num){
        int fact=1;
        if(num<0){
            return 0;
        }
        else if(num==1){
            return 1;
        }
        else{
            for (int i = 2; i <num+1 ; i++) {
                fact=fact*i;
            }
        }
        return fact;

    }
    static long recFact(int num){
        count++;
        System.out.printf("\nFunction Called %d times",count);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(num==1){
            return 1;
        }
        return num*recFact(num-1);
    }
    public static void main (String[] args) {
        int start=(int)System.currentTimeMillis();
        System.out.print("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.printf("Factorial of %d = %d",num,recFact(num));
        int end=(int)System.currentTimeMillis();
        System.out.printf("\nTotal Execution Time :%d sec",(end-start)/1000);
    }
}

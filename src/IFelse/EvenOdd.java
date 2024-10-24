package IFelse;

import java.util.Scanner;
class Input{
    static int inputNumber(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        return n;
    }
}
//Take the positive integer input and tell if it even or add

public class EvenOdd {
    public static void evenOdd() throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Positive Integer :");
        int num=sc.nextInt();
        System.out.println("Wait 5 sec.....");
        Thread.sleep(5000);
        if(num%2==0) System.out.printf("%d is even number",num);
        else System.out.printf("%d is odd number",num);
    }
    public static void main(String[] args) throws InterruptedException {
       evenOdd();
    }
}

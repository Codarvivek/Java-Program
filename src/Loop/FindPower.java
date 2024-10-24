package Loop;

import java.util.Scanner;

class Input{
    static int input(){
        System.out.print("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        return num;
    }
}
public class FindPower {
    public static void main(String[] args) {
        int num=Input.input();
        int paw=Input.input();
        int ans=1;
        for (int i = 1; i <paw+1 ; i++) {
            ans=ans*num;
        }
        System.out.printf("%d to the power of %d is %d",num,paw,ans);
    }
}

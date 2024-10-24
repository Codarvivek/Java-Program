package Recursion;

import java.util.Scanner;

public class Reverse {
    static String reverseString(String s,int idx){
        if(s.length()==idx)return "";
        String smallAns=reverseString(s,idx+1);
        char current=s.charAt(idx);
        return smallAns+current;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev=reverseString(s,0);
        if(rev.equals(s)){
            System.out.printf("%s is Palindrome",s);
        }
        else{
            System.out.printf("%s is Not Palindrome",s);
        }
    }
}

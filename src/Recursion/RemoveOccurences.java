package Recursion;

import java.util.Scanner;

public class RemoveOccurences {
    static String removeA(String s,int idx){
        if(s.length()==idx)return "";
        String smallAns=removeA(s,idx+1);
        char current=s.charAt(idx);
        if(current!='A') return current + smallAns;
        else {
            return smallAns;
        }
        //return smallAns+current;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeA(s,0));
    }
}

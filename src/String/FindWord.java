package String;

import java.util.Objects;
import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        String sen="Computer is a electronic Device";
        Scanner sc=new Scanner(System.in);
        String search=sc.next();
        int idx=0;
        for (int i = 0; i < sen.length(); i++) {
            char ch=sen.charAt(i);
            if(ch==' ' || i==sen.length()-1){
                String word=sen.substring(idx,i+1);
                idx=i+1;
                System.out.println(word);
                if(word.equals(search)){
                    System.out.println("Yes\""+word+"\" is find...");
                    break;
                }
            }
        }
    }
}

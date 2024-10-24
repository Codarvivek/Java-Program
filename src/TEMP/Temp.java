package TEMP;
import java.util.*;
public class Temp {
    static int addDigits(int num) {
        int ans=0;
        int ansfinal=0;
        while(num>0){
            int temp=num%10;
            ans+=temp;
            num/=10;
        }
        while(ans>0){
            int temp=ans%10;
            ansfinal+=temp;
            ans/=10;
        }
        return ansfinal;
    }
    public static void main(String[] args) {
        System.out.println(addDigits(38));

}
}
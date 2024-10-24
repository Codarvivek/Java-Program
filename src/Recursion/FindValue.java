package Recursion;
//Given two number p & q ,find the value p^q using a recursion function
public class FindValue {
    static int fineValue(int p,int q){
        if(q==0){
            return 1;
        }
        return fineValue(p,q-1)*p;
    }
    //Alternate Approach of same QUESTION...................................
    static int findValue2(int p,int q){
        if(q==0){
            return 1;
        }
        int smallWork=fineValue(p,q/2);
        if(q%2==0){
            return smallWork*smallWork;
        }
        return smallWork*smallWork*p;
    }
    public static void main(String[] args) {
        System.out.println(fineValue(5,3));
        System.out.print(findValue2(5,3));
    }
}

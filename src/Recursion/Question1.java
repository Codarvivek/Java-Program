package Recursion;
//Given a number num and a value k. Print k multiple of num
//Constraints:k>0
//Input 1 :num=12,k=5
//Output 1 :12,24,36,48,60
public class Question1 {
    static void FindK(int num,int k){
        if(k==1){
            System.out.println(num);
            return ;
        }
        FindK(num,k-1);
        System.out.println(num*k);
    }
    public static void main(String[] args) {
        FindK(12,5);
    }
}

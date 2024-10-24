package IFelse;

public class ReverseNumber {
    static long reverseNumber(long num){
        long ans=0;
        while(num>0){
            long last=num%10;
            ans=(ans*10)+last;
            num/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        long num=200;
        System.out.println(num);
        System.out.println("Reverse Number :"+reverseNumber(num));
    }
}

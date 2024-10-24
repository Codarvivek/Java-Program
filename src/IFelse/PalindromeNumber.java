package IFelse;

public class PalindromeNumber {
    static boolean SumOfDigitIsPalindrom(int num){
        int t=num;
        int sum=0;
        while(t>0){
            int last=t%10;
            sum=sum+last;
            t/=10;
        }
        int temp=sum;
        int ans=0;
        while(temp>0){
            int last=temp%10;
            ans=ans*10+last;
            temp/=10;
        }
        if(ans==sum)return true;
        else return false;
    }
    public static void main(String [] args){
        int num=56;
        if(SumOfDigitIsPalindrom(num)){
            System.out.printf("YES");
        }
        else{
            System.out.printf("NO");
        }
    }
}

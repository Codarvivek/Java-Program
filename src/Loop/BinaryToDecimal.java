package Loop;

public class BinaryToDecimal {
    static long binaryToDecimal(int binaryNumber){
        long ans=0;
        int pow=1;
        while(binaryNumber>0){
            int temp=binaryNumber%2;
            ans+=(temp*pow);
            pow*=2;
            binaryNumber=binaryNumber/10;
        }
        return ans;
    }
    static int decimalToBinary(int num){
        int ans=0;
        while (num>0){
            if(num%2!=0){
                ans=ans*10+(num%2);
            }
            else{
                ans=ans*10;
            }
            num=num/2;
        }
   int temp= ReverseNumber.reverseNumber(ans);

        return temp;
    }
    public static void main(String[] args) {
        //int binaryNumber=Input.input();
        for (int i = 0; i < 50; i++) {
            System.out.println(i+"="+decimalToBinary(i));
        }

    }
}

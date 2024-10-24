package IFelse;

public class ArmstrongNumber {
    static boolean isArmstrong(int num){
        int temp=num;
        int ans=0;
       while (temp>0){
         int last=temp%10;
         ans=ans+last*last*last;
         temp=temp/10;
       }
        return ans == num;
    }
    public static void main(String[] args) {
        int num=151;
        if (isArmstrong(num)){
            System.out.printf("True");
        }
        else {
            System.out.printf("False");
        }
    }
}

package IFelse;
//Take Positive Integer input  and tell if it is divisible by 5 and 3..
public class DivideNumber3and5 {
    public static void main(String[] args) {
        System.out.print("enter your number :");
        int num=Input.inputNumber();
        if(num%3==0 && num%5==0){
            System.out.println("The number is Divide by 5 and 3");
        }
        else{
            System.out.println("The number is not Divide by 5 and 3");
        }
    }
}

package IFelse;
//Take Positive Integer input and tell  if it is a three digit number or not
public class ThreeDigitNumber {
    public static void main(String[] args) {
        System.out.print("Enter your Number :");
        int num=Input.inputNumber();
        if(num>99 && num<1000){
            System.out.println("Your Number is Three Digit");
        }
        else {
            System.out.println("Your number is not a three Digit");
        }
    }
}


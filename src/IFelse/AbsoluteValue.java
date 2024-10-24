package IFelse;
//Take the integer input and print the absolute value of that integer
public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.print("Enter your Integer :");
        int num=Input.inputNumber();
        if(num<0) System.out.println("Absolute value :"+(num*(-1)));
        else System.out.println("Absolute value :"+num);

    }
}

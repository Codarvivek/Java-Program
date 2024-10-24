package IFelse;

public class Greatest3Number {
    public static void main(String[] args) {
        System.out.print("Enter the First Number :");
        int num1=Input.inputNumber();
        System.out.print("Enter the Second Number :");
        int num2=Input.inputNumber();
        System.out.print("Enter the Second Number :");
        int num3=Input.inputNumber();
        int greatest=num1>num2?num1>num3?num1:num3:num2>num3?num2:num3;
        System.out.println(greatest);
    }
}

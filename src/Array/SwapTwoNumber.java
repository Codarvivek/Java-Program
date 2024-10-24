package Array;

public class SwapTwoNumber {
    static void swap(int a,int b){
        System.out.print("Before Swap Value ");
        System.out.print("\na ="+a);
        System.out.print("\nb ="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("\nAfter Swap Value");
        System.out.print("\na ="+a);
        System.out.print("\nb ="+b);
    }
    public static void main(String[] args) {
        int a=5;
        int b=8;
        swap(a,b);
    }
}

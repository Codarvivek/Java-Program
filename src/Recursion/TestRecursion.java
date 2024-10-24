package Recursion;

public class TestRecursion {
    static void Print(int n){
 try {
     System.out.print(n);
     Print(n - 1);
     System.out.print(n+" ");
 } catch (Exception e) {
     System.out.printf("Stack OverFlow");
 }


    }
    public static void main(String[] args) {
        Print(10);
    }
}

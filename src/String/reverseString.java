package String;

public class reverseString {
    public static void main(String[] args) {
        String str="Welcome Vivek";
        System.out.print(new StringBuilder(str).reverse().append(25));
        System.out.print("\n"+str.toUpperCase());
    }
}

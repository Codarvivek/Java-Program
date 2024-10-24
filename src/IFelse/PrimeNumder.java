package IFelse;

public class PrimeNumder {
    static String cheakPrime(int num){
        for(int i=2;i<num;i++) {
            if (num % i == 0) {
                System.out.println("Number is divide by "+i);
                return "NOT PRIME";

            }
        }
        return "Prime NUmber";
    }
    public static void main(String[] args) {
        int num=2;
        String msg=cheakPrime(num);
        System.out.println(msg);
    }

}

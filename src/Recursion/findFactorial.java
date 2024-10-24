package Recursion;
class Factorial{
    public long findFactorial(int num){
        if(num<0){
            return -1;
        }
        else if(num==1){
            return 1;
        }
        return num*findFactorial(num-1);
    }
}

public class findFactorial {
    public static void main(String[] args) {
        Factorial obj1=new Factorial();
        for (int i = 0; i < 50; i++) {
            System.out.printf("Factorial of %d is %d\n",i,obj1.findFactorial(i));
        }
    }
}

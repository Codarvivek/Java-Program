package Loop;

public class Pattern {
    static void P1(int row,int col){
        for (int i = 1; i < row+1; i++) {
            for (int j = 1; j < col+1; j++) {
                if(i==1||j==1||row==i||col==j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void P2(int row){
        for (int i = 1; i <row+1 ; i++) {
            for (int j = row-i+1; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void P3(int num){
        for (int i = 1; i < num+1 ; i++) {
            for (int j = i; j <num+1 ; j++) {
                System.out.print(j+" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void P4(int row,int col){
        for (int i = 1; i < row+1 ; i++) {
            for (int j = 1; j <col+1 ; j++) {
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else {
                    System.out.print(2+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=10;
        int col=9;
        P3(50);

    }
}

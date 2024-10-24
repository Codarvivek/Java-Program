package Array.Array2D;

import java.util.Scanner;

public class PascalTringle {
    static int[][] pascalTriange(int n){
        int [][] p=new int[n][];
        for (int i = 0; i < n; i++) {
            p[i]=new int[i+1];
            p[i][0]=p[i][i]=1;
            for (int j = 1; j < i; j++) {
                p[i][j]=p[i-1][j-1]+p[i-1][j];
            }
        }
        return p;
    }
    public static void main(String[] args) {
        System.out.print("Enter number of rows :");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int [][] ans=pascalTriange(row);
        System.out.println("\nPascal Triangle");
        Print2DArray.print2DArray(ans);
    }
}

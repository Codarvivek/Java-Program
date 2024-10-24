package Array.Array2D;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyTwoMatrix {
    static int[][] input2DMatix(int row,int column){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[row][column];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
              arr[i][j]= sc.nextInt();  
            }
        }
        return arr;
    }
    static int[][] multiplyMatrix(int[][] arr1,int[][] arr2,int r1,int c1,int r2,int c2){
        if(c1!=r2){
            System.out.printf("Enter valid Matrix..........");
            return null;
        }
        int [][] ans=new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j <c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int r1 ,r2;
        int c1 ,c2;
        System.out.print("Enter the Matrix row and column");
        Scanner sc=new Scanner(System.in);
        r1=sc.nextInt();
        c1=sc.nextInt();

        System.out.println("Enter the Element of matrix");
        int Matrix1[][]=input2DMatix(r1,c1);

        System.out.print("\nEnter the Matrix row and column");
        r2=sc.nextInt();
        c2=sc.nextInt();
        System.out.println("Enter the Element of matrix");
        int Matrix2[][]=input2DMatix(r2,c2);


        System.out.println("\n\n===========================================================");
        System.out.println("Multiplication of Matrix1 and Matrix2 is");
        int [][] ans=multiplyMatrix(Matrix1,Matrix2,r1,c1,r2,c2);
        Array.Array2D.Print2DArray.print2DArray(ans);
        
    }
}

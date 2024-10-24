package Array.Array2D;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class flipMatrix {
    static  int[][] inputArray(int r,int c){
        Scanner sc=new Scanner(System.in);
        int[][] Matrix=new int[r][c];
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                Matrix[i][j]=sc.nextInt();
            }
        }
        return Matrix;
    }
    static void filpArrayMatrix(int[][] arr,int r,int c){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                int temp=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=temp;


            }

        }
    }
    public static void main(String[] args) {
        System.out.print("Enter Row And Column size:");
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int column=sc.nextInt();
        System.out.println("\n============Original Matrix ===========");
        int[][] Matrix=inputArray(row,column);
        Print2DArray.print2DArray(Matrix);
        System.out.println("\n================Flip Array===============");
        filpArrayMatrix(Matrix,row,column);
        Print2DArray.print2DArray(Matrix);
    }
}

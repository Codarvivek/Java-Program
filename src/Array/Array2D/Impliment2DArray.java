package Array.Array2D;
class Print2DArray{
    static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
public class Impliment2DArray {
    public static void main(String[] args) {
        int[][] arr=new int[4][3];
        int[][] arr2={
                {11,12,13},
                {14,15,16},
                {17,18,19}
        };
        Print2DArray.print2DArray(arr2);

    }
}

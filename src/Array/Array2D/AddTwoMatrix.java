package Array.Array2D;

public class AddTwoMatrix {
    static int[][] addTwoMatrix(int [][] arr1,int[][] arr2){
        int[][] sum=new int[arr1.length][arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return sum;
    }
        public static void main(String[] args) {
            int[][] arr=new int[4][3];
            int[][] arr2={
                    {11,12,13},
                    {14,15,16},
                    {17,18,19}
            };
            System.out.println("Matrix 1");
            Array.Array2D.Print2DArray.print2DArray(arr2);
            int[][] arr3={
                    {20,21,22},
                    {23,24,25},
                    {26,27,28}
            };
            System.out.println("Matrix 2");
            Array.Array2D.Print2DArray.print2DArray(arr3);
            System.out.println("Sum Of Matrix A and B ");
            int [][] sum=addTwoMatrix(arr2,arr3);
            Array.Array2D.Print2DArray.print2DArray(sum);
        }
    }


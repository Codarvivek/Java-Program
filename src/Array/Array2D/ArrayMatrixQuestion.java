package Array.Array2D;

public class ArrayMatrixQuestion {
    static void prifixSumArrar(int[][] arr) {
        for (int i = 0; i < (arr.length - 1); i++){
            for (int j = 1; j < arr[i].length - 1; j++){
                arr[i][j] += arr[i][j-1];
    }
}
    }
    public static void main(String[] args) {
        //float start=System.currentTimeMillis();
        int[][] arr={{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1}};
        Print2DArray.print2DArray(arr);

        prifixSumArrar(arr);
        System.out.println("Prefix sum of this Array");
        Print2DArray.print2DArray(arr);
        int l1=3,l2=5,r1=1,r2=4;
        int sum=0;

        for (int i = l1; i <=l2 ; i++) {
           sum=sum+arr[i][r2]-arr[i][r1-1] ;
        }
        //float end=System.currentTimeMillis();
        System.out.printf("%d sum \n",sum);
       // System.out.println("Total Time ="+(end));
}
}

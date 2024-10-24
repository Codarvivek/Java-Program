package Array.Array2D;

public class SpiralPrinting {
//    static void spiralPrint(int[][] matrix,int row,int col){
//        int topRow=0 ,bottomRow=row-1,leftCol=0,rightCol=col-1;
//        int totalElement=row*col;
//        int d=0;
//        while (d<totalElement){
//            //topRow -> leftCol to rightCol
//            for (int j = topRow; j <=rightCol && d<totalElement; j++) {
//                System.out.print(matrix[topRow][j]+" ");
//                d++;
//            }
//            topRow++;
//            //rightCol -> topRow to bottomRow
//            for (int i = topRow; i <= bottomRow && d<totalElement; i++) {
//                System.out.print(matrix[i][rightCol]+ " ");
//
//                d++;
//            }
//            rightCol--;
//            //bottomRow -> rightCol to leftCol
//            for (int j = rightCol; j >=leftCol && d<totalElement; j--) {
//                System.out.print(matrix[bottomRow][j]+" ");
//
//                d++;
//            }
//            bottomRow--;
//            //leftCol -> bottomRow to topRow
//            for (int i = bottomRow; i >=topRow && d<totalElement; i--) {
//                System.out.print(matrix[i][leftCol]+" ");
//
//                d++;
//            }
//            leftCol++;
//        }
//    }
    static int[][] spiralGenrate(int row,int col){
        int topRow=0 ,bottomRow=row-1,leftCol=0,rightCol=col-1;
        int totalElement=row*col;
        int d=0;
        int[][] matrix=new int[row][col];
        int data=1;
        while (d<totalElement){
            //topRow -> leftCol to rightCol
            for (int j = topRow; j <=rightCol && d<totalElement; j++) {
                matrix[topRow][j]=data;
                data++;
                d++;
            }
            topRow++;
            //rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && d<totalElement; i++) {

                matrix[i][rightCol]=data;
                data++;
                d++;
            }
            rightCol--;
            //bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >=leftCol && d<totalElement; j--) {

                matrix[bottomRow][j]=data;
                data++;
                d++;
            }
            bottomRow--;
            //leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >=topRow && d<totalElement; i--) {

                matrix[i][leftCol]=data;
                data++;
                d++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
       // spiralPrint(arr,4,4);
        int[][] matrix=spiralGenrate(4,4);
        Print2DArray.print2DArray(matrix);
    }
}

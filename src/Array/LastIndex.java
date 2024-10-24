package Array;
//Find the last occurrence of element x in a given array
public class LastIndex {
    static int findLastIndex(int [] arr,int n){
        int lastindex=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                lastindex=i;
            }
        }
        return lastindex;
    }
    public static void main(String[] args) {
        int [] arr={5,1,2,3,5,4,5};
        System.out.print(findLastIndex(arr,4)+"th index");
    }
}

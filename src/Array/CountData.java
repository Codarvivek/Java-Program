package Array;
//Count the number of occurrence of particular element in x
import java.lang.reflect.Array;

class CountData {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,2,3,4};
        int element=2;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                count++;
            }
        }
        System.out.printf("%d time",count);

    }
}

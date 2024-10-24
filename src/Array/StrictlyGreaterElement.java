package Array;
//Count the number of elements strictly greater than value of x?

import javax.swing.plaf.IconUIResource;

public class StrictlyGreaterElement {
    static int strictlyGreaterElementFind(int[] arr,int element){
        int noOfElement=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>element){
                noOfElement++;
            }
        }
        return noOfElement;
    }
    public static void main(String[] args) {
        int [] arr={5,5,1,4,8,2,3,6};
        System.out.println("Length of Array ="+arr.length);
        System.out.print(strictlyGreaterElementFind(arr,4));
    }
}

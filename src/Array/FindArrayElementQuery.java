package Array;

import java.util.Scanner;

public class FindArrayElementQuery {
    static int[] makefreqArray(int []arr){
        int [] freq=new int[10005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        int []arr={10,40,856,258,965,96,100};
        System.out.println(arr.length);
        int[] freq=makefreqArray(arr);
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter you number of query :");
        int q=sc.nextInt();
        while (q>0){
            q--;
            try {
                System.out.print("\nEnter Your Number to be searched :");
                int num=sc.nextInt();
                if(freq[num]>0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.printf(e.getMessage());
                System.out.println("Enter valid Range Of Number.........");
            }

        }
    }
}

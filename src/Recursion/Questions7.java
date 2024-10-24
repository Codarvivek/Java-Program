package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

//Given an Array arr of size N and an integer X. The Task is to find all the indices of the integer X in the array.
// INPUT :arr={1,2,3,4,5,2,2,5}, X=2
// OUTPUT : 1,5,6
public class Questions7 {
    static void findAllIndex(int []arr,int x,int idx){
        if(arr.length<=idx)return;
        if(arr[idx]==x){
            System.out.println(idx);
        }
        findAllIndex(arr,x,idx+1);
    }
    static ArrayList<Integer> findAllIndexx(int[] arr,int x,int idx){
       if(arr.length<=idx)return new ArrayList<Integer>();
       ArrayList<Integer> ans=new ArrayList<>();
       if(arr[idx]==x) ans.add(idx);
       ArrayList<Integer> smallAns=findAllIndexx(arr,x,idx+1);
       ans.addAll(smallAns);
       return ans;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,2,2,5};
        int x=2;
        //findAllIndex(arr,x,0);
        ArrayList<Integer> ans=findAllIndexx(arr,x,0);
        System.out.print(ans);
    }
}

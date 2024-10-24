package IFelse;
/*if cost price and selling price of an item is input  thorough the Keyboard , Write a program to determine whether the seller has made profit or incurred loss.Also
determine how much profit he made or loss he incurred*/

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        System.out.print("Enter your Selling Price :");
        int SP=Input.inputNumber();
        System.out.print("\nEnter your Cost Price :");
        int CP=Input.inputNumber();
        if(CP<SP){
            int profit=CP-SP;
            System.out.printf("%d rs Profit..........",Math.abs(profit));

        }
        else{
            int loss=SP-CP;
            System.out.printf(" %d rs Loss...........",(loss*(-1)));
        }
    }
}

/**
*Name: Alex Nguyen
*Date: 07/26/22
*Program Name: ShippingCost.java
*Purpose: Calculates the shipping cost based on the weight of a package until the user inputs a weight less that 1
*/
import java.util.Scanner;
import java.text.NumberFormat;

public class ShippingCost{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    int weightAN = 0;
    do{
      System.out.println("\nWeight of order:");
      weightAN = input.nextInt();

      if(weightAN == 0){
        System.out.println("");
      }
      else if(weightAN <= 10){
        System.out.println("Shipping cost: $3.00");
      }
      else{
        System.out.println("Shipping cost: " + money.format(3 + ((weightAN - 10) * 0.25)));
      }
    }while(weightAN > 0);

    System.out.println("bye");
  }
}
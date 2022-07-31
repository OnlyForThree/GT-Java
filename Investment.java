/**
*Name: Alex Nguyen
*Date: 07/12/22
*Program Name: Investment.java
*Purpose: An Investment application that calculates how many years it will have for a $2,500 to be worth at least $5,000 if compunded annually at 7.5%
*/

import java.util.Scanner; //Import Scanner
import java.text.NumberFormat; //Import NumberFormat

public class Investment{
  public static void main(String[] args){
    //Declare vaariables
    double userInputAN;
    int counterAN = 0;

    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();

    //Collect starting money amount
    System.out.print("Enter the starting value: ");
    userInputAN = input.nextDouble();

    //If the starting money amount has already reached the goal of $5000
    if(((int) userInputAN) >= 5000){
      //Display the c
      System.out.println(money.format(userInputAN));
    }
    else{ //If starting money amount has not reached the goal
        do{
          //Add 7.5% interest
          userInputAN = userInputAN * 1.075;
          //Print out the new value
          System.out.println(money.format(userInputAN));
          //Update counter
          counterAN++;
          }while (((int)userInputAN) < 5000); //Repeat while the total amount has not reached the goal of $5000
        }

    System.out.println("Number of years: " + counterAN);
  }
}
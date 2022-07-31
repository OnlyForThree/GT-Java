/**
*Name: Alex Nguyen
*Date: 07/12/22
*Program Name: PrimeFactors.java
*Purpose:
*/

import java.util.Scanner; //Import Scanner

public class PrimeFactors{
  public static void main(String[] args){
    //Declare variables
    int userNumberAN;
    int counterAN = 2;

    Scanner input = new Scanner(System.in);

    do{ //Ask for a positive integer
      System.out.println("Please enter a positive integer:");
      userNumberAN = input.nextInt();
    } while (userNumberAN < 1); //Repeat if the number input is less than 1

    //While the counter is less than or equal to the user input
    while (counterAN <= userNumberAN){

      //If the number divides evenly
      if (userNumberAN % counterAN == 0){
        //Print the number and update the number
        System.out.println(counterAN);
        userNumberAN = userNumberAN / counterAN;
      }
      else{
        //Increase the counter to check a new factor
        counterAN++;
      }
    }
  }
}
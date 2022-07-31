/**
*Name: Alex Nguyen
*Date: 07/24/22'
Program Name: PrimeNumber.java
*Purpose: The program prompts the user for a number and displays if the integer is a prime number or not
*/
import java.util.Scanner; //Import Scanner

public class PrimeNumber{
  public static void main(String[] args){
    int userInputAN;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number you would like to check: ");
    userInputAN = input.nextInt();

    if (isPrime(userInputAN)){
      System.out.println("This number is prime.");
    }
    else{
      System.out.println("This number is not prime.");
    }
  }

  public static boolean isPrime(int userInputAN){
    for (int i = 1; i <= userInputAN; i++){
      if(userInputAN == 1){
        return true;
      }
      else if((userInputAN % i == 0) && ((i != 1) && (i != userInputAN))){
        return false;
      }
    }
    return true;
  }
}

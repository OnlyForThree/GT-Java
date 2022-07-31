/**
*Name: Alex Nguyen
*Date: 07/28/22
*Program Name: PrimeNumV2.java
*Purpose: A modified version of PrimeNum.java which now includes different methods. 
*The user can use this application to check if a number is prime (From 1 through 100)
*The user can also use this application to find prime numbers within a range (From 1 through 100)
*/
import java.util.Scanner;
import java.util.ArrayList;

public class PrimeNumV2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the mode you would like to use [1 - Prime Check] [2 - Find Prime]: ");
    int modeAN = input.nextInt();

    Prime_Numbers2Screen(modeAN);
  }

  public static boolean isPrime(int numberAN){
    boolean isPrime = false;
    switch (numberAN){
          case 1: isPrime = true; break;
          case 2: isPrime = true; break;
          case 3: isPrime = true; break;
          case 5: isPrime = true; break;
          case 7: isPrime = true; break;
          case 11: isPrime = true; break;
          case 13: isPrime = true; break;
          case 17: isPrime = true; break;
          case 19: isPrime = true; break;
          case 23: isPrime = true; break;
          case 29: isPrime = true; break;
          case 31: isPrime = true; break;
          case 37: isPrime = true; break;
          case 41: isPrime = true; break;
          case 43: isPrime = true; break;
          case 47: isPrime = true; break;
          case 53: isPrime = true; break;
          case 59: isPrime = true; break;
          case 61: isPrime = true; break;
          case 67: isPrime = true; break;
          case 71: isPrime = true; break;
          case 73: isPrime = true; break;
          case 79: isPrime = true; break;
          case 83: isPrime = true; break;
          case 89: isPrime = true; break;
          case 97: isPrime = true; break;
          default: isPrime = false; break;
      }
    return isPrime;
  }

  public static void Prime_Numbers2Screen(int modeAN){
    Scanner input = new Scanner(System.in);
    ArrayList<String> primeNumbersAN = new ArrayList<String>();
    
    if(modeAN == 1){
      System.out.print("Enter a number between 1 and 100: ");
      int userNumOneAN = input.nextInt();

      if(isPrime(userNumOneAN)){
        System.out.println("The number " + userNumOneAN + " is a prime number.");
      }
      else{
        System.out.println("The number " + userNumOneAN + " is not a prime number.");
      }
    }
    else if (modeAN == 2){
      System.out.print("Enter the range minimum (No lower than 1): ");
      int userNumOneAN = input.nextInt();

      System.out.print("Enter the range maximum (No high than 100): ");
      int userNumTwoAN = input.nextInt();

      if (((userNumOneAN >= 1) && (userNumTwoAN <= 100)) && (userNumTwoAN > userNumOneAN)){
        System.out.println("Prime numbers in your range of " + userNumOneAN + " and " + userNumTwoAN + " are: ");
        
        for(int i = userNumOneAN; i <= userNumTwoAN; i++) {
          if(isPrime(i)){
            primeNumbersAN.add(Integer.toString(i));
          }
        }
      }

      if(primeNumbersAN.size() == 0){
        System.out.println("No Prime Numbers In Range");
      }
      else if(primeNumbersAN.size() > 0){
        for(int i = 0; i < primeNumbersAN.size(); i++){
          System.out.println(primeNumbersAN.get(i));
        }
      }
    }
    else{
      System.out.println("Please enter the numbers 1 or 2 to select a mode.");
    }
  }
}
  
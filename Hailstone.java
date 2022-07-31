/**
*Name: Alex Nguyen
*Date: 07/18/22
*Program Name: Hailstone.java
*Purpose: A hailstone program that prints out:
-the maximum number of iterations
-the number that creates the maximum iterations,
-number of integers that reach the ending hailstone cycle
*/
import java.util.Scanner;

public class Hailstone {
  public static void main(String[] args) {
  int cyclesAN = 0, maximumEndAN, maxIterationsAN = 0, maxIterationsIndexAN = 0;
    
  Scanner input = new Scanner(System.in);

  System.out.print("Enter the maximum starting number: ");
  maximumEndAN = input.nextInt();
  
  for (int i = 1; i <= maximumEndAN; i++){
    int hailstoneNumberAN = i;
    int iterationsAN = 0;

    do{
      if ((hailstoneNumberAN % 2) == 0){
        hailstoneNumberAN = hailstoneNumberAN / 2;
        iterationsAN++;
      }
      else if ((hailstoneNumberAN % 2) == 1) {
        hailstoneNumberAN = hailstoneNumberAN * 3 + 1;
        iterationsAN++;
      }

    } while (hailstoneNumberAN != 1);

    if (iterationsAN > maxIterationsAN){
      maxIterationsAN = iterationsAN;
      maxIterationsIndexAN = i;
    }
    cyclesAN++;
  }
    System.out.println("Hailstone 1");
    System.out.println("The number of integers that reach this cycle: " + cyclesAN);

    System.out.println("\nHailstone 2");
    System.out.println(maxIterationsAN + " is the maximum number of iterations taken to reach the cycle");
    System.out.println(maxIterationsIndexAN + " is the starting number that produces this maximum");
    
  }
}
/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/1/22
 * Filename: RandomNum.java
 * Purpose:  A RandomNum program that gives a random number between two numbers that the user provides.
 */

import java.util.Scanner;
import java.util.Random;

public class RandomNum{
  public static void main(String[] args){
    int randomLowAN = 0;
    int randomHighAN = 0;

    Scanner input = new Scanner(System.in);
    Random r = new Random();
    System.out.print("Input the random minimum value: ");
    randomLowAN = input.nextInt();

    System.out.print("\nInput the random maximum value: ");
    randomHighAN = input.nextInt();

    System.out.println("A random number between " + randomLowAN + " and " + randomHighAN + " is " + (r.nextInt(randomHighAN - randomLowAN + 1) + randomLowAN));

    
  }
}
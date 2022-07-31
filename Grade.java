/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/30/22
 * Filename: Grade.java
 * Purpose:  A Java program that accepts two integer numbers and checks whether they are the same.
 */

import java.lang.Math;

public class Grade{
  public static void main(String[] args){

    int lowNumAN = 50;
    int highNumAN = 100;
    int randomNumberAN = (int)((highNumAN - lowNumAN + 1) * Math.random() + lowNumAN);

    System.out.println("The psuedorandom grade genarator has determined your score is a: " + randomNumberAN);

    if ((randomNumberAN >= 90) & (randomNumberAN <= 100))
    {
      System.out.println("The corresponding letter grade is: A");
    } 
    else if ((randomNumberAN >= 80) & (randomNumberAN <= 89))
    {
      System.out.println("The corresponding letter grade is: B");
    }
    else if ((randomNumberAN >= 70) & (randomNumberAN <= 79))
    {
      System.out.println("The corresponding letter grade is: C");
    }
    else if ((randomNumberAN >= 60) & (randomNumberAN <= 69))
    {
      System.out.println("The corresponding letter grade is: D");
    }
    else
    {
      System.out.println("The corresponding letter grade is: F");
    }
  }
}
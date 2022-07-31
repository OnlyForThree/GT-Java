/**
*Name: Alex Nguyen
*Date: 07/13/22
*Project Name: PowersTable.java
*Purpose: A PowersTable application that displays a table of powers for numbers 1-5 with 6 rows of results
*/

import java.lang.Math; //Import math functions
import java.text.NumberFormat; //Import NumberFormat

public class PowersTable{
  public static void main(String[] args){

    NumberFormat number = NumberFormat.getIntegerInstance();

    System.out.format("%8s %8s %8s %8s %8s", "x^1", "x^2", "x^3", "x^4", "x^5"); //Print first line with power columns
    System.out.print("\n"); //New line (Added because spacing was off if I added "\n")

    for(int i = 1; i<=6; i++){ //Repeat 6 times

      //Print the power value according to the current counter value
      System.out.format("%8s %8s %8s %8s %8s", ((int)Math.pow(i, 1)), ((int)Math.pow(i, 2)), ((int)Math.pow(i, 3)), ((int)Math.pow(i, 4)), ((int)Math.pow(i, 5)));
      System.out.print("\n"); //New line (Added because spacing was off if I added "\n")
    }
  }
}
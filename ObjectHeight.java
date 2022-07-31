/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/27/22
 * Filename: ObjectHeight.java
 * Purpose:  Prompts the user for a time less than 4.5 seconds and then displays the height of the object at that time
 */

import java.util.Scanner; // Import the Scanner class

public class ObjectHeight{
    public static void main(String[] args){
    //Declare variables
    double timeAN;
    double heightAN;
      
    Scanner input = new Scanner(System.in);

    //Explain instructions + Get input
    System.out.println("Please enter a time that is less than 4.5 seconds:");
      timeAN = input.nextDouble();

      //Calculate height
      heightAN = (100 - ((4.9 * timeAN) * timeAN));

      //Display height
      System.out.println("The height of the ball is: " + heightAN);
  }
}

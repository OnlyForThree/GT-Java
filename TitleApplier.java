/**
*Name: Alex Nguyen + Sayo Odusote
*Date: 07/14/22
*Project Name: TitleApplier.java
*Purpose: a program that asks for the user's name and then writes that name to the monitor with either "Ms." or "Mr." in front, depending if the name is for a female or male.
*/

// Sayo Odusote - Start to 22
import java.util.Scanner; //Import Scanner class
import java.lang.String; //Import String methods

public class TitleApplier{
  public static void main(String[] args){
    //Declare string variables for arguments
    String userName, firstLetter = ""; 
     //Declare string variables for comparing
    String charA = "A", charB = "B", charC = "C", charD = "D", charE = "E", charF = "F";

    Scanner input = new Scanner(System.in);
    
    System.out.println("Program java Title"); //Print app title

    //Alex Nguyen - Lines 23 to end
    do{ //Run the function
    System.out.println("Enter a name: "); //Ask for name input
    userName = input.nextLine(); //Take name input

    if(userName.length() != 0){ //If the userName is not blank
    firstLetter = userName.substring(0,1); //Update the first letter variable
    }

      //If the first letter is A.B, or C
    if (((firstLetter.equals(charA)) || firstLetter.equals(charB)) || firstLetter.equals(charC)){
      System.out.println("Ms. " + userName + "\n"); //Print out Ms. as the title
    }
      //If the first letter is A,B, or C
    else if (((firstLetter.equals(charD)) || firstLetter.equals(charE)) || firstLetter.equals(charF)){
      System.out.println("Mr. " + userName + "\n"); //Print out Mr. as the title
    }
      //If the userName length is 0
    else if (userName.length() == 0){
      System.out.println("\n"); //Print a blank line
    }
    else{ //If none of the other conditions are met
      System.out.println(userName + "\n"); //Print just the name with no title
    }
      
    } while (! (userName.length() == 0)); //Repeat while the user's input is blank
  }
}
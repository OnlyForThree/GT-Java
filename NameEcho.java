/**
*Name: Alex Nguyen + Sayo Odusote
*Date: 07/13/22
*Project Name: NameEcho.java
*Purpose: A NameEcho program that asks for user's first and last name in one input and then writes it back with the first name as entered, and the second name all in capital letters.
*Additional Credits: Group 4 helped us write this
*/

  // Sayo Odusote
import java.util.Scanner; //Import Scanner Class
import java.lang.String; //Import String Class

class NameEcho {
  public static void main(String[] args) {
    
    int spaceIndex = 0, j = 0; //Declare spaceIndex and j as global variables
    String lastName, firstName, fullName, spaceChar = " "; 
    //Declare lastName and firstName to be used later to house substrings of fullName
    //Declare spaceChar to be a string argument
    
    Scanner input = new Scanner(System.in);

    //Take name input
    System.out.println("Program NameEcho");
    System.out.print("\nEnter your name: ");
    fullName = input.nextLine();

    //Alex Nguyen 29-40
    //Iterates through the fullName string to check if there is a space and sets the spaceIndex the index of the space
    for(j = 0; j < fullName.length(); j++){
      if (fullName.substring((j) , (j + 1)).equals(spaceChar)){
        spaceIndex = j;
        lastName = fullName.substring(j);
        firstName = fullName.substring(0, spaceIndex);

        System.out.print(firstName);
        System.out.print(lastName.toUpperCase());
      }
    }
    
  }
}
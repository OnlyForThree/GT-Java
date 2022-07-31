/**
*Name: Alex Nguyen
*Date: 07/18/22
*Program Name: GroupAssignment.java
*Purpose: A GroupAssignment application that prompts the user for his or her first and last name and then displays a group assignment.  The program will keep looping until -2 is entered to quit.
*/
import java.util.Scanner; //Import Scanner Class
import java.lang.String; //Import String Class

class GroupAssignment {
  public static void main(String[] args) {
    
    int spaceIndexAN = 0, jAN = 0; //Declare spaceIndex and j as global variables
    int spaceCounterAN = 0;
    String lastNameAN = "", firstNameAN, fullNameAN = "", spaceCharAN = " "; 
    //Declare lastName and firstName to be used later to house substrings of fullName
    //Declare spaceChar to be a string argument
    
    Scanner input = new Scanner(System.in);

    do{
    //Take name input
    System.out.print("\nEnter your name or (-2 to quit): ");
    fullNameAN = input.nextLine();

      for(jAN = 0; jAN < fullNameAN.length(); jAN++){
          if (fullNameAN.substring((jAN) , (jAN + 1)).equals(spaceCharAN)){
          spaceIndexAN = jAN;
          spaceCounterAN++;
      }
      }
      if(fullNameAN.equals("-2")){
        System.out.println("Goodbye");
      }   
      else if ((fullNameAN.equals(" ")) || (fullNameAN.equals(""))){
        System.out.println("Please enter a first and last name");
      }
      else if (spaceCounterAN == 0){
        System.out.println("Please enter a first and last name");
      }
      else{
        for(jAN = 0; jAN < fullNameAN.length(); jAN++){
          if (fullNameAN.substring((jAN) , (jAN + 1)).equals(spaceCharAN)){
          spaceIndexAN = jAN;
          lastNameAN = (fullNameAN.substring(jAN)).trim();
          firstNameAN = (fullNameAN.substring(0, spaceIndexAN)).trim();

          System.out.print(firstNameAN + " " + lastNameAN + " ");
          }
        }

        if ((lastNameAN.substring(0,1).equals("A"))) {
          System.out.print("is assigned to Group 1");
        }
        if ((lastNameAN.substring(0,1).equals("B"))) {
          System.out.print("is assigned to Group 1");
        }
        if ((lastNameAN.substring(0,1).equals("C"))) {
          System.out.print("is assigned to Group 1");
        }
        if ((lastNameAN.substring(0,1).equals("D"))) {
          System.out.print("is assigned to Group 1");
        }
        if ((lastNameAN.substring(0,1).equals("E"))) {
          System.out.print("is assigned to Group 1");
        }
        if ((lastNameAN.substring(0,1).equals("F"))) {
          System.out.print("is assigned to Group 1");
        }
        if ((lastNameAN.substring(0,1).equals("G"))) {
          System.out.print("is assigned to Group 1");
        }
        if ((lastNameAN.substring(0,1).equals("H"))) {
          System.out.print("is assigned to Group 1");
        }
        if ((lastNameAN.substring(0,1).equals("I"))) {
          System.out.print("is assigned to Group 1");
        }
        if ((lastNameAN.substring(0,1).equals("J"))) {
          System.out.print("is assigned to Group 2");
        }
        if ((lastNameAN.substring(0,1).equals("K"))) {
          System.out.print("is assigned to Group 2");
        }
        if ((lastNameAN.substring(0,1).equals("L"))) {
          System.out.print("is assigned to Group 2");
        }
        if ((lastNameAN.substring(0,1).equals("M"))) {
          System.out.print("is assigned to Group 2");
        }
        if ((lastNameAN.substring(0,1).equals("N"))) {
          System.out.print("is assigned to Group 2");
        }
        if ((lastNameAN.substring(0,1).equals("O"))) {
          System.out.print("is assigned to Group 2");
        }
        if ((lastNameAN.substring(0,1).equals("P"))) {
          System.out.print("is assigned to Group 2");
        }
        if ((lastNameAN.substring(0,1).equals("Q"))) {
          System.out.print("is assigned to Group 2");
        }
        if ((lastNameAN.substring(0,1).equals("R"))) {
          System.out.print("is assigned to Group 2");
        }
        if ((lastNameAN.substring(0,1).equals("S"))) {
          System.out.print("is assigned to Group 2");
        }
        if ((lastNameAN.substring(0,1).equals("T"))) {
          System.out.print("is assigned to Group 3");
        }
        if ((lastNameAN.substring(0,1).equals("U"))) {
          System.out.print("is assigned to Group 3");
        }
        if ((lastNameAN.substring(0,1).equals("V"))) {
          System.out.print("is assigned to Group 3");
        }
        if ((lastNameAN.substring(0,1).equals("W"))) {
          System.out.print("is assigned to Group 3");
        }
        if ((lastNameAN.substring(0,1).equals("X"))) {
          System.out.print("is assigned to Group 3");
        }
        if ((lastNameAN.substring(0,1).equals("Y"))) {
          System.out.print("is assigned to Group 3");
        }
        if ((lastNameAN.substring(0,1).equals("Z"))) {
          System.out.print("is assigned to Group 3");
        }
        System.out.println(" ");
      }
      } while (! (fullNameAN.equals("-2")));
  }
}


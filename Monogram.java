/**
*Name: Alex Nguyen
*Date: 07/18/22
*Project Name: Monogram.java
*Purpose: a Monogram application the prompts the user for his or her first name, middle name and last name.  The program will display a:
lowercase first initial
upper case last initial
lowercase middle initial
*/

import java.util.Scanner; //Import Scanner Class
import java.lang.String; //Import String Class

public class Monogram {
  public static void main(String[] args) {
    
    int spaceIndexOneAN = 0, spaceIndexTwoAN = 0, j = 0;
    String lastInitialAN, firstInitialAN, middleInitialAN, fullNameAN, spaceCharAN = " ";
    
    Scanner input = new Scanner(System.in);

    //Take name input
    System.out.println("RemoveString");
    System.out.print("Enter your name: ");
    fullNameAN = input.nextLine();
    fullNameAN = fullNameAN.trim();

    if(fullNameAN.length() > 5){
    while (spaceIndexTwoAN == 0){
      for(j = 0; j < fullNameAN.length(); j++){
      if (fullNameAN.substring((j) , (j + 1)).equals(spaceCharAN)){
        spaceIndexTwoAN = j;
      }
    }
    }

    while (spaceIndexOneAN == 0){
      for(j = fullNameAN.length() - 1; j > -1; j--){
      if (fullNameAN.substring((j) , (j + 1)).equals(spaceCharAN)){
        spaceIndexOneAN = j;
      }
    }
    }

      firstInitialAN = (fullNameAN.substring(0,1)).toLowerCase();
      middleInitialAN = (fullNameAN.substring(spaceIndexOneAN + 1, spaceIndexOneAN + 2)).toUpperCase();
      lastInitialAN = (fullNameAN.substring(spaceIndexTwoAN + 1, spaceIndexTwoAN + 2)).toLowerCase();
      
       System.out.println(firstInitialAN + middleInitialAN + lastInitialAN);
  }
  else{
    System.out.println("Please input a first, middle, and last name");
  }
  }
}
/**
*Name: Alex Nguyen
*Date: 07/22/22
*Program Name: Nim.java
*Purpose: An application that allows the user to play a game of Nim against a computer after selecting their mode of easy or difficult
*/
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class Nim {
  public static void main(String[] args) {
    int randomNumAN = (int) (Math.random() * (30-15+1) + 15);
    Scanner input = new Scanner(System.in);
    
    System.out.print("Easy or Difficult [e / d]: ");
    String modeAN = input.next();

    do{
      if(randomNumAN != 0){
        randomNumAN = userDrawStones(randomNumAN);
      }
      
      if(randomNumAN != 0){
        randomNumAN = drawStones(randomNumAN, modeAN);
      }
      
    }while(randomNumAN > 0);
  }

  public static int userDrawStones(int stoneAmountAN){
    int userInputAN = 0;
    Scanner input = new Scanner(System.in);
    
    do{
      System.out.print("\nThere are " + stoneAmountAN + " stones. How many would you like? ");
      userInputAN = input.nextInt();
    }while(! isValidEntry(userInputAN, stoneAmountAN) || ((userInputAN <= 0) && (userInputAN > 3)));

    if(stoneAmountAN - userInputAN <= 0){
      System.out.println("The computer beats the player!");
    }
    return stoneAmountAN - userInputAN;
  }

  public static int drawStones(int stoneAmountAN, String modeAN){
    int randomStoneAmountAN = 0;

    System.out.print("There are " + stoneAmountAN + " stones. ");
    
    if(modeAN.equals("e")){
      do{
        randomStoneAmountAN = (int) (Math.random() * (3-1+1) + 1);
      }while(! isValidEntry(randomStoneAmountAN, stoneAmountAN));
    }
    else if(modeAN.equals("d")){
      if(stoneAmountAN > 3){
        randomStoneAmountAN = 3;
      }
      else if (stoneAmountAN == 3){
        randomStoneAmountAN = 2;
      }
      else if (stoneAmountAN == 2){
        randomStoneAmountAN = 1;
      }
      else{
        randomStoneAmountAN = 1;
      }
    }
    
    System.out.print("The computer takes " + randomStoneAmountAN + " stones.");

    if (stoneAmountAN - randomStoneAmountAN == 0){
      System.out.println("\nThe player beats the computer!");
    }
    
    return stoneAmountAN - randomStoneAmountAN;
  }
  
  public static boolean isValidEntry(int userStoneAmountAN, int randomAN){
    boolean validAN = false;

    if(randomAN - userStoneAmountAN < 0){
      validAN = false;
    }
    else{
      validAN = true;
    }

    return validAN;
  }
}
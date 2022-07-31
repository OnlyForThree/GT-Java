/**
*Name: ALex Nguyen
*Date: 07/28/22
*Project Name: Analysis.java
*Purpose: An Analysis program that will take user inputs between 1 and 50 then display the results of average, maximum, range, and median. The program will also print a histogram
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;

public class Analysis{
  public static void main(String[] args){
    ArrayList<Integer> numberInputsAN = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);
    int userInputAN = 0;
    
    do{
      System.out.print("Enter a number from 1 through 50 [Enter 0 to move on] ");
      userInputAN = input.nextInt();
      if(userInputAN != 0){
      numberInputsAN.add(userInputAN);
      }
    }while(userInputAN != 0);

    int sumAN = 0;
    for(int i = 0; i < numberInputsAN.size(); i++){
      sumAN = sumAN + numberInputsAN.get(i);
    }
    System.out.println("The average is " + sumAN / numberInputsAN.size());

    int maxAN = 0, minAN = 10;
    for(int j = 0; j < numberInputsAN.size(); j++){
      if((numberInputsAN.get(j)).compareTo(maxAN) >= 0){
        maxAN = numberInputsAN.get(j);
      }
      if((numberInputsAN.get(j)).compareTo(minAN) <= 0){
        minAN = numberInputsAN.get(j);
      }
    }
    System.out.println("The maximum is " + maxAN);
    System.out.println("The range is " + (maxAN - minAN));
    System.out.println("The median is " + numberInputsAN.get(numberInputsAN.size() / 2));

    int set1AN = 0, set2AN = 0, set3AN = 0, set4AN = 0, set5AN = 0, set6AN = 0, set7AN = 0, set8AN = 0, set9AN = 0, set10AN = 0;
    for(int k = 0; k < numberInputsAN.size(); k++){
      if(((numberInputsAN.get(k)).compareTo(0) > 0) && ((numberInputsAN.get(k)).compareTo(6) < 0)){
        set1AN++;
      }
      else if(((numberInputsAN.get(k)).compareTo(5) > 0) && ((numberInputsAN.get(k)).compareTo(11) < 0)){
        set2AN++;
      }
      else if(((numberInputsAN.get(k)).compareTo(10) > 0) && ((numberInputsAN.get(k)).compareTo(16) < 0)){
        set3AN++;
      }
      else if(((numberInputsAN.get(k)).compareTo(15) > 0) && ((numberInputsAN.get(k)).compareTo(21) < 0)){
        set4AN++;
      }
      else if(((numberInputsAN.get(k)).compareTo(20) > 0) && ((numberInputsAN.get(k)).compareTo(26) < 0)){
        set5AN++;
      }
      else if(((numberInputsAN.get(k)).compareTo(25) > 0) && ((numberInputsAN.get(k)).compareTo(31) < 0)){
        set6AN++;
      }
      else if(((numberInputsAN.get(k)).compareTo(30) > 0) && ((numberInputsAN.get(k)).compareTo(36) < 0)){
        set7AN++;
      }
      else if(((numberInputsAN.get(k)).compareTo(35) > 0) && ((numberInputsAN.get(k)).compareTo(41) < 0)){
        set8AN++;
      }
      else if(((numberInputsAN.get(k)).compareTo(40) > 0) && ((numberInputsAN.get(k)).compareTo(46) < 0)){
        set9AN++;
      }
      else if(((numberInputsAN.get(k)).compareTo(45) > 0) && ((numberInputsAN.get(k)).compareTo(51) < 0)){
        set10AN++;
      }
    }

    System.out.format("%9s", "  1 - 5 :\t");
    for(int l = 0; l < set1AN; l++){
      System.out.print("*");
    }
    System.out.print("\n");
    System.out.format("%9s", " 6 - 10 :\t");
    for(int l = 0; l < set2AN; l++){
      System.out.print("*");
    }
    System.out.print("\n");
    System.out.format("%9s", "11 - 15 :\t");
    for(int l = 0; l < set3AN; l++){
      System.out.print("*");
    }
    System.out.print("\n");
    System.out.format("%9s", "16 - 20 :\t");
    for(int l = 0; l < set4AN; l++){
      System.out.print("*");
    }
    System.out.print("\n");
    System.out.format("%9s", "21 - 25 :\t");
    for(int l = 0; l < set5AN; l++){
      System.out.print("*");
    }
    System.out.print("\n");
    System.out.format("%9s", "26 - 30 :\t");
    for(int l = 0; l < set6AN; l++){
      System.out.print("*");
    }
    System.out.print("\n");
    System.out.format("%9s", "31 - 35 :\t");
    for(int l = 0; l < set7AN; l++){
      System.out.print("*");
    }
    System.out.print("\n");
    System.out.format("%9s", "36 - 40 :\t");
    for(int l = 0; l < set8AN; l++){
      System.out.print("*");
    }
    System.out.print("\n");
    System.out.format("%9s", "41 - 45 :\t");
    for(int l = 0; l < set9AN; l++){
      System.out.print("*");
    }
    System.out.print("\n");
    System.out.format("%9s", "46 - 50 :\t");
    for(int l = 0; l < set10AN; l++){
      System.out.print("*");
    }
    System.out.print("\n");
  }
}
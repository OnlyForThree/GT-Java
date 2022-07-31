/**
*Name: Alex Nguyen
*Date: 07/28/22
*Project Name: GeneratedNums.java
*Purpose: A GeneratedNums application that prints out an index and a generated number that follows (index + hundreds + tens + ones)
*/
import java.util.ArrayList;

public class GeneratedNums {
  public static void main(String[] args) {
    ArrayList<Integer> generatedNumbersAN = new ArrayList<Integer>();

    System.out.format("%-8s %-15s", "Index", "GeneratedNumber");
    System.out.print("\n");

    for(int i = 0; i <= 100; i++){
      int tempAN = i;

      int hundredsAN = (int) i/100;
      tempAN = tempAN - hundredsAN * 100;

      int tensAN = (int) i/10;
      tempAN = tempAN - tensAN * 10;

      int onesAN = tempAN;
      
      generatedNumbersAN.add(i + hundredsAN + tensAN + onesAN);
    }

    for(int j = 0; j <= generatedNumbersAN.size() - 1; j++){
      System.out.format("%-8s %-15s", j, generatedNumbersAN.get(j));
      System.out.print("\n");
    }
  }
}
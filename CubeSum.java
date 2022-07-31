/**
*Name: Alex Nguyen
*Date: 07/13/22
*Project Name: CubeSum.java
*Purpose: An applicationt that determines what integers of two, three, and four digits are equal to the sum of the cubes of their digits
*(Armstrong Numbers)
*/

import java.text.NumberFormat; //Import the Nmber Format
import java.lang.Math; //Import math functions

public class CubeSum{
  public static void main(String[] args){

        NumberFormat number = NumberFormat.getIntegerInstance();

    for(int i = 0; i<= 9999; i++){
    //Declare variables
    int totalAN;
    int checkingAN = i;
    int thousandsAN;
    int hundredsAN;
    int tensAN;
    int onesAN;
    
    //Total all digits
    thousandsAN = checkingAN / 1000;
    checkingAN = checkingAN - (thousandsAN * 1000);
      
    hundredsAN = checkingAN / 100;
    checkingAN = checkingAN - (hundredsAN * 100);

    tensAN = checkingAN / 10;
    checkingAN = checkingAN - (tensAN * 10);

    onesAN = checkingAN / 1;
    checkingAN = checkingAN - (onesAN * 1);

    totalAN = ((int) (Math.pow(thousandsAN, 3) + Math.pow(hundredsAN, 3) + Math.pow(tensAN, 3) + Math.pow(onesAN, 3)));

    //Display number if adding the cubes would equal the current number being checked
    if (totalAN == ((double)i)){
      System.out.println(i);
    }

    }

  }
}
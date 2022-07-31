/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/1/22
 * Filename: RandomGenerator.java
 * Purpose:  a RandomGenerator application that implements the Linear Congruential Method.
 */

public class RandomGenerator{
  public static void main(String[] args){
    //Declare variables
    int seedVariableAN = 973;
    int aConstantAN = 7;
    int cConstantAN = 5;
    int mConstantAN = 79;

    System.out.print("Seed = " + seedVariableAN + ", a = " + aConstantAN + ", c = " + cConstantAN + ", m = " + mConstantAN);
    
    System.out.println("\n\n<" + aConstantAN + "*" + seedVariableAN + " + " + cConstantAN + "> % " + mConstantAN + "=" + ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN));
    seedVariableAN = ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN);
    System.out.println("<" + aConstantAN + "*" + seedVariableAN + " + " + cConstantAN + "> % " + mConstantAN + "=" + ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN));
    seedVariableAN = ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN);
    System.out.println("<" + aConstantAN + "*" + seedVariableAN + " + " + cConstantAN + "> % " + mConstantAN + "=" + ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN));
    seedVariableAN = ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN);
    System.out.println("<" + aConstantAN + "*" + seedVariableAN + " + " + cConstantAN + "> % " + mConstantAN + "=" + ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN));
    seedVariableAN = ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN);
    System.out.println("<" + aConstantAN + "*" + seedVariableAN + " + " + cConstantAN + "> % " + mConstantAN + "=" + ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN));
    seedVariableAN = ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN);
    System.out.println("<" + aConstantAN + "*" + seedVariableAN + " + " + cConstantAN + "> % " + mConstantAN + "=" + ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN));
    seedVariableAN = ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN);
    System.out.println("<" + aConstantAN + "*" + seedVariableAN + " + " + cConstantAN + "> % " + mConstantAN + "=" + ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN));
    seedVariableAN = ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN);
    System.out.println("<" + aConstantAN + "*" + seedVariableAN + " + " + cConstantAN + "> % " + mConstantAN + "=" + ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN));
    seedVariableAN = ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN);
    System.out.println("<" + aConstantAN + "*" + seedVariableAN + " + " + cConstantAN + "> % " + mConstantAN + "=" + ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN));
    seedVariableAN = ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN);
    System.out.println("<" + aConstantAN + "*" + seedVariableAN + " + " + cConstantAN + "> % " + mConstantAN + "=" + ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN));
    seedVariableAN = ((aConstantAN * seedVariableAN + cConstantAN) % mConstantAN);
 }
}
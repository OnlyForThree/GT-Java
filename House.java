/**
*Name: Alex Nguyen
*Date: 07/21/22
*Program Name: House.java
*Purpose: Prints out a house
*/
public class House {
  public static void main(String[] args) {
    addRoof();
    addBase();
    addWalk();
  }

  public static void addRoof(){
    System.out.println("   /\\");
    System.out.println("  /  \\");
    System.out.println(" /    \\");
    System.out.println("/______\\");
  }

  public static void addBase(){
    System.out.println("|      |");
    System.out.println("|      |");
    System.out.println("|      |");
    System.out.println("|______|");
  }

  public static void addWalk(){
    System.out.println("   **");
    System.out.println("   ***********");
  }
}
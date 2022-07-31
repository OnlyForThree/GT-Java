/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/23/22
 * Filename: boardTTT.java
 * Purpose:  A Tic Tac Toe Rules application that displays the rules for playing Tic Tac Toe.
 */

public class boardTTT {
  //Prints rules for 
  public static void main(String[] args){
    System.out.format("%7s %8s", "|", "|\n");
    System.out.format("%7s %8s", "|", "|\n");
    System.out.format("%7s %8s", "|", "|\n");
    System.out.print("---------------------\n");
    System.out.format("%7s %8s", "|", "|\n");
    System.out.format("%7s %3s %4s", "|", "X", "|\n");
    System.out.format("%7s %8s", "|", "|\n");
    System.out.print("---------------------\n");
    System.out.format("%7s %8s", "|", "|\n");
    System.out.format("%7s %8s", "|", "|\n");
    System.out.format("%7s %8s", "|", "|\n");
  }
}
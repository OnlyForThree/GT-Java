/**
 * 
 * Designer: Alex Nguyen
 * Date: 6/23/22
 * Filename: BingoCard.java
 * Purpose: A BingoCard application that displays a traditional bingo card with five columns of five unique numbers 
 */

public class BingoCard {
//Prints a board for Bingo
  public static void main(String[] args) {
    System.out.format("%6s %6s %6s %6s %6s", "B", "I", "N", "G", "O\n");
    System.out.format("%6s %6s %6s %6s %6s", "5", "16", "32", "50", "72\n");
    System.out.format("%6s %6s %6s %6s %6s", "14", "21", "41", "59", "63\n");
    System.out.format("%6s %6s %6s %6s %6s", "1", "19", "FREE", "49", "70\n");
    System.out.format("%6s %6s %6s %6s %6s", "6", "30", "37", "56", "69\n");
    System.out.format("%6s %6s %6s %6s %6s", "3", "27", "44", "47", "74\n");
  }
}
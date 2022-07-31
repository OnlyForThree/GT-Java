/**
Author: Sayo Odusote + Alex Nguyen
Date: 7/14/2022
Project Name: CharAt.java
user inputs a word then the application displays each letter in the word
*/
// Alen Nguyen
import java.util.Scanner; // import Scanner
import java.lang.String; // import string class
class CharAt{
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    // get users word
  String word;
    System.out.println("Enter a word: ");
    word = input.next();
    System.out.print("\n");
// Sayo Odusote
    // iterates through the word to get each letter then print out each letter
    int length = word.length();
for (int i = 0; i < length; i++){
char letter = word.charAt(i);
  System.out.println(letter);
}
  }
}
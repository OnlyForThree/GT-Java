/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/1/22
 * Filename: Hurriane.java
 * Purpose:  A Hurrican application that displays the wind speeds based off of the user's category input.
 */

import java.util.Scanner;

class Hurricane {
  public static void main(String[] args) {
    int categoryInputAN;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the hurricane category number (1-5): ");
    categoryInputAN = input.nextInt();

    switch (categoryInputAN){
      case 1: System.out.println("74-95 mph or 64-82 kt or 119-153km/hr"); break;
      case 2: System.out.println("96-110 mph or 83-95 kt or 154-177 km/hr"); break;
      case 3: System.out.println("111-130 mph or 96-113 kt or 178-209 km/hr"); break;
      case 4: System.out.println("131-155 mph or 114-135 kt or 210-249 km/hr"); break;
      case 5: System.out.println("greater than 155 mph or 135 kt or 249 hm/hr");
    }
  }
}
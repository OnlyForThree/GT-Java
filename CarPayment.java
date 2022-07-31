/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/5/22
 * Filename: CarPayment.java
 * Purpose:  A CarPayment application that calculates a monthly car payment after prompting the user for the principal owing (P), the interest rate (r) and the number of monthly payments (m).
 */

import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

class CarPayment {
  public static void main(String[] args) {
    int principalAN, monthsAN;
    double interestAN, paymentAN;

    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    System.out.print("Principal: ");
    principalAN = input.nextInt();

    System.out.print("Interest Rate: ");
    interestAN = input.nextDouble();

    System.out.print("Number of monthly payments: ");
    monthsAN = input.nextInt();

    paymentAN = (principalAN * (interestAN / 12)) / (1 - Math.pow((1 + interestAN / 12), (-1 * monthsAN)));
    System.out.println("The monthly payment is " + money.format(paymentAN));
  }
}
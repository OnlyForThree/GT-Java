/**
 * 
 * Designer: Alex Nguyen
 * Date: 7/6/22
 * Filename: Eggs.java
 * Purpose:  An Eggs application that prompts the user for the number of eggs, and then calculates the bill
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Eggs{
  public static void main(String[] args){
    int dozensAN, singlesAN, eggsPurchasedAN;
    double dozensCostAN, singlesCostAN;
    double billTotalAN = 0;

    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();

    System.out.print("Enter the number of eggs purchased: ");
    eggsPurchasedAN = input.nextInt();

    singlesAN = eggsPurchasedAN % 12;
    dozensAN = (eggsPurchasedAN - singlesAN) / 12;

    if ((dozensAN >= 0) && (dozensAN < 4)){
      billTotalAN = billTotalAN + (0.5 * dozensAN);
        if (singlesAN > 0){
        billTotalAN = billTotalAN + 0.25;
        }
    }
    else if ((dozensAN >= 4) && (dozensAN < 6)){
      billTotalAN = billTotalAN + (0.45 * dozensAN);
        if (singlesAN > 0){
        billTotalAN = billTotalAN + 0.225;
        }
    }
    else if ((dozensAN >= 6) && (dozensAN < 11)){
      billTotalAN = billTotalAN + (0.4 * dozensAN);
        if (singlesAN > 0){
        billTotalAN = billTotalAN + 0.2;
        }
    }
    else if (dozensAN >= 11){
      billTotalAN = billTotalAN + (0.35 * dozensAN);
        if (singlesAN > 0){
        billTotalAN = billTotalAN + 0.175;
        }
    }

    System.out.println("The bill is equal to: " + money.format(billTotalAN));
  }
}
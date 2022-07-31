/**
*Name: Alex Nguyen
*Date: 07/26/22
*Program Name: PerfectIntegers.java
*Purpose: Prints all perfect integers (integers that are equal to the sum of all it's factors)
*/
public class PerfectIntegers{
  public static void main(String[] args){
    for (int i = 1; i <= 100; i++){
      if(isPerfect(i)){
        System.out.println(i);
      }
    }
  }

  public static boolean isPerfect(int i){
    int sumAN = 0;
    for(int j = 1; j < i; j++){
      if((i % j) == 0){
        sumAN = sumAN + j;
      }
    }

    if(sumAN == i){
      return true;
    }
    else{
      return false;
    }
  }
}
/**
*Name: Alex Nguyen
*Date: 07/26/22
*Program Name: PythagoreanTriple.java
*Purpose: Finds and prints all instances of where i^2 + j^2 = k^2
*/
public class PythagoreanTriple{
  public static void main(String[] args){
    for(int i = 1; i < 100; i++){
      for(int j = 1; j < 100; j++){
        for(int k = 1; k < 100; k++){
          PerfectSqaure(i, j, k);
        }
      }
    }
  }

  public static void PerfectSqaure(int i, int j, int k){
    if((i * i) + (j * j) == (k * k)){
      System.out.println(i + " " + j + " " + k);
    }
  }
}
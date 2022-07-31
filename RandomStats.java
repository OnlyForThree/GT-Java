import java.lang.Math;
import java.lang.Integer;

public class RandomStats{
  public static void main(String[] args){
    int[] occurencesAN;
    occurencesAN = new int[10];

    System.out.format("%-8s %-15s", "Number", "Occurrences");
    System.out.print("\n");
    
    for(int i = 1; i <= 500; i++){
      int randomAN = (int)(Math.random()*(9-0+1)+0);
      switch(randomAN){
        case 1: occurencesAN[randomAN] = occurencesAN[randomAN] + 1; break;
        case 2: occurencesAN[randomAN] = occurencesAN[randomAN] + 1; break;
        case 3: occurencesAN[randomAN] = occurencesAN[randomAN] + 1; break;
        case 4: occurencesAN[randomAN] = occurencesAN[randomAN] + 1; break;
        case 5: occurencesAN[randomAN] = occurencesAN[randomAN] + 1; break;
        case 6: occurencesAN[randomAN] = occurencesAN[randomAN] + 1; break;
        case 7: occurencesAN[randomAN] = occurencesAN[randomAN] + 1; break;
        case 8: occurencesAN[randomAN] = occurencesAN[randomAN] + 1; break;
        case 9: occurencesAN[randomAN] = occurencesAN[randomAN] + 1; break;
      }
    }

    for(int j = 1; j <= 9; j++){
      System.out.format("%-8s %-15s", j, occurencesAN[j]);
      System.out.print("\n");
    }
  }
}
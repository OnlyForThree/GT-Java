/**
*Name: Alex Nguyen
*Date: 07/18/22
*Project Name: RandomWalk.java
*Purpose: A RandomWalk application that determines how many steps the person will walk before taking a step off the bridge.
*/
public class RandomWalk {
  public static void main(String[] args) {
    int walkMaxAN = 0, totalStepsAN = 0, walkLocationAN = 0;

    for (int i = 0; i <= 50; i++){
      int walkingStepsAN = 0;
      
      do{
      int randomNumberAN = (int)((2 - 1 + 1) * Math.random() + 1);
      if (randomNumberAN == 1){
        walkLocationAN++;
        walkingStepsAN++;
      }
      else if (randomNumberAN == 2){
        walkLocationAN--;
        walkingStepsAN++;
      }
      } while ((walkLocationAN > -4) && (walkLocationAN < 4));

      walkLocationAN = 0;

      System.out.println("Fell off after " + walkingStepsAN + " steps");
      
      if (walkingStepsAN > walkMaxAN){
        walkMaxAN = walkingStepsAN;
      }

      totalStepsAN = totalStepsAN + walkingStepsAN;
    }

    System.out.println("Average Steps " + (totalStepsAN / 50));
    System.out.println("Maximum Steps " + walkMaxAN);
  }
}
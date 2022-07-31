/**
*Name: Alex Nguyen
*Date: 07/11/22
*Purpose:  A program that will display an image that is Winter Break themed
*/

import java.util.Scanner;

public class WinterFest {
  public static void main(String[] args){
    int userImageChoiceAN;
    int userChoiceNextAN = 1;

    Scanner input = new Scanner(System.in);
    
    do {
      System.out.print("Select the image you want to see [1 - Snowman] [2 - Winter House] [3 - Shoveling Snow]: ");
      userImageChoiceAN = input.nextInt();
      if (userImageChoiceAN == 1)
      {
        System.out.println("   _==_ _");
        System.out.println(" _,(-,)|_|");
        System.out.println("  \\/. \\-|");
        System.out.println("__( :  )|_");
      }
      else if (userImageChoiceAN == 2)
      {
        System.out.println("    ...        *                        *       *");
        System.out.println("      ...   *         * ..   ...                        *");
        System.out.println(" *      ...        *           *            *");
        System.out.println("          ...               ...                          *");
        System.out.println("            ..                            *");
        System.out.println("    *        ..        *                       *");
        System.out.println("           __##____              *                      *");
        System.out.println("  *    *  /  ##  ****                   *");
        System.out.println("         /        ****               *         *  X   *");
        System.out.println("   *    /        ******     *                    XXX      *");
        System.out.println("       /___________*****          *             XXXXX");
        System.out.println("        |            ***               *       XXXXXXX   X");
        System.out.println("    *   | ___        |                    *   XXXXXXXX  XXX");
        System.out.println("  *     | | |   ___  | *       *             XXXXXXXXXXXXXXX");
        System.out.println("        | |_|   | |  ****             *           X   XXXXXXX");
        System.out.println("    *********** | | *******      *                X      X");
        System.out.println("************************************************************");
      }
      else if (userImageChoiceAN == 3)
      {
        System.out.println("  -    -  -   -   -       -     -   -  -  -     -   -       -   - ");
        System.out.println(" -     -    -   -   -    -   -    --   -  -    -      -  )   - -");
        System.out.println("  - -  -    --  -    -      -     -    -  -  /|   )   (     )  -");
        System.out.println("-   -      -    -    -    -  .---.  _    -  / (  (   -  - (   - ");
        System.out.println("_  -      -  -     -    - - /_   .-(_)-    /   \\)  -    -   -  -");
        System.out.println(" \\  -      -      -   -   - )u\\ /     -    |   /  -  .--.     - ");
        System.out.println("  `-.  -  -   -   -     -   \\-_/_ -    -   (  /\\    /___ \\.-.   ");
        System.out.println("     \\ -       --     -     /    \\  -       \\/ \\\\ - |. .|/`-'  -_");
        System.out.println("     |-                    / / /  \\ - -   -    (_) __\\-/__  - .'");
        System.out.println("      \\    -       -   _.-' / /\\   \\  -  -   - | \\\\  \\:/  )  /");
        System.out.println("       \\-  -  -  -    (\\_.-' /- \\_.'\\ -   - -  \\ V\\\\  :/ / - |");
        System.out.println("        |   -        / (_).-'-  /  /|    --   - `-'\\\\_/ /)  /");
        System.out.println("         \\    -  -  / /    -   /  / | - -  - -   - ((_)/_) /");
        System.out.println("         |_ .-. ___/ /  -    -(  (\\  \\  -   - - -  \\ \\\\  / |");
        System.out.println("         ( )_  ) __\\/  -   -   \\.'\\\\.'\\  -  -    - |  |  | /");
        System.out.println("          \\  ).-'   | -   -    _> _>> _>  -    -   |__|__| |");
        System.out.println("           `._______|_________(__/(__/____________(___V___)'");
      }

      System.out.print("\nWould you like to see another image? [1 - Yes] [2 - No]: ");
      userChoiceNextAN = input.nextInt();
    } while (userChoiceNextAN == 1);

    System.out.println("Happy Holidays and Happy New Year!");
  }
}
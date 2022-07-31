/**
Name: Alex Nguyen
Date: 07/29/22
Program Name: Life.java
Purpose: A Life.java program that allows the user to play a game of life
NOTE: Ava Xu helped me write this program when I ran into issues and questions about my code + also helped me debug when I had compiling issues
*/

import java.util.Scanner;
import java.lang.Math;

public class Life{
  public static void main(String[] args){ 
	Scanner input = new Scanner(System.in);
	
	int columnAN = 20, rowAN = 20;
	int userCellAN = 3;
	
	char[][] cellAN = new char[rowAN][columnAN];
	char[][] cellTwoAN = new char[rowAN][columnAN];
	
	userCell(cellAN, userCellAN);
	
	int yAN, xAN, jointsAN;
	int livingAN;
	int statusAN;
	int dayAN=1;
	
	do{
    for (int i = 0; i < 20; i++){
		  yAN = i;
		  for (int j = 0; j < 20; j++){
			  xAN = j;
			  jointsAN = livingJoints(yAN,xAN,cellAN);
			
			  if (jointsAN <= 1){ 
				  cellTwoAN[yAN][xAN] = 'O';
			  } 
        else if (jointsAN >= 4){
				cellTwoAN[yAN][xAN] = 'O';
        } 
        else if (jointsAN == 3){
				cellTwoAN[yAN][xAN] = 'X';
			  } 
        else if (jointsAN == 2){
				cellTwoAN[yAN][xAN] = cellAN[yAN][xAN]; 
			  }
		  }
	  }
    
		System.out.println("Day "+ dayAN);
		dayAN++;
		print(cellAN);
		livingAN = numberOfLivingCells(cellAN); 
		
		for (int i=0; i<20; i++){
			yAN = i; 
			for (int j=0; j<20; j++){
				xAN = j;
				cellAN[yAN][xAN] = cellTwoAN[yAN][xAN];
				cellTwoAN[yAN][xAN]=0;
			}
		}
    
		System.out.print("Would you like to continue? [1 = Continue] [Other number = Stop]: ");
		statusAN = input.nextInt();
	}while ((livingAN > 0) && (statusAN == 1)); 
		
}
	public static int livingJoints(int yAN, int xAN, char[][]cellAN){
		int jointsAN = 0; 

    int imin = Math.max(0,yAN-1);
		int imax = Math.min(19,yAN+1);
		int jmin = Math.max(0,xAN-1);
    int jmax = Math.min(19,xAN+1);
		
		for (int j = jmin; j <= jmax; j++){
			for(int i = imin; i <= imax; i++){
			  if (cellAN[i][j]=='X'){
				  jointsAN++;
			  }
		  }
		}
		
		if(cellAN[yAN][xAN] == 'X'){
			jointsAN--;
		}
		return jointsAN;
	}
  
	public static int numberOfLivingCells(char[][]cellAN){
		int yAN, xAN, livingAN=0; 
		
		for (int i = 0; i < 20; i++) {
			yAN = i;
			for (int j = 0; j < 20; j++) {
				xAN = j;
				
				if (cellAN[yAN][xAN]=='X') {
					livingAN++;
				}
			}
		}
    
		return livingAN;
	}
  
	public static void userCell(char[][] cellAN, int userCellAN){
		Scanner input = new Scanner(System.in); 
		int xAN, yAN;
    
		System.out.println("Please enter " + userCellAN + " alive cells.");
		
		for (int i=0; i<userCellAN; i++){
			System.out.print("\nCell #"+(i+1));
			System.out.print("\nEnter the y-coordinate [1-20]:");
			yAN = input.nextInt();
			System.out.print("Enter the x-coordinate [1-20]:");
			xAN = input.nextInt();
			cellAN[yAN][xAN]='X';
		}
		
		
	}
  
	public static void print(char[][]cellAN) { //prints the grid
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				 if (cellAN[i][j]!='X') {
					 System.out.print("O");
				 } 
         else{
					 System.out.print(cellAN[i][j]);
				 }
			}
			System.out.println("");
		}
	}

}
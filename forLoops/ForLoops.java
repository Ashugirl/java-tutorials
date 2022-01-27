package forLoops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForLoops {

	public static void main(String[] args) {
		
	
		
		/*for(int y=-1; y<=29; y=y+3) {
			System.out.println(y);
		}*/
		
		/*int[] fizzgame = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
			for(int x : fizzgame) {
				if (x%2==0) {
					System.out.println(x + " buzz");
					
				}else {
					System.out.println(x + " fizz");
				}
				
				
				}*/
		
		int[] game = {11,33,33,65,88,88,66,44,99,11};
		
		 for (int x = 0; x < game.length; x++) {
			 //System.out.println("First loop " + game[x]);
			 	for (int y = x+1; y < game.length; y++) {
			 		//System.out.println("Second loop " + game[y]);
			 if (game[x] == game[y]) 
				 System.out.println(game[y] + " is duplicated.");
			 }}
			 
			 
			  
				
	
		 }
			 }
			
		
				
			
		
		
		
	


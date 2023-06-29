package com.Question1;

import java.util.Scanner;

public class Star_Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter direction (Up, Down, Left, Right): ");
	        String direction = sc.nextLine();

	        System.out.print("Enter the maximum number of stars in a row: ");
	       int maxStars = sc.nextInt();

	       createPattern(direction, maxStars);
	}

	    public static void createPattern(String direction, int maxStars) {
	        if (direction.equalsIgnoreCase("Up")) {
	            createUpPattern(maxStars);
	        }else if (direction.equalsIgnoreCase("Down")) {
	            createDownPattern(maxStars);
	        }else if (direction.equalsIgnoreCase("Left")) {
	            createleftPattern(maxStars);
	        }
//	            else if (direction.equalsIgnoreCase("Right")) {
//	            createRightPattern(maxStars);
//	        }
	        else {
	            System.out.println("Invalid direction input!");
	        }
	    }


		private static void createUpPattern(int maxStars) {
			int space = 1;
			double row = Math.ceil(maxStars/2)+1;
//			System.out.println(row);
			for(int i = 1; i<=row; i++){
				int count  = 0;
	          for(int j = 0; j<(maxStars-space); j++) {
	            	System.out.print(" ");
	            }
	          space = space+2;
	            int temp = i;
				   while(temp > 1) {
					   System.out.print("*"+ " ");
					   count++;
					   temp--;
				   }
				   int num = 1;
				   while(num < i) {
					   System.out.print("*"+" ");
					   count++;
					   num++;
				   }
				System.out.print("*");
				System.out.println();
			}
			space = 1;
			for (int i = 1; i <= 2; i++) {
				for(int j = 0; j<maxStars-space; j++) {
	            	System.out.print(" ");
	            }
	            System.out.println("*");
	        }
			
		}
		
		private static void createDownPattern(int maxStars) {
			int space = 1;
			int row = (int)Math.ceil(maxStars/2)+1;
//			System.out.println(row);
			space = 1;
			for (int i = 1; i <= 2; i++) {
				for(int j = 0; j<maxStars-space; j++) {
	            	System.out.print(" ");
	            }
	            System.out.println(" *");
	        }
			for (int i = row; i >=1; i--) {
				int count  = 0;
		          for(int j = 0; j<space; j++) {
		            	System.out.print(" ");
		            }
		          space = space+2;
		            int temp = i;
					   while(temp > 1) {
						   System.out.print("*"+ " ");
						   count++;
						   temp--;
					   }
					   int num = 1;
					   while(num < i) {
						   System.out.print("*"+" ");
						   count++;
						   num++;
					   }
					System.out.print("*");
					System.out.println();
			}
			
			
		}
		
		private static void createleftPattern(int maxStars) {
			
			int space = 1;
			int row = (int)Math.ceil(maxStars/2)+1;
//			System.out.println(row);
			for(int i = 1; i<=row; i++) {
				for(int j = 1; j<=maxStars-space; j++) {
					System.out.print(" ");	
				}
				space = space+2;
				int k = 1;
				while(k <= i) {
					System.out.print("*"+" ");
					k++;
				}
				if(i != (maxStars/2)+1) {
					System.out.println();
				}
				else {
					break;
				}	
			}
		
			for(int j = 0; j<1; j++) {
				System.out.print("* "+"* ");
				System.out.println();
			}

			int temp = maxStars - row;
			space = 2;
			for(int i = 1; i<=temp; i++) {
				for(int j = 1; j<=space; j++) {
					System.out.print(" ");
				}
				int k = 1;
				while(k <= row-i) {
					System.out.print("* ");
					k++;
				}
				space = space+2;
				System.out.println(" ");
				
			} 
		} 		
}		



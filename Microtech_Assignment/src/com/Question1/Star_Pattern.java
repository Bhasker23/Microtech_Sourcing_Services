package com.Question1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

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
	        }
//	        else if (direction.equalsIgnoreCase("Down")) {
//	            createUpPattern(maxStars);
//	        } else if (direction.equalsIgnoreCase("Left")) {
//	            createUpPattern(maxStars);
//	        } else if (direction.equalsIgnoreCase("Right")) {
//	            createUpPattern(maxStars);
//	        }
	    else {
	            System.out.println("Invalid direction input!");
	        }
	    }

		private static void createUpPattern(int maxStars) {
			int space = 1;
			double row = Math.ceil(maxStars/2)+1;
			System.out.println(row);
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
				if (count >= maxStars) {
					break;
				}
			}
			
			
			space = 1;
			for (int i = 1; i <= 2; i++) {

				for(int j = 0; j<maxStars-space; j++) {
	            	System.out.print(" ");
	            }
	            System.out.println("*");
	        }
			
		}
		

}



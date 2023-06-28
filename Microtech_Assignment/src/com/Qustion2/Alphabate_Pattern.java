package com.Qustion2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Alphabate_Pattern {

	public static void main(String[] args) {
		
		Map<Integer,Character> map = new LinkedHashMap<>();
		map.put(1,'A');
		map.put(2,'B');
		map.put(3,'C');
		map.put(4,'D');
		map.put(5,'E');
		map.put(6,'F');
		map.put(7,'G');
		map.put(8,'H');
		map.put(9,'I');
		map.put(10,'J');
		map.put(11,'K');
		map.put(12,'L');
		map.put(13,'M');
		map.put(14,'N');
		map.put(15,'O');
		map.put(16,'P');
		map.put(17,'Q');
		map.put(18,'R');
		map.put(19,'S');
		map.put(20,'T');
		map.put(21,'U');
		map.put(22,'V');
		map.put(23,'W');
		map.put(24,'X');
		map.put(25,'Y');
		map.put(26,'Z');
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in the range 1-26");
		int rows =  sc.nextInt();
		int col = rows+rows;
			
		for(int i = 1; i<=rows; i++) {
			
			   for (int j = 1; j <= col - i*2; j++) {
	                System.out.print(" ");
	            }
			   int temp = i;
			   while(temp > 1) {
				   System.out.print(map.get(temp)+ " ");
				   temp--;
			   }
			   int num = 1;
			   while(num <= i) {
				   System.out.print(map.get(num)+ " ");
				   num++;
			   }
			   System.out.println();
		}	
	}
}

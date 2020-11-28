/**
 * 
 */
package com.rockckor.model;

/**
 * @author Rockoder
 *
 */
public class Main {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int value = 5;
		System.out.println(">> " + value + "! = " + factorial(value));
	}
	
	/**
	 * Get factorial using recursive method.
	 * @param x
	 * @return
	 */
	private static int factorial(int x) {
		
		if( x==0 || x==1) //Base case
			return 1;
		else //Recursive case
			return x * factorial(x-1);
		
		//   [     Base case    ]   [ Recursive case ]
		//return (x == 1) ? 1 : x * factorial(x-1);
	}

}

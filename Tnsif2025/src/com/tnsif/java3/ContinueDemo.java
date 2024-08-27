package com.tnsif.java3;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=5;i<15;i++) {
        	//to skip odd one 
        	if(i%2!=0)
        		// to print the even one
        		continue;/*Skipping Specific Iterations:

                 The primary use of the continue keyword is to skip the current iteration of a loop when a 
                 certain condition is met, and then proceed with the next iteration. This is particularly useful 
                 when you want to avoid executing certain parts of the loop for specific cases.
                 Example: Skipping even numbers in a loop that processes only odd numbers.
                 */
        	System.out.println(i+" ");
        }
	}

}

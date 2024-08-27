package com.tnsif.java2;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int FirstNum;
		int SecondNum;
		int Res;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the 1st num:");
		FirstNum=Sc.nextInt();
		System.out.println("Enter the 2st num:");
		SecondNum=Sc.nextInt();
		Res=FirstNum+SecondNum;
		System.out.println("Result:"+Res);
	}
}

package com.tnsif.java2;
import java.util.Scanner;

public class Studentinfo {

	public static void main(String[] args) {
	 

		  
				// TODO Auto-generated method stub
				String name;
				String srn;
				long mblno;
				float marks;
				int age;
				System.out.println("enter student details:");
				Scanner Sc=new Scanner(System.in);
				name=Sc.next();
				srn=Sc.next();
				mblno=Sc.nextLong();
				marks=Sc.nextFloat();
				age=Sc.nextInt();
				System.out.println("student:" +name+" "+srn+" "+mblno+" "+marks+" "+age);
		

	}

}

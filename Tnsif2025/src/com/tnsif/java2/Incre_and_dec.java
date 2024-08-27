package com.tnsif.java2;

public class Incre_and_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//increment and decrement operations
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		a++;
		System.out.println(a);
		int e=a++ + ++b +c+d++;//11+21+30+40
		System.out.println(e);
		System.out.println(d);
		System.out.println(a);
		int f=--a+b+ --c +d--;//10+21+29+40
		System.out.println(f);
		System.out.println(c);
		System.out.println(a);
		System.out.println(d);
		d--;
		System.out.println(d);

	}

}

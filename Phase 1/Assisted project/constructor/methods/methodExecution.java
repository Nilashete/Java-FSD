package com.simplilearn.methods;

public class methodExecution {
	public int multiplynumbers(int a, int b) {
		int z=a*b;
		return z;
		
	}
	public static void main(String[] args) {
		methodExecution b= new methodExecution();
		int ans=b.multiplynumbers(40, 50);
		System.out.println("multiplication is: "+ans);
	}
}

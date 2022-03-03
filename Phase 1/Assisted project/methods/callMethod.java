package com.simplilearn.methods;

public class callMethod {
	int val=120;
	
	int operation(int val) {
		val=val*10/100;
		return(val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callMethod d=new callMethod();
		System.out.println("before operatiom value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);

	}

}

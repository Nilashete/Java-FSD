package com.simplilearn.orderstatictics;

public class Main {
	public static void main(String[] args) {
		kthSmallst ob = new kthSmallst(); 
        int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
        int n = arr.length,k = 4; 
        System.out.println("K'th smallest element is "+ ob.kthSmallst(arr, 0, n-1, k)); 
	}
}

package com.simplilearn.longestsubsequence;

import java.util.HashSet;

public class LongestIncreasingSubseuence {

	public static void main(String[] args) 
	{
		int[] a= {3,9,1,10,4,40,2,13,85};
		HashSet<Integer>hs=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		int longseq=0;
		for(int i=0;i<a.length;i++) {
			if(!hs.contains(a[i]-1)) {
				int no=a[i];
				while(hs.contains(no)) {
					no++;
				}
				if(longseq <no-a[i]) {
					longseq=no-a[i];
				}
				}
			}
		System.out.println("Longest Subsequence length is "+longseq);
	}
}

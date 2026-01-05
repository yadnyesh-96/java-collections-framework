
/*
1. Longest Subarray With Sum ≤ K
Description:
Given an integer list nums and integer k, return the maximum length of a contiguous subarray whose sum is ≤ k.
Example:
Input: nums=[2,3,1,2,4], k=7
Output: 3
Explanation: [3,1,2] has sum 6 ≤ 7.

*/

import java.util.*;

public class LongestSubArray{
	public static void main(String x[]){
		
		Deque<Integer> dq=new ArrayDeque<>();
		int sum=0,maxLen=0;
		
		int a[]=new int[]{2,3,1,2,4};
		
		for(int i=0; i<a.length; i++){
			dq.addLast(a[i]);
			
			sum+=a[i];
			while(sum>k){
				sum-=dq.removeFirst();
			}
			
			if(dq.size()>maxLen){
				maxLen=dq.size();
			}
		}
		
		System.out.printf("Longest Subarray With Sum%d ≤ K%d",sum,maxLen);
		
	}
}
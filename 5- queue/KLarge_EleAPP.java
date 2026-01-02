import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();

        for(int v:nums){
            p.add(v);

            if(p.size()>k){
                p.poll();
            }
        }

    

        return p.peek();
    }
}

public class KLarge_EleAPP{
	public static void main(String x[]){
		
		int a[]=new int[]{3,2,1,5,6,4};
		
		Solution s=new Solution();
		
		int result = s.findKthLargest(a, 2); // store result
        System.out.println("Kth largest element is: " + result);
		
		
	}
}
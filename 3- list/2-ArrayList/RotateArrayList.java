

import java.util.*;

public class RotateArrayList{
	public static void main(String x[]){
		
		ArrayList<Integer>al=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		int n=al.size();
		int k=2;
		k=k%n;
		
		for(int i=0; i<k; i++){
			int last = al.remove(n-1);
			al.add(0,last);
		}
		
		System.out.println(al);
	}
}
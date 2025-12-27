

import java.util.*;

public class ArrayList_revList{
	public static void main(String x[]){
	
	ArrayList al=new ArrayList();
	
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(75);
		al.add(10);
		
		System.out.println("ArrayList is:"+al);
		
		ListIterator i=al.listIterator(al.size());
		
		while(i.hasPrevious()){
			Object obj=i.previous();
			System.out.println(obj);
		}
		
		
		
	}
}



import java.util.*;

public class add_ListApp{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println("Array List before inserting new element:"+al);
		
		al.add(2,300);
		System.out.println();
		System.out.println("Array List after the inserting :"+al);
	}
}
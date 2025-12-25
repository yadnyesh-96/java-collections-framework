

import java.util.*;

public class ListIterator1_ListApp{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		ListIterator i=al.listIterator(2);
		
		while(i.hasNext()){
			Object obj=i.next();
			System.out.println(obj);
		}
	}
}
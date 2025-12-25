

import java.util.*;

public class Listiterator_ListApp{
	public static void main(String x[]){
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		ListIterator i=al.listIterator();
		
		while(i.hasNext()){
			Object obj=i.next();
			System.out.println(" "+obj);
		}
		System.out.println();
		while (i.hasPrevious()) {
			Object obj = i.previous();
				System.out.println(obj);
			
		}
	}
}
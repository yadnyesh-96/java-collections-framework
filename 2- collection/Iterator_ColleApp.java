

import java.util.*;

public class Iterator_ColleApp{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Iterator i=al.iterator();
		
		while(i.hasNext()){
			Object obj= i.next();
			System.out.print(" "+obj);
		}
	}
}
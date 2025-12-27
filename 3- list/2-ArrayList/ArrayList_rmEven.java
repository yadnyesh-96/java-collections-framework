

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayList_rmEven{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	
	CopyOnWriteArrayList al=new CopyOnWriteArrayList();
	
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(75);
		al.add(10);
		
		System.out.println("ArrayList is:"+al);
		
		Iterator i=al.iterator();
	
		
		while(i.hasNext()){
			Object obj =i.next();
			if((int)obj%2==0){
				int index=al.indexOf((int)obj);
				al.remove(index);
			}
		}
		
		System.out.println("After removed even elements ArrayList is:"+al);
		
	}
}
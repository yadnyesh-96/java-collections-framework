
/*
Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/

import java.util.*;
public class MergeArrayListApp{
	public static void main(String x[]){
		ArrayList al=new ArrayList();
		
		
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		ArrayList al2=new ArrayList();
		al2.add(20);
		al2.add(60);
		al2.add(10);
		al2.add(70);
		al2.add(80);
		
		ArrayList al3=new ArrayList();
		
		Iterator i=al.iterator();
		while(i.hasNext()){
			Object obj=i.next();
			al3.add(obj);
		}
		
		Iterator j=al2.iterator();
		while(j.hasNext()){
			Object obj=j.next();
			if(!al.contains(obj)){
				al3.add(obj);
			}
		}
		
		Iterator k=al3.iterator();
		while(k.hasNext()){
			Object obj=k.next();
			System.out.println(obj);
		}
	}
}

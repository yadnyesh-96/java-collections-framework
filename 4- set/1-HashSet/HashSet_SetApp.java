

import java.util.*;
public class HashSet_SetApp{
	public static void main(String x[]){
		
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(22);
		hs.add(20);
		hs.add(10);
		hs.add(10);
		hs.add(25);
		hs.add(22);
		hs.add(50);
		hs.add(40);
		hs.add(45);
		hs.add(10);
		
		for(Object obj:hs){
			System.out.println(obj);
		}
	}	
}


import java.util.*;
public class put_mapAPP{
	public static void main(String x[]){
		
		HashMap map=new HashMap();
	
		map.put(1,10);
		map.put(2,50);
		map.put(3,10);
		map.put(4,20);
		map.put(5,70);
		map.put(7,50);
		
		//System.out.println(map);
		Collection c =map.values();
		for(Object val:c){
			System.out.println(val);
		}
	}
}
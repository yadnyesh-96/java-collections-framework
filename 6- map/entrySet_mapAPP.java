

import java.util.*;
public class entrySet_mapAPP{
	public static void main(String x[]){
		
		HashMap map=new HashMap();
		map.put(1,"ABC");
		map.put(2,"PQR");
		map.put(3,"SUV");
		map.put(4,"XYZ");
		
		
		Set<Map.Entry> data=map.entrySet();
		for(Map.Entry e:data){
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
		
	}	
}
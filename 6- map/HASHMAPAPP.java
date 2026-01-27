

import java.util.*;
public class HASHMAPAPP{
	
	public static void main(String x[]){
		
		LinkedHashMap map=new LinkedHashMap();
		
		List ls = new ArrayList();
		ls.add("Ajay");
		ls.add("Virat");
		ls.add("Pratik");
		
		ArrayList al=new ArrayList();
		al.add("smith");
		al.add("fincth");
		al.add("maxwell");
		
		map.put("IND",ls);
		map.put("AUS",al);
		
		Set<Map.Entry> set=map.entrySet();
		for(Map.Entry m : set){
			String tname=(String)m.getKey();
			System.out.println("Team Name :"+tname);
			Object obj = m.getValue();
			ArrayList a=(ArrayList)obj;
			for(Object o:a){
				System.out.println(o);
			}
		}		
		
		
	}
}
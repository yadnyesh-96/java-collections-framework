import java.util.*;
public class UniqueElement{
	public static void main(String x[]){
		
	int a[]=new int[]{10,20,30,10,50,10,20,20,30,40,60,70,70};

	LinkedHashMap map=new LinkedHashMap();
	
	for(int i=0; i<a.length; i++){
		Integer count = (Integer)map.get(a[i]);
		if(count == null){
		count=0;
		}
		++count;
		map.put(a[i],count);
	}
	Set<Map.Entry> set=map.entrySet();
	for(Map.Entry m:set){
		System.out.println(m.getKey()+"\t"+m.getValue());
	}
	}
}
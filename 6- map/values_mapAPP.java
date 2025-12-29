
import java.util.*;
public class values_mapAPP{
	public static void main(String x[]){
		
		HashMap map=new HashMap();
		map.put(1,"ABC");
		map.put(2,"PQR");
		map.put(3,"SUV");
		map.put(4,"XYZ");
		
		
		Collection c=map.values();
		for(Object obj:c){
			System.out.println(obj);
		}
		
	}	
}
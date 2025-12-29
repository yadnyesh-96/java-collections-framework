
import java.util.*;
public class putAll_mapAPP{
	public static void main(String x[]){
		
		HashMap map=new HashMap();
		map.put(1,"ABC");
		map.put(2,"PQR");
		map.put(3,"SUV");
		map.put(4,"XYZ");
		
		LinkedHashMap lmap=new LinkedHashMap();
		lmap.putAll(map);
		System.out.println(lmap);
	}
}
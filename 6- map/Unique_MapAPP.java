


import java.util.*;
public class Unique_MapAPP{
		public static void main(String x[]){
			
			int a[]=new int[]{4,3,2,7,8,2,3,1};
			
			HashMap map=new HashMap();
			
			for(int v:a){
				if(map.containsKey(v)){
					map.put(v, (int)map.get(v) + 1);
				}else{
					map.put(v,1);
				}
			}
			
			System.out.println(map);
			
		}
}



import java.util.*;
public class Unique_MapAPP{
		public static void main(String x[]){
			
			int a[]=new int[]{1,1,1,2,2,3};
			
			HashMap map=new HashMap();
			ArrayList al=new ArrayList();
			
			for(int v:a){
				if(map.containsKey(v)){
					map.put(v, (int)map.get(v) + 1);
				}else{
					map.put(v,1);
					al.add(v);
				}
			}
			
			System.out.println(map);
			
			
			System.out.println(al);
		}
}
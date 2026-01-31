package org.Player;

import java.util.*;
public class PlayerRecordScenario_MapAPP {
	public static void main(String x[]) {
		LinkedHashMap map=new LinkedHashMap();
		
			ArrayList al=new ArrayList();
			
			al.add(new Player(1,"ABC",15));
			al.add(new Player(2,"MNO",35));
			al.add(new Player(3,"PQR",45));
			al.add(new Player(4,"SUV",10));
			al.add(new Player(5,"XYZ",50));
			
			ArrayList al1=new ArrayList();
			al1.add(new Player(1,"Virat",120));
			al1.add(new Player(2,"Dhoni",250));
			al1.add(new Player(3,"Rohit",190));
			al1.add(new Player(4,"Shivam",120));
			al1.add(new Player(5,"Malinga",150));

			map.put("IND",al1);
			map.put("ASUS", al);
			
			Set<Map.Entry>set=map.entrySet();
			for(Map.Entry e:set) {
				String Tname=e.getKey().toString();
				System.out.println(Tname);
				Object obj=e.getValue();
				ArrayList val=(ArrayList)obj;
				for(Object o:val) {
					Player p=(Player)o;
					System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
				}
			}
	}
}

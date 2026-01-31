package org.Player;

import java.util.*;
pu

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

package org.Player;


			
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

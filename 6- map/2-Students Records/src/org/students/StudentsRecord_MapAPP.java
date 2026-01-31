package org.students;
import java.util.*;
public class StudentsRecord_MapAPP {

	public static void main(String[] args) {
		LinkedHashMap FE=new LinkedHashMap();
		
		FE.put(1,"Anurag");
		FE.put(2, "Harshal");
		FE.put(3, "Saurabh");
		FE.put(4, "Nikhil");
		FE.put(5, "Mangesh");
		
	
		
		LinkedHashMap Dept=new LinkedHashMap();
		Dept.put("FE", FE);
		Dept.put("SE", SE);
		
		Set<Map.Entry>set=Dept.entrySet();
		for(Map.Entry e:set) {
			String Dname=e.getKey().toString();
			System.out.println("----");
			System.out.println("|"+Dname+"|");
			System.out.println("----");
			Object obj=e.getValue();
			LinkedHashMap m=(LinkedHashMap)obj;
			Set<Map.Entry>s=m.entrySet();
			System.out.println("ID\tNAME");
			System.out.println("-----------------------");
			for(Map.Entry E:s) {
				System.out.println(E.getKey()+"\t"+E.getValue());
			}
			System.out.println("-----------------------");
			
		}
	}

}

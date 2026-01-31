package org.students;
import java.util.*;
public class StudentsRecord_MapAPP {

	public static void main(String[] args) {
		LinkedHashMap FE=new LinkedHashMap();
		

		
		LinkedHashMap SE=new LinkedHashMap();
		SE.put(1,"Aniket");
		SE.put(2,"Shubham");
		SE.put(3,"Abhijeet");
		SE.put(4,"Pranav");
		SE.put(5,"Sachin");
		
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

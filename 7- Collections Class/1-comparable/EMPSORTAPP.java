
import java.util.*;

class Employee{
	int id;
	int sal;
	String name;
	
	public Employee(int id,int sal,String name){
		this.id=id;
		this.sal=sal;
		this.name=name;
	}
	
	public int getId(){
		return id;
	}
	
	public int getSal(){
		return sal;
	}
	
	public String getName(){
		return name;
	}
}

class SortById implements Comparator{
	public int compare(Object obj,Object obj1){
		Employee f = (Employee) obj;
		Employee s = (Employee) obj1;
		
		if(f.getId()>s.getId()){
			return 1;
		}else if(f.getId()<s.getId()){
			return -1;
		}else{
			return 0;
		}
	}
}

class SortBySal implements Comparator{
	public int compare(Object obj, Object obj1){
		Employee f = (Employee)obj;
		Employee s = (Employee)obj1;
		if(f.getSal()>s.getSal()){
			return 1;
		}else if(f.getSal()<s.getSal()){
			return -1;
		}else{
			return 0;
		}
	}
}

class SortByName implements Comparator{
	public int compare(Object obj,Object obj1){
		Employee f = (Employee)obj;
		Employee s = (Employee)obj1;
		
		return f.getName().compareTo(s.getName());
	}
}

public class EMPSORTAPP{
	public static void main(String x[]){
		
		List ls =new ArrayList();
		ls.add(new Employee(1,15000,"XYZ"));
		ls.add(new Employee(5,17000,"MNO"));
		ls.add(new Employee(2,14000,"ABC"));
		ls.add(new Employee(4,11000,"HSP"));
		ls.add(new Employee(3,12000,"PQR"));
		
		System.out.println("ORIGINAL DATA");
		for(Object obj:ls){
			Employee e = (Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		
		Comparator c =new SortById();
		Collections.sort(ls,c);
		
		System.out.println("SORT ID DATA");
		for(Object obj:ls){
			Employee e = (Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		
		c=new SortByName();
		Collections.sort(ls,c);
		
		System.out.println("SORT NAME DATA");
		for(Object obj:ls){
			Employee e = (Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		
		c=new SortBySal();
		Collections.sort(ls,c);
		
		System.out.println("SORT SALARY DATA");
		for(Object obj:ls){
			Employee e = (Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
	}
}
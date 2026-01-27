
import java.util.*;
class Employee implements Comparable{
	
	int id;
	int sal;
	String name;
	
	Employee(int id,int sal,String name){
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
	
	public int compareTo(Object obj){
		Employee emp=(Employee)obj;
		if(this.id>emp.id){
			return 1;
		}else if(this.id<emp.id){
			return -1;
		}else{
			return 0;
		}
	}
}

public class EmployeeAPPSort{
	public static void main(String x[]){
		List ls =new ArrayList();
		ls.add(new Employee(2,15000,"ABC"));
		ls.add(new Employee(4,17000,"MNO"));
		ls.add(new Employee(1,12000,"XUV"));
		ls.add(new Employee(5,11000,"WYX"));
		ls.add(new Employee(3,16000,"PQR"));
		
		
		System.out.println("Before the ID SOrting");
		for(Object obj:ls){
			Employee e=(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		
		Collections.sort(ls);
		
		System.out.println("After the ID Sorting");
		for(Object obj:ls){
			Employee e=(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
	}
}
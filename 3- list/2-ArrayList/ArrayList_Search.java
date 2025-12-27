
import java.util.*;

public class ArrayList_Search{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	ArrayList al=new ArrayList();
	
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(75);
		al.add(10);
		
		System.out.println("ArrayList is:"+al);
		
		Iterator i=al.iterator();
	
		boolean flag=false;
		System.out.println("Enter Number to search in collection:");
		int data=sc.nextInt();
		
		
		while(i.hasNext()){
			Object obj =i.next();
			if((int)obj==data){
				flag=true;
			}
			
		}
		if(flag){
			System.out.println("Data Found");
		}else{
			System.out.println("Data not Found !");
		}
	}
}
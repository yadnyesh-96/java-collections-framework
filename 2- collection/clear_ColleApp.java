
import java.util.*;

public class clear_ColleApp{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al.clear();
		
		boolean b=al.isEmpty();
		if(b){
			System.out.println("ArrayList Is Empty");
		}else{
			System.out.println("ArrayList is not empty");
		}
		
		System.out.print(" "+al);
		
		
		
	}
}

import java.util.*;

public class containsAll_ColleApp{
	public static void main(String x[]){
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Collection c=new ArrayList();
		c.add(50);
		c.add(60);
		c.add(70);
		
		boolean b =al.addAll(c);
		if(b){
			System.out.println("Element added in ArrayList");
		}else{
			System.out.println("Element are not added in ArrayList");
		}
		
		Iterator i=al.iterator();
		while(i.hasNext()){
			Object obj=i.next();
			System.out.print(" "+obj);
		}
	}
}

import java.util.*;

public class cusrsor_VectorApp{
	public static void main(String x[]){
		
		Vector v=new Vector();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		//Iterator Interface ref abd Iterator interface mehod which is iterator()
		Iterator i=v.iterator();
		
		while(i.hasNext()){
			
			Object obj=i.next();
			System.out.println(" "+obj);
		}
		
		
	}
}

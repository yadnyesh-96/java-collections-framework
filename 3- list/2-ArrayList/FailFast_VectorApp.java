
import java.util.*;
public class FailFast_VectorApp{
	public static void main(String x[]){
		
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println("Before the Modification Vector is: "+v);
		
		Iterator i=v.iterator();
		
		while(i.hasNext()){
			Object obj=i.next();
			if((int)obj==20){
				v.add(100);
			}
		}
		
		System.out.println("After modification Vector is :"+v);
	}
}
/*

Output:
6 warnings
Before the Modification Vector is: [10, 20, 30, 40, 50]
Exception in thread "main" java.util.ConcurrentModificationException
        at java.base/java.util.Vector$Itr.checkForComodification(Vector.java:1292)
        at java.base/java.util.Vector$Itr.next(Vector.java:1248)
        at FailFast_VectorApp.main(FailFast_VectorApp.java:18)
		
*/
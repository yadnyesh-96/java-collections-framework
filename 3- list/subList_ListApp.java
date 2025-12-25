
import java.util.*;

public class subList_ListApp{
	public static void main(String x[]){
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		List sub=al.subList(1,3);
		
		System.out.print("Array list: ["+al);
		System.out.print("]/nsub list : ["+sub);
	}
}
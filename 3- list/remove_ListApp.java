

import java.util.*;

public class remove_ListApp{
	public static void main(String x[]){
		
		ArrayList al =new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		if(al.remove(2)==null){
			System.out.println("data not deleted");
		}else{
			System.out.println("Data removed "+al.remove(2));
		}
	}
}
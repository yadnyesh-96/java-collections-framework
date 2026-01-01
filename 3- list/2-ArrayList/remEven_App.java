

import java.util.*;
public class remEven_App{
	public static void main(String x[]){
		int arr[]=new int[]{1,2,3,4,6,5};
		
		ArrayList al=new ArrayList();
		
		for(int a:arr){
			al.add(a);
		}
		
		Iterator i=al.iterator();
		
		while(i.hasNext()){
			Object obj=i.next();
			if((int)obj%2!=0){
				System.out.println(obj);
			}
		}
		
	}
}
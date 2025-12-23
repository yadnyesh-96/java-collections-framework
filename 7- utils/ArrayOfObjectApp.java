import java.util.*;
public class ArrayOfObjectApp{
	
	public static void main(String x[]){
		
		Object obj[]=new Object[5];
		
		obj[0]=100;
		obj[1]=1.02f;
		obj[2]=false;
		obj[3]=new java.util.Date();
		obj[4]="good";
		
		for(Object o:obj){
			System.out.println(o);
		}
	}
}
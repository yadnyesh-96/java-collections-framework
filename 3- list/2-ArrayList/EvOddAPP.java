
import java.util.*;

public class EvOddAPP{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		List<Integer> ls=new ArrayList<Integer>();
		System.out.println("How much element you want to insert ?");
		int s=sc.nextInt();
		
		System.out.println("Enter the Elements:");
		for(int i=1;i<=s;i++){
			int val=sc.nextInt();
			ls.add(val);
		}
		
		List<Integer>e=new ArrayList<Integer>();
		List<Integer>o=new ArrayList<Integer>();
		
		Iterator l=ls.iterator();
		while(l.hasNext()){
			int num=(int)l.next();
			if(num%2==0){
				e.add(num);
			}else{
				o.add(num);
			}
		}
			
		System.out.println("Even List is:"+e);
		System.out.println("Odd List is :"+o);
		
		//System.out.println(ls);
	}
}
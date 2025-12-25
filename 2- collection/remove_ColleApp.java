
	import java.util.*;
	public class remove_ColleApp{
		public static void main(String x[]){
			
			ArrayList al=new ArrayList();
			
			al.add(40);
			al.add(50);
			al.add(60);
			al.add(70);
			
			boolean b= al.remove(Integer.valueOf(50)); // al.remove(50) it search 50 index and another if generic we use then nothing any error
				
			if(b){
				System.out.println("Element removed");
			}else{
				System.out.println("Element not be removed");
			}
		}
	}
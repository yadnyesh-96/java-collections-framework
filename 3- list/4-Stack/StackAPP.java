
import java.util.*;
public class StackAPP{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		Stack s=new Stack();
		
		do{
			System.out.println("1.PUSH/ADD Data in Stack");
			System.out.println("1.PUSH/ADD Data in Stack");
			System.out.println("2.REMOVE Data from Stack");
			System.out.println("3.PEEK/TAKE Top Data from Stack");
			System.out.println("4.Check Stack Empty or not");
			System.out.println("5.Search Data from Stack");
			System.out.println("6.DISPLAY Stack");
			System.out.println("7.EXIT");
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			
			switch (choice){
				
				case 1: System.out.println("Enter the Value");
						int data=sc.nextInt();
						s.push(data);
					break;
					
				case 2: Object obj=s.pop();
						System.out.println("Removed data is:"+obj);
					break;
				
				case 3:	obj=s.peek();
						System.out.println("Top most data/element"+obj);
					break;
					
				case 4: if(!s.isEmpty()){
							System.out.println("Stack is Empty");
						}else{
							System.out.println("Stack contains the data");
						}
					break;
					
				case 5:	System.out.println("Enter value to search:");
						data=sc.nextInt();
						if(s.search(data)!=-1){
							System.out.println("Data is Present in stack");
						}else{
							System.out.println("Data is Not Found");
						}
					break;
				case 6:	ListIterator i=s.listIterator(s.size());
						while(i.hasNext()){
							Object obj1=i.next();
							System.out.println(obj1);
						}
					break;
					
				case 7: System.exit(0);
					break;
					
				default:
					System.out.println("Invalid Input");
				
				
			}
			
			
		}while(true);
		
	}
}
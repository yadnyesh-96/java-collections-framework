
class ListNode{
	int val;
	ListNode next;
}

public class ListNodeApp{
	public static void main(String x[]){
	
	ListNode n1 =new ListNode();
	n1.val=10;
	
	ListNode n2 =new ListNode();
	n1.val=20;
	
	ListNode n3 =new ListNode();
	n1.val=30;
	
	ListNode curr = n1;
	
	while(curr != null){
		System.out.println(curr.val);
		curr = curr.next;
	}
	}
}
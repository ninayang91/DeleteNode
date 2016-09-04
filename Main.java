import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Node a=new Node(1);
		Node b=new Node(2,a);
		Node c=new Node(3,b);
		Node head=new Node(1,c);
		//System.out.println(kToLast(head, 5));
	}
	
	//delete a node in the middle of a singly linked list
	// we could only access to that node
	//swith values, delete n.next
	public static boolean deleteNode(Node n){
		if(n==null || n.next==null) return false;
		n.data=n.next.data;
		n.next=n.next.next;
		return true;
	}
	
	//talk about the case when the node is the last one
	//make the node as dummy
	
	


}

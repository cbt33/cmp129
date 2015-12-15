package examples.linkedlist;

public class LinkedListDemo1 {

	//Adding the 1st node is a special case, it is the 1st and only time the head is updated.
	
	//Watch the order in which the statements are executed.
	
	//A linked list is built in the memory: you will not see it happen.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head;
		Node tail;
		Node temp;
		head = null;
		tail = null;

		// Add our 1st node
		temp = new Node();
		temp.data = 5;
		temp.next = null;
		head = temp;
		tail = temp;

		// Add the 2nd node
		temp = new Node();
		//You can't change the order of next two statements
		tail.next = temp;
		tail = temp;
		tail.data = 12;
		tail.next = null;

		// Add the 3rd node
		temp = new Node();
		tail.next = temp;
		tail = temp;
		tail.data = 18;
		tail.next = null;
		
		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}

	}

}

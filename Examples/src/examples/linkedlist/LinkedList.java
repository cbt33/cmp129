package examples.linkedlist;

public class LinkedList<T> {
	public Node<T> head;
	public Node<T> tail;
	
	public LinkedList(Node<T> head) {
		this.head = head;
		this.tail = head;
	}
	
	public void addNode(T data) {
		Node<T> node = new Node<T>(data);
		tail.setNext(node);
		tail = node;
		tail.setNext(null);
		tail.setData(data);
	}
	
	public String toString() {
		String output = "";
		Node<T> node = head;
		int i = 0;
		while (node != null) {
			output = output + "Node " + i + ": " + node.getData() + "\n";
			node = node.getNext();
			i++;
		}
		return output;
	}
	
}

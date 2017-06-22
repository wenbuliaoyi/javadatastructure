package datastrut;

public class SingleLinkedList<E> {

	Node<E> head = null;
	
	public SingleLinkedList(){
		
	}
	

	private static class Node<E> {
		E item;
		Node<E> next;

		Node(E item) {
			this.item = item;
		}
	}

	/**
	 * 
	 * @param data
	 */
	public void add(E data) {
		Node<E> newNode = new Node<E>(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public boolean remove(Object o){
		if (o == null) {
			Node<E> preNode = head;
			Node<E> currentNode = preNode.next;
			while (currentNode != null) {
				if (currentNode.item == null) {
					preNode.next = currentNode.next;
					return true;
				}
				preNode = currentNode;
				currentNode = currentNode.next;
			}
		} else {
			Node<E> preNode = head;
			Node<E> currentNode = preNode.next;
			while (currentNode != null ) {
				if (o.equals(currentNode.item)) {
					preNode.next = currentNode.next;
					return true;
				}
				preNode = currentNode;
				currentNode = currentNode.next;
			}
		}
		return false;
	}
	
	public int size(){
		Node<E> o = head;
		int size = 0;
		while(o != null) {
			o = o.next;
			size = size+1;
		}
		return size;
	}
	
	public E get(int index){
		if (index >=0 && index <= size()-1) {
			int i = 0;
	        Node<E> preNode = head;
	        while (preNode != null) {
	        	if (i == index) {
	        		return preNode.item;
	        	}
	        	preNode = preNode.next;
	            i++;
	        }
		} else {
			throw new RuntimeException("越界了！");
		}
		return null;
	}
	
	public void reverse(){
		
		this.head = reverse(this.head);
		
	}
	
public void reverseByLoop(){
		
		this.head = reverseByLoop(this.head);
		
	}
	
	/**
	 * 反转--通过递归
	 * @param head
	 * @return
	 */
	private Node<E> reverse(Node<E> head){
		if (head==null) {
			return head;
		}
		if (head.next == null) {
			return head;
		}
		
		Node<E> reHead = reverse(head.next);
		head.next.next=head;
		head.next = null;
		return reHead;
	}
	
	/**
	 * 通过循环反转
	 * @param head
	 * @return
	 */
	private Node<E> reverseByLoop (Node<E> head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node<E> pre = head;
		Node<E> cur = head.next;
		Node<E> temp = null;
		while (cur != null) {
			temp = cur.next;
			cur.next = pre;
			
			pre = cur;
			cur = temp;
		}
		head.next = null;
		return pre;
	}
	
}

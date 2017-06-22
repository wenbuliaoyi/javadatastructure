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
			throw new RuntimeException("‘ΩΩÁ¡À£°");
		}
		return null;
	}
	
//	private E unlink (Node<E> node) {
//		final E element = node.item;
//		final Node<E> next = node.next;
//		if (node != null && node == head) {
//			this.head = node.next;
//		} else if (next == null) {
//			node = null;
//		} else {
//			
//		}
//		return element;
//	}
	
}

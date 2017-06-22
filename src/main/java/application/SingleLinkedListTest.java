package application;

import datastrut.SingleLinkedList;

public class SingleLinkedListTest {
	public static void main(String[] args) {
		SingleLinkedList<String> list = new SingleLinkedList<String>();
		list.add("ghw");
		list.add("xiaohong");
		list.add("xiaoli");
		list.reverseByLoop();
		System.out.println(list.get(2));
	}

}

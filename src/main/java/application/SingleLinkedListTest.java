package application;

import datastrut.SingleLinkedList;

public class SingleLinkedListTest {
	public static void main(String[] args) {
		SingleLinkedList<String> list = new SingleLinkedList<String>();
		list.add("ghw");
		list.add("xiaohong");
		list.add("xiaoli");
		String str = list.get(0);
		System.out.println(str);
	}

}

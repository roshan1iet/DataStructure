package com.demo.test;

import com.demo.linkedlist.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		
		DoublyLinkedList lst=new DoublyLinkedList();
		lst.addNode(5);
		lst.addNode(10);
		lst.addNode(15);
		lst.addNode(20);
		lst.addNode(25);
		lst.addNode(30);
		
		//lst.displayData();
		lst.deleteByPosition(3);
		lst.addByPosition(16, 3);
		//lst.displayData();
		lst.displayReverseData();
	}
	

}

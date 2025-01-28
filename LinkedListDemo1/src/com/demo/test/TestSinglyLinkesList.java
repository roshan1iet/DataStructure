package com.demo.test;
import com.demo.linkedlist.SinglyLinkedList;


public class TestSinglyLinkesList {

	public static void main(String[] args) {
		SinglyLinkedList lst=new SinglyLinkedList();
		lst.addNode(20);
		lst.addNode(25);
		lst.addNode(30);
		lst.addNode(35);
		lst.addNode(40);
		
		//lst.displayAll();
		//lst.addNode(45);
		//lst.addByPosition(33,3);
		//lst.displayAll();
		//lst.deleteByPosition(3);
	    //lst.deleteByVal(20);
	    lst.searchedByValue(30);
		//lst.displayAll();
	}

}

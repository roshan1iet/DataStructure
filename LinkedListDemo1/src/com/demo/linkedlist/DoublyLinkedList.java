package com.demo.linkedlist;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node next,prev;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public DoublyLinkedList() {
		super();
		this.head=null;
	}
	
	public void addNode(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.prev=temp;
				temp.next=newNode;
				newNode.next=null;
			}
		}
	}
	
	public void deleteByPosition(int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			if(pos==1) {
				head=head.next;
				if(temp.next!=null) {
					temp.next.prev=null;
				}
				temp.next=null;
				temp=null;
			}else {
				for(int i=1;temp!=null && i<=pos-1;i++) {
					temp=temp.next;
				}
				if(temp!=null) {
					temp.prev.next=temp.next;
					if(temp.next!=null) {
						temp.next.prev=temp.prev;
					}
					temp.next=null;
					temp=null;
				}
				else {
					System.out.println("position is beyond list");
				}
			}
		}
	}
	

	public void addByPosition(int val, int pos) {
		Node newNode=new Node(val);
		
		if(head==null) {
			if(pos>1)
			System.out.println("List is empty");
		   else {
			if(pos==1) {
				head=newNode;
			}
		  }
		}
		
		else {
			Node temp=head;
			for(int i=1;temp!=null && i<pos-2;i++) {
				temp=temp.next;
			}if(temp!=null) {
				newNode.next=temp.next;
				newNode.prev=temp;
				newNode.prev.next=newNode;
				if(temp.next!=null) {
					temp.next.prev=newNode;
				}else {
					System.out.println("pos is beyond list");
				}
					
			}
		}
		
	}
	
	
	public void displayData() {
		if(head==null) {
			System.out.println("List is Empty");
		}else {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	
	
	public void displayReverseData() {
		if(head==null) {
			System.out.println("List is Empty");
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.prev;
			}
		}
	
		
	}
}

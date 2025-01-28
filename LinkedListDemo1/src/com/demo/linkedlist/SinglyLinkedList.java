package com.demo.linkedlist;

public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data=data;
			this.next=null;
		}
	}
	Node head;
	public SinglyLinkedList() {
		super();
		this.head = null;
	}
	
	public void addNode(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;          //add node at the beginning
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
				temp.next=newNode;  //add node at the end
				}
		}
	
	
	public void searchedByValue(int val) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			int pos=0;
			while(temp!=null && temp.data!=val) {
				temp=temp.next;
				pos++;
			}if(temp!=null) {
				System.out.println(pos);
			}
			
		}System.out.println("data not found");
	}
	
	
	public void addByPosition(int val,int pos) {
		Node newNode=new Node(val);
		if(head==null && pos>1) {
			System.out.println("list is empty");
		}else {
			if(pos==1) {
				head=newNode;
			}else {
				Node temp=head;
				for(int i=1;temp!=null && i<=pos-2;i++) {
					temp=temp.next;
				}if(temp!=null) {
					newNode.next=temp.next;
					temp.next=newNode;
				}else {
					System.out.println("position is beyond the list");
				}
				
			}
		}
	}
	
	
	
	public void deleteByVal(int val) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head, prev=null;
			if(head.data==val) {
				head=temp.next;
				temp.next=null;
				temp=null;
			}else {
			
			while(temp!=null && temp.data!=val) {
				prev=temp;
				temp=temp.next;
			}if(temp!=null) {
				prev.next=temp.next;
				temp.next=null;
				temp=null;
			}else {
				System.out.println("given number is beyond the list");
			}
		}
		}
	}

	
	public void deleteByPosition(int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head, prev=null;
			for(int i=1;temp!=null && i<=pos-1;i++) {
				prev=temp;
				temp=temp.next;
			}if(temp!=null) {
				prev.next=temp.next;
				temp.next=null;
				temp=null;
			}else {
				System.out.println("given number is beyond the list");
			}
		}
	}
	
	
	
	public void displayAll() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data+"");
				temp=temp.next;
			}
		}
	}
}

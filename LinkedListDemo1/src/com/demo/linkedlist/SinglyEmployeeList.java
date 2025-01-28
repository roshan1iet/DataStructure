package com.demo.linkedlist;

import com.demo.beans.Employee;

public class SinglyEmployeeList {
     class Node{
    	 Employee data;
    	 Node next;
		public Node(Employee data) {
			super();
			this.data=data;
			this.next=null;
		}
    	  
     }
  Node head;
	public SinglyEmployeeList() {
		super();
		this.head=null;
	}
	
	public void addNode(Employee val) {
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
	
	
	public void searchedByid(int id) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			int pos=1;
			while(temp!=null && temp.data.getEmpid()!=id) {
				temp=temp.next;
				pos++;
			}if(temp!=null) {
				System.out.println(temp.data);
			}
			else
				System.out.println("data not found");
		}
	}
	
	
	public void addByPosition(Employee val,int pos) {
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
	
	
	
	public void deleteById(int id) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head, prev=null;
			if(head.data.getEmpid()==id) {
				head=temp.next;
				temp.next=null;
				temp=null;
			}else {
			while(temp!=null && temp.data.getEmpid()!=id) {
				prev=temp;
				temp=temp.next;
			}if(temp!=null) {
				prev.next=temp.next;
				temp.next=null;
				temp=null;
			}else {
				System.out.println("given id is not found"+id);
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

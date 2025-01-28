package com.demo.test;

import com.demo.beans.Employee;
import com.demo.linkedlist.SinglyEmployeeList;

public class TestEmployeelist {

	public static void main(String[] args) {
		SinglyEmployeeList lst=new SinglyEmployeeList();
		
		lst.addNode(new Employee(1,"Roshan", "Gadchiroli"));
		lst.addNode(new Employee(2,"Rakesh", "Nagpur"));
		lst.addNode(new Employee(3,"Rohan", "Wardha"));
		lst.addNode(new Employee(4,"Ramesh", "Chandrapur"));
		
		//lst.displayAll();
		lst.searchedByid(3);
		lst.deleteById(4);
		//lst.displayAll();
		
		
		
		
	}

}

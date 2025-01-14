package com.nt.main.AutoAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
@Autowired
@Qualifier("temp2")
private Address address;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

//@Autowired//(on constructor)
public Employee(Address address) {

	super();
	this.address = address;
	System.out.println("inside constructor");
}


public Address getAddress() {
	return address;
}
//@Autowired
public void setAddress(Address address) {
	this.address = address;
	System.out.println("inside setter methdo");
}


@Override
public String toString() {
	return "Employee [address=" + address + "]";
}

}

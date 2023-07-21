package com.srpingcore.LifeCycleMethod;

public class Samosa {
private double price;

public Samosa(double price) {
	super();
	this.price = price;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("setting price");
	this.price = price;
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}
//we can change the name of method we can take any thing but we have to change in xml file also 
public void init() {
	System.out.println("inside init method");
}
public void destroy() {
	System.out.println("inside destroy method");
}
}

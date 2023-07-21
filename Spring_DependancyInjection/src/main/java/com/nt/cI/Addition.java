package com.nt.cI;

public class Addition {
private int a;
private int b;
public Addition(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("Constructor:int ,int");
}
public Addition(double a, double b) {
	super();
	this.a =(int) a;
	this.b =(int) b;
	System.out.println("Constructor:double ,double");
}
public void sum() {
	System.out.println("Sum is:"+(this.a+this.b));
}
}
//for checking abugity problem for that specify the type in xml file otherwise it will give ambugity prblem
//for maintaing order also specify in xml file.also wa can  specify index for order
//by defaut take string type and resolve also
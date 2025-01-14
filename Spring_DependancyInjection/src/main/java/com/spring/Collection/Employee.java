package com.spring.Collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
private int id;

private List<String> phones;
private Set<String> addresses;
private Map<String,String>courses;
private Properties props;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, List<String> phones, Set<String> addresses, Map<String, String> courses,Properties props) {
	super();
	this.id = id;
	this.phones = phones;
	this.addresses = addresses;
	this.courses = courses;
	this.props=props;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getAddresses() {
	return addresses;
}
public void setAddresses(Set<String> addresses) {
	this.addresses = addresses;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}

public Properties getProps() {
	return props;
}
public void setProps(Properties props) {
	this.props = props;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
			+ ", props=" + props + "]";
}


}

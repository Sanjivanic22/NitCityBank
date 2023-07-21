package com.nt.standaloneCollection;

import java.util.List;
import java.util.Map;

public class Person1 {
private List<String> friends;
private Map<String,Integer>feesStructor;

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

public Map<String, Integer> getFeesStructor() {
	return feesStructor;
}

public void setFeesStructor(Map<String, Integer> feesStructor) {
	this.feesStructor = feesStructor;
}

@Override
public String toString() {
	return "Person [friends=" + friends + "]";
}

}

package com.srpingcore.LifeCycleMethod;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestExample {
private String subject;

public TestExample() {
	super();
	// TODO Auto-generated constructor stub
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

@Override
public String toString() {
	return "TestExample [subject=" + subject + "]";
}
//Note that both the @PostConstruct and @PreDestroy annotations are part of Java EE. Since Java EE was deprecated in Java 9, and removed in
//Java 11, we have to add an additional dependency to use these annotations:
/*<dependency>
<groupId>javax.annotation</groupId>
<artifactId>javax.annotation-api</artifactId>
<version>1.3.2</version>
</dependency>*/
@PostConstruct
public void strat() {
	System.out.println("starting method");
}
@PreDestroy
public void destroy() {
	System.out.println("ending method");
}
}

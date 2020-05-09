package com.deniz;

public class ChildClass extends ParentClass{
	
	int childField;
	
	public ChildClass(int childField) {
		super();
		this.childField=childField;
		this.parentField=5;
	//private olduðu için gelmiyor.	this.parentField=parentField;
	}

}

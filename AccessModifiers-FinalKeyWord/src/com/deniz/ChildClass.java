package com.deniz;

public class ChildClass extends ParentClass{
	
	int childField;
	
	public ChildClass(int childField) {
		super();
		this.childField=childField;
		this.parentField=5;
	//private oldu�u i�in gelmiyor.	this.parentField=parentField;
	}

}

package com.yercel;

import com.deniz.ParentClass;

public class ChildClassOtherPackage extends ParentClass{
	
	int j;

	public ChildClassOtherPackage(int j) {
		super();
		this.j = j;
		this.parentField=5;
	}
	
	//Protected baþka bir package'de cagrilamaz ama extends ettiðimizde çagrilabilir.
	
}

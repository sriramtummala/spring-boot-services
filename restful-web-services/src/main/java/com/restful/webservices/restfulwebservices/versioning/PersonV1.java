package com.restful.webservices.restfulwebservices.versioning;

public class PersonV1 {

	public PersonV1() {
		super();
	}
	public PersonV1(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

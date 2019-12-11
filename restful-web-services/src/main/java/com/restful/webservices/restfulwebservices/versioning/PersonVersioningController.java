package com.restful.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

	
	@GetMapping("v1/person")
	public PersonV1 personv1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping("v2/person")
	public PersonV2 personv2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(value = "person/header", headers = "X-API-VERSION=1")
	public PersonV1 headerv1() {
		return new PersonV1("Bob Charlie"); 
	}
	
	@GetMapping(value = "person/header", headers = "X-API-VERSION=2")
	public PersonV2 headerv2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
}

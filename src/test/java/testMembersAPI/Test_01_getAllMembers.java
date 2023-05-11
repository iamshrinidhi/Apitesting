package testMembersAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_01_getAllMembers {
	
	@Test
	void getAllMembers() {
		
//		without using gerkin language.
		Response response = RestAssured.get("http://127.0.0.1:5000/members");
		System.out.println("Output in string format "+response.asString());
		System.out.println("OutPut is prettyString Format "+response.asPrettyString());
		System.out.println("Body "+response.getBody());
		System.out.println("Status Code "+response.getStatusCode());
		System.out.println("Status Line is "+response.getStatusLine());
		System.out.println("Header "+response.getHeader("Content-type"));
		System.out.println("Time "+response.getTime());
		
	}

}

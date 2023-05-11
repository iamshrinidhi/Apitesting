package testMembersAPI;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;

public class Test_03_getMemberUsingStaticImport {
	
	@Test(enabled = false)
	void test_01_getAllMembers() {
		
//		without using gerkin language.
		Response response = get("http://127.0.0.1:5000/members");
		System.out.println("Output in string format "+response.asString());
		System.out.println("OutPut is prettyString Format "+response.asPrettyString());
		System.out.println("Body "+response.getBody());
		System.out.println("Status Code "+response.getStatusCode());
		System.out.println("Status Line is "+response.getStatusLine());
		System.out.println("Header "+response.getHeader("content-type"));
		System.out.println("Time "+response.getTime());
		
	}
	
	@Test(enabled = false)
	void test_02_getAllMembers() {
		
		given().get("http://127.0.0.1:5000/members").then().statusCode(200);
		
	}
	
	@Test(enabled = false)
	void test_03_getMemberByID() {
		
		given().get("http://127.0.0.1:5000/members").then().statusCode(200).body("All Members are -.id[3]", equalTo(5)).log().all();
	}
	
	@Test
	void test_03_getMemberByname() {
		
		given().get("http://127.0.0.1:5000/members").then().statusCode(200).body("All Members are -.name[3]", equalTo("Pushpavathi")).log().all();
	}

}

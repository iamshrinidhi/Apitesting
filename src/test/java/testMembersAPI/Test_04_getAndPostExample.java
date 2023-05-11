package testMembersAPI;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;

public class Test_04_getAndPostExample {
	
	@Test(enabled = false)
	void testGetAllMembers() {
		
		given().get("http://127.0.0.1:5000/members").then().statusCode(200).body("All Members are -.name[0]", equalTo("raj"))
		.body("All Members are -.name", hasItems("raj", "raju", "Rolex")).log().all();
	}
	
	@Test
	void testAddMembersIntoAPI() {
		JSONObject r = new JSONObject();
		r.put("name", "Shiva");
		r.put("email", "huhh@123.com");
		r.put("designation", "Lead");
		System.out.println(r.toJSONString());
		
		given().header("Content-Type", "application/json")
		.body(r.toJSONString())
		.when()
		.post("http://127.0.0.1:5000/member")
		.then()
		.statusCode(200)
		.log().all();
	}

}

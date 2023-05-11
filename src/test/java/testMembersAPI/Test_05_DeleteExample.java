package testMembersAPI;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;


public class Test_05_DeleteExample {
	@Test
	void testUpdate() {
		
		
		given()
		.when()
		.delete("http://127.0.0.1:5000/member/8")
		.then()
		.statusCode(200)
		.log().all();
	}

	
	
}

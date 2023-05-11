package testMembersAPI;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;


public class Test_05_PutExample {
	@Test
	void testUpdate() {
		JSONObject j = new JSONObject();
		j.put("name", "Moin");
		j.put("email", "roshan@gmail.com");
		j.put("designation", "Team manager");
		System.out.println(j.toJSONString());
		
		given().header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(j.toJSONString())
		.when()
		.put("http://127.0.0.1:5000/member/8")
		.then()
		.statusCode(200)
		.log().all();
	}

	
	
}

package projectn;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetApi {
	static {
	RestAssured.baseURI="https://api.restful-api.dev";
	RestAssured.basePath="/objects";
	}
	
	@Test
	public void getData() {
		given()
		.when()
		.get()
		.then()
		.log().all()
		.statusCode(200);
	}
}

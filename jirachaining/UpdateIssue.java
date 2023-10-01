package jirachaining;
import org.hamcrest.Matchers;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateIssue extends BaseClass {
	@Test(dependsOnMethods = "jirachaining.CreateIssue.create")
	public void update() {
		input = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "  \"fields\": {\r\n"
				+ "    \"description\": \"Bug creation Using REST API for testing\"\r\n"
				+ "  }\r\n"
				+ "}");
		response = input.put("/"+bug_ID);
		response.prettyPrint();		
		response.then().assertThat().statusCode(Matchers.equalTo(204));
	}

}

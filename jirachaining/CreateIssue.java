package jirachaining;


import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateIssue extends BaseClass {
	@Test
	public void create() {
		input = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "  \"fields\": {\r\n"
				+ "    \"project\": {\r\n"
				+ "      \"key\": \"OC\"\r\n"
				+ "    },\r\n"
				+ "    \"summary\": \"create issue in RA project\",\r\n"
				+ "    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "    \"issuetype\": {\r\n"
				+ "      \"name\": \"Bug\"\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}");
		response = input.post();	
		bug_ID = response.jsonPath().get("id");
		System.out.println("The Extracted Bugid is -------"+bug_ID);
		
	}

}


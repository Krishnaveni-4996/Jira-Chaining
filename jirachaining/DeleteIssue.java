package jirachaining;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteIssue extends BaseClass {
	@Test (dependsOnMethods = "jirachaining.UpdateIssue.update")
	public void delete() {
		
		 input = RestAssured.given();
		 
		 response = input.delete("/"+bug_ID);
		 
		 response.then().assertThat().statusCode(Matchers.equalTo(204));
		
	}
	

}

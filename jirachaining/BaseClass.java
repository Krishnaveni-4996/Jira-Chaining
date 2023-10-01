package jirachaining;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	public static String bug_ID;
	public static RequestSpecification input;
	public static Response response;
	@BeforeMethod
	public void base() {
		RestAssured.baseURI="https://testingjira.atlassian.net/rest/api/2/issue/";
		RestAssured.authentication=RestAssured.preemptive().basic("krishnaveni4996@gmail.com", "ATATT3xFfGF0b0xlLwG_GPnV5IuTwqDmIPtVFMhYaQZOYa3LviyhYFkGUQZ-YTULBOi-ZODE7SnYTgEH_-oPdgk_oFEojdoJaiY4EjkayGGAZXrg3_To3cjhi6lpDeNNjJWzBlApDkhtZN6-oHzB6xP_WqHrBz9J5-TXG_mT_WNSlUtgEMnsBWk=9D1B8ADC");
	}

}

package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class oneTestcase {
	@Test
	public void m1() {
	   Response re =	RestAssured.get("https://reqres.in/api/users/2");
	   System.out.println(re.asString());
	   
	  int code = re.getStatusCode();
	  Assert.assertEquals(code, 200);
		
	}

}

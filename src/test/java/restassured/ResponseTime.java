package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class ResponseTime {

    public static void main(String[] args) {
        RestAssured.baseURI ="https://www.tutorialspoint.com/index.htm";
        RequestSpecification r = RestAssured.given();
         Response response=r.get();
        ValidatableResponse v = response.then();
        v.time(Matchers.lessThan(1100L));
        System.out.println("Test Passed");
    }
}

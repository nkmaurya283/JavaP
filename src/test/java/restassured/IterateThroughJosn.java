package restassured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class IterateThroughJosn {

    public static void main(String[] args) {
        RestAssured.baseURI = "https://run.mocky.io/v3";

        Response res = given()
                .when()
                .get("/8ec8f4f7-8e68-4f4b-ad18-4f0940d40bb7");

        JsonPath jsonPath=new JsonPath(res.asString());
        int s=jsonPath.getInt("Location.size()");
        for(int i = 0; i < s; i++) {
            String state = jsonPath.getString("Location["+i+"].State");
            String zip = jsonPath.getString("Location["+i+"].zip");
            System.out.println(state);
            System.out.println(zip);
        }
    }
}

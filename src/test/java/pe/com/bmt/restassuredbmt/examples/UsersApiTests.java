package pe.com.bmt.restassuredbmt.examples;

import org.junit.jupiter.api.Test;
import pe.com.bmt.restassuredbmt.config.UsersApiConfig;

import static io.restassured.RestAssured.given;

public class UsersApiTests extends UsersApiConfig {
    @Test
    public void testGetAllUsers(){

        given().
                when()
                .get("users").
                then()
                .statusCode(200);
    }

    @Test
    public void testGetASingleUserData(){

        given()
                .pathParam("id",1).
                when()
                .get("users/{id}").
                then()
                .statusCode(200);
    }


}

package com.fetch.utils;

import com.fetch.config.Configuration;
import com.fetch.factory.RequestSpecificationFactory;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ApiHelper {

    public static RequestSpecification requestSpecification = RequestSpecificationFactory.getRequestSpec();

    public static Response getCoordinatesByCityNameAndState(String city, String state) {

        return RestAssured
                .given()
                .spec(requestSpecification)
                .queryParam("q", city + "," + state)
                .when()
                .get("direct");
    }

    public static Response getCoordinatesByZip(String zip) {
        return RestAssured
                .given()
                .spec(requestSpecification)
                .queryParam("zip", zip)
                .when()
                .get("zip");
    }


}

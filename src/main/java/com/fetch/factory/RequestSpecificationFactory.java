package com.fetch.factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fetch.config.Configuration;
import com.fetch.config.HeaderConfiguration;
import com.fetch.config.JsonHeaderConfiguration;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class RequestSpecificationFactory {

    private static HeaderConfiguration headerConfiguration;

    static {
        headerConfiguration = new JsonHeaderConfiguration("headers.json");
    }

    public static RequestSpecification getRequestSpec() {
        Map<String, String> headers = headerConfiguration.getHeaders();
        return RestAssured.given()
                .baseUri(Configuration.BASE_URL)
                .queryParam("appid", Configuration.API_KEY)
                .headers(headers);
    }

}

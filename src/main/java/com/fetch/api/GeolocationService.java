package com.fetch.api;

import com.fetch.models.LocationResponse;
import com.fetch.utils.ApiHelper;
import io.restassured.response.Response;
import java.util.List;
import java.util.stream.Collectors;

public class GeolocationService {

    public static LocationResponse getCoordinatesByCityNameAndStateCode(String city, String state) {
        Response response = ApiHelper.getCoordinatesByCityNameAndState(city, state);
        return response.jsonPath().getObject("[0]", LocationResponse.class);
    }

    public static LocationResponse getCoordinatesByZip(String zip) {
        Response response = ApiHelper.getCoordinatesByZip(zip);
        return response.jsonPath().getObject("", LocationResponse.class);
    }

    // Fetch coordinates for multiple locations
    public static List<LocationResponse> getMultipleLocations(List<String> locations) {
        return locations.stream()
                .map(location -> {
                    if (location.matches("\\d{5}")) {
                        // If the location is a zip code (5 digits), call the zip code API
                        return getCoordinatesByZip(location);
                    } else {
                        // Else it's a city and state combination, call the city API
                        return getCoordinatesByCityNameAndStateCode(location.split(",")[0], location.split(",")[1].trim());
                    }
                })
                .collect(Collectors.toList());
    }

}

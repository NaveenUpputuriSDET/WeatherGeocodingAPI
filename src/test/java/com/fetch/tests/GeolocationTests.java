package com.fetch.tests;

import com.aventstack.extentreports.Status;
import com.fetch.api.GeolocationService;
import com.fetch.models.LocationResponse;
import com.fetch.utils.BaseTest;
import com.fetch.utils.ExtentReportManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GeolocationTests extends BaseTest {

    @Test
    public void testCoordinatesByCityState() {
        try {
            LocationResponse location = GeolocationService.getCoordinatesByCityNameAndStateCode("Dallas", "44");
            Assert.assertNotNull(location);
            Assert.assertEquals(location.getLat(), 32.77627, 0.00001);
            Assert.assertEquals(location.getLon(), -96.79685);
            ExtentReportManager.getTest().log(Status.PASS, " get coordinated by city and state code.");

        } catch (Exception e) {
            ExtentReportManager.getTest().log(Status.FAIL, "Get coordinates by city and state code : " + e.getMessage());
            Assert.fail(e.getMessage());
        }

    }

    @Test
    public void testCoordinatesByZip() {
        try {
            LocationResponse location = GeolocationService.getCoordinatesByZip("75454");
            // Check if location data is returned
            Assert.assertNotNull( location);
            // Check if latitude, longitude, and country match the expected values
            Assert.assertEquals( 33.2841,  location.getLat(), 0.00001);
            Assert.assertEquals( -96.574, location.getLon(), 0.00001);
            Assert.assertEquals(location.getCountry(), "US");
        } catch (Exception e) {
            ExtentReportManager.getTest().log(Status.FAIL, "Get coordinates by ZIP: " + e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testMultipleLocations() {

        try {
            // List of locations (city/state and zip codes)
            List<String> locations = List.of("Dallas, 057", "75454", "Fremont, CA", "94538");
            // Fetch the location data for each entry
            List<LocationResponse> locationResponses = GeolocationService.getMultipleLocations(locations);
            // Assertions with null checks
            Assert.assertNotNull( locationResponses);
            Assert.assertFalse( locationResponses.isEmpty());
            // Check if the list contains 4 valid location responses
            Assert.assertEquals( 4, locationResponses.size());

            // Check for the first location (Dallas, TX)
            LocationResponse firstLocation = locationResponses.get(0);
            Assert.assertNotNull(firstLocation);
            Assert.assertEquals("Dallas", firstLocation.getName());

            // Check zip-based location (75454)
            LocationResponse zipLocation = locationResponses.get(1);
            Assert.assertNotNull( zipLocation);
            Assert.assertEquals("US", zipLocation.getCountry());
            Assert.assertTrue(zipLocation.getLat() != 0);



        } catch (Exception e) {
            ExtentReportManager.getTest().log(Status.FAIL, "testMultipleLocations: " + e.getMessage());
            Assert.fail(e.getMessage());
        }

    }
}

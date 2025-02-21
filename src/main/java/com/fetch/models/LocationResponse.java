package com.fetch.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@NoArgsConstructor
public class LocationResponse {

    // Getters & Setters
    private String name;
    private double lat;
    private double lon;
    private String country;
    public void setName(String name) { this.name = name; }
    public void setLat(double lat) { this.lat = lat; }
    public void setLon(double lon) { this.lon = lon; }
    public void setCountry(String country) { this.country = country; }

}

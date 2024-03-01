/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.example.geohub.model;

import javax.persistence.*;

@Entity
@Table(name = "country")

public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "countryid")
    private int countryId;
    @Column(name = "countryname")
    private String countryName;
    @Column(name = "currency")
    private String currency;
    @Column(name = "population")
    private long population;
    @Column(name = "longitude")
    private String longitude;
    @Column(name = "latitude")
    private String latitude;

    public Country() {
    }

    public Country(int countryId, String countryName, String currency, long population, String longitude,
            String latitude) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.currency = currency;
        this.population = population;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getCountryId() {
        return this.countryId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLongitude() {
        return this.longitude;
    }
}
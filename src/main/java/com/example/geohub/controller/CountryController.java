/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.geohub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

import com.example.geohub.model.Country;
import com.example.geohub.service.CountryJpaService;

@RestController

public class CountryController {
    @Autowired
    public CountryJpaService countryJpaService;

    @GetMapping("/countries")
    public ArrayList<Country> getCountriesList() {
        return countryJpaService.getCountries();
    }

    @GetMapping("/countries/{countryId}")
    public Country getCountryById(@PathVariable("countryId") int countryId) {
        return countryJpaService.getCountryById(countryId);
    }

    @PostMapping("/countries")
    public Country addCountry(@RequestBody Country country) {
        return countryJpaService.addCountry(country);
    }

    @PutMapping("/countries/{countryId}")
    public Country updateCountry(@PathVariable("countryId") int countryId, @RequestBody Country country) {
        return countryJpaService.updateCountry(countryId, country);
    }

    @DeleteMapping("/countries/{countryId}")
    public void deleteCountry(@PathVariable("countryId") int countryId) {
        countryJpaService.deleteCountry(countryId);
    }
}
package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.Country;

public interface CountryService {
    Country createCountry(Country country);

    Country getCountryById(Integer countryId);

    List<Country> getAllCountries();

    Country updateCountry(Country country);

    void deleteCountry(Integer countryId);
}
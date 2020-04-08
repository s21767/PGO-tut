package com.lab06;

public class Address {
    public String createAddress(String country){
        return String.format("Country: %s", country);
    }

    public String createAddress(String country, String city){
        return String.format("Country: %s, city: %s", country, city);
    }

    public String createAddress(String country, String city, String postalCode){
        return String.format("Country: %s, city: %s, postal code: %s",
                country, city, postalCode);
    }

    public String createAddress(String country, String city, String postalCode,
                                String streetName){
        return String.format("Country: %s, city: %s, postal code: %s, street name: %s",
                country, city, postalCode, streetName);
    }

    public String createAddress(String country, String city, String postalCode,
                                String streetName, int apartmentNumber){
        return String.format("Country: %s, city: %s, postal code: %s, street name: %s, " +
                        "apartment number: %d",
                country, city, postalCode, streetName, apartmentNumber);
    }
}

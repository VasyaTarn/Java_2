package com.company;

import java.util.Random;
import java.time.LocalDate;

public class RandomFactory {
    private static final Random RANDOM = new Random();

    private static final String[] CITY_NAMES = {"New York", "London", "Paris", "Tokyo", "Berlin"};
    private static final String[] REGIONS = {"California", "Ile-de-France", "Kanto", "Brandenburg"};
    private static final String[] COUNTRIES = {"USA", "UK", "France", "Japan", "Germany"};
    private static final String[] CONTINENTS = {"North America", "Europe", "Asia"};
    private static final String[] POSTAL_CODES = {"10001", "WC2N", "75001", "100-0001", "10115"};
    private static final String[] TELEPHONE_AREA_CODES = {"212", "020", "33", "03", "30"};
    private static final String[] TELEPHONE_COUNTRY_CODES = {"+1", "+44", "+33", "+81", "+49"};
    private static final String[] NAMES = {"John", "Jane", "Alex", "Emily", "Chris"};
    private static final String[] LAST_NAMES = {"Smith", "Doe", "Brown", "Johnson", "Taylor"};
    private static final String[] MIDDLE_NAMES = {"Michael", "Elizabeth", "James", "Marie", "Lee"};
    private static final String[] ADDRESSES = {"123 Main St", "456 Elm St", "789 Oak St", "101 Maple Ave", "202 Pine Rd"};

    public static City randomCity() {
        City city = new City();
        city.setName(randomFromArray(CITY_NAMES));
        city.setRegion(randomFromArray(REGIONS));
        city.setCountry(randomFromArray(COUNTRIES));
        city.setPopulation(RANDOM.nextInt(1000000) + 1);
        city.setPostalCode(randomFromArray(POSTAL_CODES));
        city.setTelephoneAreaCode(randomFromArray(TELEPHONE_AREA_CODES));
        return city;
    }

    public static Country randomCountry() {
        Country country = new Country();
        country.setName(randomFromArray(COUNTRIES));
        country.setContinentName(randomFromArray(CONTINENTS));
        country.setNInhabitants(RANDOM.nextInt(100_000_000) + 1);
        country.setTelephoneCountryCode(randomFromArray(TELEPHONE_COUNTRY_CODES));
        country.setCapitalName(randomFromArray(CITY_NAMES));
        country.setCityNames(new String[]{
                randomFromArray(CITY_NAMES),
                randomFromArray(CITY_NAMES),
                randomFromArray(CITY_NAMES)
        });
        return country;
    }

    public static Fraction randomFraction() {
        Fraction fraction = new Fraction();
        fraction.setNumerator(RANDOM.nextInt(100) + 1);
        fraction.setDenominator(RANDOM.nextInt(99) + 1);
        return fraction;
    }

    public static Human randomHuman() {
        Human human = new Human();
        human.setName(randomFromArray(NAMES));
        human.setLastName(randomFromArray(LAST_NAMES));
        human.setMiddleName(randomFromArray(MIDDLE_NAMES));
        human.setBirthDate(randomDate());
        human.setPhoneNumber(randomFromArray(TELEPHONE_COUNTRY_CODES) + randomFromArray(TELEPHONE_AREA_CODES) + RANDOM.nextInt(1000000));
        human.setCity(randomCity());
        human.setCountry(randomCountry());
        human.setAddress(randomFromArray(ADDRESSES));
        return human;
    }

    private static String randomFromArray(String[] array) {
        return array[RANDOM.nextInt(array.length)];
    }

    private static LocalDate randomDate() {
        int year = RANDOM.nextInt(80) + 1940;
        int dayOfYear = RANDOM.nextInt(365) + 1;
        return LocalDate.ofYearDay(year, dayOfYear);
    }
}

package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class City {
    private String name;
    private String region;
    private String country;
    private int population;
    private String postalCode;
    private String telephoneAreaCode;

    public City()
    {
        name = "";
        region = "";
        country = "";
        population = 0;
        postalCode = "";
        telephoneAreaCode = "";
    }

    public City(String name, String region, String country, int population, String postalCode, String telephoneAreaCode)
    {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postalCode = postalCode;
        this.telephoneAreaCode = telephoneAreaCode;
    }

    public void printInfo()
    {
        System.out.println("City name: " + name);
        System.out.println("City region: " + region);
        System.out.println("City country: " + country);
        System.out.println("City population: " + population);
        System.out.println("City postal Code: " + postalCode);
        System.out.println("City telephone Area: " + telephoneAreaCode);
    }

    public void printInfo(boolean includePopulation, boolean includePostalCode, boolean includeTelephoneAreaCode) {
        System.out.println("City name: " + name);
        System.out.println("City region: " + region);
        System.out.println("City country: " + country);

        if (includePopulation) {
            System.out.println("City population: " + population);
        }

        if (includePostalCode) {
            System.out.println("City postal Code: " + postalCode);
        }

        if (includeTelephoneAreaCode) {
            System.out.println("City telephone Area: " + telephoneAreaCode);
        }
    }

    public void inputData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the city: ");
        name = sc.nextLine();

        System.out.print("Enter the region of the city: ");
        region = sc.nextLine();

        System.out.print("Enter the country of the city: ");
        country = sc.nextLine();

        System.out.print("Enter the population of the city: ");
        population = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the postal code of the city: ");
        postalCode = sc.nextLine();

        System.out.print("Enter the telephone area of the city: ");
        telephoneAreaCode = sc.nextLine();

    }

    public void inputData(Scanner scanner)
    {
        System.out.print("Enter the name of the city: ");
        name = scanner.nextLine();

        System.out.print("Enter the region of the city: ");
        region = scanner.nextLine();

        System.out.print("Enter the country of the city: ");
        country = scanner.nextLine();

        System.out.print("Enter the population of the city: ");
        population = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the postal code of the city: ");
        postalCode = scanner.nextLine();

        System.out.print("Enter the telephone area of the city: ");
        telephoneAreaCode = scanner.nextLine();

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getRegion()
    {
        return region;
    }

    public void setRegion(String region)
    {
        this.region = region;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public int getPopulation()
    {
        return population;
    }

    public void setPopulation(int population)
    {
        this.population = population;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }

    public String getTelephoneAreaCode()
    {
        return telephoneAreaCode;
    }

    public void setTelephoneAreaCode(String telephoneAreaCode)
    {
        this.telephoneAreaCode = telephoneAreaCode;
    }

}

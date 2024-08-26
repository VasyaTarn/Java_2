package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Country {
    private String name;
    private String continentName;
    private int nInhabitants;
    private String telephoneCountryCode;
    private String capitalName;
    private String[] cityNames;

    public Country()
    {
        name = "";
        continentName = "";
        nInhabitants = 0;
        telephoneCountryCode = "";
        capitalName = "";
        cityNames = new String[10];
    }

    public Country(String name, String continentName, int nInhabitants, String telephoneCountryCode, String capitalName, String[] cityNames)
    {
        this.name = name;
        this.continentName = continentName;
        this.nInhabitants = nInhabitants;
        this.telephoneCountryCode = telephoneCountryCode;
        this.capitalName = capitalName;
        this.cityNames = Arrays.copyOf(cityNames, cityNames.length);
    }

    public void printInfo()
    {
        System.out.println("Country name: " + name);
        System.out.println("Country continent name: " + continentName);
        System.out.println("Country nInhabitants: " + nInhabitants);
        System.out.println("Country telephone country code: " + telephoneCountryCode);
        System.out.println("Country capital name: " + capitalName);
        System.out.print("Country city names:");
        for(String cityName : cityNames)
        {
            System.out.print(cityName + " ");
        }

        System.out.println();
    }

    public void printInfo(boolean includeCityNames)
    {
        System.out.println("Country name: " + name);
        System.out.println("Country continent name: " + continentName);
        System.out.println("Country nInhabitants: " + nInhabitants);
        System.out.println("Country telephone country code: " + telephoneCountryCode);
        System.out.println("Country capital name: " + capitalName);

        if(includeCityNames)
        {
            System.out.print("Country city names:");
            for(String cityName : cityNames)
            {
                System.out.print(cityName + " ");
            }
        }

        System.out.println();
    }

    public void inputData()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter country name: ");
        name = scanner.nextLine();

        System.out.print("Enter country continent name: ");
        continentName = scanner.nextLine();

        System.out.print("Enter country nInhabitants: ");
        nInhabitants = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter country telephone country code: ");
        telephoneCountryCode = scanner.nextLine();

        System.out.print("Enter country capital name: ");
        capitalName = scanner.nextLine();

        System.out.print("Enter country city names: ");
        cityNames = scanner.nextLine().split(" ");
    }

    public void inputData(Scanner scanner)
    {
        System.out.print("Enter country name: ");
        name = scanner.nextLine();

        System.out.print("Enter country continent name: ");
        continentName = scanner.nextLine();

        System.out.print("Enter country nInhabitants: ");
        nInhabitants = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter country telephone country code: ");
        telephoneCountryCode = scanner.nextLine();

        System.out.print("Enter country capital name: ");
        capitalName = scanner.nextLine();

        System.out.print("Enter country city names: ");
        cityNames = scanner.nextLine().split(" ");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getContinentName()
    {
        return continentName;
    }

    public void setContinentName(String continentName)
    {
        this.continentName = continentName;
    }

    public int getNInhabitants()
    {
        return nInhabitants;
    }

    public void setNInhabitants(int nInhabitants)
    {
        this.nInhabitants = nInhabitants;
    }

    public String getTelephoneCountryCode()
    {
        return telephoneCountryCode;
    }

    public void setTelephoneCountryCode(String telephoneCountryCode)
    {
        this.telephoneCountryCode = telephoneCountryCode;
    }

    public String getCapitalName()
    {
        return capitalName;
    }

    public void setCapitalName(String capitalName)
    {
        this.capitalName = capitalName;
    }

    public String[] getCityNames()
    {
        return cityNames;
    }

    public void setCityNames(String[] cityNames)
    {
        this.cityNames = cityNames;
    }
}

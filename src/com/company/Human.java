package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Human {
    private String name;
    private String lastName;
    private String middleName;
    private LocalDate birthDate;
    private String phoneNumber;
    private City city;
    private Country country;
    private String address;

    public Human()
    {
        name = "";
        lastName = "";
        middleName = "";
        birthDate = LocalDate.now();
        phoneNumber = "";
        city = new City();
        country = new Country();
        address = "";
    }

    public Human(String name, String lastName, String middleName, LocalDate birthDate, String phoneNumber, City city, Country country, String address)
    {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Phone Number: " + phoneNumber);
        city.printInfo();
        country.printInfo();
        System.out.println("Address: " + address);
    }

    public void printInfo(boolean includeCity, boolean includeCountry, boolean includeAddress)
    {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Phone Number: " + phoneNumber);

        if(includeCity) {
            city.printInfo();
        }

        if(includeCountry) {
            country.printInfo();
        }

        if (includeAddress) {
            System.out.println("Address: " + address);
        }
    }

    public void inputData()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter your middle name: ");
        middleName = scanner.nextLine();

        System.out.print("Enter your birth date: ");
        birthDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter your phone number: ");
        phoneNumber = scanner.nextLine();

        city.inputData();

        country.inputData();

        System.out.print("Enter your address: ");
        address = scanner.nextLine();

        System.out.println();

        scanner.close();

    }

    public void inputData(Scanner scanner)
    {
        System.out.println("over");
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter your middle name: ");
        middleName = scanner.nextLine();

        System.out.print("Enter your birth date: ");
        birthDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter your phone number: ");
        phoneNumber = scanner.nextLine();

        city.inputData();

        country.inputData();

        System.out.print("Enter your address: ");
        address = scanner.nextLine();

        System.out.println();

        scanner.close();

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setName(String name, String middleName, String lastName)
    {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return name;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }

    public void setBirthDate(String birthDate)
    {
        this.birthDate = LocalDate.parse(birthDate);;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public City getCity()
    {
        return city;
    }

    public void setCity(City city)
    {
        this.city = city;
    }

    public Country getCountry()
    {
        return country;
    }

    public void setCountry(Country country)
    {
        this.country = country;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}

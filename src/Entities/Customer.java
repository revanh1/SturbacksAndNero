package Entities;

import java.time.format.DateTimeFormatter;

public class Customer {
    private int Id;
    private String FirtsName;
    private String LastName;
    
    private String NationalId;
    private int DateOfBirth;
    public Customer(int Id, String FirstName, String LastName, String NationalId, int DateOfBirth){
        this.Id = Id;
        this.FirtsName = FirstName;
        this.LastName = LastName;
        this.NationalId = NationalId;
        this.DateOfBirth = DateOfBirth;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirtsName() {
        return FirtsName;
    }

    public void setFirtsName(String firtsName) {
        FirtsName = firtsName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getNationalId() {
        return NationalId;
    }

    public void setNationalId(String nationalId) {
        NationalId = nationalId;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
}

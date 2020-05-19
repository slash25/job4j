package sql.lesson6.ex3;

import java.util.Date;

public class Employees {

    public Employees(int employeeID, String lastName, String firstName,
                     String title, String titleOfCourtesy, Date birthDate,
                     Date hireDate, String address, String city, String region,
                     String postalCode, String country, int homePhone,
                     String extension, String photo, String notes, String reportsTo) {
        EmployeeID = employeeID;
        LastName = lastName;
        FirstName = firstName;
        Title = title;
        TitleOfCourtesy = titleOfCourtesy;
        BirthDate = birthDate;
        HireDate = hireDate;
        Address = address;
        City = city;
        Region = region;
        PostalCode = postalCode;
        Country = country;
        HomePhone = homePhone;
        Extension = extension;
        Photo = photo;
        Notes = notes;
        ReportsTo = reportsTo;
    }

    int EmployeeID;
 String LastName;
 String FirstName;
 String Title;
 String TitleOfCourtesy;
 Date BirthDate;
 Date HireDate;
 String Address;
 String City;
 String Region;
 String PostalCode;
 String Country;
 int HomePhone;
 String Extension;
 String Photo;
 String Notes;
 String ReportsTo;
}

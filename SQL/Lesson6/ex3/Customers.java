package sql.lesson6.ex3;

public class Customers {
    int CustomerID;
    String CompanyName;
    String ContactName;
    String ContactTitle;
    String Address;
    String City;
    String Region;
    int PostalCode;
    String Country;
    int Phone;
    int Fax;

    public Customers(int customerID, String companyName, String contactName,
                     String contactTitle, String address, String city, String region,
                     int postalCode, String country, int phone, int fax) {
        CustomerID = customerID;
        CompanyName = companyName;
        ContactName = contactName;
        ContactTitle = contactTitle;
        Address = address;
        City = city;
        Region = region;
        PostalCode = postalCode;
        Country = country;
        Phone = phone;
        Fax = fax;
    }
}

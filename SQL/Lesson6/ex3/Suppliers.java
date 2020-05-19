package sql.lesson6.ex3;

public class Suppliers {

    public Suppliers(String supplierID, String companyName, String contactName,
                     String contactTitle, String adress, String city, String region,
                     int postalCode, String country, String phone, String fax, String homePage) {
        SupplierID = supplierID;
        CompanyName = companyName;
        ContactName = contactName;
        ContactTitle = contactTitle;
        Adress = adress;
        City = city;
        Region = region;
        PostalCode = postalCode;
        Country = country;
        Phone = phone;
        Fax = fax;
        HomePage = homePage;
    }

    String SupplierID;
   String CompanyName;
   String ContactName;
   String ContactTitle;
   String Adress;
   String City;
   String Region;
   int PostalCode;
   String Country;
   String Phone;
   String Fax;
   String HomePage;
}

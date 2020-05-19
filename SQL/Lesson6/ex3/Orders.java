package sql.lesson6.ex3;

import java.util.Date;

public class Orders {

    int OrderID;
    Customers customers;
    Employees employees;
    Date OrderDate;
    Date RequiredDate;
    Date ShippedDate;
    int ShipVia;
    Shippers shippers;
    String Freight;
    String ShipName;
    String ShipAddress;
    String ShipCity;
    String ShipRegion;
    String ShipPostalCode;
    String ShipCountry;

    public Orders(int orderID, Customers customers, Employees employees,
                  Date orderDate, Date requiredDate, Date shippedDate, int shipVia,
                  Shippers shippers, String freight, String shipName, String shipAddress,
                  String shipCity, String shipRegion, String shipPostalCode, String shipCountry) {
        OrderID = orderID;
        this.customers = customers;
        this.employees = employees;
        OrderDate = orderDate;
        RequiredDate = requiredDate;
        ShippedDate = shippedDate;
        ShipVia = shipVia;
        this.shippers = shippers;
        Freight = freight;
        ShipName = shipName;
        ShipAddress = shipAddress;
        ShipCity = shipCity;
        ShipRegion = shipRegion;
        ShipPostalCode = shipPostalCode;
        ShipCountry = shipCountry;
    }

}

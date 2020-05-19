package sql.lesson6.ex3;

public class OrderDetails {
    Orders orders;
    Products products;
    int UnitPrice;
    int Quantity;
    int Discount;

    public OrderDetails(Orders orders, Products products, int unitPrice, int quantity, int discount) {
        this.orders = orders;
        this.products = products;
        UnitPrice = unitPrice;
        Quantity = quantity;
        Discount = discount;
    }


}

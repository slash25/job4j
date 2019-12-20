package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Cheese", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Sausage", 2);
        products[3] = new Product("Sugar", 10);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName() + ": " +  product.getQuantity() );
                //System.out.println();
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        //удаляем значение из ячейки с индексом 3

        //products[0] = null;
        delete(products,1);
        //Выведем все  значения в консоль
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 " +
           "и удаляем значение из ячейки с индексом 2");
        System.out.println(" ");
        //записываем в ячейку с индексом 1 значение ячейки с индексом 2.
        products[1] = products[2];
        //удаляем значение из ячейки с индексом 2.
       delete(products,2);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }


    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (; index < products.length-1; index++) {
            products[index] = products[index + 1];
        }
        return products;
    }
}



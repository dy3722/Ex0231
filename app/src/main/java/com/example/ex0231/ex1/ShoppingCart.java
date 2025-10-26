package com.example.ex0231.ex1;

public class ShoppingCart {
    Product[] products = new Product[10];

    public ShoppingCart(){
        products[1] = new Book("wow - chapter 1",99.9,"Very interesting wow 1","David");
        products[2] = new Electronics("Ultra wow",9990.9,"Very wow and ultra","David's Electro");
        products[3] = new Clothing("wow shirt",59.9,"Very wow shirt","David's Clothing");
        products[4] = new Book("wow - chapter 2",99.9,"Very interesting wow 2","David");
        products[5] = new Electronics("wow pro max",989.9,"Very wow and pro max","David's Electro");
        products[6] = new Clothing("wow ultra shirt",99.9,"Very wow and ultra shirt","David's Clothing");
        products[7] = new Book("wow - chapter 3",99.9,"Very interesting wow 3","David");
        products[8] = new Electronics("wow plus",991.9,"Very wow and plus","David's Electro");
        products[9] = new Clothing("wow super shirt",119.9,"Very wow and super shirt","David's Clothing");
        products[10] = new Book("wow - chapter 4",99.9,"Very interesting wow 4","David");
    }

    public double calculateTotal() {
        double sum = 0;
        for (Product product : this.products)
        {
            sum += product.getPrice();
        }
        return sum;
    }
}

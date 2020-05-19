package application;

import basket.Basket;
import category.Category;
import product.Product;
import user.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Category category = new Category();
        Category category1 = new Category();
        Category category2 = new Category();

        User user = new User();

        Product product = new Product();
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();

        Basket basket = new Basket();

        category.setName("vegetable");
        category.getProductList();
        category.setProductAddToCollection("Сarrot");
        category.setProductAddToCollection("Potato");
        category.setProductAddToCollection("Cucumber");
        System.out.println(category.getProductList());

        product.setName("Apple");
        System.out.println(product.getName());
        product.setPrice(15.70);
        System.out.println(product.getPrice());
        product.setRating(4.5);
        System.out.println(product.getRating());
        product.setName("Banana");
        product.setPrice(22.50);
        product.setRating(4.3);
        product.setName("Orange");
        product.setPrice(31.40);
        product.setRating(4.2);

        basket.getPurchasedProductList();
        basket.setProductAddToCollection("Orange");
        basket.setProductAddToCollection("Apple");
        basket.setProductAddToCollection("Potato");

        System.out.println(basket.getPurchasedProductList());

        user.setLogin("AKononenko");
        user.setPassword("qwerty12345");
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());
    }
}

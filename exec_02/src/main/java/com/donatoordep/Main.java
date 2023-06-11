package com.donatoordep;

import entities.Product;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product("Celular", 3235.89, 0.50);

        Function<Product, Double> calcule = product -> {

            product.setPrice(product.getPrice() * (1 - product.getDiscount()));

            if (product.getPrice() >= 2500.0) {
                product.setPrice(product.getPrice() * 1.085);

                if (product.getPrice() >= 3000.0) {
                    product.setPrice(product.getPrice() * 1.1);
                } else {
                    product.setPrice(product.getPrice() * 1.05);
                }
            }
            return product.getPrice();
        };

        System.out.println(calcule.apply(p1));
    }
}
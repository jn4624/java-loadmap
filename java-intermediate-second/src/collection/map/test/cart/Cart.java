package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {
        Integer prevQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, prevQuantity + quantity);
    }

    public void minus(Product product, int quantity) {
        int calcQuantity = cartMap.getOrDefault(product, 0) - quantity;
        if (calcQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, calcQuantity);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println("상품: " + product + ", 수량: " + cartMap.get(product));
        }
    }
}

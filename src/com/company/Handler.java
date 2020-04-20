package com.company;
import com.company.model.*;
import java.util.HashMap;
import java.util.Collections;

public class Handler {
    private final HashMap<Long, Product> products = new HashMap<>();

    private Product getProduct(long productID) {
        Product product = this.products.get(productID);
        if (product == null) throw new IllegalArgumentException("Product not found");
        return product;
    }

    public String getDescription(final long productID) {
        return getProduct(productID).getDescription();
    }

    public void addToBasket(final User user, final long productID, final int amount) {
        if (user.getBasket() == null) {
            user.setBasket(new Basket());
        }
        user.getBasket().addProduct(getProduct(productID), amount);
    }

}

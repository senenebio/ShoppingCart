/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technical_test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sebio
 */
public class ShoppingCart {

    private Catalog catalog;
    private Rules rules;
    private Map<String, CartItem> cart;

    public ShoppingCart(Rules rules) {

        //init the catalog
        this.catalog = new Catalog();

        //empty cart
        this.cart = new HashMap<>();

        //init the rules
        this.rules = rules;

    }

    public void add(CartItem item) {
        //find if already exist
        String key = item.getCode();
        if (this.cart.containsKey(key)) {
            //update if existing
            CartItem entry = this.cart.get(key);
            entry.setQuantity(entry.getQuantity() + item.getQuantity());
        } else {
            //append if not
            this.cart.put(key, item);
        }
        
        System.out.println("Added key: " + key);
        System.out.println("Quantity : " + item.getQuantity());

    }

    public void add(CartItem item, String promo_code) {
        this.add(item);
        String key = item.getCode();
        CartItem entry = this.cart.get(key);
        entry.setPromo_code(promo_code);
        
        System.out.println("Applied Promo Code: " + promo_code);
    }

    public double total() throws Exception {
        for (AbstractRule r : this.rules.getRules()) {
            r.execute(this);
        }

        Double total = 0.00;
        for (Map.Entry<String, CartItem> me : this.cart.entrySet()) {
            String key = me.getKey();
            CartItem cart_item = me.getValue();
            total += cart_item.getTotal_price();
        }
        System.out.println("======================");
        //yeah I know, no formatting here.
        System.out.println("CART TOTAL : " + total);
        System.out.println("======================");
        return total;
    }

    public Map<String, CartItem> items() {
        
        System.out.println("--> START DETAILS");
        for (Map.Entry<String, CartItem> me : this.cart.entrySet()) {
            String key = me.getKey();
            CartItem cart_item = me.getValue();
            
            System.out.println("Quantity  : " + cart_item.getQuantity());
            System.out.println("Code      : " + cart_item.getCode());
            System.out.println("Promo Code: " + cart_item.getPromo_code());
            System.out.println("Item Total Px  : " + cart_item.getTotal_price());
            
        }
        System.out.println("--> END DETAILS");

        return this.cart;
    }

    public Rules getRules() {
        return rules;
    }

    public void setRules(Rules rules) {
        this.rules = rules;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public Map<String, CartItem> getCart() {
        return cart;
    }

    public void setCart(Map<String, CartItem> cart) {
        this.cart = cart;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technical_test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sebio
 */
public class TestShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Barebones java, we did not include dependecy to any framework (Spring, JUnit etc)        
        //No bells or whistles

        System.out.println("----------------------------");
        scenario1();
        System.out.println("----------------------------");
        
        System.out.println("----------------------------");
        scenario2();
        System.out.println("----------------------------");
        
        System.out.println("----------------------------");
        scenario3();
        System.out.println("----------------------------");
        
        System.out.println("----------------------------");
        scenario4();
        System.out.println("----------------------------");
        
        
    }

    private static void scenario1() {
        final Rules rules = new Rules();
        final ShoppingCart test_cart = new ShoppingCart(rules);

        CartItem item1 = new CartItem(3, "ult_small", "");
        test_cart.add(item1);

        CartItem item2 = new CartItem(1, "ult_large", "");
        test_cart.add(item2);

        try {
            test_cart.total();
            test_cart.items();
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    private static void scenario2() {
        final Rules rules = new Rules();
        final ShoppingCart test_cart = new ShoppingCart(rules);

        CartItem item1 = new CartItem(2, "ult_small", "");
        test_cart.add(item1);

        CartItem item2 = new CartItem(4, "ult_large", "");
        test_cart.add(item2);

        try {
            test_cart.total();
            test_cart.items();
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
    
    
    private static void scenario3() {
        final Rules rules = new Rules();
        final ShoppingCart test_cart = new ShoppingCart(rules);

        CartItem item1 = new CartItem(1, "ult_small", "");
        test_cart.add(item1);

        CartItem item2 = new CartItem(2, "ult_medium", "");
        test_cart.add(item2);

        try {
            test_cart.total();
            test_cart.items();
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
    
    
    private static void scenario4() {
        final Rules rules = new Rules();
        final ShoppingCart test_cart = new ShoppingCart(rules);

        CartItem item1 = new CartItem(1, "ult_small", "");
        test_cart.add(item1);

        CartItem item2 = new CartItem(1, "ult_1gb", "I<3AMAYSIM");
        test_cart.add(item2);

        try {
            test_cart.total();
            test_cart.items();
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

}

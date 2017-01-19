/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technical_test;

import java.util.Map;

/**
 *
 * @author sebio
 */
public class RuleUnli5GB extends AbstractRule {
    
    @Override
    public void execute(ShoppingCart target) throws Exception {
        //The  unli 5 GB Sim will have a bulk discount applied; 
        //whereby the price will drop to $39.90 each for the first month, 
        // if the customer Unlimited 5GB Sim buys more than 3. 

        String key = "ult_large";
        if (target.getCart().containsKey(key)) {
            CartItem cart_item = target.getCart().get(key);
            Catalog catalog = target.getCatalog();
            if (catalog.getItems().containsKey(key)) {
                if (cart_item.getQuantity() > 3) {
                    cart_item.setTotal_price(cart_item.getQuantity() * 39.90);
                } else {
                    cart_item.setTotal_price(cart_item.getQuantity()
                            * catalog.getItems().get(key).getPrice());
                }
            }
        }
    }
    
}

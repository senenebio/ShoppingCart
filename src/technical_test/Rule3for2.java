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
public class Rule3for2 extends AbstractRule{

    @Override
    public void execute(ShoppingCart target) throws Exception {
        // A 3 for 2 deal on Unlimited 1GB Sims. So for example, 
        // if you buy 3 Unlimited 1GB Sims, you will pay the price 
        // of 2 only for the first month. 
        
        String key = "ult_small";
        if (target.getCart().containsKey(key)) {
            CartItem entry = target.getCart().get(key);
            if (entry.getQuantity() == 3) {
                Catalog catalog = target.getCatalog();
                if (catalog.getItems().containsKey(key)) {
                    entry.setTotal_price(catalog.getItems().get(key).getPrice() * 2);
                }
                
            } else {
                Catalog catalog = target.getCatalog();
                if (catalog.getItems().containsKey(key)) {
                    entry.setTotal_price(catalog.getItems().get(key).getPrice() 
                            * entry.getQuantity());
                }
                
            }
        }
        
        //so what happens if the customer bys 6, 9, 12, ....
        //this rule will apply the else clause
        //and will compute the full price
    }

    
    
}

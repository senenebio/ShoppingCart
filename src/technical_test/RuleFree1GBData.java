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
public class RuleFree1GBData extends AbstractRule {

    @Override
    public void execute(ShoppingCart target) throws Exception {
        //We will bundle in a free  free-of-charge with every  sold. 
        //1 GB Data-pack Unlimited 2GB 

        String key = "ult_medium";
        if (target.getCart().containsKey(key)) {
            CartItem entry = target.getCart().get(key);

            //compute the px
            Catalog catalog = target.getCatalog();
            if (catalog.getItems().containsKey(key)) {
                entry.setTotal_price(catalog.getItems().get(key).getPrice()
                        * entry.getQuantity());
            }

            //add the bundle
            CartItem bundle = new CartItem(entry.getQuantity(),
                    "1gb", "");
            target.add(bundle);
        }
    }

}

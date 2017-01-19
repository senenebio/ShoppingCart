/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technical_test;

import java.util.Map;

/**
 *
 * @author Drei
 */
public class RulePromoCode extends AbstractRule {
    //Adding the promo code 'I<3AMAYSIM' will apply a 10% discount across the board.

    @Override
    public void execute(ShoppingCart target) throws Exception {

        final String promo_code = "I<3AMAYSIM";
        boolean apply_discount = false;
        for (Map.Entry<String, CartItem> me : target.getCart().entrySet()) {
            String key = me.getKey();
            CartItem cart_item = me.getValue();
            if (cart_item.getPromo_code().compareToIgnoreCase(promo_code) == 0) {
                apply_discount = true;
                break;
            }
        }
        
        Catalog catalog = target.getCatalog();
        for (Map.Entry<String, CartItem> me : target.getCart().entrySet()) {
            String key = me.getKey();
            CartItem cart_item = me.getValue();
            if (apply_discount) {               
               if (catalog.getItems().containsKey(key)) {
                   Double unit_px = catalog.getItems().get(key).getPrice();
                   Double total_px = cart_item.getQuantity() * unit_px;
                   //apply discount
                   cart_item.setTotal_price(total_px * 0.90);
               }
            }

        }
    }
}

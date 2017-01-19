/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technical_test;

/**
 *
 * @author sebio
 */
public class CartItem {

    private Integer quantity;        
    private String code;    
    private String promo_code;
    private Double total_price = 0.00;

    
    
    public CartItem(Integer quantity, String code, String promo_code) {
        this.quantity = quantity;
        this.code = code;
        this.promo_code = promo_code;
    }
    String getCode() {
        return this.code;
    }

    public void setCatalog_item(String code) {
        this.code = code;
    }

    public String getPromo_code() {
        return promo_code;
    }

    public void setPromo_code(String promo_code) {
        this.promo_code = promo_code;
    }
    
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }
    
    
}

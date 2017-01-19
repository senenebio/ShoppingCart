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
public class Catalog {

    private Map<String, CatalogItem> items;

    public Catalog() {
        //from a database, hardcoded in this example
        this.items = new HashMap<> ();
        
        this.items.put("ult_small", new CatalogItem("ult_small","Unlimited 1GB",  24.90));
        this.items.put("ult_medium", new CatalogItem("ult_small","Unlimited 2GB",  29.90));
        this.items.put("ult_large", new CatalogItem("ult_small","Unlimited 5GB",  44.90));
        this.items.put("ult_1gb", new CatalogItem("ult_small","1 GB data pack",  9.90));
        
    }
    
    
    public Map<String, CatalogItem> getItems() {
        return items;
    }

    public void setItems(Map<String, CatalogItem> items) {
        this.items = items;
    }
    
}

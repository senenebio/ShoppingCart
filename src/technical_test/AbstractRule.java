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
public abstract class AbstractRule {

    /**
     *
     * @param target
     * @throws Exception
     */
    public abstract void execute(ShoppingCart target) throws Exception;
     
}

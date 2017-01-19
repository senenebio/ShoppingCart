/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technical_test;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author sebio
 */
public class Rules {
    
    private List<AbstractRule> rules;

    public Rules() {
        //rules can be injected using spring, hardcoded in this implementation
        this.rules = new ArrayList <> (); 
                
                
        this.rules.add(new Rule3for2 ());
        this.rules.add(new RuleFree1GBData ());
        this.rules.add(new RuleUnli5GB ());
        this.rules.add(new RulePromoCode ());
        
    }
       
    

    public List<AbstractRule> getRules() {
        return rules;
    }

    public void setRules(List<AbstractRule> rules) {
        this.rules = rules;
    }
    
}

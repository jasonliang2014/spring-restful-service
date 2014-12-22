package com.chisry.web.tax.resource.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.chisry.web.tax.domain.Province;
import com.chisry.web.tax.domain.TaxBracket;
import com.chisry.web.tax.domain.TaxRate;
import com.chisry.web.tax.resource.TaxRateResource;

@Component
public class TaxRateResourceImpl implements TaxRateResource {
    
    public TaxRate getTaxRate(String province, int year) {
        
        // Hard-coded values for this demo
        TaxRate taxRate = new TaxRate();
        List<TaxBracket> taxBrackets = new ArrayList<TaxBracket>();
        if (year == 2014) {
            if (Province.BC.name().equalsIgnoreCase(province)) {
                taxBrackets.add(new TaxBracket(0.0, 37606.00, 0.0506));
                taxBrackets.add(new TaxBracket(37606.00, 75213.00, 0.0770));
                taxBrackets.add(new TaxBracket(75213.00, 86354.00, 0.1050));
                taxBrackets.add(new TaxBracket(86354.00, 104858.00, 0.1229));
                taxBrackets.add(new TaxBracket(104858.00, 150000.00, 0.1470));
                taxBrackets.add(new TaxBracket(150000.00, null, 0.1680));
                taxRate.setYear(2014);
                taxRate.setTaxBrackets(taxBrackets);
                return taxRate;
            }
            else if (Province.AB.name().equalsIgnoreCase(province)) {
                taxBrackets.add(new TaxBracket(0.0, null, 0.1000));
                taxRate.setYear(2014);
                taxRate.setTaxBrackets(taxBrackets);
                return taxRate;                
            }
        }
    
        //
        return null;
    
    }
}

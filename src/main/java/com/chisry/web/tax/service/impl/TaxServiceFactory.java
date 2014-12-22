package com.chisry.web.tax.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.chisry.web.tax.service.TaxService;

@Service
public class TaxServiceFactory {
    
    @Autowired
    @Qualifier("TaxServiceAB")
    private TaxService taxServiceAB;
    
    @Autowired
    @Qualifier("TaxServiceBC")
    private TaxService taxServiceBC;
    
    /**
     * Factory method using Spring injection to create services.
     * 
     */
    public TaxService getTaxService(String province) {
              
        // TODO Use lookup instead of autowired to make it more flexible
        if ("AB".equalsIgnoreCase(province)) {
            return taxServiceAB;
        }
        else if ("BC".equalsIgnoreCase(province)) {
            return taxServiceBC;
        }
        else {
            return null;
        }
    }

}

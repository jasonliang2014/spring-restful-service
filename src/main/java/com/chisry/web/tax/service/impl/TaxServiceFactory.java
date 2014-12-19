package com.chisry.web.tax.service.impl;

import com.chisry.web.tax.service.TaxService;

public class TaxServiceFactory {
    
    public TaxService getTaxService(String province) {
        if ("AB".equalsIgnoreCase(province)) {
            return new TaxServiceAB();
        }
        else if ("BC".equalsIgnoreCase(province)) {
            return new TaxServiceBC();
        }
        else {
            return null;
        }
    }

}

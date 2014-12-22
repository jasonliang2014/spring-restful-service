package com.chisry.web.tax.resource;

import com.chisry.web.tax.domain.TaxRate;

public interface TaxRateResource {

    /*
     * Retrieve tax rate from a configurable resource such as third party services or databases.
     * 
     * return null if province or tax is not supported.
     */
    public TaxRate getTaxRate(String province, int year);
}

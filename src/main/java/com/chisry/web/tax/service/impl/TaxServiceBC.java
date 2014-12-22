package com.chisry.web.tax.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chisry.web.tax.domain.Province;
import com.chisry.web.tax.domain.TaxRate;
import com.chisry.web.tax.exception.NotSupportedException;
import com.chisry.web.tax.resource.TaxRateResource;
import com.chisry.web.tax.service.TaxService;

@Service("TaxServiceBC")
public class TaxServiceBC extends AbstractTaxService implements TaxService {
    
    @Autowired
    private TaxRateResource taxRateResource;
    
    /**
     * Calculate provincial tax.
     */
    public double calculatePersonalIncomeTax(Integer year, Double income) {
        
        // Province tax only for this demo
        TaxRate taxRate = taxRateResource.getTaxRate(Province.BC.name(), year);
        if (taxRate == null) {
            throw new NotSupportedException("Tax year is not supported.");
        }
        
        //
        return calculateTax(taxRate, income);
    }

}

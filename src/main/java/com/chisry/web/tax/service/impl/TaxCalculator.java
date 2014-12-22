package com.chisry.web.tax.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chisry.web.tax.exception.NotSupportedException;
import com.chisry.web.tax.service.TaxService;

@Service
public class TaxCalculator {

    @Autowired
    private TaxServiceFactory taxServiceFactory;
    
    public double calculatePersonalIncomeTax(String province, Integer year, Double income) {
        Double tax = null;

        //
        try {
            TaxService ts = taxServiceFactory.getTaxService(province);
            if (ts == null) {
                throw new Exception("Not supported");
            }
            tax = ts.calculatePersonalIncomeTax(year, income);
        } catch (Exception ex) {
            throw new NotSupportedException("Not supported");
        }

        //
        return tax;
    }
}

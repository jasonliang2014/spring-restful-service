package com.chisry.web.tax.service.impl;

import com.chisry.web.tax.exception.NotSupportedException;
import com.chisry.web.tax.service.TaxService;

public class TaxCalculator {

    public double calculatePersonalIncomeTax(String province, Integer year, Double income) {
        Double tax = null;

        //
        try {
            TaxServiceFactory tsf = new TaxServiceFactory();
            TaxService ts = tsf.getTaxService(province);
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

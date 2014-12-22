package com.chisry.web.tax.service;

public interface TaxService {
    
    /**
     * Calculate provincial tax.
     */
    public double calculatePersonalIncomeTax(Integer year, Double income);
}

package com.chisry.web.tax.service.impl;

import org.springframework.stereotype.Service;

import com.chisry.web.tax.service.TaxService;

@Service("TaxServiceBC")
public class TaxServiceBC implements TaxService {

    public double calculatePersonalIncomeTax(Integer year, Double income) {

        return 0;
    }

}

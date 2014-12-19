package com.chisry.web.tax.service.impl;

import org.springframework.stereotype.Service;
import com.chisry.web.tax.service.TaxService;

@Service("TaxServiceAB")
public class TaxServiceAB implements TaxService {

    public double calculatePersonalIncomeTax(Integer year, Double income) {

        return 0;
    }

}

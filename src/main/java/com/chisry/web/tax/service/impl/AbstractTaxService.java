package com.chisry.web.tax.service.impl;

import java.util.List;

import com.chisry.web.tax.domain.TaxBracket;
import com.chisry.web.tax.domain.TaxRate;

public abstract class AbstractTaxService {

    /**
     * Calculate tax on taxable income.
     */
    public Double calculateTax(TaxRate taxRate, Double income) {

        List<TaxBracket> taxBrackets = taxRate.getTaxBrackets();

        Double tax = 0.00;
        for (TaxBracket taxBracket : taxBrackets) {

            tax += bracketTax(taxBracket.getIncomeFrom(), taxBracket.getIncomeTo(), taxBracket.getRate(), income);
        }

        //
        return tax;
    }

    private Double bracketTax(Double from, Double to, Double rate, Double income) {
        double taxable = 0.00;
        if (to == null) {
            taxable = income - from;
        }
        else {
            taxable = (income > to) ? to - from : income - from;
        }

        return taxable > 0.00 ? taxable * rate : 0.00;
    }

}

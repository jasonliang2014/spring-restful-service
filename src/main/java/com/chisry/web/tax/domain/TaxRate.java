package com.chisry.web.tax.domain;

import java.io.Serializable;
import java.util.List;

public class TaxRate implements Serializable {

    private static final long serialVersionUID = 5931976312059551158L;

    private int               year;
    private List<TaxBracket>  taxBrackets;

    public TaxRate() {

    }

    public TaxRate(int year, List<TaxBracket> taxBrackets) {
        super();
        this.year = year;
        this.taxBrackets = taxBrackets;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<TaxBracket> getTaxBrackets() {
        return taxBrackets;
    }

    public void setTaxBrackets(List<TaxBracket> taxBrackets) {
        this.taxBrackets = taxBrackets;
    }
}

package com.chisry.web.tax.domain;

import java.io.Serializable;

public class TaxBracket implements Serializable {

    private static final long serialVersionUID = -5190509591347243933L;

    private Double            incomeFrom;
    private Double            incomeTo;
    private Double            rate;

    public TaxBracket() {

    }

    public TaxBracket(Double incomeFrom, Double incomeTo, Double rate) {
        super();
        this.incomeFrom = incomeFrom;
        this.incomeTo = incomeTo;
        this.rate = rate;
    }

    public Double getIncomeFrom() {
        return incomeFrom;
    }

    public void setIncomeFrom(Double incomeFrom) {
        this.incomeFrom = incomeFrom;
    }

    public Double getIncomeTo() {
        return incomeTo;
    }

    public void setIncomeTo(Double incomeTo) {
        this.incomeTo = incomeTo;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

}

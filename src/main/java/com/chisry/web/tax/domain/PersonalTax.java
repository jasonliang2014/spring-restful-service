package com.chisry.web.tax.domain;

import java.io.Serializable;

public class PersonalTax implements Serializable {

    private static final long serialVersionUID = 3142263571667901303L;

    private double            tax;

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public PersonalTax() {

    }

    public PersonalTax(Double tax) {
        this.tax = tax;
    }
}

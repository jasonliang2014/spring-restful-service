package com.chisry.web.tax.http;

import com.chisry.web.tax.domain.PersonalTax;

public class PersonalTaxResponse extends Response {

    private static final long serialVersionUID = 7878270034955388335L;

    private PersonalTax       personalTax;

    public PersonalTaxResponse() {

    }

    public PersonalTax getPersonalTax() {
        return personalTax;
    }

    public void setPersonalTax(PersonalTax personalTax) {
        this.personalTax = personalTax;
    }

}

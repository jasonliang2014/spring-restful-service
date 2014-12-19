package com.chisry.web.tax.http;

import java.io.Serializable;

public class PersonalTaxRequest implements Serializable {

    private static final long serialVersionUID = 1848572002693446828L;

    private String            province;
    private Integer           year;
    private Double            income;

    public PersonalTaxRequest() {

    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }
}

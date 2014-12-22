package com.chisry.web.tax.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chisry.web.tax.domain.PersonalTax;
import com.chisry.web.tax.http.PersonalTaxRequest;
import com.chisry.web.tax.http.PersonalTaxResponse;
import com.chisry.web.tax.http.Status;
import com.chisry.web.tax.service.impl.TaxCalculator;

@Controller
public class TaxController {
    public static Logger logger = Logger.getLogger(TaxController.class);

    @Autowired
    private TaxCalculator taxCalculator;
    
    
    @RequestMapping(value = "/personaltax", method = RequestMethod.GET)
    @ResponseBody
    public PersonalTaxResponse calculatePersonalTax(@RequestParam(required = false) Map<String, String> params) {

        PersonalTaxResponse response = new PersonalTaxResponse();

        try {
            // TODO validation
            String province = params.get("province");
            String year = params.get("year");
            String income = params.get("income");
            Double tax = taxCalculator.calculatePersonalIncomeTax(province, Integer.parseInt(year), Double.parseDouble(income));
            PersonalTax pt = new PersonalTax(Math.round(tax * 100) / 100.00);
            response.setPersonalTax(pt);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            response.setStatus(Status.ERROR.name());
        }

        return response;
    }

}
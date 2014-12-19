package com.chisry.web.tax.http;

import java.io.Serializable;

public class Response implements Serializable {

    private static final long serialVersionUID = -5149044034931105727L;

    private String            status           = Status.OK.name();

    public Response() {

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

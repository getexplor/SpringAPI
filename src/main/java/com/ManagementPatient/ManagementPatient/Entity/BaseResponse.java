package com.ManagementPatient.ManagementPatient.Entity;

import com.sun.xml.bind.v2.schemagen.xmlschema.Any;

public class BaseResponse {
    private Boolean Status;
    private Object Data;
    private String Message;

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }
}

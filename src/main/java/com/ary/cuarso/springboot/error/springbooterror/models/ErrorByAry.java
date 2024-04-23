package com.ary.cuarso.springboot.error.springbooterror.models;

import java.util.Date;

public class ErrorByAry {
    private String menssage;
    private String error;
    private int status;
    private Date date;

    
    public String getMenssage() {
        return menssage;
    }
    public void setMenssage(String menssage) {
        this.menssage = menssage;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    

}

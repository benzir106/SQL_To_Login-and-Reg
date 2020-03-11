package com.shovo.sql_to_login_rg;

public class Std {

    private  String response;
    private  String name;
    private  String number;
    private  String password;

    public Std(String name, String number, String password) {
        this.name = name;
        this.number = number;
        this.password = password;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

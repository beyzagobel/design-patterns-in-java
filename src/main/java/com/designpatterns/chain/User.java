package com.designpatterns.chain;

import java.math.BigDecimal;

public class User {
    String name;
    String lastName;
    String userTckn;
    String address;
    BigDecimal balace;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserTckn() {
        return userTckn;
    }

    public void setUserTckn(String userTckn) {
        this.userTckn = userTckn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getBalace() {
        return balace;
    }

    public void setBalace(BigDecimal balace) {
        this.balace = balace;
    }
}

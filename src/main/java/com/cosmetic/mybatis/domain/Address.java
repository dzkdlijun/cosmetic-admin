package com.cosmetic.mybatis.domain;

public class Address extends BaseDomain{

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}
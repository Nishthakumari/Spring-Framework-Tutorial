package com.springcore.auto.wiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {


    private Address address;

    public Emp() {
    }

    @Autowired
    public Emp(Address address) {
        
        this.address = address;
        System.out.println("Inside constructor");
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        System.out.println("Setting value");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}

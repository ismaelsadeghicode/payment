package com.payment.payment.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Provider {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String field;
    private double accountnumber;

    public Provider() {
    }

    public Provider(int id, String name, String field, double accountnumber) {
        this.name = name;
        this.field = field;
        this.accountnumber = accountnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public double getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(double accountnumber) {
        this.accountnumber = accountnumber;
    }
}

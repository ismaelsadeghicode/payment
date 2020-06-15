package com.payment.payment.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double accountnumber;
    private String emailaress;

    public User() {
    }

    public User(int id, String name, double accountnumber, String emailaress) {
        this.name = name;
        this.accountnumber = accountnumber;
        this.emailaress = emailaress;
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

    public double getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(double accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getEmailaress() {
        return emailaress;
    }

    public void setEmailaress(String emailaress) {
        this.emailaress = emailaress;
    }
}

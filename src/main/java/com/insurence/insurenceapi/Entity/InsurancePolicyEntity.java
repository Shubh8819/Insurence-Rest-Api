package com.insurence.insurenceapi.Entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import javax.print.DocFlavor;
import java.time.LocalDate;

@Entity
@Table(name = "insurancepolicy")
public class InsurancePolicyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policynumber")
    private int policynumber;

    @Column(name = "policytype")
    private String type;

    @Column(name = "amount")
    private int amount;

    @Column(name = "premium")
    private int premium;

    @Column(name = "startdate")
    private LocalDate startdate;

    @Column(name = "enddate")
    private LocalDate enddate;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pid", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private CustomerEntity customer;

    public InsurancePolicyEntity(int policynumber, String type, int amount, int premium, LocalDate startdate, LocalDate enddate, CustomerEntity customer) {
        this.policynumber = policynumber;
        this.type = type;
        this.amount = amount;
        this.premium = premium;
        this.startdate = startdate;
        this.enddate = enddate;
        this.customer = customer;
    }

    public InsurancePolicyEntity(){

    }

    @Override
    public String toString() {
        return "InsurancePolicyEntity{" +
                "policynumber='" + policynumber + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", premium=" + premium +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                '}';
    }

    public int getPolicynumber() {
        return policynumber;
    }

    public void setPolicynumber(int policynumber) {
        this.policynumber = policynumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }
    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }
}

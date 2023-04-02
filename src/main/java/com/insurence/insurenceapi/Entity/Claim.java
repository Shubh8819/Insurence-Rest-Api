package com.insurence.insurenceapi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "claim")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "claimid")
    private int id;

    @Column(name = "description")
    private String discription;

    @Column(name = "claimdate")
    private String claimdate;

    @Column(name = "claimstatus")
    private String claimstatus;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cid", referencedColumnName = "pid")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private InsurancePolicyEntity insurence;


    public Claim(int id, String discription, String claimdate, String claimstatus, InsurancePolicyEntity insurence) {
        this.id = id;
        this.discription = discription;
        this.claimdate = claimdate;
        this.claimstatus = claimstatus;
        this.insurence = insurence;
    }
    public Claim(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getClaimdate() {
        return claimdate;
    }

    public void setClaimdate(String claimdate) {
        this.claimdate = claimdate;
    }

    public String getClaimstatus() {
        return claimstatus;
    }

    public void setClaimstatus(String claimstatus) {
        this.claimstatus = claimstatus;
    }

    public InsurancePolicyEntity getInsurence() {
        return insurence;
    }

    public void setInsurence(InsurancePolicyEntity insurence) {
        this.insurence = insurence;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "id=" + id +
                ", discription='" + discription + '\'' +
                ", claimdate=" + claimdate +
                ", claimstatus='" + claimstatus + '\'' +
                ", insurence=" + insurence +
                '}';
    }
}

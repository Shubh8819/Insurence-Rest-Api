package com.insurence.insurenceapi.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "mob")
    private String mobaile;


    @Column(name = "dateofbirth")
    private String date;

    @Column(name = "address")
    private String address;


    public CustomerEntity(int id, String name, String email, String mobaile, String date, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobaile = mobaile;
        this.date = date;
        this.address = address;
    }
    public CustomerEntity(){

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobaile() {
        return mobaile;
    }

    public void setMobaile(String mobaile) {
        this.mobaile = mobaile;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobaile='" + mobaile + '\'' +
                ", date='" + date + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

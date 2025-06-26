package com.bmt.webapp.models;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.*;

//This class is an entity that allow us to create a table in the database

@Entity

//The annotations @Table(name = "clients") is used in Java with JPA (Java Persistence API)to map a Java class to a specific table in your database.
//It tells JPA "This Java class should be stored in and read from a database table named call clients"
@Table(name = "clients") 

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private String phone;
    private String address;
    private String status; // New, Permanent, Lead, Occasional, Inactive
    private Date createdAt;

    // Automatically set createAt before saving
    @PrePersist
    protected void onCreate() {
        if (this.createdAt == null) {
            this.createdAt = Date.valueOf(LocalDate.now());
        }
    }

    // Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

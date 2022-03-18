package com.healthPortal.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name="name")
    public String name;

    @Column(name="address")
    @Size(min=10)
    public String address;

    @Column(name="email")
    public String email;

    @Column(name="phoneNo")
    public String phoneNo;

    @Column(name="password")
    public String password;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "appointment_details")
    public AppointmentDetails appointmentDetails;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public AppointmentDetails getAppointmentDetails() {
        return appointmentDetails;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAppointmentDetails(AppointmentDetails appointmentDetails) {
        this.appointmentDetails = appointmentDetails;
    }
}

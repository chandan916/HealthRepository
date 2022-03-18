package com.healthPortal.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="appointment_details")
public class AppointmentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name="doctor_id")
    public String doctorId;


    @Column(name="start_time")
    public Date startTime;

    @Column(name="end_time")
    public Date endTime;

    public Long getId() {
        return id;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "AppointmentDetails{" +
                "id=" + id +
                ", doctorId='" + doctorId + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}

package com.healthPortal.entity.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.healthPortal.AppConstants;
import com.healthPortal.entity.AppointmentDetails;
import lombok.Data;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class PatientDTO {

    public Long id;

    @JsonProperty(value = "name")
    @Size(min=3,message = "Invalid Name,minimum length required is 3")
    public String name;

    @JsonProperty(value = "address")
    @Size(min=10,message = "Invalid Address,minimum length required is 10")
    public String address;

    @JsonProperty(value = "email")
    @Pattern(regexp = AppConstants.EMAIL_VALIDATION_REGEX,message = "Invalid email address")
    public String email;

    @JsonProperty(value = "phoneNo")
    @Pattern(regexp = AppConstants.PHONE_NUMBER_VALIDATION_REGEX,message = "Invalid phone number")
    public String phoneNo;

    @JsonProperty(value = "password")
    @Size(min=8,max=15,message = "Max length 15 and min length 8")
    @Pattern(regexp = AppConstants.PASSWORD_VALIDATION_REGEX,message = "Password must contain one upper character, one lower character, and a number")
    public String password;

    public AppointmentDetails appointmentDetails;

    public Long getId() {
        return id;
    }

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

    @Override
    public String toString() {
        return "PatientDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", password='" + password + '\'' +
                ", appointmentDetails=" + appointmentDetails +
                '}';
    }
}

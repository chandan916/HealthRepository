package com.healthPortal.controller;

import com.healthPortal.entity.DTO.PatientDTO;
import com.healthPortal.entity.Patient;
import com.healthPortal.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    /*
        Method to save patient details
     */
    @PostMapping("/addPatient")
    public ResponseEntity<Patient> addPatient(@Valid @RequestBody PatientDTO patient) {
        Patient res= patientService.savePatient(patient);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }

    /*
        Method to get all patients details
     */
    @GetMapping("/patients")
    public List<Patient> getAllPatients() {
        return patientService.getPatient();
    }

    /*
        Method to update patient Details
     */
    @PutMapping("/updatePatient")
    public Patient updatePatient( @Valid @RequestBody PatientDTO patient) {
        return patientService.updatePatient(patient);
    }

    /*
        Method to delete patient details
     */
    @DeleteMapping("/patient/{id}")
    public void deletePatient(@PathVariable Long id) {
         patientService.deletePatient(id);
    }
}

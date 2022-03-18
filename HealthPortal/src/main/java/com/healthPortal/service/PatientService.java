package com.healthPortal.service;

import com.healthPortal.entity.DTO.PatientDTO;
import com.healthPortal.entity.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getPatient();

    Patient savePatient(PatientDTO patient);

    Patient updatePatient(PatientDTO patient);

    void deletePatient(Long id);
}

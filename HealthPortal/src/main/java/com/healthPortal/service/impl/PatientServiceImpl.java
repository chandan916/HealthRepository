package com.healthPortal.service.impl;

import com.healthPortal.HealthPortalApplication;
import com.healthPortal.entity.AppointmentDetails;
import com.healthPortal.entity.DTO.PatientDTO;
import com.healthPortal.entity.Patient;
import com.healthPortal.repository.PatientRepo;
import com.healthPortal.service.PatientService;
import com.healthPortal.service.mapper.PatientMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    public static final Logger logger = LogManager.getLogger(PatientServiceImpl.class);

    @Autowired
    public PatientRepo patientRepo;

    @Autowired
    public PatientMapper patientMapper;

    @Override
    public List<Patient> getPatient() {
        return this.patientRepo.findAllByAscendingOrder();
    }

    @Override
    public Patient savePatient(PatientDTO patient) {
        logger.info("saving patient :{}",patient.toString());
       return this.patientRepo.save(this.patientMapper.toEntity(patient));
    }

    @Override
    public Patient updatePatient(PatientDTO patient) {
        Optional<Patient> optionalPatient;
        optionalPatient = patientRepo.findById(patient.getId());
        if(optionalPatient.isPresent()){
            logger.info("updating Patient : {}",patient.toString());
            Patient oldPatient=optionalPatient.get();
            oldPatient.setEmail(patient.getEmail());
            oldPatient.setAddress(patient.getAddress());
            oldPatient.setPhoneNo(patient.getPhoneNo());
            oldPatient.setName(patient.getName());
            oldPatient.setPassword(patient.getPassword());
            if(patient.getAppointmentDetails()!=null){
                AppointmentDetails appointmentDetails=oldPatient.getAppointmentDetails();
                appointmentDetails.setDoctorId(patient.getAppointmentDetails().getDoctorId());
                appointmentDetails.setStartTime(patient.getAppointmentDetails().getStartTime());
                appointmentDetails.setEndTime(patient.getAppointmentDetails().getEndTime());
                oldPatient.setAppointmentDetails(appointmentDetails);
            }
            return patientRepo.save(oldPatient);
        }
        return null;
    }

    @Override
    public void deletePatient(Long id) {
        Optional<Patient> patient=this.patientRepo.findById(id);
        if(patient.isPresent()){
            logger.info("deleting Patient with id: {}",id);
            patientRepo.deleteById(id);
        }
    }
}

package com.healthPortal.service.mapper;

import com.healthPortal.entity.DTO.PatientDTO;
import com.healthPortal.entity.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    Patient toEntity(PatientDTO patientDTO);

}

package com.healthPortal.repository;

import com.healthPortal.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Long> {

    /**
     *
     * @return list of patient in ascending order based on start time of appointment
     */
    @Query(value="select * from patient inner join appointment_details as ad on ad.id=patient.appointment_details order by ad.start_time",nativeQuery = true)
    List<Patient> findAllByAscendingOrder();
}

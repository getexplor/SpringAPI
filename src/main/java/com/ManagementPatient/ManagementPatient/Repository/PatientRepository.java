package com.ManagementPatient.ManagementPatient.Repository;

import com.ManagementPatient.ManagementPatient.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PatientRepository extends JpaRepository<Patient, Integer> {

}

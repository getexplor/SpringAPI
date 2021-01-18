package com.ManagementPatient.ManagementPatient.Repository;

import com.ManagementPatient.ManagementPatient.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseRepository extends JpaRepository<Patient, Integer> {
}

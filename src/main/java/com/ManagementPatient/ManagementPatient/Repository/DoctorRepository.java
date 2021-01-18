package com.ManagementPatient.ManagementPatient.Repository;

import com.ManagementPatient.ManagementPatient.Entity.Doctor;
import com.ManagementPatient.ManagementPatient.Entity.Patient;
import com.ManagementPatient.ManagementPatient.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    @Query("SELECT u FROM Patient u WHERE u.doctor.id = :doctorId and u.status = false")
    List<Patient> findPatients(@Param("doctorId") Integer doctorId);
}

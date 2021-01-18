package com.ManagementPatient.ManagementPatient.Repository;

import com.ManagementPatient.ManagementPatient.Entity.Treatments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatments, Integer> {
}

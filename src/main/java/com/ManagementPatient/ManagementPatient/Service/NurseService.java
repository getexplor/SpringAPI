package com.ManagementPatient.ManagementPatient.Service;

import com.ManagementPatient.ManagementPatient.Entity.Patient;
import com.ManagementPatient.ManagementPatient.Repository.NurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NurseService {

    @Autowired
    private NurseRepository nurseRepository;

    public Patient updatePatient(Integer id, Patient patient){
        Patient existingPatient = nurseRepository.findById(id).orElse(null);
        existingPatient.setStatus(patient.getStatus());
        return nurseRepository.save(existingPatient);
    }

}

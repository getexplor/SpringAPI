package com.ManagementPatient.ManagementPatient.Service;

import com.ManagementPatient.ManagementPatient.Entity.Patient;
import com.ManagementPatient.ManagementPatient.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);
    }

    public List<Patient> getPatient(){
        return patientRepository.findAll();
    }

    public Patient getPatientById(Integer id){
        return patientRepository.findById(id).orElse(null);
    }

    public String deletePatient(Integer id){
        try{
            patientRepository.deleteById(id);
            return "Delete by id " + id;
        }catch (Exception e){
            return "Filed to delete by id " + id;
        }

    }

    public Patient updatePatient(Integer id, Patient patient){
        Patient existingPatient = patientRepository.findById(id).orElse(null);
        existingPatient.setName(patient.getName());
        existingPatient.setTreatment(patient.getTreatment());
        existingPatient.setDoctor(patient.getDoctor());
        return patientRepository.save(existingPatient);
    }
}

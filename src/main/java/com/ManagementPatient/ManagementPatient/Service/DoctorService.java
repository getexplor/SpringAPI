package com.ManagementPatient.ManagementPatient.Service;

import com.ManagementPatient.ManagementPatient.Entity.Doctor;
import com.ManagementPatient.ManagementPatient.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getDoctor(){
        return doctorRepository.findAll();
    }

}

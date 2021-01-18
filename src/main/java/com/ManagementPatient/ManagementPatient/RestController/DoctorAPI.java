package com.ManagementPatient.ManagementPatient.RestController;

import com.ManagementPatient.ManagementPatient.Entity.Doctor;
import com.ManagementPatient.ManagementPatient.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorAPI {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/api/doctors")
    public List<Doctor> GetDoctor(){
        return doctorService.getDoctor();
    }

}

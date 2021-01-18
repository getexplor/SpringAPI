package com.ManagementPatient.ManagementPatient.RestController;

import com.ManagementPatient.ManagementPatient.Entity.Patient;
import com.ManagementPatient.ManagementPatient.Service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NurseAPI {
    @Autowired
    private NurseService nurseService;

    @PutMapping("/api/nurse/{id}")
    public Patient UpdateStatus(@PathVariable Integer id, @RequestBody Patient patient){
        return nurseService.updatePatient(id, patient);
    }
}

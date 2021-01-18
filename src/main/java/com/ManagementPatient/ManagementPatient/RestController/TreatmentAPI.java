package com.ManagementPatient.ManagementPatient.RestController;

import com.ManagementPatient.ManagementPatient.Entity.BaseResponse;
import com.ManagementPatient.ManagementPatient.Entity.PatientTreatmentViewModel;
import com.ManagementPatient.ManagementPatient.Entity.Pharmacist;
import com.ManagementPatient.ManagementPatient.Entity.Treatments;
import com.ManagementPatient.ManagementPatient.Service.PharmacistService;
import com.ManagementPatient.ManagementPatient.Service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TreatmentAPI {

    @Autowired
    private TreatmentService treatmentService;
    @Autowired
    private PharmacistService pharmacistService;

    @GetMapping("/api/treatments")
    public List<Treatments> GetTreatment(){
        return treatmentService.getTreatment();
    }

    @PostMapping("/api/treatment")
    public Treatments CreatTreatment(@RequestBody Treatments treatments){
        return treatmentService.createTreatment(treatments);
    }

    @GetMapping("/api/treatments/{id}")
    public Treatments CheckPatient(@PathVariable Integer id){
        return treatmentService.getTreatmentById(id);
    }

    @PutMapping("/api/treatments/{id}")
    public Pharmacist TreatmentPatient(@PathVariable Integer id, @RequestBody Treatments treatments){
        Treatments treat = treatmentService.TreatmentPatient(id, treatments);

        Pharmacist pharmacist = new Pharmacist();
        pharmacist.setTreatments(treat);
        pharmacist.setStatus(false);

        Pharmacist pharmacistTreat = pharmacistService.CreatePharmacist(pharmacist);

        return pharmacistTreat;
    }
}

package com.ManagementPatient.ManagementPatient.Service;

import com.ManagementPatient.ManagementPatient.Entity.Treatments;
import com.ManagementPatient.ManagementPatient.Repository.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentService {

    @Autowired
    private TreatmentRepository treatmentRepository;

    public List<Treatments> getTreatment(){
        return treatmentRepository.findAll();
    }

    public Treatments createTreatment(Treatments treatments){
        return treatmentRepository.save(treatments);
    }

    public Treatments getTreatmentById(Integer id){
        return treatmentRepository.findById(id).orElse(null);
    }

    public Treatments TreatmentPatient(Integer id, Treatments treatments){
        Treatments TreatFind = treatmentRepository.findById(id).orElse(null);
        TreatFind.setReceipt(treatments.getReceipt());
        TreatFind.setStatus(treatments.getStatus());
        return treatmentRepository.save(TreatFind);
    }
}

package com.ManagementPatient.ManagementPatient.Service;

import com.ManagementPatient.ManagementPatient.Entity.Pharmacist;
import com.ManagementPatient.ManagementPatient.Repository.PharmacistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacistService {
    @Autowired
    private PharmacistRepository pharmacistRepository;

    public List<Pharmacist> GetPharmacist(){
        return pharmacistRepository.findAll();
    }

    public Pharmacist CreatePharmacist(Pharmacist pharmacist){
        return pharmacistRepository.save(pharmacist);
    }

    public Pharmacist GetPharmacistById(Integer id){
        return pharmacistRepository.findById(id).orElse(null);
    }

    public Pharmacist UpdatePharmacist(Integer id, Pharmacist pharmacist){
        Pharmacist findPharmacist = pharmacistRepository.findById(id).orElse(null);
        findPharmacist.setMedicine(pharmacist.getMedicine());
        findPharmacist.setTotalMedicine(pharmacist.getTotalMedicine());
        return pharmacistRepository.save(findPharmacist);
    }

    public Pharmacist CheckOutMedicine(Integer id, Pharmacist pharmacist){
        Pharmacist findPharmacist = pharmacistRepository.findById(id).orElse(null);
        findPharmacist.setStatus(pharmacist.getStatus());
        return pharmacistRepository.save(findPharmacist);
    }
}

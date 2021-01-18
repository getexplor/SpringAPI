package com.ManagementPatient.ManagementPatient.RestController;

import com.ManagementPatient.ManagementPatient.Entity.Pharmacist;
import com.ManagementPatient.ManagementPatient.Service.PharmacistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PharmacistAPI {
    @Autowired
    private PharmacistService pharmacistService;

    @GetMapping("/api/pharmacists")
    public List<Pharmacist> GetPharmacit(){
        return pharmacistService.GetPharmacist();
    }

    @PostMapping("/api/pharmacist")
    public Pharmacist CreatePharmacist(@RequestBody Pharmacist pharmacist){
        return pharmacistService.CreatePharmacist(pharmacist);
    }

    @GetMapping("/api/pharmacists/{id}")
    public Pharmacist GetPharmacistById(@PathVariable Integer id){
        return pharmacistService.GetPharmacistById(id);
    }

    @PutMapping("/api/pharmacists/{id}")
    public Pharmacist UpdatePharmacist(@PathVariable Integer id, @RequestBody Pharmacist pharmacist){
        return pharmacistService.UpdatePharmacist(id, pharmacist);
    }

    @PutMapping("api/pharmacist/checkout/{id}")
    public Pharmacist CheckOutMedicine(@PathVariable Integer id, @RequestBody Pharmacist pharmacist){
        return pharmacistService.CheckOutMedicine(id, pharmacist);
    }

}

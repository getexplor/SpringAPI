package com.ManagementPatient.ManagementPatient.Controller;

import com.ManagementPatient.ManagementPatient.Service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoctorController {
    @Autowired
    private TreatmentService treatmentService;
    @RequestMapping("/doctor")
    public String Dashboard(){
        return "/doctor/dashboard";
    }
    @RequestMapping("/doctor/checkup/{id}")
    public String CheckUp(@PathVariable Integer id, Model model){
        model.addAttribute("treatment",treatmentService.getTreatmentById(id));
        return "/doctor/checkup";

    }
}

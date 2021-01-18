package com.ManagementPatient.ManagementPatient.Controller;

import com.ManagementPatient.ManagementPatient.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

    private PatientService patientService;

    @Autowired
    public void setPatientService(PatientService patientService) {
        this.patientService = patientService;
    }

    @RequestMapping("/admin")
    public String dashboard(){
        return "/admin/dashboard";
    }
    @RequestMapping("/admin/formPatient")
    public String formPatien(){
        return "/admin/formPatient";
    }
    @RequestMapping(value = "/admin/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("data", patientService.getPatientById(id));
        return "/admin/formEdit";
    }
}

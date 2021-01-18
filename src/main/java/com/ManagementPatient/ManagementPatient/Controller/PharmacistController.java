package com.ManagementPatient.ManagementPatient.Controller;

import com.ManagementPatient.ManagementPatient.Service.PharmacistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PharmacistController {

    @Autowired
    private PharmacistService pharmacistService;

    @RequestMapping("/pharmacist")
    public String dashboard(){
        return "/pharmacist/dashboard";
    }
    @RequestMapping("/pharmacist/medicine/{id}")
    public String medicine(@PathVariable Integer id, Model model){
        model.addAttribute("medicine", pharmacistService.GetPharmacistById(id));
        return "/pharmacist/medicine";
    }
}

package com.ManagementPatient.ManagementPatient.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NurseController {

    @RequestMapping("/nurse")
    public String nurse(){
        return("/nurse/dashboard");
    }

}

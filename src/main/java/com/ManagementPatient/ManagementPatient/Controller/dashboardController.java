package com.ManagementPatient.ManagementPatient.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dashboardController {
    @RequestMapping("/")
    public String dashboard(){
        return "/dashboard";
    }
}

package com.ManagementPatient.ManagementPatient.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
    @RequestMapping("/login")
    public String Login(){
        return "/auth/login";
    }
    @RequestMapping("/logout")
    public String logout(){
        return "/auth/login";
    }
}

package com.ManagementPatient.ManagementPatient.RestController;

import com.ManagementPatient.ManagementPatient.Entity.BaseResponse;
import com.ManagementPatient.ManagementPatient.Entity.Users;
import com.ManagementPatient.ManagementPatient.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersAPI {
    @Autowired
    private UserService userService;

    @PostMapping("/api/login")
    public BaseResponse Login(@RequestBody Users users){
        BaseResponse response = new BaseResponse();

        Users result = userService.getUser(users.getUsername(), users.getPassword());
        if(result == null){
            response.setStatus(false);
            response.setData(null);
            response.setMessage("Username or password is wrong");
            return response;
        }
        response.setStatus(true);
        response.setData(result);
        response.setMessage("Login Success");
        return response;
    }
}

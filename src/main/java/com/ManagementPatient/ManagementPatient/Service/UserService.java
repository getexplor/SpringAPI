package com.ManagementPatient.ManagementPatient.Service;

import com.ManagementPatient.ManagementPatient.Entity.Users;
import com.ManagementPatient.ManagementPatient.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UsersRepository usersRepository;

    public Users getUser(String username, String password){
        Users result = usersRepository.findUserPassword(username, password);
        return result;
    }
}
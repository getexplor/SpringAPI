package com.ManagementPatient.ManagementPatient.Repository;

import com.ManagementPatient.ManagementPatient.Entity.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {
//    @Query("SELECT u FROM Users u WHERE u.username = ?1 and u.password = ?2")
//    Users findUserPassword(String username, String password);

    @Query("SELECT u FROM Users u WHERE u.username = :username and u.password = :password")
    Users findUserPassword(@Param("username") String username, @Param("password") String password);
}

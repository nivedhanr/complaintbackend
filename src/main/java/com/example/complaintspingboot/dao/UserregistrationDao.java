package com.example.complaintspingboot.dao;

import com.example.complaintspingboot.model.Userregistration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserregistrationDao extends CrudRepository<Userregistration,Integer> {

    @Query(value = "SELECT `id`, `address`, `confirmpass`, `email`, `name`, `password`, `phn` FROM `registration` WHERE `email`=:email AND `password`=:password",nativeQuery = true)
    List<Userregistration> userLogin(@Param("email") String email, @Param("password") String password);

    @Query(value = "SELECT `id`, `address`, `confirmpass`, `email`, `name`, `password`, `phn` FROM `registration` WHERE `id`=:id",nativeQuery = true)
    List<Userregistration> FindUser(@Param("id") Integer id);
}

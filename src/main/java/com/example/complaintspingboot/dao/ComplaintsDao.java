package com.example.complaintspingboot.dao;

import com.example.complaintspingboot.model.Complaint;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface ComplaintsDao extends CrudRepository<Complaint,Integer> {
@Query(value = "SELECT `address`,`email`, `name`,`phn` FROM `registration` u JOIN complaint c ON c.userid=u.id",nativeQuery = true)
List<Map<String,String>> Complaints();

}

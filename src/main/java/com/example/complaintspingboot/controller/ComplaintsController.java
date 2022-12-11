package com.example.complaintspingboot.controller;

import com.example.complaintspingboot.dao.ComplaintsDao;
import com.example.complaintspingboot.model.Complaint;
import com.example.complaintspingboot.model.Userregistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class ComplaintsController {
    @Autowired
    private ComplaintsDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addcomplaint",consumes = "application/json",produces = "application/json")
    public Map<String,String> Addcomplaint(@RequestBody Complaint c){
        System.out.println(c.getUserid());
        System.out.println(c.getComplaint().toString());


        HashMap<String,String> result=new HashMap<>();
        dao.save(c);
        result.put("status","success");
        return result;
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path ="/viewallcomplaint",consumes = "application/json",produces = "application/json")
    public List<Map<String,String>> Viewall(){
        return (List<Map<String, String>>) dao.Complaints();
    }
}


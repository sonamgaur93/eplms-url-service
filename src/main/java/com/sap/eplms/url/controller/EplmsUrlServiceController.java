package com.sap.eplms.url.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.eplms.url.dto.MicroserviceURLDTO;
import com.sap.eplms.url.service.EplmsUrlService;

@RestController
@RequestMapping("/api")
public class EplmsUrlServiceController {
	
    @Autowired
    private EplmsUrlService eplmsUrlService;
    
    @PostMapping("/add-url")
    public ResponseEntity<String> addURL(@RequestBody MicroserviceURLDTO urlDTO) {
      
        return ResponseEntity.status(HttpStatus.CREATED).body("URL added successfully with ID: ");
    }

    @GetMapping("/fetch-data/{serviceName}")
    public ResponseEntity<String> fetchData(@PathVariable String serviceName){
    	System.out.println(serviceName);
        return (ResponseEntity<String>) ResponseEntity.ok();
    }
}
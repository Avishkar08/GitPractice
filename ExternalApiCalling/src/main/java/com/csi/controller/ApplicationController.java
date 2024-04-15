package com.csi.controller;

import com.csi.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;
    @GetMapping("/getcontryinfo")
    public ResponseEntity<String> getExternalApi(){

        return ResponseEntity.ok(applicationService.countryInfo());
    }

    @GetMapping("/otherinfosearchere")
    public ResponseEntity<String> goHere(){
        return ResponseEntity.ok(applicationService.goHere());
    }
}

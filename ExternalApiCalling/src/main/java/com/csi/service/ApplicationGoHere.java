package com.csi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://gemini.google.com/app",name = "BradConcept")
public interface ApplicationGoHere {

    @GetMapping
    public String goHere();
}

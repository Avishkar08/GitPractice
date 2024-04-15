package com.csi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://jsonmock.hackerrank.com/api/countries?",name = "ExternalApiData")
public interface ApplicationClient {

    @GetMapping
    public  String countryInfo();
}
